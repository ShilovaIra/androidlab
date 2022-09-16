package com.vsu.shilova.labs.lab1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VectorTest {

    private static Vector testVector;
    private static Vector secondTestVector;

    @BeforeClass
    public static void prepareTestData() {
        testVector = new Vector(0, 3, 4);
        secondTestVector = new Vector(0, 0, 9);
    }

    @Test
    public void length() {
        assertEquals(5, testVector.length());
        assertEquals(9, secondTestVector.length());
    }

    @Test
    public void scalarProduct() {
        assertEquals(36, testVector.scalarProduct(secondTestVector));
    }

    @Test
    public void vectorProduct() {
        Vector testDataResult = testVector.vectorProduct(secondTestVector);
        Vector expectedResult = new Vector(27, 0, 0);
        assertEquals(expectedResult.getX(), testDataResult.getX());
        assertEquals(expectedResult.getY(), testDataResult.getY());
        assertEquals(expectedResult.getZ(), testDataResult.getZ());
    }

    @Test
    public void angleBetweenVectors() {
        assertEquals(0.8, testVector.angleBetweenVectors(secondTestVector));
    }

    @Test
    public void addition() {
        Vector testDataResult = testVector.addition(secondTestVector);
        Vector expectedResult = new Vector(0, 3, 13);
        assertEquals(expectedResult.getX(), testDataResult.getX());
        assertEquals(expectedResult.getY(), testDataResult.getY());
        assertEquals(expectedResult.getZ(), testDataResult.getZ());
    }

    @Test
    public void subtraction() {
        Vector testDataResult = testVector.subtraction(secondTestVector);
        Vector expectedResult = new Vector(0, 3, -5);
        assertEquals(expectedResult.getX(), testDataResult.getX());
        assertEquals(expectedResult.getY(), testDataResult.getY());
        assertEquals(expectedResult.getZ(), testDataResult.getZ());
    }
}