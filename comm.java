
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vimal Hari
 */
public class comm {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter amount");
        double d= obj.nextDouble();
        System.out.println("Enter discount");
        double dl=obj.nextDouble();
        double amopor = d/100*dl;
        System.out.println("Commission amount"+(d-amopor));
           
    }
}
