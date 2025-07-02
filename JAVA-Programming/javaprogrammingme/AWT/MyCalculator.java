package AWT;
import java.awt.*;
class MyCalculator
{
	Frame f;
	TextField tf;
	//Label l;
	Button b;
	MyCalculator(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(50,50,300,30);
		f.add(tf);
		//l=new Label("1");
		//l.setBounds(40,40,80,30);
		//f.add(l);
		b=new Button("1/x");
		b.setBounds(50,100,50,30);
		f.add(b);
		b=new Button("x2");
		b.setBounds(120,100,50,30);
		f.add(b);
		b=new Button("x3");
		b.setBounds(180,100,50,30);
		f.add(b);
		b=new Button("%");
		b.setBounds(250,100,50,30);
		f.add(b);
		b=new Button("7");
		b.setBounds(50,150,50,30);
		f.add(b);
		b=new Button("8");
		b.setBounds(120,150,50,30);
		f.add(b);
		b=new Button("9");
		b.setBounds(180,150,50,30);
		f.add(b);
		b=new Button("*");
		b.setBounds(250,150,50,30);
		f.add(b);
		b=new Button("4");
		b.setBounds(50,200,50,30);
		f.add(b);
		b=new Button("5");
		b.setBounds(120,200,50,30);
		f.add(b);
		b=new Button("6");
		b.setBounds(180,200,50,30);
		f.add(b);
		b=new Button("-");
		b.setBounds(250,200,50,30);
		f.add(b);
		b=new Button("3");
		b.setBounds(50,250,50,30);
		f.add(b);
		b=new Button("2");
		b.setBounds(120,250,50,30);
		f.add(b);
		b=new Button("1");
		b.setBounds(180,250,50,30);
		f.add(b);
		b=new Button("+");
		b.setBounds(250,250,50,30);
		f.add(b);
		b=new Button("/");
		b.setBounds(50,300,50,30);
		f.add(b);
		b=new Button("0");
		b.setBounds(120,300,50,30);
		f.add(b);
		b=new Button(".");
		b.setBounds(180,300,50,30);
		f.add(b);
		b=new Button("=");
		b.setBounds(250,300,50,30);
		f.add(b);
		
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new MyCalculator("Calculator");
		
	}
}
