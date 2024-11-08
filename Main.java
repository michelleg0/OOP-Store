
public class Main {
//tests
    public static void main(String[] args) {
    //Aisle for makeup products
    Aisle makeupAisle = new Aisle("Makeup");
    //Products

    Product lipstick = new Lipstick("Lipstick", "T001", 12.99,0.0, "pink");
    Product lipstick2 = new Lipstick("Lipstick2", "T002", 12.99,0.0, "red");

    //Add products to the makeup aisle
    makeupAisle.addProduct(lipstick);
    makeupAisle.addProduct(lipstick2);

    //Display the products in thhe makeup aisle

    makeupAisle.listProductNames();
        
    }

   
    
}