package ar.com.wazoo.model;

import java.util.HashMap;
import java.util.Map;

public class Plato {
   private final String nombre;
   private final Map<Ingrediente, String> ingredientes;

   /**
    * @param nombre
    */
   public Plato(final String nombre) {
      super();
      this.nombre = nombre;
      this.ingredientes = new HashMap<Ingrediente, String>();
   }

   public String getNombre() {
      return this.nombre;
   }

   public Map<Ingrediente, String> getIngredientes() {
      return this.ingredientes;
   }

   public void putIngrediente(final Ingrediente ingrediente, final String cuanto) {
      this.ingredientes.put(ingrediente, cuanto);
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder();
      sb.append("Nombre: " + this.nombre);

      for (final Map.Entry<Ingrediente, String> entry : this.ingredientes.entrySet()) {
         sb.append("\n");
         sb.append(entry.getKey()).append(": " + entry.getValue());
      }
      return sb.toString();
   }

}
