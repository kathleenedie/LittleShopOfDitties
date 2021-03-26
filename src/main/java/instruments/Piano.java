package instruments;

import stock.CategoryType;

public class Piano extends Instrument{

    private String size;

    public Piano(CategoryType category, double buyingPrice, double sellingPrice, InstrumentType type, String sound, String size) {
        super(category, buyingPrice, sellingPrice, type, sound);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String play(){
        return "Tinkle me to hear " + getSound();
    }
}
