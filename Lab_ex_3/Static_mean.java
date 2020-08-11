/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_3;
import java.util.Scanner;
/**
 *
 * @author Isha Parasu B
 */
public class Static_mean {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=obj.nextInt();
        double a[]=new double[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
            a[i]=obj.nextDouble();
        mean(a,n);
    }
    static void mean(double a[],int n)
    {   
        double sum=0,avg=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        avg=sum/n;
        System.out.println("Mean of the array:"+avg);
    }
}
