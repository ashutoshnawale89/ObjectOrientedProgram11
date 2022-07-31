package com.Oops.Program_11thDayAssignm;

public class Deckcard {

	public void Deck() {
		String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

		String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
				"Jack", "Queen", "King", "Ace"};

		// initialize deck
		int n = SUITS.length * RANKS.length;
		String[] deck = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
				//  System.out.println(deck[SUITS.length*i + j]);
			}
		}
		// shuffle card
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n-i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}  

		// print shuffled deck
		for (int i = 0; i < n; i++) {
			if (i <= 8) {

				System.out.println("Player 1  " + deck[i]);

			}
			else if (i>8 && i<=17) {
				System.out.println("Player 2  " + deck[i]);

			} 
			else if (i>17 && i<=26) {
				System.out.println("Player 3  " + deck[i]);

			}
			else if(i>26 && i<=35) {
				System.out.println("Player 4  " + deck[i]);

			} 
		}
	}
	public static void main(String[] args) {
		Deckcard card=new Deckcard();
		card.Deck();
	}
}
