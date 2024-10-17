package Encapsulation;

public class EncapsulationMain {

	public static void main(String[] args) 
	{
		EncapsulationDemo obj = new EncapsulationDemo();
		
		/* obj.acc_no = 5751313;
		obj.name = "Chris";
		obj.amount = 123400.56; */

		obj.setAccNum(568442);
		System.out.println(obj.getAccNum());
		
		obj.setName("John");
		System.out.println(obj.getName());
		
		obj.setAmount(78921.25);
		System.out.println(obj.getAmount());
	}

}
