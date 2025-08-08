package module2;
class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    Box(double len) {
        width = height = depth = len;
    }
    void vol() {
        System.out.println("The volume = " + (height * width * depth));
    }
}
class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();
        b.vol();
        Box b1 = new Box(5, 6, 4);
        b1.vol();
        Box b2 = new Box(5);
        b2.vol();
    }
}

