package ar.com.wazoo;

import org.junit.Test;

public class AppTest {

   @Test
   public void test() throws Exception{
      Application.main(new String[] { "-c", "1", "5", "n", "2", "6", "m"});
//      Application.main(new String[] { "-m" });
   }
   
   @Test
   public void testMenu() throws Exception{
      Application.main(new String[] { "-m" });
   }
   
   @Test
   public void testPlatos() throws Exception{
      Application.main(new String[] { "-p" });
   }

   @Test
   public void testPlatosDelMenu() throws Exception{
      Application.main(new String[] { "-pm" });
   }
}
