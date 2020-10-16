/*
2.Write a java program to search an element from the given type of elements using a generic function.
 */
package lab_ex12;

import java.util.Scanner;

/**
 *
 * @author isha parasu
 */
public class Generic_function {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        Integer[] numbers={20,4,98,30,73,66,87}; 
        String[] names={"Isha","Kanisha","Yogi","Kamalika","Divya","Deepthi"};
        Character[] alphabets={'a','b','c','d','e'};
        Double[] dnum={100.00,234.56,34.78,3253.000,743.4,63.56};
        Float[] fnum={21.2f,45.4f,63.5f,5912.7f};
        
        search s=new search();
        System.out.println("Available types: \n1>Integer \n2>String \n3>Character \n4>Double \n5>Float");
        System.out.println("Press 1 for Integer, 2 for String, 3 for Charcater, 4 for Double and 5 for Float types:");
        int option=obj.nextInt();
        switch(option)
        {
            case 1:
                System.out.println("Enter the number to be searched:");
                int value1=obj.nextInt();
                s.search(value1,numbers);
                break;
            case 2:
                System.out.println("Enter the name to be searched:");
                String value2=obj.next();
                s.search(value2,names);
                break;
            case 3:
                System.out.println("Enter the alphabet to be searched:");
                char value3=obj.next().charAt(0);
                s.search(value3,alphabets);
                break;
            case 4:
                System.out.println("Enter the number to be searched:");
                double value4=obj.nextDouble();
                s.search(value4,dnum);
                break;
            case 5:
                System.out.println("Enter the number to be searched:");
                float value5=obj.nextFloat();
                s.search(value5,fnum);
                break;
        }
    }
}
class search
{
    boolean flag=false;
    public<I,T> void search(I s,T[] array)
    {
        for(int i=0;i<array.length;i++)
        {
            if(s.equals(array[i])) 
            {
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("'"+s+"' is found in the array.");
        else
            System.out.println("'"+s+"' is not found in the array.");
    }
}
