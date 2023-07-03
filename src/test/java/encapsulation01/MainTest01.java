package encapsulation01;

public class MainTest01 {

	public static void main(String[] args) {
		EncapUsing_SetAndGetMethod account=new EncapUsing_SetAndGetMethod();
		//Setting the Account information
		account.setAccountHolder_id(201);
		account.setAccountHolder_name("Mukesh Kumar Reddy");
		account.setAccountHolder_address("105, kathimala road, pirpanjal, jammu & kashmir");
		account.setAccountHolder_dob("17/05/1998");
		account.setAccountHolder_balance(8700000.00);
		
		//Getting the Account information
		int accId=account.getAccountHolder_id();
		String accName=account.getAccountHolder_name();
		String accAdress=account.getAccountHolder_address();
		String accDob=account.getAccountHolder_dob();
		double accBalance=account.getAccountHolder_balance();
		
		//print all information on console
		System.out.println("Account holder information");
		System.out.println("===========================");
		System.out.println("Acoount holder id = "+accId);
		System.out.println("Acoount holder name = "+accName);
		System.out.println("Acoount holder address = "+accAdress);
		System.out.println("Acoount holder dob = "+accDob);
		System.out.println("Acoount holder balance = "+accBalance);
     
	}

}
