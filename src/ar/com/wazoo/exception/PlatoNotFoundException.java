package ar.com.wazoo.exception;

import java.util.List;
import java.util.Set;

import ar.com.wazoo.model.Plato;

public class PlatoNotFoundException extends RuntimeException {

   private static final long serialVersionUID = -3738009855101115393L;
   private List<Plato> menuGenerado;
   private Set<Plato> platos;
   
   
   public PlatoNotFoundException(List<Plato> menuGenerado, Set<Plato> platos) {
      this.menuGenerado = menuGenerado;
      this.platos = platos;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("no encuentro plato para este menu: /n");
      
      for (Plato plato : menuGenerado) {
         sb.append(plato.getNombre() + "/n");
      }
      System.out.println(sb.toString());
      return sb.toString();
   }

}
