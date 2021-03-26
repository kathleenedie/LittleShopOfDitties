package instruments;

import stock.CategoryType;

public class Clarinet extends Instrument{

    private int numberKeys;

    public Clarinet(CategoryType category, double buyingPrice, double sellingPrice, InstrumentType type, String sound, int numberKeys) {
        super(category, buyingPrice, sellingPrice, type, sound);
        this.numberKeys = numberKeys;
    }

    public int getNumberKeys() {
        return numberKeys;
    }

    public String play(){
        return "Blow me to hear " + this.getSound();
    }
}
