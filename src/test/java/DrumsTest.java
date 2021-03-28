import instruments.Drums;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import stock.CategoryType;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    private Drums drums;

    @Before
    public void before(){
        drums = new Drums(CategoryType.INSTRUMENT, 102.00, 180.00, InstrumentType.PERCUSSION, "bang", "Gamalan");
    }

    @Test
    public void hasName(){
        assertEquals("Gamalan", drums.getName());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(78.00, drums.calculateMarkUp(), 0.01);
    }
}
