package Inlamningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testClass {

    //Testar översättningen från Engelsk text till Morsekod.
    @Test
    public void testMorseTranslation() {
        //Arrange
        logicClass morseCode = new logicClass();

        //Act
        String test = "HAPPY";
        String expected = "**** *- *--* *--* -*-- ";
        morseCode.setToMorseCode(test);
        String actual = morseCode.getEnglish();

        //Assert
        assertEquals(expected, actual);
    }

    //Testar översättningen från Morsekod till Engelska.
    @Test
    public void testEnglishTranslation() {
        //Arrange
        logicClass englishWord = new logicClass();

        //Act
        String test = "**-* --- --- - -*** *- *-** *-**";
        String expected = "F O O T B A L L ";
        String actual = englishWord.setToEnglish(test);

        //Assert
        assertEquals(expected, actual);
    }

    //Testar Hashmap storage
    @Test
    public void testHashMapStorage() {
        //Arrange
        logicClass userInput = new logicClass();

        //Act
        String test = "A";
        String expected = "*-";
        String actual = userInput.storage.get(test);

        //Assert
        assertEquals(expected, actual);

    }
}