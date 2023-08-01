package com.adam.blackjack;

public enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    //Rank JACK = new Rank("JACK"); - kinda equivalent
    //Rank QUEEN = new Rank("QUEEN");
    //Rank KING = new Rank("KING");
    //...

    public int getValue() {
        return switch (this) {
            //this = the enum constant (current instance) we are calling the method on
            case JACK, QUEEN, KING -> 10;
            //default -> this.ordinal() + 1; - ordinal is inhereted by the current instance
            default -> ordinal() + 1;
        };
    }
}