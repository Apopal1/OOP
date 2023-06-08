import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Supplier supplier = new Supplier();
         try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("prostheste agores gia ton promitheyth (0 gia return sto id):");
            
            try {
                while (true) {
                    System.out.print("Dwse id: ");
                    int productId = scanner.nextInt();
                    
                    if (productId == 0) {
                        break;
                    }
                    
                    System.out.print("Dwsto onoma proiontos: ");
                    String productName = scanner.next();
                    
                    System.out.print("Dwste thn timh agoras: ");
                    double purchasePrice = scanner.nextDouble();
                    
                    System.out.print("Dwste thn posothta ton temaxiwn: ");
                    int quantity = scanner.nextInt();
                    
                    supplier.addPurchase(productId, productName, purchasePrice, quantity);
                }
            } 
            catch (Exception e) {
              //  System.out.println("Parousiastike sfalma kata thn agora.");
                e.printStackTrace();
            }
        }
        
    
        
}}
