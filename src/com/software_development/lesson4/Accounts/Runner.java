package com.software_development.lesson4.Accounts;

public class Runner {
    public static void main(String[] args) {


    BankAccounts bankName = new BankAccounts("Priorbank");

    Client petrov = new Client("Ivan", "Ivanov", "TB6848664");
    Client fedorov = new Client("Petr", "Petrov", "TB8974739");

        bankName.addNewClient(petrov);
        bankName.addNewClient(fedorov);

        petrov.openAccount(new Account(105.25));
        petrov.openAccount(new Account(200.99));
        petrov.openAccount(new Account(-500.01));
        petrov.openAccount(new Account(300.13));

        fedorov.openAccount(new Account(150.80));
        fedorov.openAccount(new Account(-100.75));
        fedorov.openAccount(new Account(1000.23));
        fedorov.openAccount(new Account(500.08));

        System.out.println(bankName.getClient("TB6848664").getAccount(1).getStatus());
        bankName.getClient("TB6848664").blockAccount(1);
        System.out.println(bankName.getClient("TB6848664").getAccount(1).getStatus() + "\n");

        System.out.println(bankName.getClient("TB6848664").getInformation());
        bankName.getClient("TB6848664").sortByBalance();
        System.out.println(bankName.getClient("TB6848664").getInformation());
        bankName.getClient("TB8974739").sortByBalance();
        System.out.println(bankName.getClient("TB8974739").getInformation());

        System.out.println(petrov.toString() + ", total balance: " + petrov.getBalance());
        System.out.println(fedorov.toString() + ", total balance: " + fedorov.getBalance());

        System.out.println();
        System.out.println(petrov.toString() + ", positive balance: " + petrov.getBalancePositiveAccounts());
        System.out.println(fedorov.toString() + ", positive balance: " + fedorov.getBalancePositiveAccounts());

        System.out.println();
        System.out.println(petrov.toString() + ", negative balance: " + petrov.getBalanceNegativeAccounts());
        System.out.println(fedorov.toString() + ", negative balance: " + fedorov.getBalanceNegativeAccounts());
}
}
