import java.util.Random;
public class BankAccount {
	private String accountNum;
	private double chkBal;
	private double savBal;
	private static int numOfAcc = 0;
	public static double totalAvail = 0;
	private static String randAccNum() {
		String subst = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			subst += r.nextInt(10);
		}
		return subst;
	}
	
	public BankAccount() {
		BankAccount.numOfAcc++;
		this.chkBal = 0;
		this.savBal = 0;
		this.accountNum = BankAccount.randAccNum();
	}
	
	public double getChkBal() {
		return this.chkBal;
	}
	
	public double getSavBal() {
		return this.savBal;
	}
	
	public void deposit(double amount, String account) {
		if(account.equals("savings"))
			this.savBal += amount;
		else if(account.equals("checking"))
			this.chkBal += amount;
		BankAccount.totalAvail += amount;
	}
	
	public void withdrawal(double amount, String account) {
		boolean success = false;
		if(account.equals("savings")) {
			if(this.savBal - amount >= 0) {
				success = true;
				this.savBal -= amount;
			}
		}
		else if(account.equals("checking")) {
			if(this.chkBal - amount >= 0) {
				success = true;
				this.chkBal -= amount;
			}
		}
		if(success) {
			BankAccount.totalAvail -= amount;
		}
	}
	
	public void accountBalance() {
		System.out.println(String.format("Savings: %.2f. Checking: %.2f.", this.savBal, this.chkBal));
	}
}
