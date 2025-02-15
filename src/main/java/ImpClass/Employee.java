package ImpClass;


import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.getId() && Objects.equals(name, employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {

    }
    // Comparable interface overrides compareTo(Object o) method
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
