//Code will be Provided soon!!

public interface PaymentStrategy {
    void pay(double amount);
}
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}


public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}


public class BitcoinPayment implements PaymentStrategy {
    private String walletAddress;

    public BitcoinPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin wallet: " + walletAddress);
    }
}

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Double> items;
    private PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(double price) {
        items.add(price);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout() {
        double total = items.stream().mapToDouble(Double::doubleValue).sum();
        paymentStrategy.pay(total);
    }
}


public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        cart.addItem(25.50);
        cart.addItem(15.75);

        // Payment with Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout();

        // Payment with PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout();

        // Payment with Bitcoin
        cart.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout();
    }
}
