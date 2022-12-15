package lesson2task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EvenNumberTest {

    @Test
    void shouldBeTrueForEvenNumbers() {
        boolean isEvenNumber = EvenNumber.isEvenNumber(6);
        Assertions.assertEquals(true, isEvenNumber);
    }

    @Test
    void shouldBeFalseForOddNumbers() {
        boolean isEvenNumber = EvenNumber.isEvenNumber(3);
        Assertions.assertEquals(false, isEvenNumber);
    }
}