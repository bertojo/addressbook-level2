package seedu.addressbook.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    @Test
    public void varyingCapitalTest() throws IllegalValueException {
        Name name1 = new Name("ABCDEFGH");
        Name name2 = new Name("AbCdEfgH");
        
        assertEquals(true, name1.isSimilar(name2));
    }
    
    @Test
    public void varyingCapitalTestWithTrailingWhitespace() throws IllegalValueException {
        Name name1 = new Name("ABCDEFGH");
        Name name2 = new Name("  AbCdEfgH            ");
        
        assertEquals(true, name1.isSimilar(name2));
    }
    
    @Test
    public void varyingCapitalTestWhitespaceInMiddle() throws IllegalValueException {
        Name name1 = new Name("ABCDEFGH");
        Name name2 = new Name("  Ab CdE fgH           ");
        
        assertEquals(false, name1.isSimilar(name2));
    }
}
