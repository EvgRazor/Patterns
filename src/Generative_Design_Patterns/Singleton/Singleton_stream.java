package Generative_Design_Patterns.Singleton;

/*
    Порождающий паттерны - прототип. В многопоточной среде
*/

import java.util.Objects;

public final class Singleton_stream {
    // Поле обязательно должно быть объявлено volatile. Запрещает кешировать данные в патоки
    private volatile static Singleton_stream singleton_stream;

    private int id;
    private int age;

    private Singleton_stream(int id, int age) {
        this.id = id;
        this.age = age;
    }

    public static Singleton_stream getInstance(int id, int age) {

        Singleton_stream result = singleton_stream;
        if (Objects.nonNull(singleton_stream)) {
            return result;
        }
        // Захват монитора, при таком подходе первая нить начинает рабоать с объектом, остальные в стадии блокировки.
        synchronized (Singleton_stream.class) {
            if (Objects.isNull(singleton_stream)) {
                singleton_stream = new Singleton_stream(id, age);
            }
        }
        return singleton_stream;

    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
}
