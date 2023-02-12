package com.hackerrank.hangmanApp;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        How to play the game
        System.out.println("Welcome to hangman! I will pick a word and will try guess it character by character. \n"
                + "If you guess wrong 6 times, then I win. If guess it before then you win. \n"
                + "Are you ready? I hope so because I am.");
        System.out.println();
        System.out.println(
                "I have picked my word. Below is a picture, and below that is your current guess, \n"
                        + "which starts off as nothing. Everytime you guess incorrectly. I add a body part to the picture. \n"
                        + "When there is a full person you lose.");
//        Allows for multiple games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
//            Setting up the game
            System.out.println();
            System.out.println("Alright!. Let's play!");
            Hangman game = new Hangman();
            do {
//                draw the things...
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalGuess());
                System.out.println(game.mysteryWord);
            }
            while (!game.gameOver());

//playing the game

//     Playing again or no?
            System.out.println();
            System.out.println("Do you want to play another game? Enter Y if you do.");
            char response = scanner.next().toUpperCase().charAt(0);
            doYouWantToPlay = (response == 'Y');
        }
        scanner.close();

    }
}
