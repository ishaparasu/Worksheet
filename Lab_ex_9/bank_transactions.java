/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_9;
import java.util.Scanner;
/**
 *
 * @author Isha Parasu B
 */
public class bank_transactions {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        bank_transactions obj1=new bank_transactions();
        System.out.println("Enter the amount in my bank:Rs.");
        float bk=obj.nextFloat();
        System.out.println("Enter the crediting amount Rs.");
        float ct=obj.nextFloat();
        try {
            obj1.checker(bk,ct);
        }
        catch(bankcreditexception e) {
            System.out.println(e);
        }
    }
    void checker(double bk,double ct) throws bankcreditexception {
        if(ct>49000) {
            throw new bankcreditexception("Error:More than 49,000 rupees cannot be credited in one take");
        }
        bk=bk-ct;
        System.out.println("Amount credited. Balance amount in my bank is Rs."+bk);
    }
}
class bankcreditexception extends Exception
{
   bankcreditexception(String msg) {
        super(msg);
    }
}
    
