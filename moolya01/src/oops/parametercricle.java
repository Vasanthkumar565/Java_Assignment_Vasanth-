package oops;

interface Shape {
    double area();

    double perimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override

    public double area() {

        double areaofcricle = Math.PI * radius * radius;
        return areaofcricle;
    }

    @Override

    public double perimeter() {
        double perimeterofcricle = 2 * Math.PI * radius;
        return perimeterofcricle;
    }

}

class Cylinder implements Shape {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        double areaofcylinder = 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
        return areaofcylinder;
    }

    //2(2r + h) or 4r + 2h.
    @Override
    public double perimeter() {
        double perimterofcylinder = 4 * radius + 2 * height;
        // double perimterofcylinder = 2*(2*radius+height);
        return perimterofcylinder;
    }
}


public class parametercricle {
    public static void main(String[] args) {
        Circle cr = new Circle(7);
        System.out.println("Circle area: " + cr.area());
        System.out.println("Circle perimeter: " + cr.perimeter());

        Cylinder cyl = new Cylinder(7, 11);
        System.out.println("\n" + "Cylinder area: " + cyl.area());
        System.out.println("Cylinder perimeter: " + cyl.perimeter());
    }
}
