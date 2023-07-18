public class Main {
    private static Employee[] employees = new Employee[10];
    private static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    private static double salarySum() {
        double sum = 0.0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    private static Employee salaryMinEmployee() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary())
                min = employee;
        }
        return min;
    }
    private static Employee salaryMaxEmployee() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary())
                max = employee;
        }
        return max;
    }
    private static double avarageSalary() {
        return salarySum() / employees.length;
    }
    private static void printEmployeesFullName() {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeeMiddleName());
        }
    }
    private static void salaryIndexing(double percent) {
        for (Employee employee : employees) {
            double increase = employee.getSalary() * percent / 100;
            employee.setSalary(employee.getSalary() + increase);
        }
    }
    private static Employee salaryMinEmployeeDepartment(int department) {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (min == null || employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }
    private static Employee salaryMaxEmployeeDepartment(int department) {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != department) {
                continue;
            }
            if (max == null || employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }
    private static double salarySumDepartment(int department) {
        double sum = 0.0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }
    private static double avarageSalaryDepartment(int department) {
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
    private static void printEmployeesDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("ID работника: " + employee.getId() + ", ФИО: " + employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeeMiddleName() + ", зарплата: " + employee.getSalary());
            }
        }
    }
    private static void salaryIndexingDepartment(double percent, int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                double increase = employee.getSalary() * percent / 100;
                employee.setSalary(employee.getSalary() + increase);
            }
        }
    }
    private static void salaryIsLess(double number) {
        for (Employee employee : employees) {
            if (employee.getSalary() < number) {
                System.out.println("ID работника: " + employee.getId() + ", ФИО: " + employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeeMiddleName() + ", зарплата: " + employee.getSalary());
            }
        }
    }
    private static void salaryIsMore(double number) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= number) {
                System.out.println("ID работника: " + employee.getId() + ", ФИО: " + employee.getEmployeeLastName() + " " + employee.getEmployeeFirstName() + " " + employee.getEmployeeMiddleName() + ", зарплата: " + employee.getSalary());
            }
        }
    }
    public static void main(String[] args) {
        employees[0] = new Employee("Александров","Александр","Александрович",1,45000);
        employees[1] = new Employee("Окунева","Ольга","Олеговна",2,40000);
        employees[2] = new Employee("Воронин","Владимир","Вячеславович",3,42000);
        employees[3] = new Employee("Курочкина","Екатенина","Дмитриевна",4,50000);
        employees[4]= new Employee("Павлов","Иван","Иванович",5,51000);
        employees[5] = new Employee("Гусаров","Глеб","Вячеславович",1,49000);
        employees[6] = new Employee("Иванов","Роман","Валерьевич",2,45000);
        employees[7] = new Employee("Кораблев","Денис","Сергеевич",3,40000);
        employees[8] = new Employee("Привалова","Наталия","Игоревна",4,51000);
        employees[9] = new Employee("Крапивина","Ольга","Анатольевна",5,40000);
        System.out.println("Сложность 1, задача 8-a:");
        printEmployees();
        System.out.println("Сложность 1, задача 8-b:");
        System.out.println("Сумма затрат на зарплаты в месяц = " + salarySum());
        System.out.println("Сложность 1, задача 8-c:");
        System.out.println("Сотрудник с минимальной зарплатой: " + salaryMinEmployee());
        System.out.println("Сложность 1, задача 8-d:");
        System.out.println("Сотрудник с максимальной зарплатой: " + salaryMaxEmployee());
        System.out.println("Сложность 1, задача 8-e:");
        System.out.println("Среднее значение зарплат сотрудников: " + avarageSalary());
        System.out.println("Сложность 1, задача 8-f:");
        printEmployeesFullName();
        System.out.println("Сложность 2, задача 1:");
        salaryIndexing(12.5);
        printEmployees();
        System.out.println("Сложность 2, задача 2-a:");
        System.out.println("Сотрудник с минимальной зарплатой в отделе: " + salaryMinEmployeeDepartment(2));
        System.out.println("Сложность 2, задача 2-b:");
        System.out.println("Сотрудник с максимальной зарплатой в отделе: " + salaryMaxEmployeeDepartment(4));
        System.out.println("Сложность 2, задача 2-c:");
        System.out.println("Сумма затрат на зарплаты по отделу в месяц = " + salarySumDepartment(3));
        System.out.println("Сложность 2, задача 2-d:");
        System.out.println("Среднее значение зарплат сотрудников в отделе: " + avarageSalaryDepartment(2));
        System.out.println("Сложность 2, задача 2-e:");
        salaryIndexingDepartment(9.5, 2);
        printEmployeesDepartment(2);
        System.out.println("Сложность 2, задача 2-f:");
        printEmployeesDepartment(3);
        System.out.println("Сложность 2, задача 3-a:");
        salaryIsLess(52000);
        System.out.println("Сложность 2, задача 3-b:");
        salaryIsMore(52000);
    }
}
