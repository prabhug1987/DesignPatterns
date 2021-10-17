package com.pattern.strategy;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;

	public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid with credit/debit card");
	}
}
