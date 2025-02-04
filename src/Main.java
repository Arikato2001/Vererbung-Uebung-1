//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Supervisor sup = new Supervisor("John", "Doe", 40, "S123", "S123", 5000.0);
        Employee emp = new Employee("Jane", "Smith", 30, "E456", "S123", 3000.0);

        emp.printAll();

        sup.changeSalary(emp, 3500.0);

        System.out.println("\nFinal Employee Details:");
        emp.printAll();
    }
}