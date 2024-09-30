package Generative_Design_Patterns.Factory_Method;

public class Airplane implements Delivery{
    @Override
    public void deliveryAll() {
        System.out.println("Авиаперевозки грузов");
    }
}
