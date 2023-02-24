package csc205.project2;

public class Driver {

    public static void main(String[] args) {

        Sphere sphere = new Sphere(2.0);
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        Cone cone = new Cone(5.0, 2.0);
        RectangularPrism rectangularPrism = new RectangularPrism(3.5, 7.0, 4.0);


        System.out.println(sphere);
        System.out.println(cylinder);
        System.out.println(cone);
        System.out.println(rectangularPrism);

    }
}
