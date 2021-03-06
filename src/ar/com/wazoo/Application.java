package ar.com.wazoo;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

import ar.com.wazoo.model.Ingrediente;
import ar.com.wazoo.model.Plato;
import ar.com.wazoo.tool.HtmlHelper;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

public class Application {

   public static void main(final String[] args) throws Exception {
      if (args.length > 0) {
         if (args[0].equals("-c")) {
            if (args.length > 3) {
               final boolean soloStockeable = args.length > 7 && args[7].equalsIgnoreCase("-s");
               mostrarCompra(Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3].equalsIgnoreCase("m"),
                        Integer.parseInt(args[4]), Integer.parseInt(args[5]), args[6].equalsIgnoreCase("m"), soloStockeable);
            }
         }
         if (args[0].equals("-m")) {
            exportMenu();
         }
         if (args[0].equals("-p")) {
            printPlatos();
         }
         
         if (args[0].equals("-pm")) {
            printPlatosMenu();
         }

      } else {
         System.out.println("-m o -c semana dia <m|n> semana dia <m|n> [-s]");
      }

   }

   /**
    *
    * @param semana
    * @param dia
    * @param maniana
    * @param semana2
    * @param dia2
    * @param maniana2
    * @param soloStockeable
    * @throws IOException
    */
   private static void mostrarCompra(final int semana, final int dia, final boolean maniana, final int semana2, final int dia2,
            final boolean maniana2, final boolean soloStockeable) throws IOException {

      int from = (semana - 1) * 14 + dia * 2 - 2;
      if (!maniana) {
         from++;
      }

      int to = (semana2 - 1) * 14 + dia2 * 2 - 2;
      to++;
      if (!maniana2) {
         to++;
      }
      System.out.println(String.format("Desde (%s, %s, %s) hasta (%s, %s, %s)", semana, dia, maniana ? "Dia" : "Noche", semana2, dia2,
               maniana2 ? "Dia" : "Noche"));
      printCompra(from, to, soloStockeable);

   }

   /**
    * @param menu
    * @throws IOException
    */
   private static void printCompra(final int from, final int to, final boolean soloStockeable) throws IOException {
      Preconditions.checkArgument(from != to, "El desde y el hasta, no pueden ser iguales");
      if (soloStockeable) {
         System.out.println("****** Solo stockeables ******");
      }

      imprimirComunes();

      final List<Plato> listaPlatos = createPlatosList(from, to);
      final TreeMap<Ingrediente, Double> ingredientesMap = bildIngredientesMap(soloStockeable, listaPlatos);
      System.out.println("----------------");
      for (final Map.Entry<Ingrediente, Double> entry : ingredientesMap.entrySet()) {
         System.out.println(String.format("%s: %s %s", entry.getKey(), entry.getValue(), entry.getKey().getUnidad()));
      }


      System.out.println("\n-------Platos---------");
      for (final Plato plato : listaPlatos) {
         System.out.println(String.format("%s %s", plato.getNombre(), plato.getIngredientes()));
      }
   }

   /**
    * @throws IOException
    */
   private static void imprimirComunes() throws IOException {
      final List<String> readLines = FileUtils.readLines(new File("comunes.txt"), "UTF-8");
      for (final String linea : readLines) {
         System.out.println(linea);
      }
   }

   /**
    * @param soloStockeable
    * @param platos
    * @return
    */
   private static TreeMap<Ingrediente, Double> bildIngredientesMap(final boolean soloStockeable, final List<Plato> platos) {
      final TreeMap<Ingrediente, Double> ingredientesMap = Maps.newTreeMap();
      for (final Plato plato : platos) {
         for (final Map.Entry<Ingrediente, Double> cosa : plato.getIngredientes().entrySet()) {
            final Ingrediente unIngrediente = cosa.getKey();
            final Double unaCantidad = cosa.getValue();

            if (soloStockeable) {
               if (unIngrediente.isStockeable()) {
                  //locura null safe
                  ingredientesMap.put(unIngrediente,
                           ingredientesMap.containsKey(unIngrediente) ? ingredientesMap.get(unIngrediente) + unaCantidad
                                    : unaCantidad);
               }
            } else {
               ingredientesMap.put(unIngrediente, ingredientesMap.containsKey(unIngrediente) ? ingredientesMap.get(unIngrediente)
                        + unaCantidad : unaCantidad);
            }

         }
      }
      return ingredientesMap;
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
    * @throws IOException 
    */
   private static void exportMenu() throws IOException {
      final String htmlMenu = HtmlHelper.buildHtmlMenu(InMemoryDB.getMenu());
      FileUtils.writeStringToFile(new File(System.getProperty("user.home") + "\\Desktop\\menu.html"), htmlMenu, "UTF-8");
   }

   /**
    * @param menu
    */
   private static void printPlatos() {
      final Collection<Plato> platos = InMemoryDB.getPlatosMap().values();
      for (Plato plato : platos) {
         System.out.println(String.format("%s: ", plato.getNombre()));

         final Map<Ingrediente, Double> ingredientes = plato.getIngredientes();
         for (Entry<Ingrediente, Double> e : ingredientes.entrySet()) {
            System.out.println(String.format("\t%s:%s %s, ", e.getKey().name(), e.getValue(), e.getKey().getUnidad()));
         }
      }
   }
   /**
    * @param menu
    */
   private static void printPlatosMenu() {
      Set<Plato> platos = Sets.newHashSet(InMemoryDB.getMenu());
      for (Plato plato : platos) {
         System.out.println(String.format("%s: ", plato.getNombre()));
         
         final Map<Ingrediente, Double> ingredientes = plato.getIngredientes();
         for (Entry<Ingrediente, Double> e : ingredientes.entrySet()) {
            System.out.println(String.format("\t%s:%s %s, ", e.getKey().name(), e.getValue(), e.getKey().getUnidad()));
         }
      }
   }
}
