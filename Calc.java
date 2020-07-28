/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author Vimal Hari
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the numbers:");
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        double c;
        System.out.println("Enter the operatore +,-,*,/");
        char opr=obj.next().charAt(0);
        switch(opr){
            case '+':
                c=a+b;
                break;
            case'-':
                c=a-b;
                break;
            case '*':
                c=a*b;
                break;
            case '/':
                c=a/b;
                break;
            default:
                System.out.println("ERROR   INVALID OPERASTOR");
                return;
        }
        System.out.println(a+" "+opr+" "+b+"="+c);       
        }
            
        }
        
        
        // TODO code application logic here
        
                
                // TODO code application logic here

    
  

