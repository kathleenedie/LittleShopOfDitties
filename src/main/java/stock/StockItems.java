package stock;

import behaviours.ISell;
import jdk.jfr.Category;

public abstract class StockItems implements ISell {

    private CategoryType category;
    private double buyingPrice;
    private double sellingPrice;

    public StockItems(CategoryType category, double buyingPrice, double sellingPrice) {
        this.category = category;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public CategoryType getCategory() {
        return category;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkUp(){
        return getSellingPrice() - getBuyingPrice();
    }
}
