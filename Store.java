import java.util.ArrayList;
import java.util.List;

public class Store {
    private String storeName;
    private int storeNumber;
    private List<Aisle> aisles;
    

    public Store(String storeName, int storeNumber, double discountRate) {
        this.storeName = storeName;
        this.storeNumber = storeNumber;
        this.aisles = new ArrayList<>();

    }

    public static void main(String[] args) {
        
    }
    
}
