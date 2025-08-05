class Circle {
    
    private double radius;

    
    public Circle(double radius) {
        this.radius = radius;
    }

     and circumference
    public void computeAndDisplay() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}


public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5.0); // Example radius
        c.computeAndDisplay();
    }
}