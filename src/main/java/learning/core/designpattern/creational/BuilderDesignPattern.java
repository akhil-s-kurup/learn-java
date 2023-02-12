package learning.core.designpattern.creational;

public class BuilderDesignPattern {

	public static void main(String[] args) {

	 Student student = new Student.StudentBuilder().buildWithId(1).buildWithName("Akhil").build();
	 System.out.println(student);
	}
	
}

class Student{
	int Id;
	String name;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Student(StudentBuilder sb)
	{
		this.Id=sb.id;
		this.name=sb.name;
	}
	
	public String toString() {
		return "Name: " +name + "  Id :"+Id; 
	}
	
	static class StudentBuilder
	{
		int id;String name;
		
		public StudentBuilder buildWithId(int id)
		{
			this.id=id;
			return this;
		}
		
		public StudentBuilder buildWithName(String name)
		{
			this.name=name;
			return this;
		}
		
		public Student build() {
			return new Student(this);
			
		}
	}
	
	
}