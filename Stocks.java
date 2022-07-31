package com.Oops.Program_11thDayAssignm;

public class Stocks {
	public String stockName;     
	public int numberOfStocks;
	public int sharePrice;
	public int totalValue;
	public int totalStockVal;
	public int sum;

	public void stockAdd(String name,int numberofStocks, int shareprice) {
		this.numberOfStocks=numberofStocks;
		this.sharePrice=shareprice;
		this.stockName=name;
		this.sum=numberOfStocks*sharePrice;
		System.out.println("The Name of Share is "+ stockName);
		System.out.println("The Share Price is  "+sharePrice);
		System.out.println("The Number of Stock  "+numberOfStocks);
		System.out.println("Total Share Price is  "+sum);
	}
	public void print() {
		sum++;
		System.out.println("The Total Portfolio Value is"+sum);
	}

	public static void main(String[] args) {
		Stocks obje=new Stocks();
		obje.stockAdd("Tata Power", 10, 230);
		obje.stockAdd("Reliance", 5, 2800);
		obje.print();
	}	
}	
