package PROJECT;

import java.util.Scanner;

public class contacts {
    public static void displayContacts(String[] names, String[] phoneNumbers) {
        System.out.println("Contacts:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + phoneNumbers[i]);
        }
    }

    public static boolean searchContact(String[] names, String target) {
        for (String name : names) {
            if (name.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of contacts:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String[] names = new String[n];
        String[] phoneNumbers = new String[n];
        System.out.println("Enter the contacts (name and phone number):");
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Phone Number: ");
            phoneNumbers[i] = scanner.nextLine();
        }
        displayContacts(names, phoneNumbers);

        System.out.println("Enter a name to search:");
        String target = scanner.nextLine();
        if (searchContact(names, target)) {
            System.out.println("Contact found.");
        } else {
            System.out.println("Contact not found.");
        }
        scanner.close();
    }
}