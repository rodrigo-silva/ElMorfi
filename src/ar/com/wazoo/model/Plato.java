package ar.com.wazoo.model;

import java.util.HashMap;
import java.util.Map;

public class Plato {
   private final String nombre;
   private final Map<Ingrediente, Double> ingredientes;
   private String cssRule;
   private boolean carbohidrato;
   private boolean caliente;
   private Caracteristica caracteristica;

   /**
    * @param nombre
    */
   public Plato(final String nombre) {
      super();
      this.nombre = nombre;
      this.ingredientes = new HashMap<Ingrediente, Double>();
      this.cssRule = "";
      this.carbohidrato = false;
      this.caliente = false;
      this.caracteristica = Caracteristica.INDIFERENTE;
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
      if(this.carbohidrato) {
         return cssRule + ";font-weight: bold;";
      }
      return cssRule;
   }

   /**
    * @param cssRule the cssRule to set
    */
   public void setCssRule(final String cssRule) {
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
   
   public boolean isCarbohidrato() {
      return carbohidrato;
   }
   
   public void setCarbohidrato(boolean carbohidrato) {
      this.carbohidrato = carbohidrato;
   }
   
   public boolean isCaliente() {
      return caliente;
   }
   
   public void setCaliente(boolean caliente) {
      this.caliente = caliente;
   }
   
   public Caracteristica getCaracteristica() {
      return caracteristica;
   }
   
   public void setCaracteristica(Caracteristica caracteristica) {
      this.caracteristica = caracteristica;
   }

   public enum Caracteristica {
      INDIFERENTE, ARROZ, POLLO, ENSALADA, CARNE, PESCADO
   }
}
