/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package power;

/**
 *
 * @author Isha
 */
public class Power {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base=2;
        int exponent=4;
        long result=1;
        for(exponent=4;exponent!=0;--exponent)
        {
            result=result*base;    
        }
        System.out.println("the power = "+result);
        // TODO code application logic here
    }
    
}
