package org.surya.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    private int id;
    @Autowired(required = false)
    // Makes the injection optional instead of mandatory.
    // without required = false, it throws an exception is bean has not found
    // with, if bean not found it will have null value printed.
    @Qualifier("address1")
    private Address address;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", address=" + address +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
