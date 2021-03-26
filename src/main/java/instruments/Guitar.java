package instruments;

import stock.CategoryType;

public class Guitar extends Instrument{

    private String model;

    public Guitar(CategoryType category, double buyingPrice, double sellingPrice, InstrumentType type, String sound, String model) {
        super(category, buyingPrice, sellingPrice, type, sound);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String play(){
        return "Strum me to hear " + getSound();
    }
}
