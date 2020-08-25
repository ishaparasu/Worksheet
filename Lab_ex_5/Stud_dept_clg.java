/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_5;
import java.util.Scanner;
/**
 *
 * @author Isha Parasu B
 */
public class Stud_dept_clg {
    public static void  main(String[] args) {
       Department[] d=new Department[5];
       Student[] s=new Student[5];
       for(int i=0;i<5;i++)
       {
           d[i]=new Department();
           d[i].getdeptdetails();
           s[i]=new Student();
           s[i].getstuddetails();
           d[i].displaydept();
           s[i].displaystud();
       }
    }
}

class College
{
    
    Scanner obj=new Scanner(System.in);
    String cname;
    int ccode;
    public void getclgdetails()
    {
        System.out.println("Enter name of the college:");
        cname=obj.next();
        System.out.println("Enter college code:");
        ccode=obj.nextInt(); 
    }
    public void displayclg()
    {
        System.out.println("College details:");
        System.out.println("Name:"+cname+"\nCode:"+ccode);
    }
}

class Department extends College
{
    String dname;
    public void getdeptdetails()
    {
        super.getclgdetails();
        System.out.println("Enter name of the department:");
        dname=obj.next();       
    }
    public void displaydept()
    {
        super.displayclg();
        System.out.println("Department details:");
        System.out.println("Name:"+dname);
    }
}

class Student extends Department
{
    String name,rno;
    double py,mat,phy,eg,che,tot,avg;
    public void getstuddetails()
    {
        
        System.out.println("Enter student name:");
        name=obj.next();
        System.out.println("Enter student roll number:");
        roll_no=obj.next();
        System.out.println("Enter python mark:");
        py=obj.nextDouble();
        System.out.println("Enter maths mark:");
        mat=obj.nextDouble();
        System.out.println("Enter physcis mark:");
        phy=obj.nextDouble();
        System.out.println("Enter eg mark:");
        eg=obj.nextDouble();
        System.out.println("Enter chemistry mark:");
        che=obj.nextDouble();        
        tot=py+mat+phy+eg+che;
        avg=total/5;
    }
    public void displaystud()
    {
        
        System.out.println("Student details:");
        System.out.println("Name:"+name+"\nRoll Number:"+rno+"\nPhthon mark:"+py+"\nMaths mark:"+mat+"\nPhysics mark:"+phy+"\nEG mark:"+eg+"\nChemistry mark:"+che);
        System.out.println("Total:"+tot+"\nAverage:"+avg);
        
    }
}
