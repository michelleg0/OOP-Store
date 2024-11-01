import java.util.ArrayList;
import java.util.List;
//public access modifier that makes this class accessible from anywhere in the program
public class Aisle {
private String aisleLocation;
//ArrayList to store products
private List<Product> products;

public Aisle(String aisleLocation) {
    this.aisleLocation = aisleLocation;
//Initializing ArrayList
    this.products = new ArrayList<>();
    
}

public String getaisleLocation(){
    return aisleLocation;
}

public void addProduct (Product product){
    products.add(product);
    System.out.println("New inventory alert! " + product.getName() + " has been added to " + aisleLocation + " aisle ");
}

public void listProductNames() {
    System.out.println("Product is located in: " + aisleLocation + " aisle ");
}






    
}
