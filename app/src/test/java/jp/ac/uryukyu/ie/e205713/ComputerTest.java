package jp.ac.uryukyu.ie.e205713;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ComputerTest {
    @Test
    void ranTest() {
        Computer classUnderTest = new Computer();
        assertNotEquals(1, classUnderTest.ran());
        assertNotEquals(100, classUnderTest.ran());
    }
}
