package BasicJava;

public class Exe_052_Bank {
    public static void main(String[] args) {

        Bank bank=new Bank(12345,10000);
        System.out.println("Account No- "+bank.getAcc_no()+" Currnet Balance is == "+bank.getBalance());

        bank.withdraw_Amount(5000);
        System.out.println("After Withdraw amount Current Balance is== "+bank.getBalance());

        bank.ADD_BALANCE(25000);
        System.out.println("After credit amount into your account your current Balance is== "+bank.getBalance());


    }

}

class Bank{

    private long Acc_no;
    private int Balance;
    private int amount;

    public Bank(long acc_no, int balance) {
        Acc_no = acc_no;
        Balance = balance;
    }

    public long getAcc_no() {
        return Acc_no;
    }

    public void setAcc_no(long acc_no) {
        this.Acc_no = acc_no;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }

    int withdraw_Amount(int amount)
    {
       if(amount<=Balance)
       {
           Balance=Balance-amount;
           return amount;
       }
       else {
           System.out.println("Insufficient Balance You can not withdraw money");
           return 0;
       }

    }

    int ADD_BALANCE(int amount)
    {
        Balance=Balance+amount;
        return Balance;
    }


}
