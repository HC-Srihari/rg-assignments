package week1.coreJava.question6;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
    private List<Employee> employeeList = new ArrayList<>();

    void printEmployeeDetails(Employee employee){
        System.out.println("Id : "+ employee.getId()+"\nEmployee Name : "+ employee.getName()+"\nEmployee Department : "+ employee.getDepartment());
    }

    public void addEmployee(Employee emp) {
        employeeList.add(emp);
        System.out.println("Employee added: ");
        printEmployeeDetails(emp);
    }

    public void viewEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employeeList) {
                printEmployeeDetails(emp);
            }
        }
    }

    public void updateEmployee(int id, String newName, String newDepartment) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setDepartment(newDepartment);
                System.out.println("Employee updated: ");
                printEmployeeDetails(emp);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    public void deleteEmployee(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                System.out.println("Employee deleted with ID: " + id);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }
}
