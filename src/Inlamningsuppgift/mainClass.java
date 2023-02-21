package Inlamningsuppgift;

import java.util.Scanner;

public class mainClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        logicClass lc = new logicClass(); // lc kallar på den andra klassen.
        String englishInput; // För att hämta inputs från användaren i konsolen.
        String morseInput; // För att hämta inputs från användaren i konsolen.

        System.out.println("Welcome to English/Morse code translator!");


        //Boolean mistake är false för att användaren skriver rätt.
        boolean error = false; // booelan false för att stanna programmet när vi fått ett ord/kod från "användaren".

        do { // do while loop, när detta uppnås, gör detta osv.
            try {
                System.out.println("INSTRUCTIONS: Please type 'E' for English and 'M' for Morse code.");
                String userChoice = scan.nextLine();

                switch (userChoice) {
                    case "E", "e" -> {
                        userChoice = null; // userChoice är null för att programmet inte ska skriva ut Exception när svaret är korrekt.
                        System.out.println("You have chosen English, please write your english word.");
                        englishInput = scan.nextLine();
                        lc.setToMorseCode(englishInput); // englishInput inlagd i setToMorse metoden.
                        System.out.println("Your English word is: " + englishInput + " and the MORSE CODE translation is: " + lc.getEnglish());
                        error = false; // error false för att indikera till programmet att de inte är error.
                    }
                }
                switch (userChoice) {
                    case "M", "m" -> {
                        userChoice = null;
                        System.out.println("You have chosen Morse Code, please write your code. ");
                        morseInput = scan.nextLine();
                        lc.setToEnglish(morseInput);
                        System.out.println("Your MORSE CODE is: " + morseInput + " and the English translation is: " + lc.getMorseCode());
                        error = false; // error false för att indikera till programmet de inte är error.

                    }
                } // if satsen fungerar som en felhantering, om användaren skiver något annat än e eller m så kommer detta felmeddelande upp och programmet börar om från början.
                if (!userChoice.matches("E") || !userChoice.matches("e") || !userChoice.matches("M") || !userChoice.matches("m")) {
                    error = true;
                    throw new Exception("OBS! Invalid input, please try again."); // Skapar ett nytt felmeddelande för att göra de tydligt i konsolen.
                }
                // 1.Felhantering
                // Använder catch Nullpointerexception för att få bort felmeddelande när användaren skriver rätt, och för att få bort invalid input alternativet varje gång.
            } catch (NullPointerException ignore) {

                // 2. Felhantering
            } // catch Exception e för att att hämta Invalid input meddelandet när användaren inte skriver E eller M.
            catch (Exception e) {
                System.out.println(e);
            }

        } while (error);

    }


}
