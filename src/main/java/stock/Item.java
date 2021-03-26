package stock;

public class Item extends StockItems{

    private String name;
    private int packSize;

    public Item(CategoryType category, double buyingPrice, double sellingPrice, String name, int packSize) {
        super(category, buyingPrice, sellingPrice);
        this.name = name;
        this.packSize = packSize;
    }

    public String getName() {
        return name;
    }

    public int getPackSize() {
        return packSize;
    }

    public double calculateMarkUp(){
        return getSellingPrice() - getBuyingPrice();
    }
}
