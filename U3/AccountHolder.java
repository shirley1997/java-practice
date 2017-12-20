public class AccountHolder {
	Account account;
	String firstName;
	String lastName;
	int accountHolderNumber;
	
	public AccountHolder(Account account,String firstName, String lastName,int accountHolderNumber){
		this.account = account;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountHolderNumber = accountHolderNumber;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getAccountHolderNumber(){
		return accountHolderNumber;
	}
}
	
	