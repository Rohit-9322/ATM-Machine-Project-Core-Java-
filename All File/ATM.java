package all_class;

// ATM Machine Project 

/* A} validate the user through ATM number and Pin 
   B} User Should able to perfrom below operation 
   
     1] Cheack Available Balance 
     2] Withdraw Amounnt 
     3] Deposit Amount 
     4] view mini project 
     5] Exit 
     
*/

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    // default constructor
    public void ATM(){
        System.out.println();
    }


    // Getter Setter 

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

   
    

}
