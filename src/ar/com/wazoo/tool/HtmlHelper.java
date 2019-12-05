package ar.com.wazoo.tool;

import java.util.Iterator;
import java.util.List;

import ar.com.wazoo.model.Plato;

public class HtmlHelper {
   
   public static String buildHtmlMenu(final List<Plato> platos) {
      StringBuffer sb = new StringBuffer();
      sb.append("<html><head><style>");
      sb.append("th,td{border: 1px solid black;}");
      sb.append("th div, td div{padding: 10px;}");
      sb.append("</style></head><body><table>");

      sb.append("<tr>");

      sb.append("<th>");
      sb.append("<div>Lunes</div>");
      sb.append("</th>");
      sb.append("<th>");
      sb.append("<div>Martes</div>");
      sb.append("</th>");
      sb.append("<th>");
      sb.append("<div>Miercoles</div>");
      sb.append("</th>");
      sb.append("<th>");
      sb.append("<div>Jueves</div>");
      sb.append("</th>");
      sb.append("<th>");
      sb.append("<div>Viernes</div>");
      sb.append("</th>");
      sb.append("<th>");
      sb.append("<div>Sabado</div>");
      sb.append("</th>");
      sb.append("<th>");
      sb.append("<div>Domingo</div>");
      sb.append("</th>");
      
      sb.append("</tr>");
      
      for (final Iterator<Plato> iterator = platos.iterator(); iterator.hasNext();) {

         sb.append("<tr>");
         for (int i = 0; i < 7; i++) {
            sb.append("<td>");
            final Plato almuerzo = iterator.next();
            final Plato cena = iterator.next();
            sb.append(String.format("<div style=\"%s\">%s</div>", almuerzo.getCssRule(), almuerzo.getNombre()));
            sb.append(String.format("<div style=\"%s\">%s</div>",cena.getCssRule(), cena.getNombre()));
            sb.append("</td>");
         }
         sb.append("</tr>");
      }
      sb.append("</table></body></html>");
      
      return sb.toString();   
   }
}
