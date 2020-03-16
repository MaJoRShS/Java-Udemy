package model.enitities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private double witdrawLimit;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, double witdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.witdrawLimit = witdrawLimit;
		
		
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

	public double getWitdrawLimit() {
		return witdrawLimit;
	}

	public void setWitdrawLimit(double witdrawLimit) {
		this.witdrawLimit = witdrawLimit;
	}
	
	public void deposit(Double amount) {
		
	}
	
	public Double withdraw(Double amount) {
		if(amount > witdrawLimit) {
			throw new DomainException("\nWithdraw error: The amount exceeds withdraw limit");
		}
		if(amount > balance){
			throw new DomainException("\nWithdraw error: Not enough balance");
		}
		
		return balance - amount;
	}


}
