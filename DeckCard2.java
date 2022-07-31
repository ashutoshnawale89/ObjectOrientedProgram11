package com.Oops.Program_11thDayAssignm;
import java.util.Arrays;

public class DeckCard2 {
	String player1[]=new String[9];
	String player2[]=new String[9];
	String player3[]=new String[9];
	String player4[]=new String[9];

	public  void Dekcrd() {
		String[] SUITS = {"clubs", "diamonds", "hearts", "spades"};

		String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"jack", "queen", "king", "ace"};

		// initialize deck
		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = SUITS[j]+ " " + RANKS[i] ;
				//  System.out.println(deck[SUITS.length*i + j]);
			}
		}
		// shuffle card
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n-i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}  		                                    //  shuffled deck for 4 player
		for (int i = 0; i < 52; i++) {
			if (i <= 8) {
				this.player1[i]=deck[i];		
			}
			else if (i<=17) {
				this.player2[i-9]=deck[i];
				//	System.out.println(player2[i-9]);

			} 
			else if (i<=26) {
				this.player3[i-18]=deck[i];
				//			System.out.println(player3[i-18]);
			}
			else if(i<=35) {
				this.player4[i-27]=deck[i];
				//		System.out.println(player4[i-27]);
			} 
		}	
	}                                      //  Sorting the deck card in using Arraylist
	public void SortingCard(String arr[]) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}                                      // Main method 
	public static void main(String[] args) {
		DeckCard2 card=new DeckCard2();
		card.Dekcrd();
		card.SortingCard(card.player1);
		card.SortingCard(card.player2);
		card.SortingCard(card.player3);
		card.SortingCard(card.player4);
	}
}
