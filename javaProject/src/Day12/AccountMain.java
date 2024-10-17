package Day12;

public class AccountMain {

	public static void main(String[] args) {
		
		AccountEncapuslation acc = new AccountEncapuslation();
		acc.setAccno(101);
		System.out.println(acc.getAccno());
		acc.setName("Ankit");
		System.out.println(acc.getName());
		acc.setAmount(2000.0);
		System.out.println(acc.getAmount());
	}

}
