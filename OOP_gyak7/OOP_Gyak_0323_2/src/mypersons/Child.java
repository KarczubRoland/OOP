package mypersons;

public class Child extends Person {
	private String school;
	
	public void setDatas(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}
	@Override
	public String toString() {
		return "Name: " + name + "Age: " + age + " School: " + school;
	}
	
	public String getSchool() {
		return school;
	}
}
