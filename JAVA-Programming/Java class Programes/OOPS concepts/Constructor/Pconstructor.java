class PConstructor {
    int x;
    int y;

    PConstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String... s) {
        PConstructor p1 = new PConstructor(10, 20);
        p1.show();
        PConstructor p2 = new PConstructor(100, 200);
        p2.show();
    }

}