package mypersons;

public class Adult extends Person{
	protected String workspace;
	
	public void setDatas(String name, int age, String workspace) {
		this.name = name;
		this.age = age;
		this.workspace = workspace;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "Age: " + age + " Workspace: " + workspace;
	}
	
	public String getWorkspace() {
		return workspace;
	}
}
