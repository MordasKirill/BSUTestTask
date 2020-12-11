package com.software_development.lesson4.Accounts;

import java.util.ArrayList;

public class BankAccounts {
    private String name;
    private ArrayList<Client> clients;

    BankAccounts(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public Client getClient (String passportID) {
        for (Client person : clients) {
            if (person.getPassportID().equals(passportID)) {
                return person;
            }
        }
        return null;
    }

    public void addNewClient(Client client) {
        clients.add(client);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank " + name + " has " + clients.size() + " customers";
    }
}
