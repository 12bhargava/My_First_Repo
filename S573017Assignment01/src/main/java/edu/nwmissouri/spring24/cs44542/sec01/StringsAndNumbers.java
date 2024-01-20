/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.nwmissouri.spring24.cs44542.sec01;

/**
 * Class: 44542-1 Object-Oriented Programming
 * @author Bhargava Reddy Erugula 
 * Description: Making sure everything works 
 * Due: 01/17/2024
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student, internet, or any other source. 
 * I will not share my source code with anyone under any circumstances.
 */
import java.util.Random;

public class StringsAndNumbers {

    public static void main(String[] args) {

        // Initialization and Basic Operations
        String example = "Working with String Methods in Java!";
        System.out.println("The String is:"+example);
        System.out.println("The length of String is:"+example.length());
        System.out.println("The Character at 5th index is:"+example.charAt(5));

        // Substring and Comparison
        System.out.println("The substring from index 11 to 17 is:"+example.substring(11, 17));
        if (example.contains("Methods")) {
            System.out.println("The substring Methods is present within the stringExample");
        } else {
            System.out.println("The substring Methods is not present within the stringExample");
        }

        // String Modification and Case Conversion
        String firstName = "Bhargava";
        String lastName = "Erugula";
        String fullName = firstName + "_" + lastName;
        System.out.println("The Concatenated String is:"+fullName);
        System.out.println("The Concatenated String in lowercase is:"+fullName.toLowerCase());
        System.out.println("The Concatenated String in uppercase is:"+fullName.toUpperCase());

        // Manipulation and Replacement
        String sampleText = "There are many String methods in Java!”";
        String replaceText = sampleText.replace("many", "Various");
        System.out.println("The result after replacement is:"+replaceText);

        // Searching and Trimming
        String searchText = "  Java is an Object-Oriented Programming Language. Java is a high level, robust and secure programming language.   ";
        int firstIndex = searchText.toLowerCase().indexOf("java");
        int secondIndex = searchText.toLowerCase().indexOf("java", firstIndex + 1);
        if (secondIndex != -1) {
            System.out.println("The index of the second occurrence of Java is:" + secondIndex);
        } else {
            System.out.println("Java not found in the given text or there is no second occurrence.");
        }
        System.out.println("The searchText after trimming the spaces at the begining and end is:" + searchText.trim());

        // Equality and Comparison
        String messageA = "hello";
        String messageB = "HELLO";
        boolean isEqualIgnoreCase = messageA.equalsIgnoreCase(messageB);
        System.out.println("The result of comparing messageA and messageB ignoring case sensitivity is:" + isEqualIgnoreCase);
        boolean isEqualCaseSensitive = messageA.equals(messageB);
        System.out.println("The result of comparing messageA and messageB considering case sensitivity is:" + isEqualCaseSensitive);

        // Joining
        System.out.println("The result after joining firstName and lastName with a hyphen is:" + firstName + "-" + lastName);

        //Random Class
        int player1 = getRandomBallLabel(21, 30);
        System.out.println("Player 1 of Team 2 selected ball labeled: " + player1);

        int player2 = getRandomBallLabel(21, 30);
        System.out.println("Player 2 of Team 2 selected ball labeled: " + player2);

        int totalTeam2Score = player1 + player2;
        System.out.println("Total score for Team 2: " + totalTeam2Score);

        Random randomValueWithSeed = new Random(20);

        System.out.println("Pseudo-random floating-point values with seed 20:");
        for (int i = 0; i < 5; i++) {
            double randomValue = randomValueWithSeed.nextDouble();
            System.out.println(randomValue);
        }
        Random randomValueWithoutSeed = new Random();

        System.out.println("Pseudo-random floating-point values without seed:");
        for (int i = 0; i < 5; i++) {
            double randomValue = randomValueWithoutSeed.nextDouble();
            System.out.println(randomValue);
        }

        //Math Class
        int absoluteDifference = Math.abs(-20 - 15);
        System.out.println("The absolute difference between -20 and 15 is:" + absoluteDifference);
        double RoundUpValue = Math.ceil(14.6 * 3.8);
        System.out.println("The result of (14.6*3.8) rounded to the nearest integer is:" + (int) RoundUpValue);
        double floorValue = Math.floor(29.7 / 4.2);
        System.out.println("The floor value of (29.7/4.2) is:" + floorValue);
        double sumOfSquares = Math.sqrt(Math.pow(10, 2) + Math.pow(20, 2));
        System.out.println("The square root of sum of squares of 10 and 20 is:" + sumOfSquares);

        double log = Math.log(256) / Math.log(2);
        System.out.println("The value of logarithm base 2 of 256 is:" + log);

        double minValue = Math.min(-5, Math.min(-10, Math.min(0, Math.min(15, 8))));
        System.out.println("The minimum value among -5,-10,0,15 and 8 is:" + minValue);

        double maxValue = Math.max(7 * 9, 40 / 5);
        System.out.println("The maximum value between the product of 7 and 9 and the quotient of 40 divided by 5 is:" + maxValue);

        double sin30 = Math.sin(Math.toRadians(30));
        double cos60 = Math.cos(Math.toRadians(60));
        System.out.println("The result of sine of 30 degrees multiplied by the cosine of 60 degrees is:" + (sin30 * cos60));
        double tan = Math.tan(Math.toRadians(45 - 30));
        System.out.println("The result of the tangent of the difference between 45 and 30 degrees is:" + tan);

        double expression = Math.abs(3 - 5) + Math.sqrt(25) - 7 * Math.pow(2, 2);
        System.out.println("The result of expression is:" + expression);

        // Difference between the equals() and equalsIgnoreCase()
        System.out.println("1. Difference between equals() and equalsIgnoreCase()\n"
                + "equals() is used to compare two strings in a case-sensitive manner.\n"
                + "For example:\n"
                + "String s1 = \"Hello\";\n"
                + "String s2 = \"hello\";\n"
                + "boolean result = s1.equals(s2); // Returns false (case-sensitive)\n"
                + "\n"
                + "equalsIgnoreCase() is used to compare two strings without considering case sensitivity.\n"
                + "For example:\n"
                + "String s1 = \"Hello\";\n"
                + "String s2 = \"hello\";\n"
                + "boolean result = s1.equalsIgnoreCase(s2); // Returns true (ignores case-sensitive)");

        // setting a specific seed value affect the sequence of generated random 
        System.out.println("Setting a specific seed value in random number generation provides determinism.\n"
                + "When using the same seed, the sequence of random numbers will be identical.\n"
                + "This ensures reproducibility, which is crucial in scenarios like simulations or testing.\n"
                + "Reproducibility allows for consistent behavior, aiding in debugging and result verification.");

        // How do you access the methods of Math class
        System.out.println("You access the methods of the Math class using the class name 'Math' followed by a dot (.) and the method name.\n"
                + "For example, to use the 'sqrt' method to calculate the square root:\n"
                + "double result = Math.sqrt(25); // Calculates the square root of 25\n"
                + "Similarly, you can use other methods like 'abs', 'ceil', 'floor', 'min', 'max', 'sin', 'cos', 'tan', etc.");
    }

    private static int getRandomBallLabel(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
