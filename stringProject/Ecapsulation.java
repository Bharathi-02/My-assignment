package stringProject;

public class Ecapsulation {

 
	private int age;
	private String name;
	public String getName() {
		return name;
	
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
    public void setAge(int age) {
    	this.age=age;
    }
	

public static void main (String[]args) {
	Ecapsulation s=new Ecapsulation();
	s.setName("bharathi");
	s.setAge(22);
	System.out.println(s.getName());
	System.out.println(s.getAge());

}}
