package com.dominic;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.setNumber("123456");
        account.setBalance(100);
        account.setCustomerName("Dominic");
        account.setCustomerPhoneNumber("185XXXXXXXX");
        account.setCustomerEmailAddress("dominic_lian@qq.com");

        account.deposit(50);
        account.withdrawal(100);
        account.deposit(60);
        account.withdrawal(100);

        Account newAccount_1 = new Account("123456", 50, "Bob", "1234567890" , "123456@qq.com");
        Account newAccount_2 = new Account("email Address", "123123123123");
    }

}
