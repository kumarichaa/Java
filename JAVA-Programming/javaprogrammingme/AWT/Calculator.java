import java.awt.*;
class MyCalculator
{
	Frame f;
	TextField tf;
	MyCalculator(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(150,40,50,30);
		f.add(tf);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyCalculator("Calculator");
	}
}