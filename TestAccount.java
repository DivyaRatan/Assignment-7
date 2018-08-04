package mmbank;



//Class to test Account functionalites

public class TestAccount {



	public static void main(String[] args) {

		//creating 1st object with initial balance

		Account acnt = new Account("Divya",1000);

		System.out.println(acnt);

		

		//getting next account number after 1st object

		int next = Account.getNextAccountNumber();

		System.out.println(next);

		

		//creating 2nd object with zero balance

		Account name = new Account("name");

		System.out.println(name);

		

		//getting next account number after 2nd object

		next = Account.getNextAccountNumber();

		System.out.println(next);

		

		//transferring balance test 1 

		String result = acnt.transaction(name, 200);

		System.out.println(result);

		

		//Transferring balance test 2

		result = acnt.transaction(name, acnt.getBalance());

		System.out.println(result);

		

		//Checking updated balance

		System.out.println(acnt);

		System.out.println(name);

	}



}