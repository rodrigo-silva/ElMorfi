package ar.com.wazoo;

import org.junit.Test;

public class AppTest {

   @Test
   public void test() throws Exception{
      Application.main(new String[] { "-c", "4", "5", "n", "1", "6", "n"});
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
}
