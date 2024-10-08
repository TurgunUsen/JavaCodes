package week3.assignment;
import java.util.ArrayList;

public class ContactManager {
    ArrayList<Contact> contacts = new ArrayList<>();

    // Add a new contact to the list
    public void addContact(Contact contact) {
        // Check for duplicates based on name
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(contact.getName())) {
                System.out.println("Contact already exists!");
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added: " + contact);
    }

    // Display all contacts
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }

}
