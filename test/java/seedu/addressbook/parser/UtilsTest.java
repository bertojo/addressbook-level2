package seedu.addressbook.parser;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.common.Utils;

import java.util.ArrayList;

public class UtilsTest {

    @Test
    public void testIsAnyNull() {
        assertEquals(false, Utils.isAnyNull("TEST"));
    }
    
    @Test
    public void testElementsAreUnique_returnTrue() {
        ArrayList<Object> testCases = new ArrayList<Object>();
        testCases.add("TEST");
        testCases.add("1");
        testCases.add("2");
        testCases.add("3");
        testCases.add("4");
        
        assertEquals(true, Utils.elementsAreUnique(testCases));
    }

    @Test
    public void testElementsAreUnique_returnFalse() {
        ArrayList<Object> testCases = new ArrayList<Object>();
        testCases.add("TEST");
        testCases.add("1");
        testCases.add("2");
        testCases.add("3");
        testCases.add("3");
        
        assertEquals(false, Utils.elementsAreUnique(testCases));
    }
    
}
