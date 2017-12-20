package edu.kit.informatik;

public class Bank{
	
	private int bankCode;
	private Account[] accounts = new Account[8];
	
	public Bank(int bankCode){
		this.bankCode = bankCode;
	}
	
	int createAccount(int accountNumber){
		for(int j=0;j<accounts.length;j++){
			if(accounts[j] == null){
				accounts[j] = new Account(bankCode, accountNumber);
				return j;
			}
		}
		int index = accounts.length;
		enlargeArray();
		accounts[index] = new Account(bankCode, accountNumber);
		return index;
	}
	
	private void enlargeArray() {
		if(accounts[accounts.length -1] != null) {
			Account[] dump = new Account[accounts.length * 2];
			for(int i = 0; i < accounts.length; i++){
				dump[i] = accounts [i];
			}
			this.accounts = dump;
		}
	}
	public void setBankCode(int bankCode){
		this.bankCode = bankCode;
		
	}
	
	
	public int getBankCode(){
		return bankCode;
	}
	
	
	public boolean removeAccount(int accountNumber){
		for(int i = 0;i<accounts.length;i++){
			if(accounts[i].getAccountNumber() == accountNumber){
				for(int j=i;j<accounts.length-1;j++){
					accounts [j] = accounts [j+1];
				}
				trimArray();
				return true;
			}
		}
		return false;
	}
	
	private void trimArray() {
		if((size() <= accounts.length / 8) && (size() > 8)){
			Account[] dump1 = new Account[accounts.length / 2];
			for(int i = 0;i < accounts.length/2;i++){
				dump1[i] = accounts[i];
			}
			this.accounts = dump1;
		}
	}
	


	public boolean containsAccount(int accountNumber){
		for(int i=0;i< accounts.length;i++){
			if(accountNumber == accounts[i].getAccountNumber())
			{
			return true;
			}
		}
		return false;
		
	}
	
	public boolean internalBankTransfer(int fromAccountNumber, int toAccountNumber, int amount){
			containsAccount(fromAccountNumber);
			containsAccount(toAccountNumber);
			int a = fromAccountNumber - amount;
			if((fromAccountNumber==0) && (toAccountNumber ==0 ) && a<0){
				return false;
			}
			else
			{
				fromAccountNumber -= amount;
				toAccountNumber += amount;
				return true;
			}
		}
	
	int length(){
		return accounts.length;
	}
		
	int size(){
		int count = 0;
		for(int i = 0;i < accounts.length; i++){
			if(accounts[i] != null){
				count++;
			}		
		}
		return count;
	}
		
	Account getAccount(int index){
		if(accounts[index] == null || index>=accounts.length || index<0){
			return null;			
		}
		return accounts[index];
	}
}
