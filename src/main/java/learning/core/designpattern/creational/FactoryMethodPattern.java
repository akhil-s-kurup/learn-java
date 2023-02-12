package learning.core.designpattern.creational;



public class FactoryMethodPattern {
	/* Factory pattern create an abstact layer and , and a Factory clas will return the actual implimenation*/
	public static void main(String[] args) {
		Writer writer = WriterFactory.getWriter("pen");
		writer.write();
		writer = WriterFactory.getWriter("pencil");
		writer.write();
	}
}

class WriterFactory
{
	public static Writer getWriter(String name)
	{
		switch (name) {
		case "pen":
		{	
			return new Pen();
		}
		case "pencil":
		{	
			return new Pencil();
		}
		default:
			break;
		}
		return null;
	}
}

interface Writer
{
   public void write();
}

class Pen implements Writer
{

	@Override
	public void write() {
		System.out.println("Writing using pen");
	}
	
}

class Pencil implements Writer
{

	@Override
	public void write() {
		System.out.println("Writing using pencil");
	}
	
}