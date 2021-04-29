import java.util.Date;

public class Order {

    private int id;
    private Date date;
    private String address;
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Order(Date date, String address, Client client ) {
        this.id = (int) (Math.random() * 100000);
        this.date = date;
        this.address = address;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
