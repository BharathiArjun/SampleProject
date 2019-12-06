package org.bank;

public class BankInfo extends AxisBank{

	public void saving() {
		System.out.println("Savings Account Deposit");
	}
	public void fixed() {
		System.out.println("Fixed Deposit");
	}
	
	public static void main(String[] args) {
		BankInfo bi = new BankInfo();
		bi.deposit();
		bi.saving();
		bi.fixed();
	}
	
}