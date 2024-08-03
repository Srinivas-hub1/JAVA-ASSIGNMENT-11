public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculateVolume();
}
public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }
}
public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double calculateVolume() {
        return (1/3) * Math.PI * Math.pow(radius, 2) * height;
    }
}
public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cone cone = new Cone(3, 7);
        Cylinder cylinder = new Cylinder(2, 10);
        System.out.println("Sphere:");
        System.out.println("Area: " + sphere.calculateArea());
        System.out.println("Volume: " + sphere.calculateVolume());

        System.out.println("\nCone:");
        System.out.println("Area: " + cone.calculateArea());
        System.out.println("Volume: " + cone.calculateVolume());
        System.out.println("\nCylinder:");
        System.out.println("Area: " + cylinder.calculateArea());
        System.out.println("Volume: " + cylinder.calculateVolume());
    }
}