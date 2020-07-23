import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Junit {

    @Test
   public void testName() throws Exception{

        assertEquals(4,Calculator.add(2,2));
    }



}
