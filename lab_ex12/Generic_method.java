/*
1.Write java programs that include generic method to satisfy the following property.
    a.	To counts the number of odd integers in an integer list
    b.	To exchange the positions of two different elements in an array.
    c.	To find the maximal element in the range [begin, end] of a list.
 */
package lab_ex12;
import java.util.Scanner;

/**
 *
 * @author isha parasu
 */
public class Generic_method {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        Integer s[]={33,436,234,65,86,235,7,12};
        System.out.println("The Integer list elements are:");
        for(int i=0;i<s.length;i++)
            System.out.println(s[i]+" ");
        Collections c=new Collections();
        c.OddNUmbers(s);
        
        System.out.println("Enter the position of 1st element to be exchanged:"); //(1-8)
        int p1=obj.nextInt();
        System.out.println("Enter the posiion of 2nd element to be exchanged:"); //(1-8)
        int p2=obj.nextInt();
        if(p1>9||p1<0||p2>9||p2<0)
        {
            System.out.println("Invalid position!");
            return;
        }
        c.ExchangePOs(s,p1,p2);
        
        System.out.println("Enter the begin index to find the maximal element in the specified range:"); //(0-7)
        int begin=obj.nextInt();
        System.out.println("Enter the end index to find the maximal element in the specified range:"); //(0-7)
        int end=obj.nextInt();
        if(begin>end)
        {
            System.out.println("Invalid indices!");
            return;
        }
        c.MaxElement(s,begin,end);
    }
}
class Collections
{
    public<I extends Integer> void OddNUmbers(I[] value)
    {
        int count=0;
        for(int i=0;i<value.length;i++)
        {
            if(value[i]%2!=0)
                count++;
        }
        if(count>0)
            System.out.println("Number of odd integers is:"+count);
        else
            System.out.println("No odd integers!");
    }
    public<I extends Integer> void ExchangePOs(I[] value,int p1,int p2)
    {
        I a; 
        a=value[p1-1];
        value[p1-1]=value[p2-1];
        value[p2-1]=a;
        System.out.println("The list elements after exchanging are:");
        for(int i=0;i<value.length;i++)
            System.out.println(value[i]+" ");
    }
    public<A extends Integer> void MaxElement(A[] value,int begin,int end)
    {
        A max=value[begin];
        for(int i=begin;i<=end;i++)
        {
            if(value[i]>max)
            {
                max=value[i];
            }
        }
        System.out.println("Maximal element is:"+max);
    }
}
