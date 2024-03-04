package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import info.Contact;

public class ContactTest {
    @Test
    public void testContactCreation() {
        Contact contact = new Contact("A1", "Greg", "Monti", "1234567890", "123 Test St");
        assertEquals("A1", contact.getContactId());
        assertEquals("Greg", contact.getFirstName());
        assertEquals("Monti", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Test St", contact.getAddress());
    }

}
