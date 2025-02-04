public class Person {
    private String name,firstName;
    public int age;

    public Person() {
    }

    public Person(String ln, String fn) {
        this.firstName = fn;
        this.name = ln;
    }

    public void setName(String ln, String fn) {
        this.firstName = fn;
        this.name      = ln;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String fullName(){

        return this.firstName + " " + this.name;
    }
}
