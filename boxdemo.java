class Box {
    double width, height, depth;

    // Constructor with three parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Default constructor
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor with one parameter
    Box(double len) {
        width = height = depth = len;
    }

    // Method to calculate volume
    void vol() {
        System.out.println("The volume = " + (height * width * depth));
    }
}
class BoxDemo3 {
    public static void main(String[] args) {
        Box b = new Box();
        b.vol();

        Box b1 = new Box(5, 6, 4);
        b1.vol();

        Box b2 = new Box(5);
        b2.vol();
    }
}