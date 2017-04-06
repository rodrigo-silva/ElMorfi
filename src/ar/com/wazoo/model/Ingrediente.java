package ar.com.wazoo.model;

public enum Ingrediente {
   CEBOLLA(true, "U"),
   ACELGA(false, "Atados"),
   HONGOS(false, "Bandeja"),
   VERDEO(true, "U"),
   PAPA(true, "U"),
   TOMATE(false, "U"),
   LECHUGA(false, "Atados"),
   HUEVO(false, "U"),
   ARROZ(true, "grs."),
   LECHE(false, "ltr"),
   RAVIOLES(false, "planchas"),
   CHAUCHAS(false, "grs"),
   ZANAHORIA(false, "U"),
   ZAPALLITO(false, "U"),
   POLLO(true, "U"),
   LIMON(true, "U"),
   FIDEOS(true, "grs"),
   PICADA(false, "grs"),
   ATUN(true, "lata"),
   TAPAS(false, "paquete"),
   QUESO_MANTECOSO(false, "grs"),
   JAMON(false, "grs"),
   ARVEJA(true, "lata"),
   NOQUIS(false, "grs"),
   MORRON(false, "U"),
   PURE_TOMATE(true, "Envase"),
   ACEITUNA(true, "paquete"),
   REPOLLO(false, "U"),
   TAPA_TARTA(false, "U"),
   VACIO(false, "grs"),
   RICOTA(false, "grs"), QUESO_MUZZARELLA(false, "grs");

   private final boolean stockeable;
   private final String unidad;

   /**
    * @param stockeable
    */
   private Ingrediente(final boolean stockeable, final String unidad) {
      this.stockeable = stockeable;
      this.unidad = unidad;
   }

   public boolean isStockeable() {
      return this.stockeable;
   }

   public String getUnidad() {
      return this.unidad;
   }

}
