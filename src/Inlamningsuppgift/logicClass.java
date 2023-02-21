package Inlamningsuppgift;

import java.util.HashMap;

public class logicClass {

    String englishResult = ""; // Startar på 0
    String morseResult = ""; // Startar på 0

    public HashMap<String, String> storage = new HashMap<>();

    // Hashmap storage sparar alfabetet och morsekoden.
    public logicClass() {
        storage.put("A", "*-");
        storage.put("B", "-***");
        storage.put("C", "-*-*");
        storage.put("D", "-**");
        storage.put("E", "*");
        storage.put("F", "**-*");
        storage.put("G", "--*");
        storage.put("H", "****");
        storage.put("I", "**");
        storage.put("J", "*---");
        storage.put("K", "-*-");
        storage.put("L", "*-**");
        storage.put("M", "--");
        storage.put("N", "-*");
        storage.put("O", "---");
        storage.put("P", "*--*");
        storage.put("Q", "--*-");
        storage.put("R", "*-*");
        storage.put("S", "***");
        storage.put("T", "-");
        storage.put("U", "**-");
        storage.put("V", "***-");
        storage.put("W", "*--");
        storage.put("X", "-**-");
        storage.put("Y", "-*--");
        storage.put("Z", "--**");
        storage.put("1", "*----");
        storage.put("2", "**---");
        storage.put("3", "***--");
        storage.put("4", "****-");
        storage.put("5", "*****");
        storage.put("6", "-****");
        storage.put("7", "--***");
        storage.put("8", "---**");
        storage.put("9", "----*");
        storage.put("0", "-----");
        storage.put(".", "*-*-*-");
        storage.put(",", "--**--");
        storage.put("?", "**--**");
        storage.put(" ", " ");


    }

    public String getEnglish() {
        return englishResult;
    } // returnerar svaret från EnglishInput.

    public String getMorseCode() {
        return morseResult;
    } // returnerar svaret från MorseInput.


    // setToMorseCode omvandrar englishInput till storaboksäver för att kunna läsa av texten i storage.
    public void setToMorseCode(String englishInput) {
        // for loop skapar en variabel och splittar englishInput till CharArray.
        // ":" Lambda expression, samma som .forEach loop.
        for (char character : englishInput.toCharArray())
            englishResult += storage.get((character + "").toUpperCase()) + " ";
    }

    //setToEnglish skriver ut morseResult genom att göra om hashmapen i reversed ordning.
    // För att kunna plocka ur första värdet ur storage som är Key...
    public String setToEnglish(String morseInput) {
        HashMap<String, String> reversedHashMap = new HashMap<>();
        for (String i : storage.keySet()) {
            reversedHashMap.put(storage.get(i), i);
        }
        // for loop med split, för att läsa varje bokstav i morsekod.
        //Varje mellanslag splittas för att programmet ska kunna läsa bokstäverna korrekt
        for (String splitInput : morseInput.split(" "))
            morseResult += reversedHashMap.get(splitInput) + " ";

        return morseResult;
    }
}