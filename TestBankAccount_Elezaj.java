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

