package lesson3task4;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @org.junit.jupiter.api.Test
    void shouldConvertMinutesToSeconds() {
        int minutesToSeconds = Converter.minutesToSeconds(5);
        Assertions.assertEquals(300, minutesToSeconds);
    }
}