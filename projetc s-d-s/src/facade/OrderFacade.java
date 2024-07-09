package facade;

public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String item, int amount) {
        if (inventoryService.checkStock(item)) {
            paymentService.processPayment(amount);
            shippingService.shipItem(item);
            System.out.println("Order placed for " + item);
        } else {
            System.out.println("Item out of stock");
        }
    }
}
