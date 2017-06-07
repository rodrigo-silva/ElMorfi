package ar.com.wazoo.model;

import static org.junit.Assert.assertEquals;

import java.util.TreeMap;

import org.junit.Test;

import com.google.common.collect.Maps;

public class IngredienteTest {

   @Test
   public void testSort() {
      final TreeMap<Ingrediente, Double> sortedMap = Maps.newTreeMap();

      sortedMap.put(Ingrediente.FIDEOS, 1.0);
      sortedMap.put(Ingrediente.ACEITUNA, 1.0);
      sortedMap.put(Ingrediente.CEBOLLA, 1.0);
      sortedMap.put(Ingrediente.HUEVO, 1.0);

      assertEquals(Ingrediente.CEBOLLA, sortedMap.keySet().iterator().next());

   }
}
