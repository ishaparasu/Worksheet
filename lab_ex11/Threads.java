/*
1.Write a java program for generating three threads to perform the following operations
    i)	Getting N numbers as input
    ii)	Printing the numbers divisible by five
    iii)Computing the average.
 */
package lab_ex11;
import java.util.Scanner;

/**
 *
 * @author Isha Parasu
 */
public class Threads {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        try 
        {
            System.out.println("Enter the count of numbers:");
            int n=obj.nextInt(); 
            int a[]=new int[n]; 
            System.out.println("Enter the numbers:");
            for(int i=0;i<n;i++)
                a[i]=obj.nextInt();
            thread1 p=new thread1(n,a);
            Thread t1=new Thread(p); 
            thread2 q=new thread2(n,a);
            Thread t2=new Thread(q);
            thread3 r=new thread3(n,a);
            Thread t3=new Thread(r);
            t1.start(); 
            t1.join();  
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }
        catch(InterruptedException e) 
        {
            System.out.println(e);
        }
    } 
}
class thread1 implements Runnable 
{
    public int n;
    public int[] a;
    public thread1(int n,int[] a) 
    {
        this.n=n;
        this.a=a;
    }
    public void run() 
    {
        System.out.print("Entered numbers are: ");
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}
class thread2 extends thread1 implements Runnable 
{
    public thread2(int n,int[] a) 
    {
        super(n,a);
    }
    public void run() 
    {
        boolean flag=false;
        System.out.print("Number(s) divisible by 5 are: ");
        for(int i=0;i<a.length;i++) 
        {
            if(a[i]%5==0) 
            {
                flag=true; 
                System.out.print(a[i]+"  ");       
            }
        }
        if(flag==false) 
            System.out.print("None");
        System.out.println();
    }
}
class thread3 extends thread2 implements Runnable 
{
    public thread3(int n,int[] a) 
    {
        super(n,a);
    }
    public void run() 
    {
        int sum=0,avg=0;
        System.out.print("Average of "+n+" numbers is: ");
        for(int i=0;i<n;i++) 
        {
            sum=sum+a[i];
        }
        avg=sum/n;
        System.out.println(avg);
    }
}
