package com.xma.task2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DirectionsTest {

    @Test
    void titles() {
        for (var direction : Directions.values()) {
            System.out.printf("%7s - %s\n", direction.name(), direction.getTitle());
        }
    }

    @Test
    void symbols() {
        for (var direction : Directions.values()) {
            System.out.printf("%7s - %s\n", direction.name(), direction.getSymbol());
        }
    }

    @Test
    void vectors() {
        for (var direction : Directions.values()) {
            System.out.printf("%7s - %s\n", direction.name(), Arrays.toString(direction.getVector()));
        }
    }
}