package week1.coreJava.question7;

public class Main {
    public static void main(String[] args) {
        EmployeeJDBC empCRUD = new EmployeeJDBC();


        //create employees
        Employee employee1 = new Employee(5,"Captain America","Marvel");
        Employee employee2 = new Employee(6, "Bruce Wayne","DC");
        empCRUD.addEmployee(employee1);
        empCRUD.addEmployee(employee2);


        // reading all employees
        System.out.println("All employees : ");
        empCRUD.viewEmployees();

        //updating employees
        System.out.println("Updating employee :");
        empCRUD.updateEmployee(5,"Captain America","Avengers");

        //deleting employees
        System.out.println("Deleting Employee");
        empCRUD.deleteEmployee(5);




    }
}
