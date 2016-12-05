package com.betterorjacks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.getHand();
        System.out.println("\n");
        System.out.println("Enter the cards you want to hold, using the following pattern:");
        System.out.println("1 - hold, 0 - don\'t hold");
        System.out.println("Example: 10101\n");
        String hold = scanner.nextLine();
        deck.getSecondHand(hold);
        deck.evaluateHand();
    }
}
