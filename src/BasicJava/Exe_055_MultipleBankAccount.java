package BasicJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Exe_055_MultipleBankAccount {

    private static Map<Integer,BankAccount> accounts=new HashMap<>();

    Scanner sc=new Scanner(System.in);
    int ch;



}

class BankAccount{

    long AccountNo;
    String HolderName;
    int balance;

    public BankAccount(long accountNo, String holderName, int balance) {
        AccountNo = accountNo;
        HolderName = holderName;
        this.balance = balance;
    }

    public long getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(long accountNo) {
        AccountNo = accountNo;
    }

    public String getHolderName() {
        return HolderName;
    }

    public void setHolderName(String holderName) {
        HolderName = holderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void desplyDetails()
    {
        System.out.println("/n--------Account Details--------");
        System.out.println("Account No-- "+AccountNo);
        System.out.println("Account Holder Name-- "+HolderName);
        System.out.println("Balance-- "+balance);
    }
}
