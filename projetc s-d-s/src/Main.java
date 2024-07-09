import singleton.Singleton;
import strategy.*;
import facade.OrderFacade;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();


        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Item("Book", 10));
        cart.addItem(new Item("Pen", 5));

        PaymentStrategy creditCard = new CreditCardStrategy("1234-5678-9876-5432");
        cart.pay(creditCard);

        PaymentStrategy payPal = new PayPalStrategy("myemail@example.com");
        cart.pay(payPal);


        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("Laptop", 1500);
    }
}
