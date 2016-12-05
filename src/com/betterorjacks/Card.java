package com.betterorjacks;

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public void displayCard() {
        this.rank.display();
        this.suit.display();
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }
}
