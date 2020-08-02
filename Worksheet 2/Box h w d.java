
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box;


class box
{
    double depth;
    double height;
    double width;
    double vol;
    public void volume()
    {
        vol=depth*height*width;
        System.out.println("Volume:"+vol);
    }
}
/**
 *
 * @author Isha
 */
public class Box{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        box obj=new box();
        
        obj.depth=10;
        obj.height=20;
        obj.width=30;
  
        // TODO code application logic here
    }
    
}
