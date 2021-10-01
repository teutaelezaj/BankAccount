public class TestBankAccount_Elezaj {

	public static void main(String[] args) {
		/*
		//instantiate 3 bank accounts
		BankAccount_Elezaj acct1 = new BankAccount_Elezaj();
		BankAccount_Elezaj acct2 = new BankAccount_Elezaj();
		BankAccount_Elezaj acct3 = new BankAccount_Elezaj();
	*/
		// create 6 bank accounts using the 3 constructors ( 2 accounts w/ same constructors) 
		
		BankAccount_Elezaj acct1 = new BankAccount_Elezaj("11223344");
		BankAccount_Elezaj acct4 = new BankAccount_Elezaj("22222222");
		
		BankAccount_Elezaj acct2 = new BankAccount_Elezaj();
		BankAccount_Elezaj acct5 = new BankAccount_Elezaj();
		
		BankAccount_Elezaj acct3 = new BankAccount_Elezaj("777678", 45000, 0.10);
		BankAccount_Elezaj acct6 = new BankAccount_Elezaj("123456", 2000, 0.03);
		
		System.out.println("total accounts created so far " + BankAccount_Elezaj.total_accounts);
		//get the statements for all bank accounts
		
		acct1.statement();
		acct2.statement();
		acct3.statement();
		acct4.statement();
		acct5.statement();
		acct6.statement();
		
		System.out.println(acct1.getBalance());
		System.out.println(acct3.getInterest());
		
		System.out.println(acct4.isClosed());
		
		BankAccount_Elezaj.bank_info();
		
		acct2.AccountNumber = "777777";
		acct2.setClosed(true);
		acct6.setBalance(1000000000.5);
		
		
		acct3.setInterest(-5.6);
		
		acct5.setBalance(200);
		acct5.statement();
		acct5.AccountNumber = "1234567";
		acct5.setInterest(-50);
		acct5.Elezaj_Withdraw(400);
		acct5.statement();
		acct5.Elezaj_Withdraw(300);
		acct5.statement();
		acct5.deposit(2000);
		acct5.statement();
	}

}

//Admittedly, week 11's lesson has been a little difficult for me to grasp. I've
//gotten use to working with just one program at a time, so dealing with
//two that are intertwined with one another has been hard but genuinely a lot
//of fun and has made me realize how much I enjoy computer science. With that being said,
//I first dealt with the changes needed to be made on BankAccount_Elezaj (explained there).
//Here, I decided to work with account 5 since we have not done anything with it
//yet. I first set the balance to 200. I was able to use what we did in account 6 and
//replicate it with account 5. I then set the account number to "1234567", as 
//asked in the homework, and set the interest to -50. Then, I withdrew 400 from
//account 5. Because account 5 had a balance of 200, withdrawing 400 would enter you in overdraft
//mode. Your current balance at this point would be -200, but it would be
//a success because the policy allows someone to withdraw up to $500. Now, however, 
//the owner of the account wants to withdraw another 300. This would not be covered
//by the overdraft policy, because this would mean they had withdrew 700, which
//is over the 500 limit. This would then print an error message. Finally, the 
//owner wants to deposit 2000, which would work and would end in a balance of 
//1500. They may now withdraw if needed. 

//This lesson has definitely pushed me out of my comfort zone, but it was enjoyable
//and I'm excited to see how I can better my methods for the exam and project.

