package com.software_development.lesson4.Customer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class CustomerList {
    private ArrayList<Customer> customers;

    CustomerList(ArrayList<Customer> customers) {

        this.customers = customers;
    }
    public void sortByName(){
        customers.sort(Comparator.comparing(Customer::getName));
    }

    public void addCustomer ( int id, String lastName, String name, String patronymic, String address, BigInteger cardID, int bankAccount){
        this.customers.add(new Customer( id, lastName, name, patronymic, address, cardID, bankAccount));
    }

    ArrayList<Customer> getCustomerByCreditCardRange(String min, String max){
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer customer : this.customers) {
            if (customer.getCardID().toString().compareTo(min) > 0
                    && customer.getCardID().toString().compareTo(max) < 0) {
                list.add(customer);
            }
        }
        return list;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

}
