package Test;

import org.junit.jupiter.api.Test;

import info.Contact;

import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
    @Test
    @DisplayName("Contact ID cannot have more than 10 characters")
    void testContactIDWithMoreThanTenCharacters() {
        Contact contact = new Contact("1234567890", "FirstName", "LastName", "PhoneNumber", "Address");
        if (contact.getContactID().length() > 10) {
            fail("Contact ID has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Contact First Name cannot have more than 10 characters")
    void testContactFirstNameWithMoreThanTenCharacters() {
    	Contact contact = new Contact("ContactId", "Greg", "LastName", "PhoneNumber", "Address");
        if (contact.getFirstName().length() > 10) {
            fail("First Name has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Contact Last Name cannot have more than 10 characters")
    void testContactLastNameWithMoreThanTenCharacters() {
    	Contact contact = new Contact("ContactId", "FirstName", "Monti", "PhoneNumber", "Address");
        if (contact.getLastName().length() > 10) {
            fail("Last Name has more than 10 characters.");
        }
    }

    @Test
    @DisplayName("Contact phone number is exactly 10 characters")
    void testContactNumberWithMoreThanTenCharacters() {
    	Contact contact = new Contact("ContactId", "FirstName", "LastName", "1234567890", "Address");
    	if(contact.getPhoneNumber().length() != 10) {
    		fail("Phone number length does not equal 10.");
    	}
    }

    @Test
    @DisplayName("Contact address cannot have more than 30 characters")
    void testContactAddressWithMoreThanThirtyCharacters() {
    	Contact contact = new Contact("ContactId", "FirstName", "LastName", "PhoneNumber", "1234 TestClass Lane");
    	if(contact.getAddress().length() > 30) {
    		fail("Address cannot have more than 30 characters.");
    	}
    }
    

    @SuppressWarnings("null")
    @Test
    @DisplayName("Contact ID shall not be null")
    void testContactIdNotNull() {
    	Contact contact = new Contact("1234567890", "FirstName", "Monti", "PhoneNumber", "Address");
        assertNotNull(contact.getLastName(), "Last name was null.");
    }
	@Test
    @DisplayName("Contact First Name shall not be null")
    void testContactFirstNameNotNull() {
    	Contact contact = new Contact("ContactId", "Greg", "LastName", "PhoneNumber", "Address");
		assertNotNull(contact.getFirstName(), "First name was null.");
    }

    @Test
    @DisplayName("Contact Last Name shall not be null")
    void testContactLastNameNotNull() {
    	Contact contact = new Contact("ContactId", "FirstName", "Monti", "PhoneNumber", "Address");
        assertNotNull(contact.getLastName(), "Last name was null.");
    }

    @Test
    @DisplayName("Contact Phone Number shall not be null")
    void testContactPhoneNotNull() {
    	Contact contact = new Contact("ContactId", "FirstName", "LastName", "1234567890", "Address");
        assertNotNull(contact.getPhoneNumber(), "Phone number was null.");
    }

    @Test
    @DisplayName("Contact Address shall not be null")
    void testContactAddressNotNull() {
    	Contact contact = new Contact("ContactId", "FirstName", "LastName", "PhoneNumber", "1234 TestCase Lane");
        assertNotNull(contact.getAddress(), "Address was null.");
    }
}
