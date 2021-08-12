package com.chapter_42;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    String[] arr;

    @BeforeEach
    void setUp() {
        arr = new String[] {"b", "c", "d", "a"};
    }

    @Test
    @DisplayName("Insertion sort should work")
    void testMultiply() {
        InsertionSort.sort(arr);
        var result = new String[] {"a", "b", "c", "d"};
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], arr[i], "Insertion sort should work");
        }
    }
}
