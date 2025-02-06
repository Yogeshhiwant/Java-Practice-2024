package ImpClass;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
//    private String gender;
//    private long salary;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return id == employee.id && Objects.equals(name, employee.name);
	}

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
	public int hashCode() {
		return Objects.hash(id);
	}

// Comparable interface overrides compareTo(Object o) method
	public int compareTo(Employee o) {
		return this.id - o.id;
	}

// Comparator uses compare(Object o1, Object o2) method
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};


}
