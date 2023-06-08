
class Item extends InventoryItem {

    private double lotPrice;

    public Item(){}

    public Item(int id, int stockQuantity, double lotPrice){

        super(id,stockQuantity);
        this.lotPrice=lotPrice;

    }

    public double getLotPrice() {
        return lotPrice;
    }

    public void setLotPrice(double lotPrice) {
        this.lotPrice = lotPrice;
    }

}
