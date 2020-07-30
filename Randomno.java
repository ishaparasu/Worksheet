/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomno;

import java.util.Random;

/**
 *
 * @author Isha
 */
public class Randomno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rmd=new Random();
        int result=rmd.nextInt(10)+5;
        System.out.println("Random number:"+result);
        
        // TODO code application logic here
    }
    
}
