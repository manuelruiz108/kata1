package kata1.ulpgc;

public record Employee(String name, String surname, String department, String id) {
    public String uniqueID() {
        if (department.length() >= 3) {
            return department.substring(0, 3) + "-" + id;
        }
        return department + "-" + id;

    }

    public String toString() {
        return name + " " + surname + " with ID: " + uniqueID() + " works at " + department;
    }
}
