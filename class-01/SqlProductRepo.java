public class SqlProductRepo extends ProductRepo {

    @Override
    public void getProductById(int id) {
        System.out.println("Product being fetched from SQL Repo!");
    }

}