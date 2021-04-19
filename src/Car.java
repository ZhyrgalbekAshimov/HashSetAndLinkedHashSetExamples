public class Car{

    private int id;
    private String yearOfProduce;
    private Condition condition;
    private String model;

    Car(String model, String yearOfProduce, Condition condition) {
        this.model = model;
        this.yearOfProduce = yearOfProduce;
        this.condition = condition;
        this.id = (int) (Math.random() * 100000000);
    }

    public String getModel() {
        return model;
    }

    int getId() {
        return id;
    }

    public String getYearOfProduce() {
        return yearOfProduce;
    }

    public Condition getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return model;
    }

}
