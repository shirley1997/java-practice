public class Account {
	Account account;
	long accountNumber; //Kontonummer
	int bankCode; //Bankleitzahl
	int balance = 0; //Kontostand
	int NumberOfAccounts = 0;
	
	public Account(int balance,int bankCode,long accountNumber)
	{
		this.bankCode = bankCode;
		this.balance = balance;
		for(int i =1;i<= NumberOfAccounts;i++ ){
			accountNumber = i-1;
		}
		
	
	}

	boolean withdraw(int amount){
		balance -=  amount;
		if(balance<0)
		{
			return false;
		}
		else 
		{
			return true;
		}
	}   //man hebt das Geld ab
	
	void deposit(int amount){
		balance += amount;
	}  //man deponiert das Geld;
	
	public int getBalance(){
		return balance;
	}  //man bekommt die nummer von Kontostand
	public long getAccountNumber(){
		return accountNumber;
	} //man bekommt ihre Kontonummer*/
	public int getNumberOfAccounts(){
		return NumberOfAccounts;
	} //man bekommt die nummer von alle Kontos
	public int getBankCode(){
		return bankCode;
	}
	
	void transfer(Account account, int amount){
		this.balance -=amount;
		account.balance += amount;
		
		
		
	}
	//man weist das Geld von einem Konto zu anderem an
	public static void main(String[] args){
		Account account = new Account(30,5218,0);
		account.withdraw(15);
		account.deposit(60);
		long YourAccountNumber = account.getAccountNumber();
		int Yourbalance = account.getBalance();
		int YourbankCode = account.getBankCode();
		//int YourNumberOfAccounts = infoAccount.getNumberOfAccounts();
		System.out.println("===========Welcome to the information page of your account!===========" );
		System.out.println("Your AccountNumber is: " + YourAccountNumber);
		System.out.println("Your bankCode is: "+YourbankCode);
		System.out.println("Your balance right now is: "+ Yourbalance + " euro");
		System.out.println(" ");
		
		AccountHolder man = new AccountHolder(account,"Hans","Maller",5678);
		System.out.println("Your name is : "+ man.getFirstName() +" "+ man.getLastName());
		System.out.println("Your accountHolderNumber is: "+ man.getAccountHolderNumber());
		
		
		
		
		
		
		
		
		
	}
}

