package mypersons;

public class Employee extends Adult {
	private int salary;
	//private static final int Retage = 65;

	public void setDatas(String name, int age, String workspace, int salary) {
		this.name = name;
		this.age = age;
		this.workspace = workspace;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age + " Workspace: " + workspace + " Salary: " + salary;
	}

}
