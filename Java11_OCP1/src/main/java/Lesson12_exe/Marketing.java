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
public class Marketing extends Employee{
    private String department = "Marketing";
    private double depId = 31;
    
    public Marketing( int empId, String name, String title, String email, double depId, String department) {
        super (empId, name, title, email);
        
        this.department = department;
        this.depId = depId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getDepId() {
        return depId;
    }

    public void setDepId(double depId) {
        this.depId = depId;
    }
}

