package ar.com.wazoo.model;

public enum Ingrediente {
   CEBOLLA(true),
   ACELGA(false),
   HONGOS(false),
   VERDEO(true),
   PAPA(true),
   TOMATE(false),
   LECHUGA(false),
   HUEVO(false),
   ARROZ(true),
   LECHE(false),
   RAVIOLES(false),
   CHAUCHAS(false),
   ZANAHORIA(false),
   ZAPALLITO(false),
   POLLO(true),
   LIMON(true),
   FIDEOS(true),
   PICADA(false),
   ATUN(true),
   TAPAS(false),
   QUESO_MANTECOSO(false),
   JAMON(false),
   ARVEJA(true),
   NOQUIS(false),
   MORRON(false),
   PURE_TOMATE(true),
   ACEITUNA(true),
   REPOLLO(false),
   VACIO(false);

   private final boolean stockeable;

   /**
    * @param stockeable
    */
   private Ingrediente(final boolean stockeable) {
      this.stockeable = stockeable;
   }

   public boolean isStockeable() {
      return this.stockeable;
   }

}
