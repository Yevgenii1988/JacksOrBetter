package com.betterorjacks;

import java.util.*;

public class Deck {
    private static int topCard = 0;
    private List<Card> cards = new ArrayList(52);
    private LinkedList<Card> hand = new LinkedList();
    private Combination combination;

    public Deck() {
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    private void draw() {
        Card card = cards.get(topCard);
        hand.add(card);
        topCard++;
    }

    public void getHand() {
        shuffle();

        for (int i = 0; i < 5; ++i) {
            draw();
        }

        for (Card card : hand) {
            card.displayCard();
            System.out.print(" ");
        }
    }

    public void getSecondHand(String hold) {
        for (int i = 0; i < hold.length(); i++) {
            if (!String.valueOf(hold.charAt(i)).equals("1") && !String.valueOf(hold.charAt(i)).equals("0")) {
                System.out.println("Illegal input!");
                break;
            }
        }

        int count = 0;

        for (Iterator<Card> iterator = hand.iterator(); iterator.hasNext(); ) {
            Card card = iterator.next();
            if (String.valueOf(hold.charAt(count)).equals("0")) {
                iterator.remove();
            }
            count++;
        }

        for (int i = hand.size(); i < 5; i++) {
            draw();
        }

        for (Card card : hand) {
            card.displayCard();
            System.out.print(" ");
        }

    }

    public void evaluateHand() {
        Evaluator evaluator = new Evaluator(hand);
        List<Rank> ranks = evaluator.getRanksArray();
        int uniqueRanks = evaluator.countRanks(ranks);
        if (uniqueRanks == 5) {
            boolean sameSuits = evaluator.checkSuites(hand);
            boolean isStraight = evaluator.checkStraight(ranks);
            if (sameSuits) {
                if (isStraight){
                    boolean isRoyalFlush = evaluator.checkRoyalFlush(ranks);
                    if (isRoyalFlush){
                        combination = Combination.ROYAL_FLUSH;
                    } else combination = Combination.STRAIGHT_FLUSH;
                } else combination = Combination.FLUSH;
            } else if (isStraight) {
                combination = Combination.STRAIGHT;
            } else combination = Combination.TRASH;
        } else if (uniqueRanks == 4) {
            boolean isHighPair = evaluator.checkPairs(ranks);
            if (isHighPair) {
                combination = Combination.JACKS_OR_BETTER;
            } else combination = Combination.TRASH;
        } else if (uniqueRanks == 3) {
            boolean isThree = evaluator.checkThree(ranks);
            if (isThree) {
                combination = Combination.THREE_OF_A_KIND;
            } else combination = Combination.TWO_PAIR;
        } else if (uniqueRanks == 2){
            boolean isFour = evaluator.checkFour(ranks);
            if (isFour){
                combination = Combination.FOUR_OF_A_KIND;
            } else combination = Combination.FULL_HOUSE;
        }

        System.out.println("Congratulations, you've got");
        combination.display();
    }
}
