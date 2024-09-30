package Generative_Design_Patterns.Factory_Method;

public class Sea implements Delivery {

    @Override
    public void deliveryAll() {
        System.out.println("Морские перевозки грузов");
    }
}
