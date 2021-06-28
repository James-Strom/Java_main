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
public class Main {
    public static void main(String[] args) {
        Accounting accEmp1 = new Accounting (11, "Joe Soap", "CFO", "jspoap@cc.com", 21, "Accounting");
        Accounting accEmp2 = new Accounting (12, "Alice Soap", "Head of Tax", "aspoap@cc.com", 21, "Accounting");
        Accounting accEmp3 = new Accounting (13, "Harry Potter", "Bookkeeper", "hpotter@cc.com", 21, "Accounting");
        Sales salEmp1 = new Sales (14, "Saul Goodman", "Head of Sales", "sgoodman@cc.com", 25, "Sales");
        Sales salEmp2 = new Sales (15, "Jesse Pinkman", "Sales Rep", "jpinkman@cc.com", 25, "Sales");
        Marketing marEmp1 = new Marketing (16, "Gus Fring", "CMO", "gfring@cc.com", 31, "Marketing");
                
        
        accEmp1.display();
        System.out.println("Department ID: " + accEmp1.getDepId());
        System.out.println("Department: " + accEmp1.getDepartment() +"\n");
        
        accEmp2.display();
        System.out.println("Department ID: " + accEmp2.getDepId());
        System.out.println("Department: " + accEmp2.getDepartment() + "\n");
        
        accEmp3.display();
        System.out.println("Department ID: " + accEmp3.getDepId());
        System.out.println("Department: " + accEmp3.getDepartment() + "\n");
        
        salEmp1.display();
        System.out.println("Department ID: " + salEmp1.getDepId());
        System.out.println("Department: " + salEmp1.getDepartment() + "\n");
        
        salEmp2.display();
        System.out.println("Department ID: " + salEmp2.getDepId());
        System.out.println("Department: " + salEmp2.getDepartment() + "\n");
        
        marEmp1.display();
        System.out.println("Department ID: " + marEmp1.getDepId());
        System.out.println("Department: " + marEmp1.getDepartment() + "\n");
    }
}
