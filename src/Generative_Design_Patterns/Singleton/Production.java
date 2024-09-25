package Generative_Design_Patterns.Singleton;

public class Production {

    public static void main(String[] args) {

        // Создаем наш Singleton.
        Singleton singleton = Singleton.getSingleton("MyName", "MySurname");
        Singleton singleton2 = Singleton.getSingleton("MyName2", "MySurname2");

        // Проверяем -> singleton
        System.out.println("singleton -> name = " + singleton.getName()); // singleton -> name = MyName
        System.out.println("singleton -> surname = " + singleton.getSurname()); // singleton -> surname = MySurname

        // Проверяем -> singleton2
        System.out.println("singleton2 -> name = " + singleton2.getName()); // singleton -> name = MyName
        System.out.println("singleton2 -> surname = " + singleton2.getSurname()); // singleton -> surname = MySurname

        // singleton2 не отработает, т.к. наш метод getSingleton() проверяет ссылку на NULL.
        // Если не NULL то вернется ссылка ранее созданая.


    }

}
