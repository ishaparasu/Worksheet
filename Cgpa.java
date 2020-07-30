/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cgpa;

import java.util.Scanner;

/**
 *
 * @author Isha
 */
public class Cgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double tot,cgpa;
        System.out.println("enter the marks");
        double phy=obj.nextDouble();
        double chem=obj.nextDouble();
        double eng=obj.nextDouble();
        double maths=obj.nextDouble();
        double cs=obj.nextDouble();
        tot=(phy+chem+eng+maths+cs)/10;
        cgpa=tot/5;
        System.out.println("CGPA = "+cgpa);
        
       
        
        // TODO code application logic here
    }
    
}
