import java.awt.*;
class MyFrame2
{
	Frame f;
	TextField tf;
	Button b1;
	Label l;
	MyFrame2(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(40,40,60,30);
		l=new Label("Enter the no.");      
		l.setBounds(40,40,80,20);
		f.add(l);
		
		f.add(tf);
		b1=new Button("ok");
		b1.setBounds(40,100,60,30);
		f.add(b1);
		f.setlayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new MyFrame2(" ");
	}
}