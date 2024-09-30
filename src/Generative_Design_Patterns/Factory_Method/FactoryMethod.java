package Generative_Design_Patterns.Factory_Method;

/*
    Порождающий паттерны - фабричный метод
*/

public class FactoryMethod {

    public Delivery test (String flag) {
        switch (flag) {
            case "Грузоперевозки" -> {
                return new Auto();
            }
            case "Авиаперевозки грузов" -> {
                return new Airplane();
            }
            case "Морские перевозки грузов" -> {
                return new Sea();
            }
            default -> {
                return new NoDelivery();
            }
        }
    }

}
