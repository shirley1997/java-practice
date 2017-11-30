
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

	/*public Account getAccount(){
		return account;
	}*/
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder man = new AccountHolder(account,"Hans","Maller",5678);
		String Youfirstname = man.getFirstName();
		String Yourlastname = man.getLastName();
		
		int yourNumber = man.getAccountHolderNumber();
		Account Youraccount = man.getAccount();
		System.out.println("Your name is : "+ Youfirstname +" "+ Yourlastname);
		System.out.println("Your accountHolderNumber is: "+ yourNumber);
		System.out.println("Your account information is: "+ Youraccount);
		
		
	}
	}*/


