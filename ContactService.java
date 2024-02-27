package info;

import java.util.ArrayList;

public class ContactService {
    private ArrayList<Contact> contacts;

    public ContactService() {
        contacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        boolean contactAlready = false;
        
        for (Contact contactList : contacts) {
            if (contactList.equals(contact)) {
                contactAlready = true;
            }
        }
        if (!contactAlready) {
            contacts.add(contact);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteContact(String string) {
        for (Contact contactList : contacts) {
            if (contactList.getContactID().equals(string)) {
                contacts.remove(contactList);
                return true;
            }
        }
        return false;
    }

    public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber,
            String address) {
        for (Contact contactList : contacts) {

            if (contactList.getContactID().equals(contactID)) {
                if (!firstName.equals("") && !(firstName.length() > 10)) {
                    contactList.setFirstName(firstName);
                }
                if (!lastName.equals("") && !(lastName.length() > 10)) {
                    contactList.setFirstName(lastName);
                }
                if (!phoneNumber.equals("") && (phoneNumber.length() == 10)) {
                    contactList.setFirstName(phoneNumber);
                }
                if (!address.equals("") && !(address.length() > 30)) {
                    contactList.setFirstName(address);
                }
                return true;
            }
        }
        return false;
    }
}
