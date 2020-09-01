/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_6;
import java.util.Scanner;
/**
 *
 * @author Isha Parasu B
 */
public class Tax_calculation {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the gender of the employee(Press 'M' for male and press 'F' for female)");
        String gender=obj.next();
        System.out.println("Enter the income of the employee:");
        double salary=obj.nextDouble();
        employee1 emp=new employee1();
        emp.information(gender,salary);
        emp.show();        
    } 
}
interface customer
{
    void information(String gen,double sal);
    void show();
}
class employee1 implements customer
{
    String g;
    double s;
    public void information(String gen,double sal)
    {
        g=gen;
        s=sal; 
    }
    public void show()
    {
        System.out.println("Employee details:");
        System.out.println("Gender:"+g);
        System.out.println("Income"+s);
        if(g=="M")
        {
            if(s<=190000)
                System.out.println("Tax percentage is NIL");
            else if(s>190000 && s<=200000)
                System.out.println("Tax percentage is 10%");
            else if(s>200000 && s<=500000)
                System.out.println("Tax percentageis 20%");
            else//if s>500000
                System.out.println("Tax percentage is 25%");
        }            
        else//if g=='F'
        {
           if(s<=190000)
                System.out.println("Tax percentage is NIL");
            else if(s>190000 && s<=200000)
                System.out.println("Tax percentage is NIL");
            else if(s>200000 && s<=500000)
                System.out.println("Tax percentage is 10%");
            else//if s>500000
                System.out.println("Tax percentage is 20%"); 
        } 
    }
}

    
