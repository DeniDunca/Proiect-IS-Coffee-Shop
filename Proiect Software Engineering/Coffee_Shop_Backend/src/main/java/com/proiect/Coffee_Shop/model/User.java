package com.proiect.Coffee_Shop.model;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name="address", nullable = false)
    private String address;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="phone_number", nullable = false)
    private String phone_number;

    public User(String username, String address, String password, String email, String phone_number) {
        this.username = username;
        this.address = address;
        this.password = password;
        this.email = email;
        this.phone_number = phone_number;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }
}
