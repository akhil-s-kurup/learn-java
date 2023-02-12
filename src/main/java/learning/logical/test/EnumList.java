package learning.logical.test;



enum Intrest
{
	PERSONAL_LOAN(12.7f),
	GOLD_LOAN(7.0f);
	
	private float intrest;
	
	public float getIntrest() {
		return intrest;
	}

	public void setIntrest(float intrest) {
		this.intrest = intrest;
	}

	Intrest( float intrest)
	{
		this.intrest=intrest;
	}
	
	
}
public class EnumList {
	
	private void processLoan(Intrest loan) {
		System.out.println(loan.getIntrest());
	}
	
	public static void main(String[] args) {
		
		new EnumList().processLoan(Intrest.PERSONAL_LOAN);
		new EnumList().processLoan(Intrest.GOLD_LOAN);
	}
}
