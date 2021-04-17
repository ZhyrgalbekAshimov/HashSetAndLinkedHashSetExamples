import java.util.Map;
import java.util.TreeMap;

//Список продуктов с датами истечения их сроков. 
public class Main {

    public static void main(String[] args) {

        Map<String, Product> tm = new TreeMap<>(new DateComparator());
        tm.put("09-05-2020", new Product("Sausage"));
        tm.put("01-05-2020", new Product("Sardines"));
        tm.put("20-10-2023", new Product("Butter"));
        tm.put("01-05-2021", new Product("Ice cream"));
        tm.put("18-04-2025", new Product("Milk"));
        tm.put("25-12-2019", new Product("Yogurt"));
        tm.put("13-03-2018", new Product("Sandwich"));

        System.out.printf("%-14s %-14s %-14s %n", "Expire date", "Product name", "Product ID");
        System.out.println("-----------------------------------------------------");
        for(Map.Entry<String,Product> entry : tm.entrySet()) {
            String key = entry.getKey();
            Product value = entry.getValue();
            int productId = value.getId();
            System.out.printf("%-14s %-14s %d %n", key, value, productId);
        }
    }
}
