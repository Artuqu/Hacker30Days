package com.hackerrank.hangmanApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Hangman {

    String mysteryWord;
    StringBuilder currentGuess;
    ArrayList<Character> previousGuesses = new ArrayList<>();
    int maxTries = 6;
    int currentTry = 0;
    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedReader;

    public Hangman() throws IOException {
        initializeStreams();
        mysteryWord = pickWord();
        currentGuess = initializeCurrentGuess();
    }

    public void initializeStreams() throws IOException {
        try {
            File inFile = new File("dictionary.txt");
            fileReader = new FileReader(inFile);
            bufferedReader = new BufferedReader(fileReader);
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                dictionary.add(currentLine);
                currentLine = bufferedReader.readLine();
            }
            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Could not initialize streams!");
        }
    }

    public String pickWord() {
        Random random = new Random();
        int wordIndex = Math.abs(random.nextInt() % dictionary.size());
        return dictionary.get(wordIndex);
    }

    public StringBuilder initializeCurrentGuess() {
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < mysteryWord.length() * 2; i++) {
            if (i % 2 == 0) {
                current.append("_");
            } else {
                current.append(" ");
            }
        }
        return current;
    }

    public String getFormalGuess() {
        return "Current Guess: " + currentGuess.toString();
    }

    public boolean gameOver() {
        if (didWeWin()) {
            System.out.println();
            System.out.println("Congrats! You won! You guessed the right word!");
            return true;
        } else if (didWeLose()) {
            System.out.println();
            System.out.println("Sorry you lost! You spend all of your 6 tries." +
                    "The word was " + mysteryWord + ".");
            return true;
        }
        return false;
    }

    private boolean didWeWin() {
        String guess = getCondensedCurrentGuess();
        return guess.equals(mysteryWord);
    }

    private String getCondensedCurrentGuess() {
        String guess = currentGuess.toString();
        return guess.replace(" ", "");
    }

    private boolean didWeLose() {
        return currentTry == maxTries;
    }

    public boolean isGuessedAlready(char guess) {
        return previousGuesses.contains(guess);
    }

    public boolean playGuess(char guess) {
        boolean isItAGoodGuess = false;
        previousGuesses.add(guess);
        for (int i = 0; i < mysteryWord.length(); i++) {
            if (mysteryWord.charAt(i) == guess) {
                currentGuess.setCharAt(i * 2, guess);
                isItAGoodGuess = true;
            }
        }
        if (!isItAGoodGuess) {
            currentTry++;
        }
        return isItAGoodGuess;
    }

    public String drawPicture() {
        return switch (currentTry) {
            case 0 -> noPersonDraw();
            case 1 -> addHeadDraw();
            case 2 -> addBodyDraw();
            case 3 -> addOneArmDraw();
            case 4 -> addSecondArmDraw();
            case 5 -> addFirstLegDraw();
            default -> fullPersonDraw();
        };
    }


    private String noPersonDraw() {
        return "_ _ _ _ _ _\n" +
                "|        |\n" +
                "|        \n" +
                "|       \n" +
                "|        \n" +
                "|       \n" +
                "|\n" +
                "|\n";
    }

    private String addHeadDraw() {
        return "_ _ _ _ _ _\n" +
                "|        |\n" +
                "|        O\n" +
                "|        \n" +
                "|         \n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    private String addBodyDraw() {
        return "_ _ _ _ _ _\n" +
                "|        |\n" +
                "|        O\n" +
                "|        |  \n" +
                "|        |\n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    private String addOneArmDraw() {
        return "_ _ _ _ _ _\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / |  \n" +
                "|        |\n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    private String addSecondArmDraw() {
        return "_ _ _ _ _ _\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / | \\ \n" +
                "|        |\n" +
                "|        \n" +
                "|\n" +
                "|\n";
    }

    private String addFirstLegDraw() {
        return "_ _ _ _ _ _\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / | \\ \n" +
                "|        |\n" +
                "|       /  \n" +
                "|\n" +
                "|\n";
    }

    private String fullPersonDraw() {
        return "_ _ _ _ _ _\n" +
                "|        |\n" +
                "|        O\n" +
                "|      / | \\ \n" +
                "|        |\n" +
                "|       / \\ \n" +
                "|\n" +
                "|\n";
    }


}
