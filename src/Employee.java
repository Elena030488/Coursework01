import java.util.Objects;

public class Employee {
    private String employeeFirstName;
    private String employeeMiddleName;
    private String employeeLastName;
    private int department;
    private double salary;
    private static int IDCounter = 0;
    private int id;

    public Employee (String employeeLastName, String employeeFirstName, String employeeMiddleName, int department, int salary) {
        this.employeeLastName = employeeLastName;
        this.employeeFirstName = employeeFirstName;
        this.employeeMiddleName = employeeMiddleName;
        this.department = department;
        this.salary = salary;
        this.id = IDCounter++;
    }
    public String getEmployeeFirstName() {
        return this.employeeFirstName;
    }
    public String getEmployeeMiddleName() {
        return this.employeeMiddleName;
    }
    public String getEmployeeLastName() {
        return this.employeeLastName;
    }
    public int getDepartment() {
        return this.department;
    }
    public double getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID работника: " + this.id + ", ФИО: " + this.employeeLastName + " " + this.employeeFirstName + " " + this.employeeMiddleName + ", отдел: " + this.department + ", зарплата: " + this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(employeeFirstName, employee.employeeFirstName) && Objects.equals(employeeMiddleName, employee.employeeMiddleName) && Objects.equals(employeeLastName, employee.employeeLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeFirstName, employeeMiddleName, employeeLastName, department, salary, id);
    }

    public boolean equalsFIO(String lastName, String firstName, String middleName) {
        if (getEmployeeLastName().equalsIgnoreCase(lastName) && getEmployeeFirstName().equalsIgnoreCase(firstName) && getEmployeeMiddleName().equalsIgnoreCase(middleName)) {
            return true;
        }
        return false;
    }

}

