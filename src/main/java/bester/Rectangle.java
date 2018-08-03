package bester;

import java.util.Objects;

public class Rectangle implements Bestful{
    private double length;
    private double breadth;

    public Rectangle(double breadth, double length) {
        this.breadth = breadth;
        this.length = length;
    }

    public double area() {
        return length * breadth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.breadth, breadth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area());
    }


    @Override
    public boolean compareTo(Bestful bestful) {
        return area()>bestful.hashCode();
    }
}
