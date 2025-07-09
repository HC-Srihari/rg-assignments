package week1.coreJava.question6;

public class Main {
    public static void main(String[] args) {
        EmployeeCRUD employeeCRUD = new EmployeeCRUD();

        //create employees
        employeeCRUD.addEmployee(new Employee(1,"John Wick","IT"));
        employeeCRUD.addEmployee(new Employee(2,"Tony Stark","Finance"));


        //read all employees
        System.out.println("All employees :");
        employeeCRUD.viewEmployees();

        //update employee
        System.out.println("Updating the employee with id: 2");
        employeeCRUD.updateEmployee(2,"Tony Stark","R&D");

        //deleting employees
        System.out.println("Deleting employee with id : 1 ");
        employeeCRUD.deleteEmployee(1);


    }
}
