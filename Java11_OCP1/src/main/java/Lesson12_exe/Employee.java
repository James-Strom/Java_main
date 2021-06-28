/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12_exe;

/**
 *
 * @author james
 */
public class Employee {
    private int empId;
    private String name;
    private double salary;
    private String title;
    private String email;
    
    public Employee (int empId, String name, String title,String email) {
        this.empId = empId;
        this.name = name;
        this.title = title;
        this.email = email;
    }
    
    public void display() {
        System.out.println("Empoyee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Title: " + title);
        System.out.println("Email: " + email);
    } 
}
