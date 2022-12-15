package lesson2task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AgeTest {

    @org.junit.jupiter.api.Test
    void shouldBeTrueIfAnAdult() {
        boolean age = Age.isAdult(18);
        Assertions.assertEquals(true, age);
    }
    @org.junit.jupiter.api.Test
    void shouldBeTrueIfOlder() {
        boolean age = Age.isAdult(25);
        Assertions.assertEquals(true, age);
    }
    @org.junit.jupiter.api.Test
    void shouldBeFalseIfAChild() {
        boolean age = Age.isAdult(7);
        Assertions.assertEquals(false, age);
    }
}