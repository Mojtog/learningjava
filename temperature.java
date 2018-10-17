package com.company;
import java.util.Scanner;

public class Main {
    static public String userInput1;
    static public String userInput2;
    static public int menuChoice;

    public static int getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Find the length of a word\n2.Find if second word is a part of a first one\n3.Find if first word starts with second\n4.Print out character array\n5.Get a substring\n6.Exit");
        System.out.println("Type in menu number");
        menuChoice = keyboard.nextInt();


        return menuChoice;
    }
    public static void menu() {
        boolean isRunning = true;
        while (isRunning) {
            int menuPoint = getMenuOption();
            switch(menuPoint) {
                case 1:
                    getLengthofaWord();
                    break;
                case 2:
                    findString();
                    break;
                case 3:
                    startString();
                    break;
                case 4:
                    characterArray();
                    break;
                case 5:
                    substring();
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("That's it, I hope you liked it");
                    break;
                default:
                    System.out.println("Please, choose one of the options provided");
                    getMenuOption();
            }
        }

    }

    public static void getWords() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type in any long word");
        userInput1 = keyboard.nextLine();
        System.out.println("Type in a short word here");
        userInput2 = keyboard.nextLine();

    }

    public static void getLengthofaWord() {
        getWords();
        int len = userInput1.length();
        System.out.println("The length of a first word is "+len+" characters.");
        int len2 = userInput2.length();
        System.out.println("The length of a second word is "+len2+" characters.");
    }

    public static void characterArray() {
        getWords();
        characterArray1();
        characterArray2();
    }

    public static void characterArray1() {
        int i = 0;
        int len = userInput1.length();
        while(i < len) {
           char c = userInput1.charAt(i);
           System.out.println(c);
           i++;
        }

    }

    public static void startString() {
        getWords();
        boolean bool = userInput1.startsWith(userInput2);
        if (bool==true) {
            System.out.println("Yes, first word starts with the second!");
        }
        else {
            System.out.println("No, the first word does not start with the second");
        }
    }

    public static void findString() {
        getWords();
        boolean yes = userInput1.contains(userInput2);
        if (yes==true) {
            System.out.println("Yes, first word contains the second word");
        }
        else {
            System.out.println("No, first word does not contain the second word");
        }
    }

    public static void substring() {
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Type in any long word");
        userInput1 = keyboard2.nextLine();
        int position;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type in a number to derive substring from the firstword");
        position = keyboard.nextInt();
        String sub = userInput1.substring(position);
        System.out.println(sub);
    }

    public static void characterArray2() {
        int i2 = 0;
        int len2 = userInput2.length();
        while(i2 < len2) {
        char c2 = userInput2.charAt(i2);
            System.out.println(c2);
            i2++;
        }
    }



    public static void main(String[] args) {
	menu();
    }
}

