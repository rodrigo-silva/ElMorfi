package ar.com.wazoo;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import ar.com.wazoo.model.Plato;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class ChequearBalanceTest {

   public static void main(final String[] args) {
      final Set<String> platoNames = InMemoryDB.getPlatosMap().keySet();
      final HashMap<String, Occurrences> ocurrenciesMap = Maps.newHashMap();

      for (final Plato plato : InMemoryDB.getMenu()) {
         final String nombre = plato.getNombre();
         System.out.println(nombre);

         if (ocurrenciesMap.containsKey(nombre)) {
            ocurrenciesMap.get(nombre).addOccurrence();
         } else {
            ocurrenciesMap.put(nombre, new Occurrences(nombre));
         }
         platoNames.remove(nombre);
      }
      System.out.println();
      System.out.println("Platos que no estan : " + platoNames);
      System.out.println();

      final List<Occurrences> ocurrencias = Lists.newArrayList(ocurrenciesMap.values());

      Collections.sort(ocurrencias);
      for (final Occurrences o : ocurrencias) {
         System.out.println(o);
      }

   }

   private static class Occurrences implements Comparable<Occurrences> {
      private final String name;
      private Integer ocurrences;

      public Occurrences(final String name) {
         this.name = name;
         this.ocurrences = 1;
      }

      @Override
      public int compareTo(final Occurrences o) {
         return this.ocurrences.compareTo(o.ocurrences);
      }

      public void addOccurrence() {
         this.ocurrences++;
      }

      @Override
      public String toString() {
       return String.format("%s: %s", this.name, this.ocurrences);
      }

   }

}
