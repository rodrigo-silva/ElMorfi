package ar.com.wazoo.model;

import java.util.HashMap;
import java.util.Map;

public class Plato {
   private final String nombre;
   private final Map<Ingrediente, Double> ingredientes;
   private String cssRule;

   /**
    * @param nombre
    */
   public Plato(final String nombre) {
      super();
      this.nombre = nombre;
      this.ingredientes = new HashMap<Ingrediente, Double>();
      this.cssRule = "";
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

   public void putIngrediente(final Ingrediente ingrediente, final Integer cuanto) {
      this.ingredientes.put(ingrediente, Double.valueOf(cuanto));
   }

   /**
    * @return the cssRule
    */
   public String getCssRule() {
      return cssRule;
   }

   /**
    * @param cssRule the cssRule to set
    */
   public void setCssRule(String cssRule) {
      this.cssRule = cssRule;
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

   public enum Tipo {
      VERDURA, CARNE, PASTA
   }
}
