public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee("Александров","Александр","Александрович",1,45000));
        employeeBook.addEmployee(new Employee("Окунева","Ольга","Олеговна",2,40000));
        employeeBook.addEmployee(new Employee("Воронин","Владимир","Вячеславович",3,42000));
        employeeBook.addEmployee(new Employee("Курочкина","Екатенина","Дмитриевна",4,50000));
        employeeBook.addEmployee(new Employee("Павлов","Иван","Иванович",5,51000));
        employeeBook.addEmployee(new Employee("Гусаров","Глеб","Вячеславович",1,49000));
        employeeBook.addEmployee(new Employee("Иванов","Роман","Валерьевич",2,45000));
        employeeBook.addEmployee(new Employee("Кораблев","Денис","Сергеевич",3,40000));
        employeeBook.addEmployee(new Employee("Привалова","Наталия","Игоревна",4,51000));
        employeeBook.addEmployee(new Employee("Крапивина","Ольга","Анатольевна",5,40000));
        System.out.println("Сложность 3, задача 4-a:");
        employeeBook.printEmployees();
        System.out.println("Сложность 3, задача 4-b:");
        employeeBook.deleteEmployee("александров", "александр", "александрович");
        employeeBook.printEmployees();
        System.out.println("Сложность 3, задача 5-a:");
        employeeBook.changeSalary("кораблев", "денис", "сергеевич", 50000);
        employeeBook.printEmployees();
        System.out.println("Сложность 3, задача 5-b:");
        employeeBook.changeDepartment("кораблев", "денис", "сергеевич",2);
        employeeBook.printEmployees();
        System.out.println("Сложность 3, задача 6:");
        employeeBook.printDepartments();
    }
}

