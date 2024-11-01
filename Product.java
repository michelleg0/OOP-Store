
//public access modifier that makes this class accessible frm anywhere in the program

public class Product {
//Instance variables
//The access modifiers are set to private, so this restricts access to this just this class (encapsulation).
    private String name;
    private String sku;
    private double price;

//Constructor. Set to public, so it can be called outside of the class
public Product(String name, String sku, double price) {

//This keyword refers to the current object.
    this.name = name;
    this.sku = sku;
    this.price = price;

}

//Getter methods below are accessible outside of the class
//The return value is an instance variable
public String getName() {
    return name;
}

public String getSku() {
    return sku;
}

public double getPrice() {
    return price;
}
    
}
