/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_ex_7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Isha Parasu B
 */
public class empsort {
    public static void main(String[] args) {
        employee emp=new employee("Sonal",40000);
        ArrayList<employee> list=new ArrayList<>();
        list.add(emp);
        list.add(new employee("Geminika Muthu",75000));
        list.add(new employee("Dharshini Sree",35000));
        list.add(new employee("Jovita",50000));
        list.add(new employee("Isha Parasu",40000));
        list.add(new employee("Darathi",37000));
        list.add(new employee("Amsavarthan",100000));
        list.add(new employee("Aako",60000));
        list.add(new employee("Ram",37000));
        list.add(new employee("Aravinth Vimal",55000));
        list.add(new employee("Sorna",42000));
        list.add(new employee("Guru Priya Dharshini",35000));
        list.add(new employee("Jeya Roshini",48000));
        list.add(new employee("Sathya",33000));
        list.add(new employee("Naseeha Shyma",45000));
        list.add(new employee("Bhavadharani",52000));
        list.add(new employee("Nithila Pallete",70000));
        list.add(new employee("Divya Sri",44000));
        list.add(new employee("Raji Santhoshi",62000));
        list.add(new employee("Jane Nivethitha",72000));
        System.out.println("List is "+list);
        Collections.sort(list,new sort());
        System.out.println("Sorted list is \n"+list);
    }
    
}

class employee
{
    String name;
    double sal;
    employee(String s1,double s2)
    {
        name=s1;
        sal=s2;
    }
    public String toString()
    {
        return "\nName:"+name+"\tSalary:Rs."+sal;
    }
}

class sort implements Comparator<employee>
{
    public int compare(employee e1,employee e2)
    {
        return e2.name.compareTo(e1.name);
    }
}
