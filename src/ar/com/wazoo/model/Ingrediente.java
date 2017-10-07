package ar.com.wazoo.model;

public enum Ingrediente {
   //el orden de declaracion importa al querer compararlos
   QUESO_MANTECOSO(false, true, false, "grs"),
   ARROZ(true, false, false, "grs."),
   POLENTA(true, false, false, "grs."),
   FIDEOS(true, false, false, "grs"),
   FIDEOS_SOPA(true, false, false, "grs"),
   LENTEJAS(true, false, false, "grs"),
   NOQUIS(false, true, false, "grs"),
   RAVIOLES(false, true, false, "planchas"),
   TAPAS(false, true, false, "paquete"),
   POLLO(true, true, false, "U"),
   JAMON(false, true, false, "grs"),
   QUESO_MUZZARELLA(false, true, false, "grs"),
   TAPA_TARTA(false, true, false, "U"),

   CEBOLLA(true, true, true, "U"),
   ACELGA(false, true, true, "Atados"),
   HONGOS(false, true, true, "Bandeja"),
   VERDEO(true, true, true, "U"),
   PAPA(true, true, true, "U"),
   BATATA(true, true, true, "U"),
   CHOCLO(true, true, true, "U"),
   APIO(true, true, true, "U"),
   TOMATE(false, true, true, "U"),
   LECHUGA(false, true, true, "Atados"),
   CHAUCHAS(false, true, true, "grs"),
   ZANAHORIA(false, true, true, "U"),
   ZAPALLITO(false, true, true, "U"),
   LIMON(true, true, true, "U"),
   MORRON(false, true, true, "U"),
   REPOLLO(false, true, true, "U"),
   RUCULA(false, true, true, "grs"),
   HUEVO(false, true, false, "U"),

   PICADA(false, true, false, "grs"),
   OSOBUCO(false, true, false, "grs"),
   FALDA(false, true, false, "grs"),
   ARVEJA(true, true, false, "lata"),
   VACIO(false, true, false, "grs"),
   RICOTA(false, true, false, "grs"),
   PURE_TOMATE(true, false, false, "Envase"),
   ATUN(true, false, false, "lata"),
   ACEITUNA(true, false, false, "paquete"),
   LECHE(false, true, false, "ltr"),
   ZAPALLO(false, true, true, "U"),
   CHORIZO_COLORAO(true, true, false, "U"),
   PANCETA(true, true, false, "grs"),
   MERLUZA(false, true, false, "Kg"),
   CARRE(false, true, false, "Kg"),
   SALCHICHAS(false, false, false, "Paquete"),
   SALCHICHAS_VIENA(false, false, false, "Paquete"),
   ;

   private final boolean stockeable;
   private final String unidad;
   private final boolean vegetal;
   private final boolean perecedero;

   /**
    * @param stockeable
    */
   private Ingrediente(final boolean stockeable, final boolean perecedero, final boolean vegetal, final String unidad) {
      this.stockeable = stockeable;
      this.perecedero = perecedero;
      this.vegetal = vegetal;
      this.unidad = unidad;
   }

   public boolean isStockeable() {
      return this.stockeable;
   }

   /**
    * @return the vegetal
    */
   public boolean isVegetal() {
      return this.vegetal;
   }

   /**
    * @return the perecedero
    */
   public boolean isPerecedero() {
      return this.perecedero;
   }

   public String getUnidad() {
      return this.unidad;
   }

}
