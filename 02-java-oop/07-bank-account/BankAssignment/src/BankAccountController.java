
public class BankAccountController {

	public static void main(String[] args) {
		BankAccount myAccount = new BankAccount();
		myAccount.deposit(1337.38, "checking");
		myAccount.deposit(1984.11, "savings");
		myAccount.accountBalance();
		System.out.println(BankAccount.totalAvail);
		myAccount.withdrawal(400, "checking");
		myAccount.withdrawal(120, "savings");
		myAccount.accountBalance();
		System.out.println(BankAccount.totalAvail);

	}

}
