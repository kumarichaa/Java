package AWT;
import java.awt.*;

class MyFrame extends Frame
{
	MyFrame(String s)
	{
		super(s);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new MyFrame("First frame");
		new MyFrame("Second frame");
		
	}
}