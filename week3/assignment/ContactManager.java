package week3.assignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ContactManager {

    // ArrayList for storing contacts
    private ArrayList<Contact> contacts = new ArrayList<>();
    // HashMap for phone number lookup by contact name
    private HashMap<String, String> phoneBook = new HashMap<>();
    // HashSet for storing unique email domains
    private HashSet<String> emailDomains = new HashSet<>();

    // Add a new contact
    public void addContact(Contact contact) {
        // Check for duplicates based on name
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(contact.getName())) {
                System.out.println("Contact already exists!");
                return;
            }
        }
        // Add to ArrayList and HashMap (for name -> phone number)
        contacts.add(contact);
        phoneBook.put(contact.getName(), contact.getPhoneNumber());

        // Add the email domain to HashSet
        String email = contact.getEmail();
        String domain = email.substring(email.indexOf("@") + 1);
        emailDomains.add(domain);

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

    // Search for a contact by name and display their phone number
    public void searchContact(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Phone number for " + name + ": " + phoneBook.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Extract and display unique email domains from contacts
    public void extractEmailDomains() {
        if (emailDomains.isEmpty()) {
            System.out.println("No email domains available.");
        } else {
            System.out.println("Unique email domains: " + emailDomains);
        }
    }
}

