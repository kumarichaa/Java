class ParameterizedConstructor {
    int x;
    int y;

    ParameterizedConstructor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void show() {
        System.out.println(x);
        System.out.println(y);
    }

public static void main(String... s)
{
ParameterizedConstructor p1 = new ParameterizedConstructor(10, 20);
p1.show();
ParameterizedConstructor p2 = new ParameterizedConstructor(100, 200);
p2.show();
}

}