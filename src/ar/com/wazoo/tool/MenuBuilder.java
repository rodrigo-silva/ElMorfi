package ar.com.wazoo.tool;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

import ar.com.wazoo.exception.PlatoNotFoundException;
import ar.com.wazoo.model.Plato;
import ar.com.wazoo.model.Plato.Caracteristica;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class MenuBuilder {

   private Set<Plato> platos;

   public MenuBuilder(final Set<Plato> platos) {
      this.platos = platos;
   }
   
   /**
    * 
    */
   public void printPlatosReport() {
      int carbo = 0;
      int calientes = 0;
      final HashMap<Caracteristica, Integer> caracteristicas = Maps.newHashMap();
      
      for (Caracteristica c : Caracteristica.values()) {
         caracteristicas.put(c, 0);
      }
      
      for (Plato plato : this.platos) {
         StringBuilder sb = new StringBuilder();
         sb.append(plato.getNombre());
         sb.append(" es caliente: " + plato.isCaliente());
         sb.append(" es carbo: " + plato.isCarbohidrato());
         System.out.println(sb.toString());
         
         carbo = plato.isCarbohidrato() ? carbo + 1 : carbo;
         calientes = plato.isCaliente() ? calientes + 1 : calientes;
      }
      
      System.out.println("Total es: " + this.platos.size());
      System.out.println("carbo: " + carbo);
      System.out.println("calientes " + calientes);
   }

   /**
    * 
    * @return
    * @throws Exception
    */
   public List<Plato> generateMenuVerano() {
      final List<Plato> temp = createShuffledList();
      
      final List<Plato> menuGenerado = Lists.newArrayList();
      for (int i = 0; i < 56; i++) {
         Plato conseguido = null;
         
         //ya usaste todos los platos, tenes que reponer
         if (temp.size() == 0) {
            temp.addAll(createShuffledList());
         }
         for (Plato plato : temp) {
            if(i== 0) {
               conseguido = plato;
               break;
            }
            if(cumpleCondiciones(plato, menuGenerado, i)) {
               conseguido = plato;
               break;
            }
         }
         
         if(conseguido != null) {
            temp.remove(conseguido);
            menuGenerado.add(conseguido);
         } else {
            agregarPlatoRepetido(menuGenerado, i);
         }
      }
      
      return menuGenerado;
   }

   /**
    * 
    * @param plato
    * @param menuGenerado
    * @param indice
    * @return
    */
   private boolean cumpleCondiciones(final Plato plato, final List<Plato> menuGenerado, final int indice ) {
      if(indice % 2 == 0 && plato.isCaliente()) {
         return false;
      }
      
//      if(menuGenerado.get(indice - 1).isCarbohidrato() && plato.isCarbohidrato()) {
//         return false;
//      }
      
      if(chocaCaracteristica(plato, menuGenerado, indice)) return false;
      if(repiteCarne(plato, menuGenerado, indice)) return false;
      if(repitePescado(plato, menuGenerado, indice)) return false;
      if(repitePlato(plato, menuGenerado, indice)) return false;
      
      return true;
   }

   /**
    * @param plato
    * @param menuGenerado
    * @param indice
    */
   private boolean repitePlato(final Plato plato, final List<Plato> menuGenerado, final int indice) {
      int atras = 1;
      while (atras < 7 && (indice - atras) >= 0) {
         if (plato.equals(menuGenerado.get(indice - atras))) {
            return true;
         }
         atras++;
      }
      return false;
   }

   /**
    * @param plato
    * @param menuGenerado
    * @param indice
    */
   private boolean repiteCarne(final Plato plato, final List<Plato> menuGenerado, final int indice) {
      if (plato.getCaracteristica().equals(Caracteristica.CARNE)) {
         int atras = 1;
         while (atras < 10 && (indice - atras) >= 0) {
            if (menuGenerado.get(indice - atras).getCaracteristica().equals(Caracteristica.CARNE)) {
               return true;
            }
            atras++;
         }
      }
      
      return false;
   }
   
   private boolean repitePescado(final Plato plato, final List<Plato> menuGenerado, final int indice) {
      if (plato.getCaracteristica().equals(Caracteristica.PESCADO)) {
         int atras = 1;
         while (atras < 12 && (indice - atras) >= 0) {
            if (menuGenerado.get(indice - atras).getCaracteristica().equals(Caracteristica.CARNE)) {
               return true;
            }
            atras++;
         }
      }
      
      return false;
   }

   /**
    * @param plato
    * @param menuGenerado
    * @param indice
    */
   private boolean chocaCaracteristica(final Plato plato, final List<Plato> menuGenerado, final int indice) {
      int atras = 1;
      while (atras < 4 && (indice - atras) >= 0) {
         if(plato.getCaracteristica() != Caracteristica.INDIFERENTE && menuGenerado.get(indice - atras).getCaracteristica() != Caracteristica.INDIFERENTE) {
            if(plato.getCaracteristica().equals(menuGenerado.get(indice - atras).getCaracteristica())) {
               return true;
            }
         }
         atras++;
      }
      return false;
   }

   /**
    * agrega un plato del listado total al menu.
    * 
    * @param menuGenerado
    * @param i
    */
   private void agregarPlatoRepetido(final List<Plato> menuGenerado, int i) {
      Plato repetido = null;
      for (Plato plato : createShuffledList()) {
         if(cumpleCondiciones(plato, menuGenerado, i)) {
            repetido = plato;
            break;
         }
      }
      if(repetido != null) {               
         menuGenerado.add(repetido);
      } else {
         throw new PlatoNotFoundException(menuGenerado, this.platos);
      }
   }

   /**
    * crea un lista nueva
    * @return
    */
   private List<Plato> createShuffledList() {
      final List<Plato> temp = Lists.newArrayList();
      temp.addAll(this.platos);
      Collections.shuffle(temp, new Random());
      
      return temp;
   }
   
   private List<Plato> createShuffledListSinFritas() {
      final List<Plato> temp = Lists.newArrayList();

      for (Plato plato : this.platos) {
         if(plato.getNombre().contains("fritas")) continue;
         temp.add(plato);
      }
      Collections.shuffle(temp, new Random());
      
      return temp;
   }
}