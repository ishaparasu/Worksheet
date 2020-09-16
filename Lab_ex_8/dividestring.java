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
        int i;
        System.out.println("Enter the string:");
        String s=obj.next();
        System.out.println("The given string is "+str);
        int l=s.length();
        if(l%num!=0) 
        {
            System.out.println("Invalid Input");
            return;
        }
        div=len/num;
        System.out.print("The given string is divided into "+n+" equal parts and they are:");
        for(i=0;i<l;i++) 
        {
            if(i%div==0)
            {
                System.out.print("\t");
            }
            System.out.print(s.charAt(i));
        }
    }

}
