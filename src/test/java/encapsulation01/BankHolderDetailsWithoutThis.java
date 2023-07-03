package encapsulation01;

public class BankHolderDetailsWithoutThis {
	long accountHolder_id;
	String accountHolder_name;
	String accountHolder_address;
	String accountHolder_dob;
	double accountHolder_balance;
	
	public BankHolderDetailsWithoutThis(long id,String name,String address,String dob,double balance) {
		accountHolder_id=id;
		accountHolder_name=name;
		accountHolder_address=address;
		accountHolder_dob=dob;
		accountHolder_balance=balance;
	}
    
}
