package com.company;

public class InvestmentCompany
{
    private String address;
    private int ownedMoney;
    private int investedMoney;

    private String name;
    private String director;

    private static int numberOfCompanies;

    protected int numberOfClients;
    protected double percentages;

    public InvestmentCompany()
    {
        numberOfCompanies++;
    }

    public InvestmentCompany(String address, int ownedMoney, int investedMoney, String name)
    {
        this();
        this.address = address;
        this.ownedMoney = ownedMoney;
        this.investedMoney = investedMoney;
        this.name = name;
    }

    public InvestmentCompany(String address, int ownedMoney, int investedMoney, String name, String director, int numberOfClients, double percentages)
    {
        this(address, ownedMoney, investedMoney, name);
        this.director = director;
        this.numberOfClients = numberOfClients;
        this.percentages = percentages;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }

    public void setOwnedMoney(int ownedMoney)
    {
        this.ownedMoney = ownedMoney;
    }
    public int getOwnedMoney()
    {
        return ownedMoney;
    }

    public void setInvestedMoney(int investedMoney)
    {
        this.investedMoney = investedMoney;
    }
    public int getInvestedMoney()
    {
        return investedMoney;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }
    public String getDirector()
    {
        return director;
    }

    public String toString()
    {
        return "Address: " + address + "; Owned Money: " + ownedMoney + "; Invested Money: " + investedMoney + "; Name: " + name + "; Director: " + director + "; Number of clients: " + numberOfClients + "; Persentages: " + percentages + ";";
    }

    public static void printStaticNumberOfCompanies()
    {
        System.out.println("Number of companies: " + numberOfCompanies);
    }

    public void printNumberOfCompanies()
    {
        System.out.println("Number of companies: " + numberOfCompanies);
    }

    public void ResetValues(String address, int ownedMoney, int investedMoney, String name, String director, int numberOfClients, double percentages)
    {
        this.address = address;
        this.ownedMoney = ownedMoney;
        this.investedMoney = investedMoney;
        this.name = name;
        this.director = director;
        this.numberOfClients = numberOfClients;
        this.percentages = percentages;
    }
}
