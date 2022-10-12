//package practice;

import java.util.Scanner;


class Employee{
    int salary;
    String name;
    Scanner grasp = new Scanner(System.in);
    int getsal()
    {
        return salary;
    }

    int setsal()
    {
        // Scanner grasp = new Scanner(System.in);
        salary = grasp.nextInt();
        return salary;
    }
    
    String getname()
    {
        return name;
    }

    String setname()
    {
        // Scanner grasp = new Scanner(System.in);
        name = grasp.nextLine();
        return name;
    }
}
    
class emp1
{
    static String getname()
    {
        Employee obj = new Employee();
        return obj.name;
    }
}

public class Class_Practice {
    public static void main(String[] args)
    {
        Employee cat = new Employee();
        System.out.println("Enter new employee's name: ");
        cat.setname();
        System.out.println("Enter new employee's salary: ");
        cat.setsal();
        System.out.println("Name of new employee: " + emp1.getname() + "\nSalary of new Employee: " + cat.getsal());
    }
}
