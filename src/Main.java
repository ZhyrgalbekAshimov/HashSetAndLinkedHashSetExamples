import java.util.*;

//Простой список клиентов

public class Main {

    public static void main(String[] args) {

        Set<Client> hs = new HashSet<>();

        hs.add(new Client("John Duke", "Manas street, 15", "0555205060"));
        hs.add(new Client("Bob Smith", "Mederova street, 99", "0551502233"));
        hs.add(new Client("Bob Smith", "Gorkiy street, 12", "0551741056"));
        hs.add(new Client("Sarah Fishman", "Chuy avenue, 7", "0550506088"));


        System.out.printf("%-14s %-21s %-14s %-14s %n", "Name", "Address", "Phone", "ID");
        System.out.println("-----------------------------------------------------");
        for(Client c : hs) {
            String address = c.getAddress();
            int id = c.getId();
            String phoneNumber = c.getPhoneNumber();
            System.out.printf("%-14s %-21s %-14s %d %n", c, address, phoneNumber, id);
        }
    }
}