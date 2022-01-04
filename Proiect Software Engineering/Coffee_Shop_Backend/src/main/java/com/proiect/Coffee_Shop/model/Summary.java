package com.proiect.Coffee_Shop.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="summary" )
public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="description", nullable = false)
    private String description;
}
