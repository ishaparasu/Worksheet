/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revarr;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class Revarr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=obj.nextInt();
        System.out.println("Enter the elements:");
        int a[]=new int[10];
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();
        }
        System.out.println("Reverse order is:");
        for(int i=n-1;i>=0;i--){
            System.out.println(+a[i]);
        }
        
        // TODO code application logic here
    }
    
}
