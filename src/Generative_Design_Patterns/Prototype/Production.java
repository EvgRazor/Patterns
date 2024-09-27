package Generative_Design_Patterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Production {

    public static void main(String[] args) {

        // Пример клонирования shapesCope

        List<Shape> shapesOriginal = new ArrayList<>();
        List<Shape> shapesCope = new ArrayList<>();

        Circle circle = new Circle();
        circle.setRadius(20);
        circle.setColor("Red");
        circle.setX(10);
        circle.setY(15);

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("green");
        rectangle.setX(200);
        rectangle.setY(150);
        rectangle.setWidth(17);
        rectangle.setHeight(27);


        shapesOriginal.add(circle);
        shapesOriginal.add(rectangle);

        // Делаем копии
        Circle circleCopy = (Circle) circle.clone();
        Rectangle rectangleCopy = (Rectangle) rectangle.clone();

        shapesCope.add(circleCopy);
        shapesCope.add(rectangleCopy);

        // Выводим оригиал

        for(Shape shape : shapesCope) {
            if (shape instanceof Circle) {
                System.out.println("Это класс оригинал Circle -> " + shape.hashCode());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Это класс оригинал Rectangle -> " + shape.hashCode());
            }
        }

        System.out.println("----");

        // Выводим копию

        for(Shape shape : shapesOriginal) {
            if (shape instanceof Circle) {
                System.out.println("Это класс копия Circle -> " + shape.hashCode());
            }
            if (shape instanceof Rectangle) {
                System.out.println("Это класс копия Rectangle -> " + shape.hashCode());
            }
        }

    }

}
