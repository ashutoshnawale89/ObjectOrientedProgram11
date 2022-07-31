package com.Oops.Program_11thDayAssignm;

public class StockAccount {
	String clientName;
	String stockName;     
	int numberOfStocks;
	int sharePrice;
	int balanceAmt;
	int addamount;

	// Constructor for name and credit balance amount
	public StockAccount(String name,int balanc) {
		this.clientName=name;
		this.balanceAmt=balanc;
		this.addamount=balanc;
		System.out.println(clientName);
	}

	//   Stocks is Buy
	public void buyStocks(String company,int numberofStocks, int shareprice) {
		this.numberOfStocks=numberofStocks;
		this.sharePrice=shareprice;
		this.stockName=company;	
		if ((numberOfStocks*sharePrice) <= this.balanceAmt) {
			int sum=numberOfStocks*sharePrice;
			this.balanceAmt=this.balanceAmt-sum;
			System.out.println("The Share is Successfully Buy");
		}
		else {
			System.out.println("Insufficient Balance in Account");
		}
	}
	// Stock is Sell
	public void sellStocks(String company,int numofStocks,int sellprice) {
		if (company==this.stockName && numofStocks<=this.numberOfStocks ) {
			this.numberOfStocks=this.numberOfStocks-numofStocks;
			int debamount=numofStocks*sellprice;
			// Profit or Loss Condition 
			if (sellprice > this.sharePrice) {
				int profit=(sellprice-this.sharePrice)*numofStocks;
				System.out.println("The Profit is "+profit);
			} 
			else {
				int loss=(sellprice-this.sharePrice)*numofStocks;
				System.out.println("The loss is "+loss);    		  
			}
			this.balanceAmt=this.balanceAmt+debamount;
			System.out.println("The share  "+numofStocks+"  Is Successfully Selled"+company+ "@"+ sellprice);
		}
		else  {
			System.out.println("The Insufficient Number of Share Thats Reason Sell Order is Cancelled");
		}
	}	   
	// Print 
	public void print() {
		int balan=this.addamount-this.balanceAmt;	
		System.out.println("Stock name is "+ stockName + " &  Number of Stocks is "+this.numberOfStocks);
		System.out.println("Portfolio Amount is "+ balan);
		System.out.println("The Remaining Balance is "+balanceAmt);	
	}	     
	// main method
	public static void main(String[] args) {
		StockAccount obje=new StockAccount("Ashutosh R Nawale",50000);  // argument on parameters
		obje.buyStocks("Reliance", 12 , 2700);     // Buy Stocks
		obje.sellStocks("Reliance", 5, 2800);        // Sell stocks
		obje.print();                                // print call
	}	
}
