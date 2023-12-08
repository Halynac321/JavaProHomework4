package com.hillel.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4 {
    public static void main(String args[]) {
        char [] testFindSymbolOccurance = "Bob likes fishing very much!".toCharArray();
        int resultFindSymbolOccurance = findSymbolOccurance(testFindSymbolOccurance, 'i');
        System.out.println("Testing findSymbolOccurance. Result = " + resultFindSymbolOccurance);

        int resultFindWordPosition = findWordPosition("Apollo".toCharArray(), "pollo".toCharArray());
        System.out.println("Testing 1 findWordPosition. Result = " + resultFindWordPosition);
        resultFindWordPosition = findWordPosition("Apple".toCharArray(), "plant".toCharArray());
        System.out.println("Testing 2 findWordPosition. Result = " + resultFindWordPosition);

        char [] resultCharArray = stringReverse("Bob likes fishing very much!".toCharArray());
        System.out.println("Testing stringReverse. Result = " + new String(resultCharArray));

        System.out.println("Testing 1 isPalindrome. Result = " + isPalindrome("ERE".toCharArray()));
        System.out.println("Testing 2 isPalindrome. Result = " + isPalindrome("Allo".toCharArray()));

        guessWord ();
        }
        static int findSymbolOccurance (char [] myCharArray, char symbol) {
        int numOfOccurances = 0;
        for (char selectedChar : myCharArray) {
            if (selectedChar == symbol) numOfOccurances++;
            }
        return numOfOccurances;
        }
        static int findWordPosition (char [] source, char [] target) {
        String sourceString = new String(source);
        String targetString = new String(target);
        int resut = sourceString.indexOf(targetString);
        return resut;
        }
        static char [] stringReverse (char [] myCharArray) {
        char [] resultCharArray = new char [myCharArray.length];
        int j=0;
        for (int i = myCharArray.length-1; i >= 0 ; i--){
            resultCharArray [j] = myCharArray[i];
            j++;
            }
        return resultCharArray;
        }
        static boolean isPalindrome (char [] myCharArray) {
        if (Arrays.equals(myCharArray, stringReverse(myCharArray))) return true;
        else return false;
        }
        static void guessWord () {
            String [] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape",
                    "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
            int randomNum = (int)(Math.random() * words.length);
            String computerWord = words [randomNum];
            System.out.println("ComputerWord:" + computerWord);
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter word:");
            String userWord = myObj.nextLine();
            String comparisonResult="";
            for (int i = 0; i < computerWord.length() ; i++) {
                if (i<userWord.length() && computerWord.charAt(i) == userWord.charAt(i)){
                    comparisonResult = comparisonResult + computerWord.charAt(i);
                } else{
                    if (comparisonResult == "") {
                        System.out.println("Sorry, try again");
                    }
                    else {
                        String newComparisonResult=comparisonResult;
                        for (int j=0; j<15-comparisonResult.length(); j++) {newComparisonResult += "*";}
                        System.out.println ("Sorry, try again: "+ newComparisonResult);
                    }
                    return;
                }
            }
            System.out.println("Congratulations! You guessed the word!");

        }
    }
