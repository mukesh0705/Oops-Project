package encapsulation01;

public class MainTest03 {

	public static void main(String[] args) {
		BankHolderDetailsWithoutThis account=new BankHolderDetailsWithoutThis(800576464654L, "Rama kumar Reddy", "105, kathimala road, pirpanjal, jammu & kashmir, India-700005", "11/05/2001", 9000000.00);
		System.out.println("Account holder information \n==========================");
		System.out.println("Account holder Account Number = "+account.accountHolder_id);
		System.out.println("Account holder name = "+account.accountHolder_name);
		System.out.println("Account holder address = "+account.accountHolder_address);
		System.out.println("Account holder dob = "+account.accountHolder_dob);
		System.out.println("Account holder balance = "+account.accountHolder_balance);

	}

}
