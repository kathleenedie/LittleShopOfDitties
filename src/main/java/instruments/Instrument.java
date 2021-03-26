package instruments;

import behaviours.IPlay;
import behaviours.ISell;
import stock.StockItems;

public abstract class Instrument extends StockItems implements IPlay, ISell {
}
