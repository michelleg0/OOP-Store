
//Inherits from the Product superclass
public class Mascara extends Product {

    private boolean waterproof;
    
    public Mascara(String name, String sku, double price,double discount, String brushType, boolean waterproof) {
//super class constructor
        super(name, sku, price, discount);
        this.waterproof = waterproof;
    }

    public boolean isWaterproof(){
        return waterproof;
    }
    
}
