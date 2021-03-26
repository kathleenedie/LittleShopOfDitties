package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import stock.CategoryType;
import stock.StockItems;

public abstract class Instrument extends StockItems implements IPlay{

    private InstrumentType type;
    private String sound;

    public Instrument(CategoryType category, double buyingPrice, double sellingPrice, InstrumentType type, String sound) {
        super(category, buyingPrice, sellingPrice);
        this.type = type;
        this.sound = sound;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public String play(){
        return "I make the sound " + getSound();
    }
}
