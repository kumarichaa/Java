class RConstructor {
    int x;
    int y;

    RConstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String... s) {
        RConstructor r1 = new RConstructor(10, 20);
        r1.show();
        RConstructor r2 = new RConstructor(100, 200);
        r2.show();
    }
}