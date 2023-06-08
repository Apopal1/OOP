//import java.lang.reflect.Array;

public class Product implements iProductInventory {

        private int id;
        private String productName;
        private Item[] items;
        private int ItemCount;

        public Product(int id,String productName ){

            this.id = id;
            this.productName = productName;
            this.items = new Item[1000];

        }

        public int getId() {
            return id;
        }

        public double getInventoryValue() {

            
            return 0;
        }

        public  void addItems(int quantity, double purchasePrice,int productId, String productName) {
           
            
            
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Item[] getItems() {
            return items;
        }

        public void setItems(Item[] items) {
            this.items = items;
        }

        public int getItemCount() {
            return ItemCount;
        }

        public void setItemCount(int itemCount) {
            ItemCount = itemCount;
        }
            

        
        

       

}
