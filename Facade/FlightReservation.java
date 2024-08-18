package Facade;

class FlightReservation {
    public double bookFlight(String seatClass, String seat) {
        double basePrice = 500.00;
        double price = 0.0;

        switch (seatClass) {
            case "Economy":
                price = basePrice;
                break;
            case "Business":
                price = basePrice * 2.5;
                break;
            case "First":
                price = basePrice * 2.5 * 1.5;
                break;
        }

        System.out.println("Flight booked in " + seatClass + " class, Seat: " + seat + ". Price: R$" + price);
        return price;
    }
}

