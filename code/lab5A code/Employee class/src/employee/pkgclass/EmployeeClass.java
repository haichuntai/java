/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.pkgclass;

/**
 *
 * @author 19219
 */
class Employee{
    private String name;
    private int idNumber;
    private String department;
    private String position;
    public Employee(){
        name = " ";
        idNumber = 0;
        department = " ";
        position = " ";
    }
    public Employee(String ename, int eidNumber, String edepartment, String eposition){
        name = ename;
        idNumber = eidNumber;
        department = edepartment;
        position = eposition;
    }
    public Employee(String ename, int eidNumber){
        name = ename;
        idNumber = eidNumber;
        department = " ";
        position = " ";
    }
    public void setname(String ename){
        name = ename;
    }
    public void setidNumber(int eidNumber){
        idNumber = eidNumber;
    }
    public void setdepartment(String edepartment){
        department = edepartment;
    }
    public void setposition(String eposition){
        position = eposition;
    }
    public String getname(){
        return name;
    }
    public int getidNumber(){
        return idNumber;
    }
    public String getdepartment(){
        return department;
    }
    public String getposition(){
        return position;
    }
    
    
}
public class EmployeeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee1;
        employee1 = new Employee();
      employee1.setname("Susan Meyers");
      employee1.setidNumber(47899);
      employee1.setdepartment("Accounting");
      employee1.setposition("Vice President");
      
      Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");

      Employee employee3 = new Employee("Joy Rogers", 81774);
      employee3.setdepartment("Manufacturing");
      employee3.setposition("Engineer");
      
      System.out.println("Employee #1");
      System.out.println("Name: " + employee1.getname());
      System.out.println("ID Number: " + employee1.getidNumber());
      System.out.println("Department: " + employee1.getdepartment());
      System.out.println("Position: " + employee1.getposition());
      System.out.println();
      
      System.out.println("Employee #2");
      System.out.println("Name: " + employee2.getname());
      System.out.println("ID Number: " + employee2.getidNumber());
      System.out.println("Department: " + employee2.getdepartment());
      System.out.println("Position: " + employee2.getposition());
      System.out.println();
      
      System.out.println("Employee #3");
      System.out.println("Name: " + employee1.getname());
      System.out.println("ID Number: " + employee3.getidNumber());
      System.out.println("Department: " + employee3.getdepartment());
      System.out.println("Position: " + employee3.getposition());
    }
    
}
