package mydomain.model;

public class Address {
    String street;
    String city ;
    int id;

    public Address(String street, String city, int id) {
        this.street = street;
        this.city = city;
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Address{" +
            ", street='" + street + '\'' +
            ", city='" + city + '\'' +
            ", id=" + id +
            '}';
    }
}
