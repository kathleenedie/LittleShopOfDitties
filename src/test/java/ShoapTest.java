import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Recorder;
import org.junit.Before;
import org.junit.Test;
import stock.CategoryType;
import stock.Item;

import static org.junit.Assert.assertEquals;

public class ShoapTest {

    private Shoap shop;
    private Guitar guitar;
    private Recorder recorder;
    private Item beaters;

    @Before
    public void before(){
        shop = new Shoap();
        guitar = new Guitar(CategoryType.INSTRUMENT, 205.00, 320.00, InstrumentType.STRING, "twang", "bass");
        recorder = new Recorder(CategoryType.INSTRUMENT, 12.00, 22.00, InstrumentType.WIND, "too", "treble");
        beaters = new Item(CategoryType.BEATERS, 8.00, 15.00, "wee hands", 2);
    }

    @Test
    public void hasInitialEmptyStockList(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddStockItems(){
        shop.addStockItem(guitar);
        shop.addStockItem(recorder);
        shop.addStockItem(beaters);
        assertEquals(3, shop.getStock().size());
    }

    @Test
    public void canRemoveStockItems(){
        shop.addStockItem(guitar);
        shop.addStockItem(recorder);
        shop.addStockItem(beaters);
        shop.removeStockItem(beaters);
        assertEquals(2, shop.getStock().size());
    }
}
