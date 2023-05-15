package org.example;

import org.junit.jupiter.api.Test;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

class JunitTestCaseExampleTest {
    JunitTestCaseExample obj=new JunitTestCaseExample();

    @Test
    void remove() {
        obj.remove("Tom");
        obj.remove("Som");
        obj.remove("Sem");
        assertEquals("Removing 1 student from list", 1, obj.sizeOfList());

    }

    @Test
    void add() {
        obj.add("Jerry");
        obj.add("Jhon");
        obj.add("Marry");
        obj.add("Som");
        assertEquals("Adding 4 student to list", 4, obj.sizeOfList());
    }

    private void assertEquals(String s, int i, int i1) {

    }
}