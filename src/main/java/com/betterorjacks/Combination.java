package com.betterorjacks;

public enum Combination {
    ROYAL_FLUSH {
        public void display() {
            System.out.print("Royal flush!");
        }
    },
    STRAIGHT_FLUSH {
        public void display() {
            System.out.print("Straight flush!");
        }
    },
    FOUR_OF_A_KIND {
        public void display() {
            System.out.print("Four of a kind!");
        }
    },
    FULL_HOUSE {
        public void display() {
            System.out.print("Full House!");
        }
    },
    FLUSH {
        public void display() {
            System.out.print("Flush!");
        }
    },
    STRAIGHT {
        public void display() {
            System.out.print("Straight!");
        }
    },
    THREE_OF_A_KIND {
        public void display() {
            System.out.print("Three of a kind!");
        }
    },
    TWO_PAIR {
        public void display() {
            System.out.print("Two pair!");
        }
    },
    JACKS_OR_BETTER {
        public void display() {
            System.out.print("Jacks or better!");
        }
    },
    TRASH {
        public void display() {
            System.out.print("Thrash!");
        }
    };

    public abstract void display();
}
