/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_2;
import java.util.Scanner;
/**
 *
 * @author isha parasu B
 */
public class Account_balance {
    public static void main(String[] args) { 
        Scanner obj=new Scanner(System.in);
        account acc=new account("19cse073","isha",0);
        System.out.println("ID is "+acc.getID());
        System.out.println("Name  is "+acc.getName());
        System.out.println("Balance is "+acc.getBalance());
        System.out.println("Enter the amount to be credited:");
        int b=obj.nextInt();
        System.out.println("Balance is "+acc.credit(b));
        System.out.println("Enter the amount to be debited:");
        int c=obj.nextInt();
        System.out.println("Balance is "+acc.debit(c));
        account accou=new account("19cse068","Dharsana",2000);
        System.out.println("Enter the amount to be transfered to the another account");
        int d=obj.nextInt();
        System.out.println("Balance:"+acc.transferTo(accou,d));
        System.out.println(acc);
        System.out.println(accou);
    
    }
    
}

class account
{
    String id;
    String name;
    int balance;
    account(String i,String n,int b)
    {
        id=i;
        name=n;
        balance=bb;
    }
    account(String i,String n)
    {
        id=i;
        name=n;
    }
    String getID()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    int getBalance()
    {
        return balance;
    }
    int credit(int amount)
    {
        balance=balance+amount;
        return balance;
    }
    int debit(int amount)
    {
        if(amount<=balance)
            balance=balance-amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }
    int transferTo(account accou,int amount)
    {
        if(amount<=balance)
        {
            balance=balance-amount;
            accou.balance=accou.balance+amount;
        }
        else
            System.out.println("Amount exceeded balance");
        return balance;            
    }
    public String toString()
   {
       return "\nID is "+id+"\tName is "+name+"\tBalance is "+balance;
   }
}
