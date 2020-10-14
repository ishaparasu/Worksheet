/*
Write a java program that implements inter-thread communication for banking application.
 */
package lab_ex11;

import java.util.Scanner;

/**
 *
 * @author Isha Parasu
 */
public class Inter_thread {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        Account acc=new Account();
        System.out.println("Total amount in account is Rs."+acc.TotalAmount);
        System.out.print("Enter the amount to be deposited:");
        double DepositAmount=obj.nextDouble();
        System.out.print("Enter the amount to be credited: ");
        double CreditAmount=obj.nextDouble();
        Deposit d=new Deposit(acc,DepositAmount);	
        Credit cr=new Credit(acc,CreditAmount);
        d.start();
        try 
        {
            d.join();
        }
        catch(InterruptedException e) 
        {
            System.out.println(e);
        }
        c.start();
    }
}
class Account
{
    double TotalAmount=0;
    synchronized void credit(double amount)
    {
        if(TotalAmount<amount)
        {
            try 
            {   
                System.out.println("Cannot credit since credit amount exceeds the balance amount.");
                wait();
            }
            catch(InterruptedException e) 
            {
                System.out.println(e);
            }
        }
        TotalAmount=TotalAmount-amount;
        System.out.println("Amount is credited!\nBank balance after crediting is:Rs."+TotalAmount);
    }
    synchronized void deposit(double amount)
    {
        TotalAmount=TotalAmount+amount;
        System.out.println("Amount is deposited.");
        System.out.println("Bank balance after depositng is:Rs."+TotalAmount);
    }
}
class Deposit extends Thread
{
    double amount;
    Account ac;
    Deposit(Account ac,double amount)
    {
        this.ac=ac;
        this.amount=amount;
        //new Thread(this).start();
    }
    public void run()
    {
        a.deposit(amount);
    }
}
class Credit extends Thread
{
    double amount;
    Account ac;
    Credit(Account a,double amount) 
    {
        this.ac=ca;
        this.amount=amount;
        //new Thread(this).start();
    }
    public void run()
    {
        a.credit(amount);
    }
}
