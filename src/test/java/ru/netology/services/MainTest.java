package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testCountRestMonthsCase1() {
        Main main = new Main();

        int actual = main.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountRestMonthsCase2() {
        Main main = new Main();

        int actual = main.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "test.csv")
    public void testCountRestMonthsParameterized( int income, int expenses, int threshold, int expected) {
        Main main = new Main();

        int actual = main.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }


    }