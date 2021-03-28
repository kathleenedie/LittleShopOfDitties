import behaviours.ISell;
import stock.Item;

import java.util.ArrayList;
import java.util.Collection;

public class Shoap {

    private ArrayList<ISell> stock;

    public Shoap() {
        this.stock = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public void addStockItem(ISell iSell){
        this.stock.add((iSell));
    }


    public void removeStockItem(ISell iSell) {
        this.stock.remove(0);
    }
}
