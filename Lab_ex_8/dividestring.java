/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_8;
import java.util.Scanner;
/**
 *
 * @author Isha Parasu B
 */
public class dividestring {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num=5;
        int div;
        System.out.println("Enter the string:");
        String a=obj.next();
        System.out.println("The given string is "+str);
        int length=a.length();
        if(length%num!=0) 
        {
            System.out.println("Invalid Input");
            return;
        }
        div=length/num;
        System.out.print("The given string is divided into "+n+" equal parts and they are:");
        for(int i=0;i<length;i++) 
        {
            if(i%div==0)
            {
                System.out.print("\t");
            }
            System.out.print(a.charAt(i));
        }
    }

}
