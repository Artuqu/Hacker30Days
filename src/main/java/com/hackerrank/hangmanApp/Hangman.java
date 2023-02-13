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
        for (int i = 0; i < mysteryWord.length(); i++) {
//            if (i % 2 == 0) {
                current.append("_ ");
//            } else {
//                current.append(" ");
//            }
        }
        return current;
    }

    public String getFormalGuess() {
        return "Current Guess: " + currentGuess.toString();
    }

    public String drawPicture() {
        switch (currentTry) {
            case 0:
                return noPersonDraw();
            case 1:
                return addHeadDraw();
            case 2:
                return addBodyDraw();
            case 3:
                return addOneArmDraw();
            case 4:
                return addSecondArmDraw();
            case 5:
                return addFirstLegDraw();
            default:
                return fullPersonDraw();
        }
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

    public boolean gameOver() {

        return true;
    }
}
