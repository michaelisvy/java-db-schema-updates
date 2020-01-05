package org.samples.user;

import lombok.Data;

import javax.persistence.*;

@Data @Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String streetAddress;
    private String zipCode;
    private String city;

    public Address(String streetAddress, String zipCode, String city) {
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.city = city;
    }
}
