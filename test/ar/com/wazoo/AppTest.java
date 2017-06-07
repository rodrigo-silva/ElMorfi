package ar.com.wazoo;

import org.junit.Test;

public class AppTest {

   @Test
   public void test() throws Exception{
      Application.main(new String[] { "-c", "1", "1", "m", "4", "7", "n"});
//      Application.main(new String[] { "-m" });
   }
}
