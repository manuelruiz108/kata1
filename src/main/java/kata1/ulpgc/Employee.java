package kata1.ulpgc;

public class Employee {
    private final String name;
    private final String surname;
    private final String department;
    private final String id;

    public Employee(String name, String surname, String department, String id) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartment() {
        return department;
    }

    public String getId() {
        return id;
    }

}
