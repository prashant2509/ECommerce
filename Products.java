package shopping;


import java.util.ArrayList;
import java.util.List;


public class Products {
    private final List<Product> products = new ArrayList<Product>();

    public Products () {
        this.initStoreItems();
    }
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void initStoreItems() {
        String [] productNames = {"Laptop", "mobile", "headphones"};
        Double [] productPrice = {40000.0d, 20000.0d, 800.0d};
        Integer [] stock = {10, 6, 10};
        
        for (int i=0; i < productNames.length; i++) {
            this.products.add(new Product(i+1, productNames[i], productPrice[i], stock[i]));
        }
    }
}