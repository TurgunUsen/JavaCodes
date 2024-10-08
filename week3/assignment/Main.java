package week3.assignment;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();

        // Example contacts
        manager.addContact(new Contact("Alice", "1234567890", "alice@gmail.com"));
        manager.addContact(new Contact("Bob", "9876543210", "bob@yahoo.com"));

        // Display all contacts
        manager.displayContacts();

        // Search for a contact
        manager.searchContact("Alice");

        // Extract and display unique email domains
        manager.extractEmailDomains();
    }
}
