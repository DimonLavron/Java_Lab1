package com.company;

public class InvestmentCompany {
    private String address;
    private int ownedMoney;
    private int investedMoney;

    private String name;
    private String director;

    private static int numberOfCompanies;

    protected int numberOfClients;
    protected double percentages;

    public InvestmentCompany() {
        this("", 0, 0, "", "", 0, 0.0);
    }

    public InvestmentCompany(String address, int ownedMoney, int investedMoney, String name) {
        this(address, ownedMoney, investedMoney, name, "", 0, 0.0);
    }

    public InvestmentCompany(String address, int ownedMoney, int investedMoney, String name, String director, int numberOfClients, double percentages) {
        this.address = address;
        this.ownedMoney = ownedMoney;
        this.investedMoney = investedMoney;
        this.name = name;
        this.director = director;
        this.numberOfClients = numberOfClients;
        this.percentages = percentages;
        numberOfCompanies++;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOwnedMoney() {
        return ownedMoney;
    }

    public void setOwnedMoney(int ownedMoney) {
        this.ownedMoney = ownedMoney;
    }

    public int getInvestedMoney() {
        return investedMoney;
    }

    public void setInvestedMoney(int investedMoney) {
        this.investedMoney = investedMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public static int getNumberOfCompanies() {
        return numberOfCompanies;
    }

    public static void setNumberOfCompanies(int numberOfCompanies) {
        InvestmentCompany.numberOfCompanies = numberOfCompanies;
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }

    public double getPercentages() {
        return percentages;
    }

    public void setPercentages(double percentages) {
        this.percentages = percentages;
    }

    public String toString() {
        return "Address: " + address + "; Owned Money: " + ownedMoney + "; Invested Money: " + investedMoney + "; Name: " + name + "; Director: " + director + "; Number of clients: " + numberOfClients + "; Persentages: " + percentages + ";";
    }

    public static void printStaticNumberOfCompanies() {
        System.out.println("Number of companies: " + numberOfCompanies);
    }

    public void printNumberOfCompanies() {
        System.out.println("Number of companies: " + numberOfCompanies);
    }

    public void resetValues(String address, int ownedMoney, int investedMoney, String name, String director, int numberOfClients, double percentages) {
        this.address = address;
        this.ownedMoney = ownedMoney;
        this.investedMoney = investedMoney;
        this.name = name;
        this.director = director;
        this.numberOfClients = numberOfClients;
        this.percentages = percentages;
    }
}
