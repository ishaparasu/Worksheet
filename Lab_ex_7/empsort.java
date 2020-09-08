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
        employee emp=new employee("nairobi",40000);
        ArrayList<employee> list=new ArrayList<>();
        list.add(emp);
        list.add(new employee("sri",100));
        list.add(new employee("devi",300));
        list.add(new employee("soundhu",500));
        list.add(new employee("raj",250));
        list.add(new employee("Darathi",320));
        list.add(new employee("preetha",110));
        list.add(new employee("ram",600));
        list.add(new employee("dhivya",370));
        list.add(new employee("mai",550));
        list.add(new employee("Sruthi",450));
        list.add(new employee("Priya ",700));
        list.add(new employee("Roshini",900));
        list.add(new employee("siva",600));
        list.add(new employee("jesica",540));
        list.add(new employee("rani",570));
        list.add(new employee("bharathi",720));
        list.add(new employee("rajaa",710));
        list.add(new employee("dsouza",720));
        list.add(new employee("raghul",310));
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
