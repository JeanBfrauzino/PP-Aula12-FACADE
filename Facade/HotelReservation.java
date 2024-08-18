package Facade;

class HotelReservation {
    public double bookRoom(String roomType, int numberOfPeople) {
        double basePrice = 200.00;
        double price = 0.0;

        switch (roomType) {
            case "Simple":
                price = basePrice * numberOfPeople;
                break;
            case "Executive":
                price = basePrice * 1.5 * numberOfPeople;
                break;
            case "Presidential Suite":
                price = basePrice * 1.5 * 3 * numberOfPeople;
                break;
        }

        System.out.println("Hotel room booked: " + roomType + ". Price: R$" + price);
        return price;
    }
}

