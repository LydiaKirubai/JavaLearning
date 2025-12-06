package learningday6;

public class BankAccount {
	
	String name;
	private double balance;
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		 BankAccount bankaccount = new BankAccount();
		 bankaccount.setName("Jane Doe");
		 bankaccount.setBalance(1000);
		 
		 System.out.println(bankaccount.getName());
		 System.out.println(bankaccount.getBalance());

	}

}
