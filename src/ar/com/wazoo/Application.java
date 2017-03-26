package ar.com.wazoo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import ar.com.wazoo.model.Ingrediente;
import ar.com.wazoo.model.Plato;

import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayListMultimap;

public class Application {

   public static void main(final String[] args) {
      if (args.length > 0) {
         if (args[0].equals("-c")) {
            if (args.length > 3) {
               printCompra(Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3].equalsIgnoreCase("m"),
                        Integer.parseInt(args[4]), Integer.parseInt(args[5]), args[6].equalsIgnoreCase("m"));
            }
         }
         if (args[0].equals("-m")) {
            printMenu();
         }

      } else {
         System.out.println("-m o -c semana dia <m|n> semana dia <m|n>");
      }

   }

   private static void printCompra(final int semana, final int dia, final boolean maniana, final int semana2, final int dia2,
            final boolean maniana2) {

      int from = (semana - 1) * 14 + dia * 2 - 2;
      if (!maniana) {
         from++;
      }

      int to = (semana2 - 1) * 14 + dia2 * 2 - 2;
      to++;
      if (!maniana2) {
         to++;
      }
      printCompra(from, to);

   }

   /**
    * @param menu
    */
   private static void printCompra(final int from, final int to) {
      Preconditions.checkArgument(from != to, "El desde y el hasta, no pueden ser iguales");
      final List<Plato> platos = createPlatosList(from, to);

      final ArrayListMultimap<Ingrediente, String> mm = ArrayListMultimap.create();
      for (final Plato plato : platos) {
         System.out.println(String.format("%s", plato.getNombre()));
         for (final Map.Entry<Ingrediente, String> cosa : plato.getIngredientes().entrySet()) {
            mm.put(cosa.getKey(), cosa.getValue());
         }
      }

      System.out.println();

      for (final Ingrediente ingrediente : mm.keySet()) {
         final StringBuilder sb = new StringBuilder();
         for (final String cantidad : mm.get(ingrediente)) {
            sb.append(cantidad + " + ");
         }
         System.out.println(String.format("%s: %s", ingrediente, sb.toString()));
      }
   }

   /**
    * @param from
    * @param to
    * @return
    */
   private static List<Plato> createPlatosList(final int from, final int to) {
      final List<Plato> menu = InMemoryDB.getMenu();

      if (from < to) {
         return menu.subList(from, to);
      } else {
         final List<Plato> subList = menu.subList(from, menu.size());
         subList.addAll(menu.subList(0, to));
         return subList;
      }
   }

   /**
    * @param menu
    */
   private static void printMenu() {
      final List<Plato> menu = InMemoryDB.getMenu();
      for (final Iterator<Plato> iterator = menu.iterator(); iterator.hasNext();) {
         for (int i = 0; i < 7; i++) {
            System.out.println(String.format("%s | %s", iterator.next().getNombre(), iterator.next().getNombre()));
         }
         System.out.println("-------------------");

      }
   }

}
