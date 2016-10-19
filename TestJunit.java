import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestJunit {
	@Test
	   public void testString() {
	      String str= "Junit, Hello world!" ;
	      assertEquals("Junit, Hello world!",str);
	   }
}
