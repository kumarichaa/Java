import java.awt.*;

class DemoFrame2 //via Association
{
Frame f;

DemoFrame2(String s)
{
f=new Frame(s);
f.setSize(400,400);
f.setVisible(true);
}

public static void main(String s[])
{
new DemoFrame2("association");
Frame f=new Frame("Richaaaaaaaaaaaaaaaaaaaa");
f.setSize(200,200);
f.setVisible(true);
}
}



