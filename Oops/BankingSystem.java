package Oops;

class Account{
	int accNo;
	String name;
	float ammount;
	
	void insert(int ac, String n, float am) {
		accNo = ac;
		name = n;
		ammount = am;
	}
	
	void deposite(float am){
		System.out.println("Before deposite acc balance " + ammount);
		ammount += am;
		System.out.println("After deposite acc balance = " + ammount);
	}
	
	void withdraw(float am) {
		if(am<ammount) {
			ammount-=am;
			System.out.println(am + " Withdrawn, balance available "+ ammount );
			
		}
		else {
			System.out.println("Insufficient balance, availabe balance = " + ammount);
		}
	}
	
	void display() {
		System.out.println(name +"\t"+ accNo +"\t"+ ammount);
	}
}

public class BankingSystem {
	
	public static void main (String[] args) {
		Account A1 = new Account();
		A1.insert(3003, "Pallab Biswas" , 500);
		A1.display();
		A1.deposite(4000);
		A1.withdraw(3000);
	}

}
