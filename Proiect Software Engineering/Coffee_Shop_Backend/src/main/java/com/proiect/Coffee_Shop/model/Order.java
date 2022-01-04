package com.proiect.Coffee_Shop.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_data", nullable = false)
    private String userData;

    @Column(name="ordered_products", nullable = false)
    private String orderedProducts;

}
