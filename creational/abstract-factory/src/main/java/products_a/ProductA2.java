package products_a;

public class ProductA2 implements ProductA {
    public ProductA2() {
        System.out.println("Product A2 created");
    }

    @Override
    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
