package com.javaIntroduction;

public class LoanManagement {

	String customerName;
	double loanAmount;
	double interestRate;
	int loantenture;
	

	double calculateInterest(double loanAmount,double interestRate) {
		return (loanAmount*interestRate*loantenture)/100;
		
	}
	double calculateTotalAmount(double simpleInterest) {
		return loanAmount+simpleInterest;
		
	}
	double calculateMonthlyEMI(double totalAmountpay,int loantenture) {
		int totalMonths = loantenture * 12;
		double rawEmi = totalAmountpay / totalMonths;
		return Math.round(rawEmi * 100.0) / 100.0;
	}
	void displayLoanSummary(double interest, double totalAmount, double emi) {
		System.out.println("----------------------------------------------");
		System.out.println("LOAN SUMMARY FOR: " + customerName.toUpperCase());
		System.out.println("----------------------------------------------");
		System.out.println("Principal Loan Amount : Rs. " + loanAmount);
		System.out.println("Interest Rate         : " + interestRate + "% per annum");
		System.out.println("Loan Tenure           : " + loantenture + " years");
		System.out.println("Total Interest Charged: Rs. " + interest);
		System.out.println("Total Amount Payable  : Rs. " + totalAmount);
		System.out.println("Monthly EMI Component : Rs. " + emi);
		System.out.println("----------------------------------------------\n");
	}
	
	public static void main(String[] args) {
		LoanManagement loan1 = new LoanManagement();
		loan1.customerName = "Anisha";
		loan1.loanAmount = 1500000.0; 
		loan1.interestRate = 7.5;     
		loan1.loantenture = 10;     
		
		
		double interest1 = loan1.calculateInterest(loan1.loanAmount, loan1.interestRate);
		double total1 = loan1.calculateTotalAmount(interest1);
		double emi1 = loan1.calculateMonthlyEMI(total1, loan1.loantenture);
		
		
		loan1.displayLoanSummary(interest1, total1, emi1);

		
		// ==================== OBJECT 2: Car Loan Layout ====================
		LoanManagement loan2 = new LoanManagement();
		loan2.customerName = "Vinnu";
		loan2.loanAmount = 450000.0;  
		loan2.interestRate = 9.2;     
		loan2.loantenture = 3;        
		
	
		double interest2 = loan2.calculateInterest(loan2.loanAmount, loan2.interestRate);
		double total2 = loan2.calculateTotalAmount(interest2);
		double emi2 = loan2.calculateMonthlyEMI(total2, loan2.loantenture);
		
		
		loan2.displayLoanSummary(interest2, total2, emi2);
	

	}

}
