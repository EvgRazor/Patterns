package Generative_Design_Patterns.Prototype;

import java.util.Objects;

public class Circle extends Shape{

    private int radius;

    public Circle () {

    }

    public Circle (Circle circle) {
        if(Objects.nonNull(circle)) {
            this.radius = circle.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
