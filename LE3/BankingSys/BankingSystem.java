/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class BankingSystem { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Select Account Type (1-Savings, 2-Current): "); 
        int choice = sc.nextInt(); 
        System.out.print("Enter Acc No and Initial Balance: "); 
        String num = sc.next(); double bal = sc.nextDouble(); 
        BankAccount account = (choice == 1) ? new Sav(num, bal) : new Cur(num, bal); 
        System.out.print("Enter withdrawal amount: "); 
        double amt = sc.nextDouble(); 
        account.withdraw(amt); 
        System.out.println("Remaining Balance: " + account.getBalance()); 
        sc.close(); 
    } 
} 
