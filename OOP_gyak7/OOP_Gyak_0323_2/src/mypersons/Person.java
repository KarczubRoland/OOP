package mypersons;

public class Person {
	protected String name;
	protected int age;
	
	public void setDatas(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return " Name: " + name + " Age: " + age;
	}
	public boolean isSmaller(Person a) {
		if (a.getAge() < age)
			return true;
		return false;
	}
	
}
