/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_9;
/**
 *
 * @author Isha Parasu B
 */
public class try_catch {
    public static void main(String[] args) {
        try {
           int i=10,j=0;
           int k=i/j;// 10 / 0 is not possible
           System.out.println(k);        
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        try {
            int arr[]=new int[10];
            arr[50]=1;// 50 th index element can't be accessed as the array has only 10 index
            System.out.println(arr[50]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);                       
        }
        try {
            int n=Integer.parseInt("ISHA");// string can't be converted into integer format here
            System.out.println(n);
        }
        catch(NumberFormatException e) {
            System.out.println(e);
        }     
        try {
            String s="Isha";
            char c=s.charAt(18);// 18 th location is not possible as the string has only 4 characters
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
