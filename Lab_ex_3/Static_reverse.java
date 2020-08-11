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
public class Static_reverse {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 elements of the array");
        for(int i=0;i<5;i++)
            a[i]=obj.nextInt();
        reverse(a);
    }
    static void reverse(int a[])
    {
        int arr[]=new int[5];
        int j=5;
        for(int i=0;i<5;i++)
        {
            arr[j-1]=a[i];
            j=j-1;
        }
        System.out.println("Reversed array:");
        for(int i=0;i<5;i++)
            System.out.println(arr[i]);
        
    }
    
}
