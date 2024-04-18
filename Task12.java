1. Create a package named "com.example.hr" that includes an Employee class. The

Employce class should have the following fields:


First  create the Employee class:

package com.example.hr;

public class Employee {
     
    private String name;
    private int id;
    private double salary;
    
     
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    
    public void printName() {
        System.out.println("Name: " + name);
    }
    
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

-----------------------------------------------------------------------
Next  create the EmployeeTest class:

package com.example.hrtest;
import com.example.hr.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        // Creating an instance of Employee class
        Employee employee = new Employee("John Doe", 101, 50000.0);
        
        // Calling methods to print name and salary
        employee.printName();
        employee.printSalary();
    }
}


2.Write a Java program to create an ArrayList of strings and then remove all the elements from the ArrayList.


import java.util.ArrayList;

public class RemoveElements {
    public static void main(String[] args) {
       
        ArrayList<String> arrayList = new ArrayList<>();

        
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");

         
        System.out.println("ArrayList before removing elements: " + arrayList);

         
        arrayList.clear();

         
        System.out.println("ArrayList after removing elements: " + arrayList);
    }
}



3.Write a Java program to create a TreeMap of employee IDs and names. Then, print out the names of all the employees in alphabetical order.


import java.util.*;

public class EmployeeTreeMap {
    public static void main(String[] args) {
 
        TreeMap<Integer, String> employeeMap = new TreeMap<>();

 
        employeeMap.put(101, "John Doe");
        employeeMap.put(102, "Alice Smith");
        employeeMap.put(103, "Bob Johnson");
        employeeMap.put(104, "Emily Davis");

 
        System.out.println("Names of all employees in alphabetical order:");
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }
    }
}


4.Write a program to convert List to Array

import java.util.ArrayList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
 
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");

 
        String[] array = list.toArray(new String[0]);

 
        System.out.println("Elements of the Array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}

