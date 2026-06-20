package all_class;

import java.util.ArrayList;

public class ATMOperationImplement implements ATMOperationsInterface{
    ATM atm = new ATM();
    ArrayList<String> miniStatement=new ArrayList<>();

    @Override
    public void depositAmount(double depositAmount) {
        miniStatement.add(depositAmount + " Amount Deposited !");
      System.out.println(depositAmount+" Deposited Succssfully !!");
      atm.setBalance(atm.getBalance()+depositAmount);
      viewBalance();
      System.out.println();

      
        
    }

    @Override
    public void vieewMiniStatement() {
        for(String s : miniStatement){
        System.out.println(s);
        
      }   
       System.out.println();
    }

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is :- " +atm.getBalance());
        System.out.println();
        
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount > atm.getBalance()) {
            System.out.println("Insufficient Balance !!");
        }
        else if ((withdrawAmount % 500 == 0) || (withdrawAmount % 200 == 0)) {
             miniStatement.add(withdrawAmount + " Amount Withdrawn !");
            System.out.println(" Withdraw Succssfully !! \n Collect the Cash :- "+withdrawAmount);
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();
        }
        
        else{
            System.out.println("Avalible Notes 200 & 500 So \n    please only Entering the multiple of 500 & 200 ");
        }
        System.out.println();
        
        
    }
    
}
