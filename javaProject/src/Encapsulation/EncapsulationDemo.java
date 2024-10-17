package Encapsulation;

public class EncapsulationDemo 
{
	
	private int acc_no;
	private String name;
	private double amount;

	 void setAccNum(int acc_no)
	{
		this.acc_no = acc_no;
	}
	int getAccNum() 
	{
		return acc_no;
	}
	
	// for name 
	void setName(String name) 
	{
		this.name= name;
	}
	String getName() 
	{
		return name;
	}
	
	// for amount 
	void setAmount(double amount) 
	{
		this.amount = amount;
	}
	double getAmount()
	{
		return amount;
	} 
	
}
