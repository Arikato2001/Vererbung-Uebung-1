class Employee extends Person {
    private final String employeeId;
    private String supervisorId;
    private double salary;

    public Employee(String name, String firstName, int age, String employeeId, String supervisorId, double salary) {
        super(name, firstName);
        super.age = age;
        this.employeeId = employeeId;
        this.supervisorId = supervisorId;
        this.salary = salary;
    }

    // Getter methods
    public String getEmployeeId() {
        return employeeId;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSupervisorId(String supervisorId){
        this.supervisorId = supervisorId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printAll(){
        System.out.println("Full name: " + fullName());
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + getSalary());
    }
}
