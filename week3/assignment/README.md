# Java Programming Assignment: Working with 
- ArrayList
- HashMap
- HashSet

## Objective:

The goal of this assignment is to help students understand and practice the use of Java collections, specifically:
- ArrayList
- HashMap
- HashSet

Students will create a program to manage a simple contact list where they can store, organize, and manipulate contacts using these three data structures.

## Problem Statement:

Create a Java program that allows users to store and manage contacts using:
- ArrayList
- HashMap
- HashSet

Each contact should have the following details:

- **Name** (String)
- **Phone Number** (String)
- **Email** (String)

Your program should offer the following functionalities:

- Add a new contact.
- Display all contacts.
- Search for a contact by name.
- Prevent duplicate contacts (same name).
- Sort and display contacts alphabetically (optional bonus).
- Remove a contact.
- Display all unique domain names from the email addresses using a `HashSet`.

## Task Breakdown:

### 1. ArrayList for Contact Management:
Use `ArrayList` to store and manage the list of contacts.

Implement methods to:
- Add a new contact.
- Display all contacts.
- Remove a contact.

### 2. HashMap for Phone Number Lookup:
Use `HashMap` where the **key** is the contact’s name and the **value** is their phone number.

Implement methods to:
- Search for a contact by name and display the corresponding phone number.
- Update the phone number for an existing contact.

### 3. HashSet for Unique Email Domains:
Use `HashSet` to store unique email domains (e.g., gmail.com, yahoo.com) from the contacts’ email addresses.

Implement a method that:
- Extracts the domain names from email addresses.
- Displays the list of unique domains.

## Assignment Goals:

- **ArrayList**: Demonstrates dynamic list management, where you can add, remove, and display contacts.
- **HashMap**: Enables fast lookups of phone numbers by name.
- **HashSet**: Ensures unique storage of email domains, showcasing how sets can be used to filter duplicates.

## Extra Credit (Optional):

- **Sorting Contacts Alphabetically**: Implement a sorting algorithm or use `Collections.sort()` to display the contacts alphabetically by name.
- **Search by Email**: Extend the `HashMap` functionality to allow users to search for contacts by email address.
