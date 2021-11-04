package store;

/*
    @author sak5680
*/
public class CashRegister {
    
    private int itemCount;
    private double totalPrice;
    private int totalCount;
    private double totalSales;
    
    public void addItem(double price){
        itemCount++;
        totalCount = itemCount;
        totalPrice = totalPrice + price;
        totalSales = totalPrice;
    }
    
    public double getTotal(){
        return totalPrice;
    }
    
    public double getSalesTotal(){
        return totalSales;
    }
    
    public int getCount(){
        return itemCount;
    }
    
    public int getSalesCount(){
        return totalCount;
    }
    
    public void clear(){
        itemCount = 0;
        totalPrice = 0;
    }
    
    
    public void resetSales(){
        clear();
        totalCount = 0;
        totalSales = 0;
    }
    
}
