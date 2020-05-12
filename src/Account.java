/**
 * @author Issa Khodadadi 5/10/2020, 10:08 AM
 **/
public class Account {
    private double balance; // instance variable that stores the balance

    public Account(double initialBalance) {
        //validate that initialBalance is greater than 0.0
        if (initialBalance > 0.0)
            balance = initialBalance;
    } // end Account constructor

    // credit (ADD) an amount to the account
    public void credit(double amount) {
        balance = balance + amount; // add amount to balance
    } //end method credit

    public double getBalance() {
        return balance;
    } // end method getBalance
} // end Account class
