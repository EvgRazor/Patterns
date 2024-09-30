package Generative_Design_Patterns.Factory_Method;

public class Auto implements Delivery{
    @Override
    public void deliveryAll() {
        System.out.println("Грузоперевозки");
    }
}
