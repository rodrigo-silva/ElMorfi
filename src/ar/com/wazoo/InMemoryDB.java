package ar.com.wazoo;

import java.util.List;
import java.util.Map;

import ar.com.wazoo.model.Ingrediente;
import ar.com.wazoo.model.Plato;
import ar.com.wazoo.model.Plato.Caracteristica;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class InMemoryDB {
   private static final String MILANESA_CON_PURE = "Milanesa con pure mixto";
   private static final String MILANESA_CON_ENSALADA = "Milanesa con ensalada(T,L,R)";
   private static final String POLLO_PLANCHA = "Pollo plancha ensalada(T,R,Z)";
   private static final String POLLO_AL_VERDEO = "Pollo al verdeo con arroz";
   private static final String PASTEL_DE_CARNE = "Pastel de carne";
   private static final String EMPANADAS_CARNE = "Empanadas de carne";
   private static final String POLLO_AGRIDULCE = "Pollo Salteado agridulce";
   private static final String OMELETTE_CON_FRITAS = "Omelette con fritas";
   private static final String BUDIN_DE_ACELGA = "Budin de Acelga";
   private static final String EMPANADAS_ATUN = "Empanadas atun";
   private static final String PATITAS_PURE = "Patitas con Pure mixto";
   private static final String FIDEOS_SALSA_BOLOGNESA = "Fideos Bolognesa";
   private static final String FIDEOS_SALTEADOS = "Salteado verduras y fideos";
   private static final String FIDEOS_SALSA_ATUN = "Fideos salsa de atun";
   private static final String FIDEOS_SALSA_ACELGA = "Fideos salsa acelga";
   private static final String CAZUELA_DE_POLLO = "Cazuela de  pollo";


   private static final String ARROZ_HONGOS_VERDEO = "Arroz con honguitosss";
   private static final String ZAPALLITOS_CON_QUESO = "Zapallitos con queso";
   private static final String REVUELTO_ARROZ = "Revuleto arroz";
   private static final String ENSALADA_GALLEGA = "Ensalada gallega";
   private static final String ARROZ_CHINO = "Arroz Chino";

   private static final String PUCHERO = "Puchero";
   private static final String SOPA = "Sopa";
   private static final String SOPA_POLENTA = "Sopa y polenta con queso";
   private static final String GUISO_LENTEJAS = "Guiso de Lentejas";

   private static final String POLENTA_ACELGA = "Polenta con Acelga";
   private static final String MERLUZA_HORNO = "Merluza al horno";
   private static final String TORTILLA_ATUN = "Tortilla de atun con ensalada";
   private static final String HAMBURGUESAS_CASERAS = "Hamburguesas caseras con fritas";
   private static final String POLENTA_QUESO_SALSA = "Polenta con queso y Bolognesa";
   private static final String TARTA_J_Q = "Tarta jamon y queso y tomate con ensalada";
   private static final String HAMBURGUESAS_ARROZ = "Hamburguesas con arroz";
   

   /**
    * @return
    */
   public static List<Plato> getMenu() {
      return menuSummer();
      //return menuWinter();
   }


   /**
    * @return
    */
   public static Map<String, Plato> getPlatosMap() {
      final Map<String, Plato> platosMap = Maps.newHashMap();

      Plato unPlato = new Plato(BUDIN_DE_ACELGA);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.ACELGA, 2);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2);
      unPlato.putIngrediente(Ingrediente.PAPA, 1);
      unPlato.putIngrediente(Ingrediente.HUEVO, 4);
      unPlato.putIngrediente(Ingrediente.ARVEJA, 0.5);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 200);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(ARROZ_CHINO);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 2);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.HUEVO, 3);
      unPlato.putIngrediente(Ingrediente.ARROZ, 300);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.ARROZ);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FIDEOS_SALSA_ACELGA);
      unPlato.putIngrediente(Ingrediente.ACELGA, 1);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 300);
      unPlato.putIngrediente(Ingrediente.FIDEOS_TACC, 100);
      unPlato.setCarbohidrato(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(EMPANADAS_ATUN);
      unPlato.setCssRule("color: goldenrod");
      unPlato.putIngrediente(Ingrediente.ATUN, 2);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 2);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.HUEVO, 3);
      unPlato.putIngrediente(Ingrediente.TAPAS, 1);
      unPlato.putIngrediente(Ingrediente.TAPAS_TACC, 0.3);
      unPlato.setCarbohidrato(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(OMELETTE_CON_FRITAS);
      unPlato.putIngrediente(Ingrediente.HUEVO, 8);
      unPlato.putIngrediente(Ingrediente.JAMON, 100);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 250);
      unPlato.putIngrediente(Ingrediente.PAPA, 4);
      unPlato.setCarbohidrato(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(ZAPALLITOS_CON_QUESO);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 250);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 4);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.75);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.ARROZ, 300);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.ARROZ);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(MILANESA_CON_PURE);
      unPlato.setCssRule("color: #14da14");
      unPlato.putIngrediente(Ingrediente.PECHUGA, 500);
      unPlato.putIngrediente(Ingrediente.PAPA, 2);
      unPlato.putIngrediente(Ingrediente.ZAPALLO, 1);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.POLLO);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(MILANESA_CON_ENSALADA);
      unPlato.setCssRule("color: #14da14");
      unPlato.putIngrediente(Ingrediente.PECHUGA, 500);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.TOMATE, 2);
      unPlato.putIngrediente(Ingrediente.RUCULA, 0.5);
      unPlato.setCaracteristica(Caracteristica.POLLO);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(ENSALADA_GALLEGA);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.TOMATE, 2);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 300);
      unPlato.putIngrediente(Ingrediente.FIDEOS_TACC, 100);
      unPlato.putIngrediente(Ingrediente.ATUN, 1);
      unPlato.putIngrediente(Ingrediente.PEPINO, 2);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2);
      unPlato.setCarbohidrato(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(POLLO_AL_VERDEO);
      unPlato.setCssRule("color: orange");
      unPlato.putIngrediente(Ingrediente.VERDEO, 3);
      unPlato.putIngrediente(Ingrediente.PECHUGA, 500);
      unPlato.putIngrediente(Ingrediente.ARROZ, 350);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.POLLO);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(PASTEL_DE_CARNE);
      unPlato.setCssRule("color: red");
      unPlato.putIngrediente(Ingrediente.PAPA, 3);
      unPlato.putIngrediente(Ingrediente.PICADA, 500);
      unPlato.putIngrediente(Ingrediente.ACEITUNA, 1);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.HUEVO, 3);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.CARNE);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(POLLO_PLANCHA);
      unPlato.setCssRule("color: orange");
      unPlato.putIngrediente(Ingrediente.TOMATE, 2);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.PECHUGA, 500);
      unPlato.setCaracteristica(Caracteristica.POLLO);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FIDEOS_SALSA_ATUN);
      unPlato.putIngrediente(Ingrediente.ATUN, 1);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 300);
      unPlato.putIngrediente(Ingrediente.FIDEOS_TACC, 100);
      unPlato.setCarbohidrato(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(EMPANADAS_CARNE);
      unPlato.setCssRule("color: red");
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 2);
      unPlato.putIngrediente(Ingrediente.ACEITUNA, 1);
      unPlato.putIngrediente(Ingrediente.HUEVO, 3);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.TAPAS, 1);
      unPlato.putIngrediente(Ingrediente.TAPAS_TACC, 0.3);
      unPlato.putIngrediente(Ingrediente.PICADA, 500);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.CARNE);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FIDEOS_SALTEADOS);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 2);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 300);
      unPlato.putIngrediente(Ingrediente.FIDEOS_TACC, 100);
      unPlato.setCarbohidrato(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(PUCHERO);
      unPlato.putIngrediente(Ingrediente.PAPA, 2);
      unPlato.putIngrediente(Ingrediente.BATATA, 1);
      unPlato.putIngrediente(Ingrediente.OSOBUCO, 1200);
      unPlato.putIngrediente(Ingrediente.CHOCLO, 1);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.ZAPALLO, 0.25);
      unPlato.setCarbohidrato(true);
      unPlato.setCaliente(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(SOPA);
      unPlato.putIngrediente(Ingrediente.APIO, 1);
      unPlato.putIngrediente(Ingrediente.PAPA, 0.5);
      unPlato.putIngrediente(Ingrediente.ZAPALLO, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2);
      unPlato.putIngrediente(Ingrediente.CHOCLO, 1);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.FIDEOS_SOPA, 500);
      unPlato.setCarbohidrato(true);
      unPlato.setCaliente(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(SOPA_POLENTA);
      unPlato.putIngrediente(Ingrediente.APIO, 1);
      unPlato.putIngrediente(Ingrediente.PAPA, 0.5);
      unPlato.putIngrediente(Ingrediente.ZAPALLO, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2);
      unPlato.putIngrediente(Ingrediente.CHOCLO, 1);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 0.5);
      unPlato.putIngrediente(Ingrediente.POLENTA, 250);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 250);
      unPlato.setCarbohidrato(true);
      unPlato.setCaliente(true);
      platosMap.put(unPlato.getNombre(), unPlato);
      
      unPlato = new Plato(GUISO_LENTEJAS);
      unPlato.putIngrediente(Ingrediente.LENTEJAS, 250);
      unPlato.putIngrediente(Ingrediente.ARROZ, 150);
      unPlato.putIngrediente(Ingrediente.BATATA, 1);
      unPlato.putIngrediente(Ingrediente.PAPA, 2);
      unPlato.putIngrediente(Ingrediente.ZAPALLO, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.CHORIZO_COLORAO, 0.5);
      unPlato.putIngrediente(Ingrediente.PANCETA, 100);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.75);
      unPlato.setCarbohidrato(true);
      unPlato.setCaliente(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(REVUELTO_ARROZ);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.HUEVO, 4);
      unPlato.putIngrediente(Ingrediente.ARROZ, 350);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.ARROZ);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FIDEOS_SALSA_BOLOGNESA);
      unPlato.setCssRule("color: red");
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.75);
      unPlato.putIngrediente(Ingrediente.PICADA, 250);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 300);
      unPlato.putIngrediente(Ingrediente.FIDEOS_TACC, 100);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.CARNE);
      unPlato.setCaliente(true);
      platosMap.put(unPlato.getNombre(), unPlato);


      unPlato = new Plato(PATITAS_PURE);
      unPlato.putIngrediente(Ingrediente.PATITAS, 360);
      unPlato.putIngrediente(Ingrediente.PAPA, 2);
      unPlato.putIngrediente(Ingrediente.ZAPALLO, 1);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.POLLO);
      platosMap.put(unPlato.getNombre(), unPlato);
      
      unPlato = new Plato(MERLUZA_HORNO);
      unPlato.putIngrediente(Ingrediente.MERLUZA, 0.75);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2);
      unPlato.putIngrediente(Ingrediente.VERDEO, 2);
      unPlato.putIngrediente(Ingrediente.PAPA, 3);
      unPlato.setCarbohidrato(true);
      unPlato.setCaliente(true);
      unPlato.setCaracteristica(Caracteristica.PESCADO);
      platosMap.put(unPlato.getNombre(), unPlato);
      
      unPlato = new Plato(TORTILLA_ATUN);
      unPlato.putIngrediente(Ingrediente.ATUN, 2);
      unPlato.putIngrediente(Ingrediente.VERDEO, 1);
      unPlato.putIngrediente(Ingrediente.HUEVO, 3);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.TOMATE, 2);
      unPlato.putIngrediente(Ingrediente.RUCULA, 0.5);
      platosMap.put(unPlato.getNombre(), unPlato);
      
      unPlato = new Plato(POLLO_AGRIDULCE);
      unPlato.setCssRule("color: orange");
      unPlato.putIngrediente(Ingrediente.PECHUGA, 500);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 2);
      unPlato.putIngrediente(Ingrediente.ARROZ, 250);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.POLLO);
      platosMap.put(unPlato.getNombre(), unPlato);
      
      unPlato = new Plato(HAMBURGUESAS_CASERAS);
      unPlato.setCssRule("color: red");
      unPlato.putIngrediente(Ingrediente.PICADA, 500);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.HUEVO, 1);
      unPlato.putIngrediente(Ingrediente.PAPA, 4);
      unPlato.putIngrediente(Ingrediente.PAN_SANGUCHE, 3);
      unPlato.setCarbohidrato(true);
      unPlato.setCaracteristica(Caracteristica.CARNE);
      platosMap.put(unPlato.getNombre(), unPlato);
      
      unPlato = new Plato(POLENTA_QUESO_SALSA);
      unPlato.putIngrediente(Ingrediente.POLENTA, 250);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.75);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1);
      unPlato.putIngrediente(Ingrediente.PICADA, 250);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 200);
      unPlato.setCarbohidrato(true);
      unPlato.setCaliente(true);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(TARTA_J_Q);
      unPlato.putIngrediente(Ingrediente.JAMON, 100);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 300);
      unPlato.putIngrediente(Ingrediente.TOMATE, 5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.HUEVO, 2);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1);
      unPlato.putIngrediente(Ingrediente.TAPA_TARTA, 0.5);
      unPlato.setCarbohidrato(true);
      platosMap.put(unPlato.getNombre(), unPlato);
      
      unPlato = new Plato(CAZUELA_DE_POLLO);
      unPlato.putIngrediente(Ingrediente.POLLO, 0.75);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.ARROZ, 350);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.25);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2);
      unPlato.putIngrediente(Ingrediente.ARVEJA, 1);
      unPlato.setCaracteristica(Caracteristica.POLLO);
      platosMap.put(unPlato.getNombre(), unPlato);

      return platosMap;
   }

   private static List<Plato> menuSummer() {

      final Map<String, Plato> platosMap = InMemoryDB.getPlatosMap();
      
      final List<Plato> menu = Lists.newArrayList();
      
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(POLENTA_QUESO_SALSA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(TARTA_J_Q));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(FIDEOS_SALSA_BOLOGNESA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(POLLO_AL_VERDEO));
      menu.add(platosMap.get(POLENTA_QUESO_SALSA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(EMPANADAS_CARNE));
      menu.add(platosMap.get(REVUELTO_ARROZ));
      
      menu.add(platosMap.get(PATITAS_PURE));
      menu.add(platosMap.get(FIDEOS_SALSA_BOLOGNESA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(POLLO_AL_VERDEO));
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(MERLUZA_HORNO));
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(TARTA_J_Q));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(HAMBURGUESAS_CASERAS));
      menu.add(platosMap.get(REVUELTO_ARROZ));
      menu.add(platosMap.get(FIDEOS_SALTEADOS));
      
      menu.add(platosMap.get(POLENTA_QUESO_SALSA));
      menu.add(platosMap.get(POLLO_PLANCHA));
      menu.add(platosMap.get(PATITAS_PURE));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(FIDEOS_SALTEADOS));
      menu.add(platosMap.get(TARTA_J_Q));
      menu.add(platosMap.get(REVUELTO_ARROZ));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(EMPANADAS_CARNE));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(TORTILLA_ATUN));
      menu.add(platosMap.get(ARROZ_CHINO));
      
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(POLLO_PLANCHA));
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(POLENTA_QUESO_SALSA));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(REVUELTO_ARROZ));
      menu.add(platosMap.get(FIDEOS_SALSA_BOLOGNESA));
      menu.add(platosMap.get(MERLUZA_HORNO));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(HAMBURGUESAS_CASERAS));
      menu.add(platosMap.get(POLLO_AGRIDULCE));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      
      return menu;
   
   }
   
   private static List<Plato> menuWinter() {
      final Map<String, Plato> platosMap = InMemoryDB.getPlatosMap();
      
      final List<Plato> menu = Lists.newArrayList();
      
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(POLENTA_QUESO_SALSA));
      menu.add(platosMap.get(GUISO_LENTEJAS));
      menu.add(platosMap.get(GUISO_LENTEJAS));
      menu.add(platosMap.get(TARTA_J_Q));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(FIDEOS_SALSA_BOLOGNESA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(POLLO_AL_VERDEO));
      menu.add(platosMap.get(POLENTA_QUESO_SALSA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(EMPANADAS_CARNE));
      menu.add(platosMap.get(REVUELTO_ARROZ));
      
      menu.add(platosMap.get(PATITAS_PURE));
      menu.add(platosMap.get(FIDEOS_SALSA_BOLOGNESA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(POLLO_AL_VERDEO));
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(MERLUZA_HORNO));
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(SOPA));
      menu.add(platosMap.get(SOPA));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(HAMBURGUESAS_CASERAS));
      menu.add(platosMap.get(REVUELTO_ARROZ));
      menu.add(platosMap.get(FIDEOS_SALTEADOS));
      
      menu.add(platosMap.get(POLENTA_QUESO_SALSA));
      menu.add(platosMap.get(POLLO_PLANCHA));
      menu.add(platosMap.get(PATITAS_PURE));
      menu.add(platosMap.get(GUISO_LENTEJAS));
      menu.add(platosMap.get(GUISO_LENTEJAS));
      menu.add(platosMap.get(TARTA_J_Q));
      menu.add(platosMap.get(REVUELTO_ARROZ));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(FIDEOS_SALTEADOS));
      menu.add(platosMap.get(EMPANADAS_CARNE));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(TORTILLA_ATUN));
      menu.add(platosMap.get(ARROZ_CHINO));
      
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(POLLO_PLANCHA));
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(SOPA));
      menu.add(platosMap.get(SOPA));
      menu.add(platosMap.get(POLENTA_QUESO_SALSA));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(REVUELTO_ARROZ));
      menu.add(platosMap.get(FIDEOS_SALSA_BOLOGNESA));
      menu.add(platosMap.get(MERLUZA_HORNO));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(HAMBURGUESAS_CASERAS));
      menu.add(platosMap.get(POLLO_AGRIDULCE));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      
      return menu;
   }
}
