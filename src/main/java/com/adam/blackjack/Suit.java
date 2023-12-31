package com.adam.blackjack;

public enum Suit {
    CLUBS("\u2663"),
    DIAMONDS("\u2666"),
    HEARTS("\u2665"),
    SPADES("\u2660");

    private final String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }
}

