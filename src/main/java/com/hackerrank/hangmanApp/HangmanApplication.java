package com.hackerrank.hangmanApp;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//        How to play the game
        System.out.println("Welcome to hangman! I will pick a word and will try guess it character \nby character. "
                + "If you guess wrong 6 times, then I win. If guess it before \nthen you win. "
                + "Are you ready? I hope so because I am.");
        System.out.println();
        System.out.println(
                "I have picked my word. Below is a picture, and below that is your current guess, \n"
                        + "which starts off as nothing. Everytime you guess incorrectly. I add a body part \nto the picture. "
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
//                Get the guess
                System.out.println();
                System.out.println("Enter a character, that you think is in the word");
                char guess = scanner.next().toLowerCase().charAt(0);
                System.out.println();

//                Checked if the character is guessed already
                while (game.isGuessedAlready(guess)) {
                    System.out.println("Try again! You already guessed that character.");
                    guess = scanner.next().toLowerCase().charAt(0);
                }

//                Play the guess
                if (game.playGuess(guess)) {
                    System.out.println("Great guess! That character is in the word!");
                } else {
                    System.out.println("Unfortunately this character isn't in the word. ");
                }
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
