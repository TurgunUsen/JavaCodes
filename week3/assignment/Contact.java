package week3.assignment;
import java.util.*;

public class Contact{

    private String name;
    private String phoneNumber;
    private String email;

// Constructor
public Contact(String name, String phoneNumber, String email){
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.email = email;
}

// Getters
public String getName(){
    return name;
}

public String getPhoneNumber(){
    return phoneNumber;
}

public String getEmail(){
    return email;
}

// Overriding toString to display contact details
@Override
public String toString() {
    return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email;
    }

ArrayList<Contact> contacts = new ArrayList<>();

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

HashMap<String, String> phoneBook = new HashMap<>();

public void addContactToPhoneBook(Contact contact) {

    phoneBook.put(contact.getName(), contact.getPhoneNumber());
}

public void searchContact(String name) {
    if (phoneBook.containsKey(name)) {
        System.out.println("Phone number for " + name + ": " + phoneBook.get(name));
    } else {
        System.out.println("Contact not found.");
        }
}
}