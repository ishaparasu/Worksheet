/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Isha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        art obj=new art();
        obj.add();
        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());
        // TODO code application logic here
    }
    
}
class art
{
    int a=3;
    int b=2;
    int add()
    {
    return a+b;    
    }
    int sub(){
        return a-b;
    }
    int mul()
    {
        return a*b;
    }
    int div()
    {
    return a/b;
    }
}