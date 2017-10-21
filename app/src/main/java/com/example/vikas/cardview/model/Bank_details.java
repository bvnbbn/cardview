package com.example.vikas.cardview.model;

/**
 * Created by vikas on 28/9/17.
 */

public class Bank_details {

    private String Bank_name="UCO BANK";
    private String Bank_balance = "RS 2000";
    private String Account_number = "****1032";

    public Bank_details(String bank_name, String bank_balance, String account_number, String date_of_transaction) {
        Bank_name = bank_name;
        Bank_balance = bank_balance;
        Account_number = account_number;
        this.date_of_transaction = date_of_transaction;
    }

    private String date_of_transaction = "12/10/1996";


    public String getBank_name() {
        return Bank_name;
    }

    public void setBank_name(String bank_name) {
        Bank_name = bank_name;
    }

    public String getBank_balance() {
        return Bank_balance;
    }

    public void setBank_balance(String bank_balance) {
        Bank_balance = bank_balance;
    }

    public String getAccount_number() {
        return Account_number;
    }

    public void setAccount_number(String account_number) {
        Account_number = account_number;
    }

    public String getDate_of_transaction() {
        return date_of_transaction;
    }

    public void setDate_of_transaction(String date_of_transaction) {
        this.date_of_transaction = date_of_transaction;
    }





}
