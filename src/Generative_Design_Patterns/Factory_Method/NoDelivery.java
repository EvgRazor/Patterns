package Generative_Design_Patterns.Factory_Method;

public class NoDelivery implements Delivery{
    @Override
    public void deliveryAll() {
        System.out.println("По данному напровлению доставки нет!");
    }
}
