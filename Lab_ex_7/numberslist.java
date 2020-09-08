/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Isha Parasu B
 */
public class numberslist{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int num;
        double tot=0,avg;
        System.out.println("Enter the 10 elements:");
        ArrayList<Integer> list=new ArrayList<>(10);
        for(int i=0;i<10;i++)
        {
            num=obj.nextInt();
            list.add(num);
        }
        System.out.println("List is "+list);
        for(int i=0;i<10;i++)
        {
            tot=tot+list.get(i);
        }
        average=tot/10;
        System.out.println("Average is "+average);
        System.out.println("Smallest number is "+Collections.min(list));
        System.out.println("Largest number is "+Collections.max(list));
        list.removeIf((Integer in)->in%2==0);
        System.out.println("Updated list is "+list);
    }
}

