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

        Thread thread_1 = new Thread(new OneClass());
        Thread thread_2 = new Thread(new TwoClass());

        thread_1.start();
        thread_2.start();

    }

    /* Singleton для многопоточки */

    static class OneClass implements Runnable {
        @Override
        public void run() {
           Singleton_stream singleton_stream_1 = Singleton_stream.getInstance(1, 25);
           System.out.println(singleton_stream_1.getId() + " " + singleton_stream_1.getAge());
        }
    }

    static class TwoClass implements Runnable {
        @Override
        public void run() {
            Singleton_stream singleton_stream_2 = Singleton_stream.getInstance(100, 99);
            System.out.println(singleton_stream_2.getId() + " " + singleton_stream_2.getAge());
        }
    }

}
