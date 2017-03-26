package ar.com.wazoo.json;

import ar.com.wazoo.InMemoryDB;

import com.fasterxml.jackson.jr.ob.JSON;

public class JsonTest {

   public static void main(final String[] args) throws Exception {
      System.out.println(JSON.std.asString(InMemoryDB.getMenu()));

   }
}
