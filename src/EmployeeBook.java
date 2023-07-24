public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double salarySum() {
        double sum = 0.0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public Employee salaryMinEmployee() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary())
                min = employee;
        }
        return min;
    }

    public Employee salaryMaxEmployee() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary())
                max = employee;
        }
        return max;
    }

    public double avarageSalary() {
        return salarySum() / employees.length;
    }

    public void printEmployeesFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeeMiddleName());
        }
    }

    public void salaryIndexing(double percent) {
        for (Employee employee : employees) {
            double increase = employee.getSalary() * percent / 100;
            employee.setSalary(employee.getSalary() + increase);
        }
    }

    public Employee salaryMinEmployeeDepartment(int department) {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (min == null || employee.getSalary() < min.getSalary()) {
                    min = employee;
                }
            }
        }
        return min;
    }

    public Employee salaryMaxEmployeeDepartment(int department) {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                if (max == null || employee.getSalary() > max.getSalary()) {
                    max = employee;
                }
            }
        }
        return max;
    }

    public double salarySumDepartment(int department) {
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public double avarageSalaryDepartment(int department) {
        int numberOfEmployees = 0;
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                numberOfEmployees++;
                sum += employee.getSalary();
            }
        }
        if (numberOfEmployees == 0) {
            System.out.println("В отделе нет сотрудников");
        }
        return sum / numberOfEmployees;
    }

    public void printEmployeesDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ID работника: " + employee.getId() + ", ФИО: " + employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeeMiddleName() + ", зарплата: " + employee.getSalary());
            }
        }
    }

    public void salaryIndexingDepartment(double percent, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double increase = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + increase);
            }
        }
    }

    public void salaryIsLess(double number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println("ID работника: " + employee.getId() + ", ФИО: " + employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeeMiddleName() + ", зарплата: " + employee.getSalary());
            }
        }
    }

    public void salaryIsMore(double number) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println("ID работника: " + employee.getId() + ", ФИО: " + employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeeMiddleName() + ", зарплата: " + employee.getSalary());
            }
        }
    }
    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public void deleteEmployee(String lastName, String firstName, String middleName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].equalsFIO(lastName, firstName, middleName)) {
                    employees[i] = null;
                    break;
                }
            }
        }
    }
    public void changeSalary(String lastName, String firstName, String middleName, double changedSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].equalsFIO(lastName, firstName, middleName)) {
                    employees[i].setSalary(changedSalary);
                    break;
                }
            }
        }
    }
    public void changeDepartment(String lastName, String firstName, String middleName, int changedDepartment) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].equalsFIO(lastName, firstName, middleName)) {
                employees[i].setDepartment(changedDepartment);
                break;
            }
        }
    }
    public void printDepartmentsEmployeesFullName(int department) {
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getDepartment() == department) {
                    System.out.println(employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeeMiddleName());
                }
            }
        }
    }
    public void printDepartments() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Отдел № " + i + ":");
            printDepartmentsEmployeesFullName(i);
        }
    }
}

