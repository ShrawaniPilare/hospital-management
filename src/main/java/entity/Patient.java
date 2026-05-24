package com.hospital.hospital_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patients")

public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;
    private String wardName;
    private int hours;
    private int fee;

    public Patient(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id=id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number=number;
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName=wardName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours=hours;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee=fee;
    }
}