package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleTest {

    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    int a2 = 100;
    int b2 = 3;
    int c2 = 4;

    int a3 = 2;
    int b3 = 3;
    int c3 = 0;

    int a4 = 2;
    int b4 = -3;
    int c4 = 4;


    @Test
    void triangleTest1() {
            assertEquals(6, Triangle.function(3,4,5));
    }


    @Test
    void triangleTest2(){
        Assertions.assertThrows(TriangleException.class, ()-> getException2(), "Неправильные параметры треугольника");
    }

    private String getException2() throws TriangleException {
        if (((a2 + b2) < c2) || ((a2 + c2) < b2) || ((b2 + c2) < a2)) throw new  TriangleException();
        return "result";
    }


    @Test
    void triangleTest3(){
        Assertions.assertThrows(TriangleException.class, ()-> getException3(), "Сторона треугольника не может равняться нулю");
    }

    private String getException3() throws TriangleException {
        if ((a3 == 0) || (b3 == 0) || (c3 == 0)) throw new  TriangleException();
        return "result";
    }


    @Test
    void triangleTest4(){
        Assertions.assertThrows(TriangleException.class, ()-> getException4(), "Сторона треугольника не может равняться нулю");
    }

    private String getException4() throws TriangleException {
        if ((a4 < 0) || (b4 < 0) || (c4 < 0)) throw new  TriangleException();
        return "result";
    }



} class TriangleException extends Exception{}