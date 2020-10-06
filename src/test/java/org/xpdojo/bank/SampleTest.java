package org.xpdojo.bank;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class SampleTest {
    @BeforeAll
    static void setup() {
//        log.info("@BeforeAll - executes once before all test methods in this class");
    }

    @BeforeEach
    void init() {
//        log.info("@BeforeEach - executes before each test method in this class");
    }

    @AfterEach
    void tearDown() {
//        log.info("@AfterEach - executed after each test method.");
    }

    @AfterAll
    static void done() {
//        log.info("@AfterAll - executed after all test methods.");
    }

    @Test
    void groupAssertions() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 1),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 1)
        );
    }
}
