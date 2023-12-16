package hms;

import java.time.LocalDate;
import java.util.Scanner;

class Person implements DataCapturable{
    private String name;
    private String contactNumber;
    private String address;
    private String email;
    private LocalDate dateOfBirth;
    private String gender;
    private String idNumber;
    private String socialMediaHandle;
    private String emergencyContact;

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(
            String name,
            String contactNumber,
            String address,
            String email,
            LocalDate dateOfBirth,
            String gender,
            String idNumber,
            //String socialMediaHandle,
            String emergencyContact
    ) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idNumber = idNumber;
        //this.socialMediaHandle = socialMediaHandle;
        this.emergencyContact = emergencyContact;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getSocialMediaHandle() {
        return socialMediaHandle;
    }

    /*public void setSocialMediaHandle(String socialMediaHandle) {
        this.socialMediaHandle = socialMediaHandle;
    }*/

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    // Method to capture all data from the user using Scanner
    public void captureAllData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        setName(scanner.nextLine());

        System.out.print("Enter Contact Number: ");
        setContactNumber(scanner.nextLine());

        System.out.print("Enter Address: ");
        setAddress(scanner.nextLine());

        System.out.print("Enter Email: ");
        setEmail(scanner.nextLine());

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        try {
            setDateOfBirth(LocalDate.parse(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Invalid date format. Setting Date of Birth to null.");
        }

        System.out.print("Enter Gender: ");
        setGender(scanner.nextLine());

        System.out.print("Enter ID Number: ");
        setIdNumber(scanner.nextLine());

        /*System.out.print("Enter Social Media Handle: ");
        setSocialMediaHandle(scanner.nextLine());*/

        System.out.print("Enter Emergency Contact: ");
        setEmergencyContact(scanner.nextLine());

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to display all data using System.out
    public void displayAllData() {
        System.out.println("Person Details:");
        System.out.println("Name: " + getName());
        System.out.println("Contact Number: " + getContactNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Gender: " + getGender());
        System.out.println("ID Number: " + getIdNumber());
        //System.out.println("Social Media Handle: " + getSocialMediaHandle());
        System.out.println("Emergency Contact: " + getEmergencyContact());
        // Display other attributes as needed
    }

    public static void main(String[] args) {
        Person person = new Person();

        // Capture all data from the user
        person.captureAllData();

        // Display all captured data
        person.displayAllData();
    }
}