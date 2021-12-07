package com.company;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Bank {
    private Set<Account> accountSet = new HashSet<>();
    private Account bank;

    public Bank(){
       this.bank = new Account(0,currency.EUR,"Bank","MP00000",new Address("Belarus","Minsk","city","zavodskoi","Krasina str",24,44));
        addAccount(bank);
    }

    public void addAccount(Account account){
        accountSet.add(account);
    }

    public Account registrationNewAcc() throws Exception {
        System.out.println("Select currency for you chek");
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        String s = sc.nextLine();
        s.toLowerCase(Locale.ROOT);
        switch (s){
            case "eur":
                account.setCurrency(com.company.currency.EUR);
                break;
            case "usd":
                account.setCurrency(com.company.currency.USD);
                break;
            case "byn":
                account.setCurrency(com.company.currency.BYN);
                break;
            default:
                System.out.println("Use eur, usd or byn");
                break;
        }
        System.out.println("Insert sum to you chek");
        double sum;
        sum = sc.nextInt();
        account.addSum(sum);
        System.out.println("Insert you first name & second name");
        String fio;
        fio = sc.next();
        account.setFio(fio);
        System.out.println("Insert you passport ID");
        String pasportId;
        pasportId = sc.next();
        account.setPasportId(pasportId);
        account.setAddress(new Address());
        System.out.println("Insert you address");
        System.out.println("Insert you country");
        String country;
        country = sc.next();
        account.getAddress().setCountry(country);
        System.out.println("Insert you region");
        String region;
        region = sc.next();
        account.getAddress().setRegion(region);
        System.out.println("Insert you locality");
        String locality;
        locality = sc.next();
        account.getAddress().setLocality(locality);
        System.out.println("Insert you area");
        String area;
        area = sc.next();
        account.getAddress().setArea(area);
        System.out.println("Insert you street");
        String street;
        street = sc.next();
        account.getAddress().setStreet(street);
        System.out.println("Insert you number house");
        int house;
        house = sc.nextInt();
        account.getAddress().setHouse(house);
        System.out.println("Insert you number apartment");
        int apartment;
        apartment = sc.nextInt();
        account.getAddress().setApartment(apartment);
        addAccount(account);
        return account;
    }
    public void transfer(double sum,Account accountFrom, Account accountTo) throws Exception {
        for (Account accounts: accountSet){
            if (accountFrom.getPasportId().equals(accountTo.getPasportId())){
                accountFrom.minusSum(sum);
                accountTo.addSum(sum);
            }
            else{
                double temp = sum /100 * 0.1;
                accountFrom.minusSum(sum);
                bank.addSum(temp);
                sum = sum - temp;
                accountTo.addSum(sum);
            }
        }
    }

    public void viewChekPassportId(String passportId){
        for (Account accounts: accountSet){
            if (accounts.getPasportId().equals(passportId))
                System.out.println(accounts);
        }
    }
    public void viewAccount(Account account){
        System.out.println(account);
    }

    public Set<Account> getAccountSet() {
        return accountSet;
    }

    public void setAccountSet(Set<Account> accountSet) {
        this.accountSet = accountSet;
    }
}
