class Supplier {

    private String name;
    private Product[] products;
    

    public Supplier(){}

    public Supplier(String name ,Product[] products){

        this.name=name;
        this.products=new Product[10];
        

    }

    public void addPurchase(int productId, String productName, double purchasePrice, int quantity) {

        // Έλεγχος αν το προϊόν υπάρχει ήδη
        for (int i = 0; i < 10; i++) {
            if (products[i].getId() == productId) {
                // Το προϊόν υπάρχει ήδη, προσθέτουμε τα τεμάχια
                products[i].addItems(quantity, purchasePrice,productId,productName);
                
                break;
            }
        }

}

    public String toString(){

        String s = "Onoma = " + getName();
        s += "\nporion = " + getProducts();
        

        return s;
        
    }

    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }

    

    public void setName(String name) {
        this.name = name;
    }
     
    public void setProducts(Product[] products) {
        this.products = products;
    }}

    
