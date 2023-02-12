package learning.core.designpattern.creational;

public class AbstractFactoryPattern {
	public static void main(String[] args) {
		AbstractFactory factory = new FactoryCreator().getFactory("bank");
		Bank bankFactory = factory.getBankFactory();
		System.out.println(bankFactory);	
	}
}

class FactoryCreator
{
	public AbstractFactory getFactory(String name)
	{
		return new BankFactory();
	}
}


interface Loan {
}

interface Bank {
}

class ICICI implements Bank {
}

class HDFC implements Bank {
}

class PersonalLoan implements Loan {
}

class HomeLoan implements Loan {
}

abstract class AbstractFactory {
	public abstract Loan getLoanFactory();

	public abstract Bank getBankFactory();
}

class LoanFactory extends AbstractFactory {
	public Loan getLoanFactory() {
		return new HomeLoan();
	}

	@Override
	public Bank getBankFactory() {
		// TODO Auto-generated method stub
		return null;
	}
}

class BankFactory extends AbstractFactory {
	public Bank getBankFactory() {
		return new ICICI();
	}

	@Override
	public Loan getLoanFactory() {
		return null;
	}

}