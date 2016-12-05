package com.betterorjacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Rank {
    ACE {
        public void display() {
            System.out.print("A");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(ACE, TWO, THREE, FOUR, FIVE));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(TEN, JACK, QUEEN, KING, ACE));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            return straights;
        }
    },
    TWO {
        public void display() {
            System.out.print("2");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(ACE, TWO, THREE, FOUR, FIVE));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(TWO, THREE, FOUR, FIVE, SIX));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            return straights;
        }
    },
    THREE {
        public void display() {
            System.out.print("3");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(ACE, TWO, THREE, FOUR, FIVE));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(TWO, THREE, FOUR, FIVE, SIX));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(THREE, FOUR, FIVE, SIX, SEVEN));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            return straights;
        }
    },
    FOUR {
        public void display() {
            System.out.print("4");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(ACE, TWO, THREE, FOUR, FIVE));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(TWO, THREE, FOUR, FIVE, SIX));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(THREE, FOUR, FIVE, SIX, SEVEN));
            ArrayList<Rank> list4 = new ArrayList<>(Arrays.asList(FOUR, FIVE, SIX, SEVEN, EIGHT));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            straights.add(list4);
            return straights;
        }
    },
    FIVE {
        public void display() {
            System.out.print("5");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(ACE, TWO, THREE, FOUR, FIVE));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(TWO, THREE, FOUR, FIVE, SIX));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(THREE, FOUR, FIVE, SIX, SEVEN));
            ArrayList<Rank> list4 = new ArrayList<>(Arrays.asList(FOUR, FIVE, SIX, SEVEN, EIGHT));
            ArrayList<Rank> list5 = new ArrayList<>(Arrays.asList(FIVE, SIX, SEVEN, EIGHT, NINE));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            straights.add(list4);
            straights.add(list5);
            return straights;
        }
    },
    SIX {
        public void display() {
            System.out.print("6");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(TWO, THREE, FOUR, FIVE, SIX));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(THREE, FOUR, FIVE, SIX, SEVEN));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(FOUR, FIVE, SIX, SEVEN, EIGHT));
            ArrayList<Rank> list4 = new ArrayList<>(Arrays.asList(FIVE, SIX, SEVEN, EIGHT, NINE));
            ArrayList<Rank> list5 = new ArrayList<>(Arrays.asList(SIX, SEVEN, EIGHT, NINE, TEN));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            straights.add(list4);
            straights.add(list5);
            return straights;
        }
    },
    SEVEN {
        public void display() {
            System.out.print("7");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(THREE, FOUR, FIVE, SIX, SEVEN));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(FOUR, FIVE, SIX, SEVEN, EIGHT));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(FIVE, SIX, SEVEN, EIGHT, NINE));
            ArrayList<Rank> list4 = new ArrayList<>(Arrays.asList(SIX, SEVEN, EIGHT, NINE, TEN));
            ArrayList<Rank> list5 = new ArrayList<>(Arrays.asList(SEVEN, EIGHT, NINE, TEN, JACK));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            straights.add(list4);
            straights.add(list5);
            return straights;
        }
    },
    EIGHT {
        public void display() {
            System.out.print("8");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(FOUR, FIVE, SIX, SEVEN, EIGHT));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(FIVE, SIX, SEVEN, EIGHT, NINE));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(SIX, SEVEN, EIGHT, NINE, TEN));
            ArrayList<Rank> list4 = new ArrayList<>(Arrays.asList(SEVEN, EIGHT, NINE, TEN, JACK));
            ArrayList<Rank> list5 = new ArrayList<>(Arrays.asList(EIGHT, NINE, TEN, JACK, QUEEN));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            straights.add(list4);
            straights.add(list5);
            return straights;
        }
    },
    NINE {
        public void display() {
            System.out.print("9");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(FIVE, SIX, SEVEN, EIGHT, NINE));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(SIX, SEVEN, EIGHT, NINE, TEN));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(SEVEN, EIGHT, NINE, TEN, JACK));
            ArrayList<Rank> list4 = new ArrayList<>(Arrays.asList(EIGHT, NINE, TEN, JACK, QUEEN));
            ArrayList<Rank> list5 = new ArrayList<>(Arrays.asList(NINE, TEN, JACK, QUEEN, KING));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            straights.add(list4);
            straights.add(list5);
            return straights;
        }
    },
    TEN {
        public void display() {
            System.out.print("T");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(SIX, SEVEN, EIGHT, NINE, TEN));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(SEVEN, EIGHT, NINE, TEN, JACK));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(EIGHT, NINE, TEN, JACK, QUEEN));
            ArrayList<Rank> list4 = new ArrayList<>(Arrays.asList(NINE, TEN, JACK, QUEEN, KING));
            ArrayList<Rank> list5 = new ArrayList<>(Arrays.asList(TEN, JACK, QUEEN, KING, ACE));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            straights.add(list4);
            straights.add(list5);
            return straights;
        }
    },
    JACK {
        public void display() {
            System.out.print("J");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(SEVEN, EIGHT, NINE, TEN, JACK));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(EIGHT, NINE, TEN, JACK, QUEEN));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(NINE, TEN, JACK, QUEEN, KING));
            ArrayList<Rank> list4 = new ArrayList<>(Arrays.asList(TEN, JACK, QUEEN, KING, ACE));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            straights.add(list4);
            return straights;
        }
    },
    QUEEN {
        public void display() {
            System.out.print("Q");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(EIGHT, NINE, TEN, JACK, QUEEN));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(NINE, TEN, JACK, QUEEN, KING));
            ArrayList<Rank> list3 = new ArrayList<>(Arrays.asList(TEN, JACK, QUEEN, KING, ACE));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            straights.add(list3);
            return straights;
        }
    },
    KING {
        public void display() {
            System.out.print("K");
        }

        public List<List<Rank>> getStraightsList() {
            ArrayList<Rank> list1 = new ArrayList<>(Arrays.asList(NINE, TEN, JACK, QUEEN, KING));
            ArrayList<Rank> list2 = new ArrayList<>(Arrays.asList(TEN, JACK, QUEEN, KING, ACE));
            ArrayList<List<Rank>> straights = new ArrayList<>();
            straights.add(list1);
            straights.add(list2);
            return straights;
        }
    };

    public abstract void display();

    public abstract List<List<Rank>> getStraightsList();
}
