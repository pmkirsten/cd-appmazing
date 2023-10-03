package com.campusdual.appmazing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACTS")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String surname1;
    @Column
    private String surname2;
    @Column
    private String phone;
    @Column
    private String email;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return this.surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return this.surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
