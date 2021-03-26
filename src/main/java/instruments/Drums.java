package instruments;

import stock.CategoryType;

public class Drums extends Instrument{

    private String name;

    public Drums(CategoryType category, double buyingPrice, double sellingPrice, InstrumentType type, String sound, String name) {
        super(category, buyingPrice, sellingPrice, type, sound);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String play(){
        return "Bang me to hear " + getSound();
    }
}
