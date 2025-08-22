public class PaymentProcessor {
    ProductRepo pr;

    PaymentProcessor(ProductRepo pr) {
        this.pr = pr;
    }

    void pay(int productID) {
        System.out.println();
        pr.getProductById(productID);
        System.out.println("Processing payment for this product...");
        System.out.println();
    }
}