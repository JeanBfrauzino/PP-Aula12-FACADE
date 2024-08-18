package Facade;

class PaymentSystem {
    public double processPayment(double amount, String paymentMethod) {
        double finalAmount = amount;

        switch (paymentMethod) {
            case "PIX":
                finalAmount = amount * 0.9;
                System.out.println("Payment via PIX. 10% discount applied.");
                break;
            case "Boleto":
                finalAmount = amount * 0.95;
                System.out.println("Payment via Boleto. 5% discount applied.");
                break;
            case "Debit":
                System.out.println("Payment via Debit. No discount applied.");
                break;
            case "Credit":
                int installments = 6;
                finalAmount = amount * Math.pow(1 + 0.0399, installments);
                System.out.println("Payment via Credit. 3.99% interest per installment.");
                break;
        }

        System.out.println("Total amount to be paid: R$" + finalAmount);
        return finalAmount;
    }
}

