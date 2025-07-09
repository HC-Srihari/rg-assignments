package week1.coreJava.question7;

import java.util.*;
import java.sql.*;

public class EmployeeJDBC {
    private final String url = "jdbc:mysql://localhost:3306/company";
    private final String user = "root";
    private final String password = "root";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    void printEmployeeDetails(Employee employee){
        System.out.println("Id : "+ employee.getId()+"\nEmployee Name : "+ employee.getName()+"\nEmployee Department : "+ employee.getDepartment());
    }

    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employee (id, name, department) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, emp.getId());
            stmt.setString(2, emp.getName());
            stmt.setString(3, emp.getDepartment());
            stmt.executeUpdate();
            System.out.println("Employee added: ");
            printEmployeeDetails(emp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewEmployees() {
        String sql = "SELECT * FROM employee";
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        "Employee{id=" + rs.getInt("id") +
                                ", name='" + rs.getString("name") +
                                "', department='" + rs.getString("department") + "'}"
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateEmployee(int id, String name, String department) {
        String sql = "UPDATE employee SET name = ?, department = ? WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, name);
            stmt.setString(2, department);
            stmt.setInt(3, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee updated.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id = ?";
        try (Connection conn = getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee deleted.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
