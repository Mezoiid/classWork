package com.company;

import java.util.Locale;

public class Account {
    private static int id = 0;// заполняется автоматически
    private int orderId;
    private double sum;
    private currency currency;
    private String fio;
    private String pasportId;//etyophkxcbm буквы которые могут быть
    private Address address;

    public Account(double sum, com.company.currency currency, String fio, String pasportId, Address address) {
        id = id++;
        this.orderId = id;
        this.sum = sum;
        this.currency = currency;
        this.fio = fio;
        this.pasportId = pasportId;
        this.address = address;
    }
    public Account(){
        id = id++;
        orderId = id;
        sum = 0;
        currency = com.company.currency.BYN;
        fio = "";
        pasportId = "";
        address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) throws Exception {
        if (sum<0)
            throw new Exception("Invalid sum");
        this.sum = sum;
    }

    public com.company.currency getCurrency() {
        return currency;
    }

    public void setCurrency(com.company.currency currency) {
        this.currency = currency;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPasportId() {
        return pasportId;
    }

    public void setPasportId(String pasportId) throws Exception {
        if (pasportId.length()!=7) throw new Exception("Invalid passport id"+getPasportId().length());
        pasportId.toLowerCase(Locale.ROOT);
        String s ="e t y o p h k x c b m";
        String [] mas = s.split("");
        for (int i = 0; i<mas.length;i++) {
            if (!pasportId.contains(s)) {
                this.pasportId = pasportId;
            } else
                throw new Exception("Invalid passport id");
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double addSum(double add){
        return sum = sum + add;
    }

    public double minusSum(double minus) throws Exception {
        if (sum<minus)
            throw new Exception("No money, no honey");
        else
            return sum = sum - minus;
    }

    @Override
    public String toString() {
        return  "ID  = " + String.format("%07d",id) +
                "\n Sum at chek = " + sum +
                "\n Currency = " + currency +
                "\n Name = " + fio +
                "\n Passport ID = " + pasportId +
                "\n Address = " + address;
    }
}
//etyophkxcbm буквы которые могут быть
//сделать ту стринг что бы id выводилась 7 знаков.
//есди введена неверная серия паспорта выкидывает исключения.
//если номер паспорта не 7 символов исключение
//в классе аккаунт добавить метод зачислить и снять какуюто сумму
// создать класс банк, в нем храниться коллекция аккаунтов, регистрация рновго пользователя, перевод со счета на счет, если не насчет владельца то снимается комиссия 0,1% на счет банка,
//метод снятия наличных и ппополнения наличных. Конвертор валют.
// вывести все счета человека
//ввыести данные счета.
