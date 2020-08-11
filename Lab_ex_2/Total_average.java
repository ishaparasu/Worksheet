/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_2;
import java.util.Scanner;
/**
 *
 * @author Isha Parasu B
 */
public class Total_average {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Total_average avg=new Total_average();
        double a[]=new double[5];
        double b[]=new double[5];   
        double c[]=new double[5];
        double d[]=new double[5];
        double e[]=new double[5];           
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of 1 st student:");
        for(int i=0;i<=4;i++)
            a[i]=obj.nextDouble();
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of 2 nd student:");
        for(int i=0;i<=4;i++)
            b[i]=obj.nextDouble();
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of 3 rd student:");
        for(int i=0;i<=4;i++)
            c[i]=obj.nextDouble();
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of 4 student:");
        for(int i=0;i<=4;i++)
            d[i]=obj.nextDouble();
        System.out.println("Enter 5 subject(ENG,TAM,MAT,SCI,SOC) marks of 5 student:");
        for(int i=0;i<=4;i++)
            e[i]=obj.nextDouble();        
        list li=new list();
        li.calc(a,1);
        li.calc(b,2);
        li.calc(c,3);
        li.calc(d,4);
        li.calc(e,5);        
        avg=null;
        System.gc();//calling destructor
    }
    public void finalize()//Destructor
    {
        System.out.println("Object is destroyed by the Garbage Collector");
    }    
}

class list
{   
    double tot,avg;
    list() 
    {
        tot=0;
        avg=0;
    }    
    void calc(double arr[],int stu) 
    {
        for(int i=0;i<4;i++)
            tot=tot+arr[i];
        average=total/5;
        System.out.println("Student "+stu+":");
        System.out.println("Total:"+tot);
        System.out.println("Average:"+avg+"\n");
    }   
}
