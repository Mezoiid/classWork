package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        Bank b = new Bank();
        Account a = new Account();
        b.addAccount(a);
        System.out.println(b.getAccountSet());
    }
}
enum currency{
    BYN(2.5),
    EUR(0.88),
    USD(1);
    private double k;
    private currency(double k){
        this.k = k;
    }
    public static double convert(currency from,currency to,double amount){
        return amount/from.k*to.k;
    }
}
