package org.samples.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data @Entity @Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String streetAddress;
    private String zipCode;
    private String city;

    public Address(String streetAddress, String zipCode, String city) {
        this.streetAddress = streetAddress;
        this.zipCode = zipCode;
        this.city = city;
    }

    public Address() {
    }
}
