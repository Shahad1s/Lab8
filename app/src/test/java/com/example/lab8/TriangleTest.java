package com.example.lab8;

import static org.junit.Assert.*;

import com.example.lab8.Triangle;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void is_Equilateral() {
        int a = 1;
        int b =1;
        int c = 1;

        Triangle traingle = new Triangle();
        boolean expect = true;
        boolean result = traingle.Is_Equilateral(a,b,c);
        assertEquals(expect, result);


    }

    @Test
    public void is_Isosceles() {
        int a =2;
        int b =2;
        int c = 3;

        Triangle traingle = new Triangle();
        boolean expect = true;
        boolean result = traingle.Is_Isosceles(a,b,c);
        assertEquals(expect, result);

    }

    @Test
    public void is_Scalene() {
        int a = 3;
        int b =3;
        int c = 2;

        Triangle traingle = new Triangle();
        boolean expect = false;
        boolean result = traingle.Is_Scalene(a,b,c);
        assertEquals(expect, result);
    }
}