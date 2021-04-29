import java.util.*;

//Простой список клиентов. Список клиентов добавляем в HashSet
//Список заказов добавляем в LinkedHashSet

public class Main {

    public static void main(String[] args) {

        Set<Client> hs = new HashSet<>();
        Set<Order> ls = new LinkedHashSet<>();

        Client client1 = new Client("John Duke", "Manas street, 15", "0555205060");
        Client client2 = new Client("Bob Smith", "Mederova street, 99", "0551502233");
        Client client3 = new Client("Bob Smith", "Gorkiy street, 12", "0551741056");
        Client client4 = new Client("Sarah Fishman", "Chuy avenue, 7", "0550506088");

        hs.add(client1);
        hs.add(client2);
        hs.add(client3);
        hs.add(client4);

        ls.add(new Order(new Date(), "Manas street, 15", client1));
        ls.add(new Order(new Date(), "Mederova street, 99", client2));
        ls.add(new Order(new Date(), "Gorkiy street, 12", client3));
        ls.add(new Order(new Date(), "Chuy avenue, 7", client4));

        System.out.printf("%-14s %-21s %-14s %-14s %n", "CLIENT NAME", "ADDRESS", "PHONE", "ID");
        System.out.println("--------------------------------------------------------------");
        for(Client c : hs) {
            String address = c.getAddress();
            int id = c.getId();
            String phoneNumber = c.getPhoneNumber();
            System.out.printf("%-14s %-21s %-14s %d %n", c, address, phoneNumber, id);
        }

        System.out.println("\n");
        System.out.printf("%-14s %-21s %-14s %-14s %n", "ORDER ID", "ADDRESS", "CLIENT NAME", "DATE AND TIME");
        System.out.println("-------------------------------------------------------------------");
        for(Order order : ls) {
            int id = order.getId();
            String address = order.getAddress();
            String name = order.getClient().getName();
            Date date = order.getDate();
            System.out.printf("%-14s %-21s %-14s %tD, %tT %n", id, address, name, date, date);
        }
    }
}