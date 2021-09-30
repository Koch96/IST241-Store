package store;

/**@author sak5680 */

public class Store {

    public static void main(String[] args) {
        CashRegister register1 = new CashRegister();
        
        register1.addItem(1.65);
        register1.addItem(2.05);
       
        System.out.println("The total # of items purchased is: " + register1.getCount());
        System.out.printf("The total price is: $%.2f\n", register1.getTotal());
        
        register1.clear();
        
        System.out.println("The total # of items purchased is: " + register1.getCount());
        System.out.printf("The total price is: $%.2f\n", register1.getTotal());
    }
    
}
