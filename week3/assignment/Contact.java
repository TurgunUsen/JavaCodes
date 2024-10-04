package week3.assignment;

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
}