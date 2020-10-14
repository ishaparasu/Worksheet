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
            int num=obj.nextInt(); 
            int arr[]=new int[n]; 
            System.out.println("Enter the numbers:");
            for(int i=0;i<num;i++)
                a[i]=obj.nextInt();
            thread1 x=new thread1(num,arr);
            Thread th1=new Thread(x); 
            thread2 y=new thread2(num,arr);
            Thread th2=new Thread(y);
            thread3 z=new thread3(num,arr);
            Thread th3=new Thread(z);
            th1.start(); 
            th1.join();  
            th2.start();
            th2.join();
            th3.start();
            th3.join();
        }
        catch(InterruptedException e) 
        {
            System.out.println(e);
        }
    } 
}
class thread1 implements Runnable 
{
    public int num;
    public int[] arr;
    public thread1(int num,int[] arr) 
    {
        this.num=num;
        this.arr=arr;
    }
    public void run() 
    {
        System.out.print("Entered numbers are: ");
        for(int i=0;i<num;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
class thread2 extends thread1 implements Runnable 
{
    public thread2(int num,int[] arr) 
    {
        super(num,arr);
    }
    public void run() 
    {
        boolean flag=false;
        System.out.print("Number(s) divisible by 5 are: ");
        for(int i=0;i<arr.length;i++) 
        {
            if(a[i]%5==0) 
            {
                flag=true; 
                System.out.print(arr[i]+"  ");       
            }
        }
        if(flag==false) 
            System.out.print("None");
        System.out.println();
    }
}
class thread3 extends thread2 implements Runnable 
{
    public thread3(int num,int[] arr) 
    {
        super(num,arr);
    }
    public void run() 
    {
        int sum=0,avg=0;
        System.out.print("Average of "+num+" numbers is: ");
        for(int i=0;i<num;i++) 
        {
            sum=sum+arr[i];
        }
        avg=sum/num;
        System.out.println(avg);
    }
}
