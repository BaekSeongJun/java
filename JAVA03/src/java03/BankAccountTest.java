package java03;

class BankAccount{
	int balance;
	void deposit(int amount) {
		balance = amount;
	}
	void withdraw(int amount) {
		if(amount < balance )
			balance -= amount;
		else
			System.out.println("잔액이 부족합니다.");
	}
	int getBalnace() {
		return balance;
	}
}
public class BankAccountTest {
	public static void main(String args[]) {
		BankAccount b = new BankAccount();
		b.deposit(100);
		b.withdraw(160);
		
		
		System.out.println("현재 잔액 : " + b.getBalnace());
	}

}
