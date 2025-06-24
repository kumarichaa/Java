import java.awt.*;
class Calculator
{
	frame f;
	Label l;
	Button b1;
	TextField tf;
	Calculator(String s,int i,int j)
	{
		
		f=new frame(s);
		tf=new TextField();
		tf.setBounds(40,40,60,30);
		f.add(tf);
		b1=new Button("1","2","3","4","5","6","7","8","9","0","+","-","*","/","%");
		f.add(b1);
		setSize(i,j);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new Calculator("calculator",400,400);
		
		
	}
}