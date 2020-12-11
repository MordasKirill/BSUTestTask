package com.software_development.lesson4.Customer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        CustomerList vipClient = new CustomerList(new ArrayList<>());
        vipClient.addCustomer( 1, "Mordas", "Kirill", "Rychardovich", "Tixaya-59-10", new BigInteger("1111111111111111"), 123);
        vipClient.addCustomer( 2, "Sobol", "Alexey", "Anronov", "Tixaya-60-150", new BigInteger("3333333333333333"), 200);
        vipClient.addCustomer( 3,"Yakusheva", "Diana", "Anatolievna", "Tixaya-90-102", new BigInteger("2222222222222222"), 100);
        vipClient.addCustomer( 4,"Petrikevich", "Anton", "Danilovich", "Tixaya-10-100", new BigInteger("4444444444444444"), 500);
        vipClient.addCustomer( 5,"Egorov", "Max", "Rychardovich", "Tixaya-5-111", new BigInteger("5555555555555555"), 10);

        System.out.println("Customer list by alphabet: ");
        vipClient.sortByName();
        for (int i = 0; i<vipClient.getCustomers().size(); i++){
            System.out.println(vipClient.getCustomers().get(i));
        }
        System.out.println();
        System.out.println("Customer list with suitable card id: ");
        ArrayList<Customer> customersList = vipClient.getCustomerByCreditCardRange("1111111111111111", "4444444444444444");
        customersList.sort(Comparator.comparing(Customer::getCardID));
        if (customersList.size() == 0){
            System.out.println("Пользователи не найдены.");
        }
        else {
            for (Customer customer:customersList){
                System.out.println(customer);
            }
        }
    }
}
