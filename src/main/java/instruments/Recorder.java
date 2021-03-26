package instruments;

import stock.CategoryType;

public class Recorder extends Instrument{

    private String size;

    public Recorder(CategoryType category, double buyingPrice, double sellingPrice, InstrumentType type, String sound, String size) {
        super(category, buyingPrice, sellingPrice, type, sound);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play(){
        return "you will hear " + getSound() + "if you blow me";
    }
}
