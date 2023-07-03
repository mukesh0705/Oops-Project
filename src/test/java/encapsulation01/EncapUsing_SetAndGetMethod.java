package encapsulation01;

public class EncapUsing_SetAndGetMethod {
	//here we create a Bank Account Holder Form
	private int accountHolder_id;
	private String accountHolder_name;
	private String accountHolder_address;
	private String accountHolder_dob;
	private double accountHolder_balance;
	
	//Get and Set method accountHolder_id
	public int getAccountHolder_id() {
		return accountHolder_id;
	}
	public void setAccountHolder_id(int accountHolder_id) {
		this.accountHolder_id = accountHolder_id;
	}
	
	//Get and Set method accountHolder_name
	public String getAccountHolder_name() {
		return accountHolder_name;
	}
	public void setAccountHolder_name(String accountHolder_name) {
		this.accountHolder_name = accountHolder_name;
	}
	
	//Get and Set method accountHolder_address
	public String getAccountHolder_address() {
		return accountHolder_address;
	}
	public void setAccountHolder_address(String accountHolder_address) {
		this.accountHolder_address = accountHolder_address;
	}
	
	//Get and Set method accountHolder_dob
	public String getAccountHolder_dob() {
		return accountHolder_dob;
	}
	public void setAccountHolder_dob(String accountHolder_dob) {
		this.accountHolder_dob = accountHolder_dob;
	}
	
	//Get and Set method accountHolder_balance
	public double getAccountHolder_balance() {
		return accountHolder_balance;
	}
	public void setAccountHolder_balance(double accountHolder_balance) {
		this.accountHolder_balance = accountHolder_balance;
	}

}
