package all_class;

import java.util.Scanner;

import all_class.ATMOperationsInterface;

public class MainClass {
    public static void main(String[] args) {

        // Object of Implemention class
        ATMOperationsInterface op  = new ATMOperationImplement();
        
        
        // Validate the user pin and password 
        int atmnumber =12345;
        int atmpin = 123;

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("=== Welcome To ATM Machine !! ====");
        System.out.println();
        System.out.print("Enter Atm Number :- ");
        int atmNumber = sc.nextInt();

        System.out.print("Enter Pin :- ");
        int pin = sc.nextInt();
        System.out.println();
        if ((atmNumber == atmnumber) && (atmpin == pin)) {
            while (true) {
                System.out.println("1. View Available Balance \n2. Withdraw Amount \n3. Deposit Amount \n4. View MiniStatement \n5. Exit");
                System.out.print("Enter Choice :- ");
                int ch = sc.nextInt();
                if (ch == 1) {
                    op.viewBalance();
                    
                }
                else if (ch == 2) {
                    System.out.print("Enter Withdraw Amount :-");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                    
                }
                else if (ch == 3) {
                    System.out.print("Enter Amount to Deposit :- ");
                    double  depositAmount =sc.nextDouble(); //5000
                    op.depositAmount(depositAmount);
                }
                else if (ch == 4) {
                    op.vieewMiniStatement();
                    
                }
                else if (ch == 5) {
                    System.out.println("Collect your ATM Card \n Thank You! For Using ATM Machine!!");
                    System.exit(0);
                }
                else{
                    System.out.println("Please Enter Correct Choise!");
                    System.out.println();
                }


            }
        }
        else{
            System.out.println("Incorrect Atm Number or pin ");
            System.exit(0);
        }
    }
}
