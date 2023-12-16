package hms;


public class Billing implements BillingComponent{

    private static int billCounter = 1;

    private int billId;

    private int guestId;

    private Reservation reservation;

    private double roomCharge;

    private double foodCharge;

    private double drinkCharge;

    private double totalAmount;


    public Billing(int guestId, Reservation reservation, double roomCharge) {

        this.billId = billCounter++;

        this.guestId = guestId;

        this.reservation = reservation;

        this.roomCharge = roomCharge;

        this.foodCharge = 0.0;

        this.drinkCharge = 0.0;

        this.totalAmount = calculateTotal();

    }


    private double calculateTotal() {

        return roomCharge + foodCharge + drinkCharge;

    }


    public void addFoodCharge(double amount) {

        foodCharge += amount;

        totalAmount = calculateTotal();

    }


    public void addDrinkCharge(double amount) {

        drinkCharge += amount;

        totalAmount = calculateTotal();

    }


    public void generateInvoice() {

        System.out.println("Invoice for Guest ID: " + guestId);

        System.out.println("Reservation ID: " + reservation.getReservationId());

        System.out.println("Room Charges: $" + roomCharge);

        System.out.println("Food Charges: $" + foodCharge);

        System.out.println("Drink Charges: $" + drinkCharge);

        System.out.println("Total Amount: $" + totalAmount);

    }


}