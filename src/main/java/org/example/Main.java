package org.example;

/*
Rules:
Numbers divisible by 3 → "Fizz"
Numbers divisible by 5 → "Buzz"
Numbers divisible by 3 & 5 → "FizzBuzz"
All other numbers remain unchanged
*/

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static String fizzBuzz(int num)
    {
        if (num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz";
        } else if (num % 5 == 0){
            return "Buzz";
        } else if (num % 3 == 0){
            return "Fizz";
        }
return ("" + num);
    }
}