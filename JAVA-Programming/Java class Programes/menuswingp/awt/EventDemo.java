import java.awt.*;
import java.awt.event.*;
class EventDemo implements ActionListener 
{
Frame f;
Button b,b1;
TextField tf;
	EventDemo(String s)
	{	
		f=new Frame(s);
		b=new Button("ok");
		b1=new Button("cancel");
		b.setBounds(20,100,40,40);
		b1.setBounds(20,180,40,40);
	     
		b.addActionListener(this);
		b1.addActionListener(this);


		f.add(b);
		f.add(b1);
		tf=new TextField();

		tf.setBounds(20,40,100,40);
		f.add(tf);

		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);

	}

public void actionPerformed(ActionEvent e)
{
System.out.println("ap");
if(e.getSource()==b)
tf.setText("ok");
if(e.getSource()==b1)
{
tf.setText("cancel");
}
}
public static void main(String s[])
{
new EventDemo("event demo");
}
}





class Outer implements ActionListener 
{
EventDemo f;
Outer(EventDemo f)
{
this.f=f;
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==f.b)
f.tf.setText("lalu");
if(e.getSource()==f.b1)
f.tf.setText("rabari");
}
}





class WindowEventListener extends WindowAdapter
{
public void windowClosing(WindowEvent e1)
{
System.exit(0);
}

}
class MouseEventListener extends MouseAdapter
{
EventDemo t;
MouseEventListener(EventDemo f)
{
this.t=f;
}
public void mouseClicked(MouseEvent e1)
{
t.tf.setText("MouseEvent");
t.f.setBackground(Color.RED);
}
}
class KeyEventListener extends KeyAdapter
{
public void keyTyped(KeyEvent e)
{

System.out.println(e.getKeyChar());   

}
}





//tf.addKeyListener(new KeyEventListener());



//f.addWindowListener(new WindowEventListener());
//f.addMouseListener(new MouseEventListener(this));






















