package Facade;

public class Main {
    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        
        travelFacade.bookPackage(
            "José zé", 
            "123.456.789-00", 
            "First", 
            "1A", 
            "Presidential Suite", 
            2, 
            "Luxury", 
            "PIX"
        );
    }
}

