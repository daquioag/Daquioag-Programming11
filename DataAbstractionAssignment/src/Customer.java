import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {


    private int accountNumber;

    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;


    Customer() {
      //create default constructor
        checkBalance = 100.0;
        savingBalance = 100.0;
        savingRate = 1.2;
        name = "John Doe";
        accountNumber = 11;

  }
      Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
          //constructor code here
          this.name = name;
          checkBalance += checkDeposit;
          savingBalance += savingDeposit;
      }

    // requires: double, amt, Date, Date, String, account
    //modifies: this
    // adds the double amount to the account
    public double deposit(double amt, Date date, String account){
        //your code here

        if(account.equals(CHECKING)){
            checkBalance += amt;
            this.deposits = new ArrayList<Deposit>();
            return this.checkBalance;
        }
        else if(account.equals(SAVING)){
            this.deposits = new ArrayList<Deposit>();
            savingBalance += amt;
            return savingBalance;
        }
        else {
            return 0;
        }

    }
    // requires: double amt, Date Date, String account
    //modifies: this
    // removes the double amount from the account
    public double withdraw(double amt, Date date, String account) {
        //your code here
        if (account.equals(CHECKING)) {
            Withdraw withdraw1 = new Withdraw(amt, new java.util.Date(), CHECKING);
            checkBalance -= amt;
            return checkBalance;
        } else if (account.equals(SAVING)) {
            Withdraw withdraw1 = new Withdraw(amt, new java.util.Date(), SAVING);
            savingBalance -= amt;
            return savingBalance;

        } else {
            return 0;
        }
    }
    private boolean checkOverdraft(double amt, String account){
        amt=1.0;
        account = this.name;
        return false;
    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }



}
