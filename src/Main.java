import java.util.*;

// Есть список автомобилей с их техническим состоянием:
// Good     - хорошее состояние
// Bad      - плохое состояния
// Unusable - непригодный для использования

// Comparator сравнивает их состояния и выводит по 1 автомобилю по каждому из состояний в порядке возврастания (Unusable, Bad, Good)

public class Main {

    public static void main(String[] args) {

        Set<Car> ts = new TreeSet<> (new CarComparator());

        ts.add(new Car("Audi", "2005", Condition.BAD));
        ts.add(new Car("BMW", "2008", Condition.GOOD));
        ts.add(new Car("Volvo", "1999", Condition.GOOD));
        ts.add(new Car("Mercedes", "2000", Condition.UNUSABLE));
        ts.add(new Car("Honda", "2000", Condition.BAD));


        System.out.printf("%-14s %-14s %-14s %-14s %n", "Model", "Year produce", "Condition", "ID");
        System.out.println("-----------------------------------------------------");
        for(Car c : ts) {
            String yearOfProduce = c.getYearOfProduce();
            int id = c.getId();
            String cond = c.getCondition().toString();
            System.out.printf("%-14s %-14s %-14s %d %n", c, yearOfProduce, cond, id);
        }
    }
}
