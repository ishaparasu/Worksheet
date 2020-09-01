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
public class Employee_details {
    public static void main(String[] args) {
        System.out.println("Enter details of 1st manager:");
        employee emp1=new manager();
        emp1.getdetails();
        System.out.println("Enter details of 2nd manager:");
        employee emp2=new manager();
        emp2.getdetails();
        System.out.println("Enterdetails of the clerk:");
        employee emp3=new clerk();
        emp3.getdetails();
        System.out.println("1st manager details:");
        System.out.println(emp1);
        System.out.println("Salary is Rs."+emp1.CalcSalary());
        System.out.println("2nd manager details:");
        System.out.println(emp2);
        System.out.println("Salary is Rs."+emp2.CalcSalary());
        System.out.println("Clerk details:");
        System.out.println(emp3);
        System.out.println("Salary is Rs."+emp3.CalcSalary());
              
        
    }
    
}

abstract class employee
{
    Scanner obj=new Scanner(System.in);
    int age;
    String emp_name;
    float hourRate;
    void getdetails()
    {
        System.out.println("Enter the name:");
        emp_name=obj.next();
        System.out.println("Enter the age:");
        age=obj.nextInt();
        System.out.println("Enter the worked hours:");
        hourRate=obj.nextFloat();
    }
    abstract double CalcSalary();
    public String toString()
    {
        return "Name:"+emp_name+"\nAge:"+age+"\nWorked hours:"+hourRate; 
    }
}

class manager extends employee
{
    float manager_salary;
    double CalcSalary()//1 hour=Rs.1500
    {
        manager_salary=hourRate*1500;
        return manager_salary;
    }   
}

class clerk extends employee
{
    float employee_salary;
    double CalcSalary()//1 hour=Rs.750
    {
        emplpyee_salary=hourRate*750;
        return employee_salary;
    }

}

