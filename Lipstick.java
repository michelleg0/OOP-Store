
//Inheritance. Lipstick is a subclass of Product
public class Lipstick extends Product {
//Instance variable
//private to encapsulate within the class
    private String shade;

    public Lipstick(String name, String sku, double price, double discount,String shade) {
//reusing the constructor of the parent class
        super(name, sku, price, discount);
//assigning the shade parameter to the shade instance
        this.shade = shade;
    }
//Additional attribute. The public access modifier allows access to shade.
    public String getShade() {
        return shade;
    }
    
}
