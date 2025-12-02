class Product {
    private String productId;
    public Product(String productId) {
        this.productId = productId;
    }
    public void showDetails() {
        System.out.println("Product ID: " + productId);
    }
}
class Electronics extends Product {
    private String warranty;

    public Electronics(String productId, String warranty) {
        super(productId);
        this.warranty = warranty;
    }
    @Override
    public void showDetails() {
        super.showDetails(); 
        System.out.println("Warranty: " + warranty);
    }
}
public class Main {
    public static void main(String[] args) {
        Product genericProduct = new Product("P123");
        System.out.println("--- Generic Product Details ---");
        genericProduct.showDetails();

        System.out.println("\n--- Electronics Product Details ---");
        Electronics laptop = new Electronics("E456", "2 Years");
        laptop.showDetails();
    }
}
