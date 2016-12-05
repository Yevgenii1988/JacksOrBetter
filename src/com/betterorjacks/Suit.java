package com.betterorjacks;

public enum Suit {
    CLUBS {
        public void display() {
            System.out.print("C");
        }
    },
    DIAMONDS {
        public void display() {
            System.out.print("D");
        }
    },
    HEARTS {
        public void display() {
            System.out.print("H");
        }
    },
    SPADES {
        public void display() {
            System.out.print("S");
        }
    };

    public abstract void display();
}
