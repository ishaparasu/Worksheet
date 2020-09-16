/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_8;
import java.util.Scanner;
/**
 *
 * @author Isha Parasu B`
 */
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String a="";
        System.out.println("Enter the string:");
        String s=obj.next();
       for(int i=s.length()-1;i>=0;i--)
        {
            a=a+s.charAt(i);
        }
        if(a.equalsIgnoreCase(s))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
    }
    
}
