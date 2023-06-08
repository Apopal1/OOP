
abstract class InventoryItem {

    private int id;
    private int stockQuantity;

    public InventoryItem(){}

    public InventoryItem(int id,int stockQuantity){

        this.id=id;
        this.stockQuantity=stockQuantity;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

}
