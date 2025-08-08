Class A {
    int i, j;
    void showij() {
        System.out.println("i & j = " + i + " " + j);
    }
}

Class B extends A {
    int k;
    void showk() {
        System.out.println("i & j in B, K = " + i + " " + j + " " + k);
    }
}

public class inher {
    public static void main(String args[]) {
        B ob = new B();
        ob.i = 1;
        ob.j = 2;
        ob.k = 3;
        ob.showij();
        ob.showk();
    }
}
