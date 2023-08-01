package com.adam.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SuitTest {
    @Test
    void clubPrintsClub() {
        assertEquals("\u2663", Suit.CLUBS.toString());
    }
}

