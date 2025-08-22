public class Main {
    public static void main(String[] args) {
        ProductRepo pr = new SqlProductRepo();
        PaymentProcessor pp = new PaymentProcessor(pr);
        pp.pay(1);
    }
}
