package Facade;

class CarRental {
    public double rentCar(String carType) {
        double basePrice = 150.00;
        double price = 0.0;

        switch (carType) {
            case "Economy":
                price = basePrice;
                break;
            case "Executive":
                price = basePrice * 2;
                break;
            case "Luxury":
                price = basePrice * 2 * 2;
                break;
        }

        System.out.println("Car rented: " + carType + ". Price: R$" + price);
        return price;
    }
}
