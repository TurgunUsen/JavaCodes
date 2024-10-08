package week3.assignment;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        // Example contacts
        manager.addContact(new Contact("Alice", "1234567890", "alice@gmail.com"));
        manager.addContact(new Contact("Bob", "9876543210", "bob@yahoo.com"));
        manager.displayContacts();
        manager.searchContact("Alice");
        manager.extractEmailDomains();
    }
}