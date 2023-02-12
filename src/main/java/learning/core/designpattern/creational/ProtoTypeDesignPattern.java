package learning.core.designpattern.creational;


/**
 * @author akhil.kurup
 * 
 * is taking a clone of an existing object
 *
 */
public class ProtoTypeDesignPattern {
	
	
	
	
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Akhil");
		Employee e2 = (Employee) e1.getClone();
		System.out.println(e2.toString());
	}

}


interface ProtoType{ public ProtoType getClone();}
class Employee implements ProtoType
{
	private int empId;
	private String name;
	
	public String toString()
	{
		return "Name :" +name + " EmpId "+empId;
		
	}
	
	public Employee(int id,String name)
	{
		this.empId=id;
		this.name=name;
	}
	@Override
	public ProtoType getClone() {
		return new Employee(empId, name);
	}
	
}