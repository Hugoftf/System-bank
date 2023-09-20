package entities;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public Account(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHoder() {
		return holder;
	}

	public void setHoder(String hoder) {
		this.holder = hoder;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
