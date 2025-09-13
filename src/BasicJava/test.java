package BasicJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {
    private static Map<Integer,BankDetails> accounts=new HashMap<>();
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int ch;

        do {
            System.out.println("\n===== Bank System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Login to Account");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                   createAccount(sc);
                    break;
                case 2:
                    loginAccount(sc);
                    break;
                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (ch != 3);
        sc.close();

    }

    private static void createAccount(Scanner sc)
    {
        System.out.println("Enter Account Number");
        int AccountNo=sc.nextInt();
        sc.nextLine();
        if(accounts.containsKey(AccountNo))
        {
            System.out.println("Account Number Already Exist!!!");
            return;
        }
        System.out.println("Enter Account Holder Name");
        String accHolderName=sc.nextLine();

        System.out.println("Enter Initial Balance ");
        int balance=sc.nextInt();

        BankDetails account =new BankDetails(AccountNo,accHolderName,balance);
        accounts.put(AccountNo,account);
        System.out.println("Account Created Successfully !!!");

    }

    public static void loginAccount(Scanner sc)
    {
        System.out.println("Enter Account Number");
        int AccountNo=sc.nextInt();

        BankDetails account=accounts.get(AccountNo);

        if(account==null)
        {
            System.out.println("Account Not Found.");
            return;
        }

        int ch;

        do {

            System.out.println("\n---------Account Menu---------");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposite Money");
            System.out.println("3. WithDraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Logout");
            System.out.println("Enter choice");
            ch=sc.nextInt();

            switch (ch)
            {
                case 1:
                    //assert account != null;
                    account.displayDetails();
                    break;

                case 2:
                    System.out.println("Enter Amount to Deposite");
                    int amount=sc.nextInt();
                    account.deposit(amount);
                    break;

                case 3:
                    System.out.println("Enter Amount To Withdraw");
                    int withdrawAmount=sc.nextInt();
                    account.withDraw(withdrawAmount);
                    break;

                case 4:
                    account.checkBalance();
                    break;

                case 5:
                    System.out.println("Logging out...");
                    break;
                default:
                    System.out.println("Invalid choice!");


            }

        }while (ch!=5);
    }


}

class BankDetails
{
    long AccountNo;
    String HolderName;
    int balance;

    public BankDetails(long accountNo, String holderName, int balance) {
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

    public void deposit(int amount)
    {
        if(amount>0)
        {
            balance=balance+amount;
            System.out.println("Deposited= "+amount);
        }
        else
        {
            System.out.println("Enter Valid amount");
        }
    }

    public void withDraw(int withdrawAmount)
    {
        if (withdrawAmount>0 && withdrawAmount<=balance)
        {
            balance=balance-withdrawAmount;
            System.out.println("Withdrawn Amount= "+withdrawAmount);
        }
        else {
            System.out.println("Insufficient Amount to withdraw !!!");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

   public void displayDetails()
    {
        System.out.println("\n--------Account Details--------");
        System.out.println("Account No-- "+AccountNo);
        System.out.println("Account Holder Name-- "+HolderName);
        System.out.println("Balance-- "+balance);
    }
}
