package entities;

import model.exceptions.DomainExpections;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withDraw(double amount) {
		if (amount > withDrawLimit) {
			throw new DomainExpections("The amount exceeds withdraw limit");
		} else if (amount > balance) {
			throw new DomainExpections("Not enough balance");
		} else {
			balance -= amount;
		}
				
	}
	
	public String toString() {
		return "New balance: " + String.format("%.2f", balance);
	}
}
