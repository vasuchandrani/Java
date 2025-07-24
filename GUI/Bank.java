
import java.util.Scanner;


public class Bank implements Runnable {
    int balance = 10000;
    boolean isWithdraw;

    Bank(boolean isWithdraw) {
        this.isWithdraw = isWithdraw;
    }

    @Override
    public void run() {
    }
    
    synchronized void deposite(int amt) {

    }

    synchronized void withdraw(int amt) {

        while (amt > balance) {
            System.out.println("Insufficient balance, waiting for deposite...");
            try {
                wait();
            } catch (InterruptedException e) {
                
            }
        }
        balance -= amt;
        System.out.println("Withdraw successful! New balance " + balance);

    }

    public static void main(String[] args) {
        Bank b = new Bank(true);
        
    }
}
