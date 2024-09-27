package Generative_Design_Patterns.Prototype;

import java.util.Objects;

public class Rectangle extends Shape{

    public int width;
    public int height;

    public Rectangle () {

    }

    public Rectangle (Rectangle rectangle) {
        if (Objects.nonNull(rectangle)) {
            this.height = rectangle.height;
            this.width = rectangle.width;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
