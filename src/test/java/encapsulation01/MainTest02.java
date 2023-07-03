package encapsulation01;

public class MainTest02 {

	public static void main(String[] args) {
		
		BankHolderdetailsConsWithThis account=new BankHolderdetailsConsWithThis(201, "Mukesh kumar Reddy", "105, kathimala road, pirpanjal, jammu & kashmir", "17/05/1998", 8500000.00);
		
		System.out.println("Account holder information \n==========================");
		System.out.println("Account holder id = "+account.accountHolder_id);
		System.out.println("Account holder name = "+account.accountHolder_name);
		System.out.println("Account holder address = "+account.accountHolder_address);
		System.out.println("Account holder dob = "+account.accountHolder_dob);
		System.out.println("Account holder balance = "+account.accountHolder_balance);
		

	}

}
