package ar.com.wazoo.model;

import java.util.HashMap;
import java.util.Map;

public class Plato {
   private final String nombre;
   private final Map<Ingrediente, Double> ingredientes;

   /**
    * @param nombre
    */
   public Plato(final String nombre) {
      super();
      this.nombre = nombre;
      this.ingredientes = new HashMap<Ingrediente, Double>();
   }

   public String getNombre() {
      return this.nombre;
   }

   public Map<Ingrediente, Double> getIngredientes() {
      return this.ingredientes;
   }

   public void putIngrediente(final Ingrediente ingrediente, final Double cuanto) {
      this.ingredientes.put(ingrediente, cuanto);
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append("Nombre: " + this.nombre);

      for (final Map.Entry<Ingrediente, Double> entry : this.ingredientes.entrySet()) {
         sb.append("\n");
         sb.append(entry.getKey()).append(": " + entry.getValue());
      }
      return sb.toString();
   }

}
