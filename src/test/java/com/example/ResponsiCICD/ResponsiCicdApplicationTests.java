package com.example.ResponsiCICD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ResponsiCicdApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

	@Test
    void simpleTest() {
        int result = 2 + 2;
        assertEquals(4, result, "2 + 2 harus sama dengan 4");
    }
}
