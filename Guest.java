package hms;

import java.time.LocalDate;
import java.util.Scanner;

class Guest extends Person implements DataCapturable{
    private String reservationId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    // Default constructor
    public Guest() {
        // Call the default constructor of the base class (Person)
        super();
    }

    // Parameterized constructor
    public Guest(
            String name,
            String contactNumber,
            String address,
            String email,
            LocalDate dateOfBirth,
            String gender,
            String idNumber,
            String socialMediaHandle,
            String emergencyContact,
            String reservationId,
            LocalDate checkInDate,
            LocalDate checkOutDate
    ) {
        // Call the parameterized constructor of the base class (Person)
        super(name, contactNumber, address, email, dateOfBirth, gender, idNumber, emergencyContact);
        this.reservationId = reservationId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getter and Setter methods for Guest attributes
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    // Override displayAllData method to include Guest attributes
    @Override
    public void displayAllData() {
        super.displayAllData(); // Call the displayAllData method of the base class (Person)
        System.out.println("Guest Details:");
        System.out.println("Reservation ID: " + getReservationId());
        System.out.println("Check-In Date: " + getCheckInDate());
        System.out.println("Check-Out Date: " + getCheckOutDate());
        // Display other attributes as needed
    }

    public static void main(String[] args) {
        Guest guest = new Guest();

        // Capture all data from the user
        guest.captureAllData();

        // Capture additional data for Guest
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Reservation ID: ");
        guest.setReservationId(scanner.nextLine());

        System.out.print("Enter Check-In Date (YYYY-MM-DD): ");
        try {
            guest.setCheckInDate(LocalDate.parse(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Invalid date format. Setting Check-In Date to null.");
        }

        System.out.print("Enter Check-Out Date (YYYY-MM-DD): ");
        try {
            guest.setCheckOutDate(LocalDate.parse(scanner.nextLine()));
        } catch (Exception e) {
            System.out.println("Invalid date format. Setting Check-Out Date to null.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();

        // Display all captured data for Guest
        guest.displayAllData();
    }
}