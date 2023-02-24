package csc205.project2;

import java.nio.file.Watchable;

public class RectangularPrism extends Shape {
    private double length;
    private double width;
    private double height;

    public RectangularPrism() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;

    }

    public RectangularPrism(double l, double w, double h) {
        super();
        this.length = l;
        this.width = w;
        this.height = h;

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2.0 * ((width * length) + (height * length) + (height * width));
    }

    public double volume() {
        return width * height * length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangular Prism {");
        sb.append("length = ").append(length);
        sb.append(" width = ").append(width);
        sb.append(" height = ").append(height);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();

    }
}
