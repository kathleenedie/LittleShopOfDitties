import instruments.Clarinet;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import stock.CategoryType;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    private Clarinet clarinet1;

    @Before
    public void before(){
        clarinet1 = new Clarinet(CategoryType.INSTRUMENT, 40.00, 95.00, InstrumentType.WIND, "proooaaaeee", 8);
    }

    @Test
    public void hasCategory(){
        assertEquals(CategoryType.INSTRUMENT, clarinet1.getCategory());
    }

    @Test
    public void canPlay(){
        assertEquals("Blow me to hear proooaaaeee", clarinet1.play());
    }
}
