/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_3;

/**
 *
 * @author Isha Parasu B
 */
public class Counter_function {
    public static void main(String[] args) {
        System.out.println("Without static variable:");
        without_static w=new without_static();
        without_static ww=new without_static();
        without_static wwww=new without_static();
        System.out.println("With static variable:");
        with_static wwwww=new with_static();
        with_static wwwwww=new with_static();
        with_static wwwwwww=new with_static();
    }    
}

class without_static
{
    int num=10;
    without_static()
    {
        num=num+10;
        System.out.println(num);// 20 20 20
    }
}

class with_static
{
    static int num=10;
    with_static()
    {
        num=num+10;
        System.out.println(num);//20 30 40
    }
}
