package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void fizzBuzz_shouldReturnFizzBuzz_whenCalledWith3And5Multiple(){
        //given
        int num = 15;
        String expected = "FizzBuzz";
        //when
        String actual = Main.fizzBuzz(num);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void fizzBuzz_shouldReturnBuzz_whenCalledWith5Multiple(){
        //given
        int num = 5;
        String expected = "Buzz";
        //when
        String actual = Main.fizzBuzz(num);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void fizzBuzz_shouldReturnFizz_whenCalledWith3Multiple(){
        //given
        int num = 3;
        String expected = "Fizz";
        //when
        String actual = Main.fizzBuzz(num);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void fizzBuzz_shouldReturn4_whenCalledWith4(){
        //given
        int num = 4;
        String expected = "4";
        //when
        String actual = Main.fizzBuzz(num);
        //then
        assertEquals(expected,actual);
    }
    @Test
    void fizzBuzz_shouldReturn1_whenCalledWith1(){
        //given
    int num = 1;
    String expected = "1";
    //when
    String actual = Main.fizzBuzz(num);
    //then
assertEquals(expected,actual);
    }

}