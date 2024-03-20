/*
    3)Create a class Employee with multiple overloaded methods that have different parameter types (e.g., int, double, String). 
    Demonstrate calling each overloaded method with appropriate arguments. 
*/

 class Employee {

    public void employeeDetails(String name, int empId, float salary) {
        System.out.println("Name          : " + name);
        System.out.println("Employee ID   : " + empId);
        System.out.println("Salary        : " + salary);

    }

    public void employeeDetails(String name, int empId, double salary) {
        System.out.println("Name        : " + name);
        System.out.println("Employee ID : " + empId);
        System.out.println("Salary      : " + salary);

    }

    public void employeeDetails(String name, int empId, int salary, int yearsOfExperience) {
        System.out.println("Name         : " + name);
        System.out.println("Employee ID  : " + empId);
        System.out.println("Salary       : " + salary);
        System.out.println("Years of Exp : " + yearsOfExperience);

    }
}
public class OopjAssignment4Q3EmployeeDetails {
    public static void main(String[] args) {

        Employee emp = new Employee();

        System.out.println("----------------------------");

        emp.employeeDetails("Aniket Dhiwar", 6786012, 40000);

        System.out.println("----------------------------");

        emp.employeeDetails("Aditya patil", 7656045, 50000);

        System.out.println("----------------------------");

        emp.employeeDetails("Sayali Shinde",4556652, 60000, 5);

        System.out.println("----------------------------");

    }
}
