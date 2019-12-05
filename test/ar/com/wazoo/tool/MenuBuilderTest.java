package ar.com.wazoo.tool;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import ar.com.wazoo.InMemoryDB;
import ar.com.wazoo.model.Plato;

import com.google.common.collect.Sets;

public class MenuBuilderTest {

   @Test
   public void testMenuBuilder() throws Exception {
      final Set<Plato> platos = Sets.newHashSet(InMemoryDB.getMenu());
//      final Set<Plato> platos = Sets.newHashSet(InMemoryDB.getPlatosMap().values());
      final MenuBuilder menuBuilder = new MenuBuilder(platos);
      
      StringBuilder sb = new StringBuilder();
      
      for (int i = 0; i < 25; i++) {
         try {
            sb.append(HtmlHelper.buildHtmlMenu(menuBuilder.generateMenuVerano()));
         } catch (Exception e) {
         }
      }
      
      FileUtils.writeStringToFile(new File(System.getProperty("user.home") + "\\Desktop\\menuTest.html"), sb.toString(), "UTF-8");
   }
   
   @Test
   public void testMenuBuilderReport() {
      final MenuBuilder menuBuilder = new MenuBuilder(Sets.newHashSet(InMemoryDB.getMenu()));
      
      menuBuilder.printPlatosReport();
   }
}