package com.awe.kz.data.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @Column(name="USER_ID")
    @SequenceGenerator(name = "user_gen", sequenceName = "user_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_gen")
    private Long id;
    @Column(name="USERNAME", nullable = false, unique = true)
    private String username;
    @Column(name="PASSWORD")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}