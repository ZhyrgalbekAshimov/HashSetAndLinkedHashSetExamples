public class Client {

    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    public Client(String name, String address, String phoneNumber) {
        this.id = (int) (Math.random() * 100000);
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  name;
    }
}