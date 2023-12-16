package hms;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
    private String reservationId;
    private String guestId;
    private int roomNumber; // New attribute
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    // Default constructor
    public Reservation() {
    }

    // Parameterized constructor
    public Reservation(String reservationId, String guestId, int roomNumber, LocalDate checkInDate, LocalDate checkOutDate) {
        this.reservationId = reservationId;
        this.guestId = guestId;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getter and Setter methods for Reservation attributes
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
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

    // Method to capture reservation data
    public void captureReservationData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Reservation ID: ");
        setReservationId(scanner.nextLine());

        System.out.print("Enter Guest ID: ");
        setGuestId(scanner.nextLine());

        System.out.print("Enter Room Number: ");
        setRoomNumber(scanner.nextInt());

        System.out.print("Enter Check-In Date (YYYY-MM-DD): ");
        try {
            setCheckInDate(LocalDate.parse(scanner.next()));
        } catch (Exception e) {
            System.out.println("Invalid date format. Setting Check-In Date to null.");
        }

        System.out.print("Enter Check-Out Date (YYYY-MM-DD): ");
        try {
            setCheckOutDate(LocalDate.parse(scanner.next()));
        } catch (Exception e) {
            System.out.println("Invalid date format. Setting Check-Out Date to null.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to display reservation data
    public void displayReservationData() {
        System.out.println("Reservation Details:");
        System.out.println("Reservation ID: " + getReservationId());
        System.out.println("Guest ID: " + getGuestId());
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Check-In Date: " + getCheckInDate());
        System.out.println("Check-Out Date: " + getCheckOutDate());
    }

    public static void main(String[] args) {
        Reservation reservation = new Reservation();

        // Capture reservation data from the user
        reservation.captureReservationData();

        // Display reservation data
        reservation.displayReservationData();
    }
}
