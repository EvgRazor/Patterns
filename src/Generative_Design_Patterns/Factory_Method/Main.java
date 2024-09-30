package Generative_Design_Patterns.Factory_Method;

public class Main {

    public static void main(String[] args) {

        String a = "Грузоперевозки";
        String b = "Авиаперевозки грузов";
        String c = "Морские перевозки грузов";
        String d = "Пеший курьер";

        Delivery delivery = new FactoryMethod().test(a);
        delivery.deliveryAll();

    }

}
