public class Product {
    @Override
    public String toString() {
        return name;
    }

    private String name;
    private int id;

    Product(String name) {
        this.name = name;
        this.id = (int) (Math.random() * 100000000);
    }

    public String getName() {
        return name;
    }

    int getId() {
        return id;
    }

}
