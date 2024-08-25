package mydomain.model;

import java.util.*;

public class Account {
    Set<Address> addresses;
    String firstname;
    String lastname;
    int id;

    public Account(Set<Address> addresses, String firstname, String lastname, int id) {
        this.addresses = addresses;
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Account{" +
            "addresses=" + addresses +
            ", firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            ", id=" + id +
            '}';
    }
}
