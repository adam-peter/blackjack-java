package com.adam.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {
    @Test
    void canGetValueOfATwo() {
        Card card = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card.getValue());
    }

    @Test
    void canGetValueOfAThree() {
        Card card = new Card(Suit.DIAMONDS, Rank.THREE);
        assertEquals(3, card.getValue());
    }

    @Test
    void canGetValueOfAnAce() {
        Card card = new Card(Suit.DIAMONDS, Rank.ACE);
        assertEquals(1, card.getValue());
    }

    @Test
    void canGetValueOfAJack() {
        Card card = new Card(Suit.DIAMONDS, Rank.JACK);
        assertEquals(10, card.getValue());
    }

    @Test
    void canGetValueOfAKing() {
        Card card = new Card(Suit.DIAMONDS, Rank.KING);
        assertEquals(10, card.getValue());
    }
}