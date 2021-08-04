package com.example.model.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    private String name;

    private String city;
    private String street;
    private String zipcode;
}
