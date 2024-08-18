package Facade;

class TravelFacade {
    private FlightReservation flightReservation;
    private HotelReservation hotelReservation;
    private CarRental carRental;
    private PaymentSystem paymentSystem;

    public TravelFacade() {
        this.flightReservation = new FlightReservation();
        this.hotelReservation = new HotelReservation();
        this.carRental = new CarRental();
        this.paymentSystem = new PaymentSystem();
    }

    public void bookPackage(String customerName, String customerCPF, String seatClass, String seat, 
                            String roomType, int numberOfPeople, String carType, String paymentMethod) {
        System.out.println("Booking package for " + customerName + " (CPF: " + customerCPF + ")");
        
        double flightCost = flightReservation.bookFlight(seatClass, seat);
        double hotelCost = hotelReservation.bookRoom(roomType, numberOfPeople);
        double carCost = carRental.rentCar(carType);
        
        double totalCost = flightCost + hotelCost + carCost;
        double finalCost = paymentSystem.processPayment(totalCost, paymentMethod);
        
        System.out.println("Booking complete. Total cost: R$" + finalCost);
    }
}
