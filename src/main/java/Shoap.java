import behaviours.ISell;

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
}
