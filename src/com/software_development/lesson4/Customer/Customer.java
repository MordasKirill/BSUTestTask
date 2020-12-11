package com.software_development.lesson4.Customer;

import java.math.BigInteger;

public class Customer {
    private int id;
    private String lastName;
    private String name;
    private String patronymic;
    private String address;
    private BigInteger cardID;
    private int bankAccount;

    public Customer( int id, String lastName, String name, String patronymic, String address, BigInteger cardID, int bankAccount) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.cardID = cardID;
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardID=" + cardID +
                ", bankAccount=" + bankAccount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(){
        this.address = address;
    }

    public BigInteger getCardID() {
        return cardID;
    }

    public void setCardID(BigInteger cardID) {
        this.cardID = cardID;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }
}
