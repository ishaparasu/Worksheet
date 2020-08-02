/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;

/**
 *
 * @author Isha
 */
public class Box {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               box obj=new box();
        System.out.println(obj.depth);
        box obj1=new box(10,20,30);
        System.out.println(obj1.depth);
        // TODO code applicat,ion logic here
    }
    
}
class box1
{
    double height;
    double width;
    double depth;
    box1()
    {
        System.out.println("inside const");
        height=10;
        depth=20;
        width=30;
        
    }
    box1(double h,double w,double d)
    {
        System.out.println("Sec const");
        height=h;
        depth=d;
        width=w;
    }
}
        // TODO code application logic here
    
    

