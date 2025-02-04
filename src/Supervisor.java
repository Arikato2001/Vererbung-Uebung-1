class Supervisor extends Employee {

    public Supervisor(String name, String firstName, int age, String employeeId, String supervisorId, double salary) {
        super(name, firstName, age, employeeId, supervisorId, salary);
    }

    // Supervisor can modify the salary of an Employee
    public void changeSalary(Employee employee, double newSalary) {
        // Check if the supervisor is the correct one for the employee (optional, if needed)
        if (this.getEmployeeId().equals(employee.getSupervisorId())) {
            // Directly changing the employee's salary
            employee.setSalary(newSalary);
            System.out.println("Salary for employee " + employee.getEmployeeId() + " has been updated to " + newSalary);
        } else {
            System.out.println("You are not authorized to change this employee's salary.");
        }
    }

    // Setter for Salary to be used only by Supervisor
    public void setSalary(double salary) {
        super.setSalary(salary);
    }
}

