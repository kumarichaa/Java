class StaticFinalVariable {
    final static int x = 20;

    public static void main(String... s) {
        // InstanceFinalvariable t=new InstanceFinalvariable();
        int X = x + 10;
        System.out.println(x);
        // InstanceFinalvariable t1=new InstanceFinalvariable();
        // t1.x=t.x+10;
        System.out.println(X);
    }
}