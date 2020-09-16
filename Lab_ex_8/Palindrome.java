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
        String a="",s;
        System.out.println("Enter the string:");
        s=obj.next();
        int len=s.length();
        for(int i=len-1;i>=0;i--)
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
