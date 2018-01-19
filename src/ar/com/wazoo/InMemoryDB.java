package ar.com.wazoo;

import java.util.List;
import java.util.Map;

import ar.com.wazoo.model.Ingrediente;
import ar.com.wazoo.model.Plato;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class InMemoryDB {
   private static final String MILANESA_CON_PURE = "Milanesa con pure";
   private static final String MILANESA_CON_ENSALADA = "Milanesa con ensalada";
   private static final String POLLO_PLANCHA = "Pollo plancha";
   private static final String POLLO_AL_HORNO_PURE = "Pollo al horno pure";
   private static final String POLLO_AL_HORNO_ENSALADA = "Pollo al horno ensalada";
   private static final String POLLO_AL_VERDEO = "Pollo al verdeo";
   private static final String CAZUELA_POLENTA = "Cazuela polenta";
   private static final String CAZUELA_DE_POLLO = "Cazuela de  pollo";

   private static final String CARNE_HORNO = "Carne Horno";
   private static final String PASTEL_DE_CARNE = "Pastel de carne";
   private static final String RAVIOLES_CON_ESTOFADO = "Ravioles con estofado";
   private static final String EMPANADAS_CARNE = "Empanadas de carne";
   private static final String MERLUZA_CON_PURE = "Cameruza con pure";

   private static final String SALCHICHAS_PURE= "Salchichas con pure";
   private static final String CERDO_BATATA_CEBOLLA = "Cerdo con Batatas y cebolla";

   private static final String FAJITAS_CERDO = "Fajitas con cerdo";
   private static final String OMELETTE_CON_FRITAS = "Omelette CON fritas";
   private static final String TEMPURA = "Tempura";
   private static final String PIZZA = "Pizza";
   private static final String TORTILLA_CON_ENSALADA = "Tortilla con ensalada";
   private static final String BOCADILLOS_DE_ACELGA = "Bocadillos de acelga";
   private static final String EMPANADAS_ATUN = "Empanadas atun";

   private static final String PASTA_CON_BOLOGNESA = "Pasta con bolognesa";
   private static final String FIDEOS_SALSA_BOLOGNESA = "Fideos Bolognesa";
   private static final String PASTA_SALSA = "Pasta salsa";
   private static final String SALTEADO_FIDEOS = "Salteado verduras y fideos";
   private static final String G_NOCCHI_SALSA_MIXTA = "GNocchi salsa mixta";
   private static final String FIDEOS_HONGOS_VERDEO = "Fideos hongos verdeo";
   private static final String FIDEOS_SALSA_ATUN = "Fideos salsa de atun";
   private static final String FIDEOS_TUCO = "fIDEOS WITH Tucou";
   private static final String RAVIOLES_SALSA_ACELGA = "Ravioles Salsa Acelga";
   private static final String FIDEOS_SALSA_ACELGA = "Fideos salsa acelga";

   private static final String ZAPALLITOS_CON_QUESO = "Zapallitos con queso";
   private static final String REVUELTO_ARROZ = "Revuleto arroz";
   private static final String RISOTTO = "Risotto";
   private static final String ENSALADA_GALLEGA = "Ensalada gallega";
   private static final String ARROZ_CHINO = "Arroz chino";
   private static final String TARTA_VERDURA = "Tarta verdura";
   private static final String TARTA_JQ = "tarta j y q";

   private static final String PUCHERO = "Puchero";
   private static final String SOPA = "Sopa";
   private static final String GUISO_LENTEJAS = "Guiso de Lentejas";

   private static final String POLENTA_QUESO = "Polenta queso";

   /**
    * @return
    */
   public static List<Plato> getMenu() {
      return menu4();
   }

   /**
    * @return
    */
   public static Map<String, Plato> getPlatosMap() {
      final Map<String, Plato> platosMap = Maps.newHashMap();

      Plato unPlato = new Plato(BOCADILLOS_DE_ACELGA);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.ACELGA, 3);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.PAPA, 2.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 2.0);
      unPlato.putIngrediente(Ingrediente.ARVEJA, 0.5);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FIDEOS_HONGOS_VERDEO);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 500);
      unPlato.putIngrediente(Ingrediente.HONGOS, 0.5);
      unPlato.putIngrediente(Ingrediente.VERDEO, 2.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(TORTILLA_CON_ENSALADA);
      unPlato.putIngrediente(Ingrediente.PAPA, 5.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.TOMATE, 2.0);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 4.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(ARROZ_CHINO);
      unPlato.putIngrediente(Ingrediente.MORRON, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 2.0);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 2.0);
      unPlato.putIngrediente(Ingrediente.ARROZ, 300);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(TEMPURA);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 1.0);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 1.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 1.0);
      unPlato.putIngrediente(Ingrediente.ARROZ, 200.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FIDEOS_SALSA_ACELGA);
      unPlato.putIngrediente(Ingrediente.ACELGA, 1.0);
      unPlato.putIngrediente(Ingrediente.LECHE, 0.5);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 400.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(RAVIOLES_SALSA_ACELGA);
      unPlato.putIngrediente(Ingrediente.ACELGA, 1.0);
      unPlato.putIngrediente(Ingrediente.RAVIOLES, 2.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(RISOTTO);
      unPlato.putIngrediente(Ingrediente.CHAUCHAS, 50.0);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 1.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(POLLO_AL_HORNO_PURE);
      unPlato.putIngrediente(Ingrediente.POLLO, 0.75);
      unPlato.putIngrediente(Ingrediente.PAPA, 4.0);
      unPlato.putIngrediente(Ingrediente.LIMON, 1.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(POLLO_AL_HORNO_ENSALADA);
      unPlato.putIngrediente(Ingrediente.POLLO, 0.75);
      unPlato.putIngrediente(Ingrediente.LIMON, 1.0);
      unPlato.putIngrediente(Ingrediente.TOMATE, 2.0);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(PASTA_CON_BOLOGNESA);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 400.0);
      unPlato.putIngrediente(Ingrediente.PICADA, 250.0);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 1.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(EMPANADAS_ATUN);
      unPlato.putIngrediente(Ingrediente.ATUN, 1.0);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 2.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 1.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 3.0);
      unPlato.putIngrediente(Ingrediente.TAPAS, 1.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(PIZZA);
      unPlato.putIngrediente(Ingrediente.QUESO_MUZZARELLA, 600.0);
      unPlato.putIngrediente(Ingrediente.JAMON, 100.0);
      unPlato.putIngrediente(Ingrediente.TOMATE, 1.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      unPlato.putIngrediente(Ingrediente.RUCULA, 100.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(OMELETTE_CON_FRITAS);
      unPlato.putIngrediente(Ingrediente.HUEVO, 6.0);
      unPlato.putIngrediente(Ingrediente.JAMON, 100.0);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 250.0);
      unPlato.putIngrediente(Ingrediente.PAPA, 6.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(G_NOCCHI_SALSA_MIXTA);
      unPlato.putIngrediente(Ingrediente.NOQUIS, 300.0);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 0.5);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(ZAPALLITOS_CON_QUESO);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 250.0);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 3.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.ARROZ, 200.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(MILANESA_CON_PURE);
      unPlato.putIngrediente(Ingrediente.POLLO, 0.75);
      unPlato.putIngrediente(Ingrediente.PAPA, 4.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 2.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(MERLUZA_CON_PURE);
      unPlato.putIngrediente(Ingrediente.MERLUZA, 1.0);
      unPlato.putIngrediente(Ingrediente.PAPA, 4.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 2.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(MILANESA_CON_ENSALADA);
      unPlato.putIngrediente(Ingrediente.POLLO, 0.75);
      unPlato.putIngrediente(Ingrediente.HUEVO, 1.0);
      unPlato.putIngrediente(Ingrediente.TOMATE, 2.0);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(RAVIOLES_CON_ESTOFADO);
      unPlato.putIngrediente(Ingrediente.VACIO, 250.0);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 1.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      unPlato.putIngrediente(Ingrediente.RAVIOLES, 2.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(ENSALADA_GALLEGA);
      unPlato.putIngrediente(Ingrediente.REPOLLO, 0.5);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.TOMATE, 1.0);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 200.0);
      unPlato.putIngrediente(Ingrediente.ATUN, 1.0);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(POLLO_AL_VERDEO);
      unPlato.putIngrediente(Ingrediente.VERDEO, 3.0);
      unPlato.putIngrediente(Ingrediente.POLLO, 0.75);
      unPlato.putIngrediente(Ingrediente.PAPA, 4.0);
      unPlato.putIngrediente(Ingrediente.HONGOS, 0.5);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(CAZUELA_DE_POLLO);
      unPlato.putIngrediente(Ingrediente.POLLO, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 0.5);
      unPlato.putIngrediente(Ingrediente.MORRON, 0.5);
      unPlato.putIngrediente(Ingrediente.ARROZ, 200.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.25);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(PASTEL_DE_CARNE);
      unPlato.putIngrediente(Ingrediente.PAPA, 4.0);
      unPlato.putIngrediente(Ingrediente.PICADA, 500.0);
      unPlato.putIngrediente(Ingrediente.ACEITUNA, 100.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 3.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(POLLO_PLANCHA);
      unPlato.putIngrediente(Ingrediente.TOMATE, 1.0);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 1.0);
      unPlato.putIngrediente(Ingrediente.POLLO, 0.75);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FIDEOS_SALSA_ATUN);
      unPlato.putIngrediente(Ingrediente.ATUN, 1.0);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 2.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 400.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(PASTA_SALSA);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 400.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(EMPANADAS_CARNE);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 2.0);
      unPlato.putIngrediente(Ingrediente.ACEITUNA, 1.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 4.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 1.0);
      unPlato.putIngrediente(Ingrediente.TAPAS, 1.0);
      unPlato.putIngrediente(Ingrediente.PICADA, 500.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(SALTEADO_FIDEOS);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 2.0);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.MORRON, 1.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(TARTA_VERDURA);
      unPlato.putIngrediente(Ingrediente.TAPA_TARTA, 1.0);
      unPlato.putIngrediente(Ingrediente.ACELGA, 2.0);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 2.0);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 100.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(TARTA_JQ);
      unPlato.putIngrediente(Ingrediente.TAPA_TARTA, 1.0);
      unPlato.putIngrediente(Ingrediente.JAMON, 200.0);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 200.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 3.0);
      unPlato.putIngrediente(Ingrediente.TOMATE, 2.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(PUCHERO);
      unPlato.putIngrediente(Ingrediente.PAPA, 1.0);
      unPlato.putIngrediente(Ingrediente.BATATA, 1.0);
      unPlato.putIngrediente(Ingrediente.APIO, 1.0);
      unPlato.putIngrediente(Ingrediente.OSOBUCO, 500.0);
      unPlato.putIngrediente(Ingrediente.CHOCLO, 1.0);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.ZAPALLO, 0.25);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(SOPA);
      unPlato.putIngrediente(Ingrediente.APIO, 1.0);
      unPlato.putIngrediente(Ingrediente.PAPA, 1.0);
      unPlato.putIngrediente(Ingrediente.ZAPALLO, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.CHOCLO, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 0.5);
      unPlato.putIngrediente(Ingrediente.FIDEOS_SOPA, 500.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(GUISO_LENTEJAS);
      unPlato.putIngrediente(Ingrediente.LENTEJAS, 250.0);
      unPlato.putIngrediente(Ingrediente.BATATA, 1.0);
      unPlato.putIngrediente(Ingrediente.PAPA, 1.0);
      unPlato.putIngrediente(Ingrediente.ZAPALLO, 0.5);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.CHORIZO_COLORAO, 0.5);
      unPlato.putIngrediente(Ingrediente.PANCETA, 100.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(REVUELTO_ARROZ);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 5.0);
      unPlato.putIngrediente(Ingrediente.HUEVO, 4.0);
      unPlato.putIngrediente(Ingrediente.ARROZ, 350.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(CARNE_HORNO);
      unPlato.putIngrediente(Ingrediente.VACIO, 300.0);
      unPlato.putIngrediente(Ingrediente.REPOLLO, 0.5);
      unPlato.putIngrediente(Ingrediente.LECHUGA, 0.5);
      unPlato.putIngrediente(Ingrediente.TOMATE, 1.0);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(CAZUELA_POLENTA);
      unPlato.putIngrediente(Ingrediente.POLLO, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 0.5);
      unPlato.putIngrediente(Ingrediente.MORRON, 0.5);
      unPlato.putIngrediente(Ingrediente.POLENTA, 250.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.25);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(CERDO_BATATA_CEBOLLA);
      unPlato.putIngrediente(Ingrediente.CARRE, 0.5);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.BATATA, 2.0);
      unPlato.putIngrediente(Ingrediente.PAPA, 2.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FIDEOS_SALSA_BOLOGNESA);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      unPlato.putIngrediente(Ingrediente.PICADA, 0.25);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 0.33);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FIDEOS_TUCO);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1.0);
      unPlato.putIngrediente(Ingrediente.PURE_TOMATE, 0.5);
      unPlato.putIngrediente(Ingrediente.FIDEOS, 0.33);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(SALCHICHAS_PURE);
      unPlato.putIngrediente(Ingrediente.SALCHICHAS, 1.0);
      unPlato.putIngrediente(Ingrediente.SALCHICHAS_VIENA, 1.0);
      unPlato.putIngrediente(Ingrediente.PAPA, 4.0);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(POLENTA_QUESO);
      unPlato.putIngrediente(Ingrediente.POLENTA, 0.300);
      unPlato.putIngrediente(Ingrediente.QUESO_MANTECOSO, 0.250);
      platosMap.put(unPlato.getNombre(), unPlato);

      unPlato = new Plato(FAJITAS_CERDO);
      unPlato.putIngrediente(Ingrediente.CARRE, 0.300);
      unPlato.putIngrediente(Ingrediente.CEBOLLA, 1);
      unPlato.putIngrediente(Ingrediente.MORRON, 1);
      unPlato.putIngrediente(Ingrediente.ZANAHORIA, 1);
      unPlato.putIngrediente(Ingrediente.ZAPALLITO, 1);
      platosMap.put(unPlato.getNombre(), unPlato);

      return platosMap;
   }

   /**
    * @return
    */
   private static List<Plato> menu1() {
      final Map<String, Plato> platosMap = InMemoryDB.getPlatosMap();

      final List<Plato> menu = Lists.newArrayList();

      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(RAVIOLES_SALSA_ACELGA));
      menu.add(platosMap.get(RISOTTO));
      menu.add(platosMap.get(POLLO_AL_HORNO_PURE));
      menu.add(platosMap.get(PASTA_CON_BOLOGNESA));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(PIZZA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(G_NOCCHI_SALSA_MIXTA));

      menu.add(platosMap.get(PASTA_CON_BOLOGNESA));
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(POLLO_AL_HORNO_PURE));
      menu.add(platosMap.get(G_NOCCHI_SALSA_MIXTA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(RAVIOLES_CON_ESTOFADO));
      menu.add(platosMap.get(PIZZA));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));

      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(PASTA_CON_BOLOGNESA));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(RISOTTO));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(RAVIOLES_SALSA_ACELGA));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(POLLO_AL_VERDEO));
      menu.add(platosMap.get(PIZZA));
      menu.add(platosMap.get(EMPANADAS_ATUN));

      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(PASTEL_DE_CARNE));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(RISOTTO));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(G_NOCCHI_SALSA_MIXTA));
      menu.add(platosMap.get(PIZZA));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(POLLO_PLANCHA));

      return menu;
   }

   /**
    * @return
    */
   private static List<Plato> menu2() {
      final Map<String, Plato> platosMap = InMemoryDB.getPlatosMap();

      final List<Plato> menu = Lists.newArrayList();

      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(RAVIOLES_SALSA_ACELGA));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(POLLO_AL_HORNO_PURE));
      menu.add(platosMap.get(RISOTTO));
      menu.add(platosMap.get(PASTA_CON_BOLOGNESA));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(PIZZA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(EMPANADAS_ATUN));

      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(G_NOCCHI_SALSA_MIXTA));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(POLLO_AL_HORNO_PURE));
      menu.add(platosMap.get(RISOTTO));
      menu.add(platosMap.get(PASTA_CON_BOLOGNESA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(RAVIOLES_CON_ESTOFADO));

      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(PASTEL_DE_CARNE));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(RAVIOLES_SALSA_ACELGA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(PIZZA));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(EMPANADAS_ATUN));

      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(PASTA_CON_BOLOGNESA));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(PASTEL_DE_CARNE));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(PIZZA));

      return menu;
   }

   /**
    * @return
    */
   private static List<Plato> menu3() {
      final Map<String, Plato> platosMap = InMemoryDB.getPlatosMap();

      final List<Plato> menu = Lists.newArrayList();

      menu.add(platosMap.get(TARTA_VERDURA));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(PASTA_CON_BOLOGNESA));
      menu.add(platosMap.get(RISOTTO));
      menu.add(platosMap.get(FIDEOS_SALSA_ATUN));
      menu.add(platosMap.get(POLLO_AL_VERDEO));
      menu.add(platosMap.get(PIZZA));
      menu.add(platosMap.get(G_NOCCHI_SALSA_MIXTA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));

      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(POLLO_AL_HORNO_PURE));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(PASTA_SALSA));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(FIDEOS_SALSA_ATUN));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(RAVIOLES_CON_ESTOFADO));
      menu.add(platosMap.get(TARTA_VERDURA));
      menu.add(platosMap.get(EMPANADAS_CARNE));

      menu.add(platosMap.get(RISOTTO));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(CAZUELA_DE_POLLO));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(PIZZA));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(TARTA_JQ));

      menu.add(platosMap.get(SALTEADO_FIDEOS));
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(TEMPURA));
      menu.add(platosMap.get(PASTA_SALSA));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(EMPANADAS_CARNE));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(POLLO_AL_HORNO_ENSALADA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(PASTA_SALSA));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(PIZZA));

      return menu;
   }

   /**
    * @return
    */
   private static List<Plato> menu4() {
      final Map<String, Plato> platosMap = InMemoryDB.getPlatosMap();

      final List<Plato> menu = Lists.newArrayList();

      menu.add(platosMap.get(SALCHICHAS_PURE));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(FIDEOS_SALSA_ATUN));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(POLLO_PLANCHA));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(FIDEOS_SALSA_BOLOGNESA));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(SALTEADO_FIDEOS));
      menu.add(platosMap.get(POLLO_AL_VERDEO));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));

      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(POLENTA_QUESO));
      menu.add(platosMap.get(POLLO_AL_HORNO_ENSALADA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(FIDEOS_SALSA_ATUN));
      menu.add(platosMap.get(RAVIOLES_CON_ESTOFADO));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(G_NOCCHI_SALSA_MIXTA));
      menu.add(platosMap.get(MERLUZA_CON_PURE));
      menu.add(platosMap.get(FIDEOS_TUCO));
      menu.add(platosMap.get(FAJITAS_CERDO));
      menu.add(platosMap.get(SALTEADO_FIDEOS));
      menu.add(platosMap.get(EMPANADAS_CARNE));

      menu.add(platosMap.get(POLLO_PLANCHA));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(G_NOCCHI_SALSA_MIXTA));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(POLLO_AL_VERDEO));
      menu.add(platosMap.get(REVUELTO_ARROZ));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(SALCHICHAS_PURE));

      menu.add(platosMap.get(SALTEADO_FIDEOS));
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(G_NOCCHI_SALSA_MIXTA));
      menu.add(platosMap.get(MERLUZA_CON_PURE));
      menu.add(platosMap.get(FIDEOS_TUCO));
      menu.add(platosMap.get(PASTEL_DE_CARNE));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(POLLO_AL_HORNO_ENSALADA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(FAJITAS_CERDO));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(REVUELTO_ARROZ));

      return menu;
   }
   /**
    * @return
    */
   private static List<Plato> menuInvierno() {
      final Map<String, Plato> platosMap = InMemoryDB.getPlatosMap();

      final List<Plato> menu = Lists.newArrayList();

      menu.add(platosMap.get(TARTA_VERDURA));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(SOPA));
      menu.add(platosMap.get(SOPA));
      menu.add(platosMap.get(CARNE_HORNO));
      menu.add(platosMap.get(RISOTTO));
      menu.add(platosMap.get(FIDEOS_SALSA_ATUN));
      menu.add(platosMap.get(POLLO_AL_VERDEO));
      menu.add(platosMap.get(PIZZA));
      menu.add(platosMap.get(CERDO_BATATA_CEBOLLA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));

      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(BOCADILLOS_DE_ACELGA));
      menu.add(platosMap.get(POLLO_AL_HORNO_ENSALADA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(FIDEOS_SALSA_ATUN));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(GUISO_LENTEJAS));
      menu.add(platosMap.get(GUISO_LENTEJAS));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));//MERLUZA
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(RAVIOLES_CON_ESTOFADO));
      menu.add(platosMap.get(TARTA_VERDURA));
      menu.add(platosMap.get(EMPANADAS_CARNE));

      menu.add(platosMap.get(RISOTTO));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(CAZUELA_POLENTA));
      menu.add(platosMap.get(CAZUELA_POLENTA));
      menu.add(platosMap.get(FIDEOS_HONGOS_VERDEO));
      menu.add(platosMap.get(SOPA));
      menu.add(platosMap.get(SOPA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(FIDEOS_SALSA_ACELGA));
      menu.add(platosMap.get(MILANESA_CON_ENSALADA));
      menu.add(platosMap.get(OMELETTE_CON_FRITAS));
      menu.add(platosMap.get(CERDO_BATATA_CEBOLLA));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(PIZZA));

      menu.add(platosMap.get(SALTEADO_FIDEOS));
      menu.add(platosMap.get(ZAPALLITOS_CON_QUESO));
      menu.add(platosMap.get(TORTILLA_CON_ENSALADA));
      menu.add(platosMap.get(PUCHERO));
      menu.add(platosMap.get(PUCHERO));
      menu.add(platosMap.get(MILANESA_CON_PURE));
      menu.add(platosMap.get(ENSALADA_GALLEGA));
      menu.add(platosMap.get(PASTEL_DE_CARNE));
      menu.add(platosMap.get(TARTA_VERDURA));
      menu.add(platosMap.get(POLLO_AL_HORNO_ENSALADA));
      menu.add(platosMap.get(ARROZ_CHINO));
      menu.add(platosMap.get(PASTA_SALSA));
      menu.add(platosMap.get(EMPANADAS_ATUN));
      menu.add(platosMap.get(REVUELTO_ARROZ));

      return menu;
   }
}
