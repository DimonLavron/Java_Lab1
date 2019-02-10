package com.company;

public class Main {

    public static void main(String[] args) {
	InvestmentCompany company1 = new InvestmentCompany();
	InvestmentCompany company2 = new InvestmentCompany("Address", 100, 500, "Polyglot");
	InvestmentCompany company3 = new InvestmentCompany("Address", 60, 428, "Parus", "Petro", 66, 12.5);
	System.out.println(company1);
	System.out.println(company2);
	System.out.println(company3);
	InvestmentCompany.printStaticNumberOfCompanies();
	company1.printNumberOfCompanies();
    }
}
