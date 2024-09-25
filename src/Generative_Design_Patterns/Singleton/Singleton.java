package Generative_Design_Patterns.Singleton;

import java.util.Objects;

/*
    Порождающий паттерны - прототип. Один поток
*/
public final class Singleton {

    // 1.
    private static Singleton singleton;

    private String name;
    private String surname;

    // 2.
   private Singleton(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    // 3.
    public static Singleton getSingleton(String name, String surname) {
        if (Objects.isNull(singleton)) {
            singleton = new Singleton(name, surname);
        }
        return singleton;
    }

    // get - для вывода данных
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


}
