import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

class View_Marks extends Frame
{
    JLabel l1,rl,stdl,ttypel,vtypel,r_nol,usr,da,ins,top;
    Label down;
    TextField r_no,r;
    JButton ext,vtypec,vtypes,ok;
    Font f;
    Dialog d;
    Choice ttype,std;
    Panel p1,p11,p2,p21,p22,p3;
    Rectangle rec;
    String user;
    Getdate  g;
    BufferedImage  image;

    public View_Marks(String s)
    {
                super("Marks View.....");
          	setSize(600,600);
          	setLocation(200, 20);
          	rec=new Rectangle(100,20,600,600);
		setMaximizedBounds(rec);
                setBackground(new Color(50,100,150));
                user=s;

                f=new Font("Serif",Font.PLAIN|Font.BOLD,30);
		l1=new JLabel("Marks Analysis:-");
                l1.setFont(f);
		l1.setForeground(Color.white);

                p1=new Panel(new GridLayout(1,1,2,5));
                p1.setBackground(new Color(0,0,150));
		p11=new Panel(new FlowLayout());
                               
		p11.add(l1);
               
		p1.add(p11);
		

                p2=new Panel(null);
                p2.setBackground(new Color(210,150,230));

                p21=new Panel(null);
                p21.setBackground(Color.red);
                p21.setBounds(0, 0, 760, 35);

                usr=new JLabel(" USER :  "+ s);
                g=new Getdate();
		da=new JLabel(" DATE :  "+ g.date());
                usr.setBounds(5, 5, 350, 20);
                da.setBounds(440, 5, 120, 20);
                p21.add(usr); p21.add(da);

                stdl=new JLabel(" CHOOSE CLASS        : ");
                stdl.setBounds(150, 150, 150, 50);
                std=new Choice();
                std.add("6");std.add("7");std.add("8");std.add("9");
                std.add("10");std.add("11sc");std.add("11com");
                std.add("12sc");std.add("12com");
                std.setBounds(300, 170, 150, 50);
                std.addItemListener(new View_Marks_Event(this));

                ttypel=new JLabel(" TEST TYPE                  : ");
                ttypel.setBounds(150, 200, 150, 50);
                ttype=new Choice();
                ttype.add("SA I");ttype.add("SA II");ttype.add("FA I");
                ttype.add("FA II");ttype.add("FA III");ttype.add("FA IV");
                ttype.setBounds(300, 220, 150, 50);
                ttype.addItemListener(new View_Marks_Event(this));

                vtypel=new JLabel(" VIEW TYPE                  : ");
                vtypel.setBounds(150, 250, 150, 50);
                vtypes=new JButton("Student Wise");
                vtypes.setBounds(170, 330, 120, 30);
                vtypes.addActionListener(new View_Marks_Event(this));

                vtypec=new JButton("Class Wise");
                vtypec.setBounds(370, 330, 120, 30);
                vtypec.addActionListener(new View_Marks_Event(this));

                //============for dialog box
                d=new Dialog(this,"Roll No. : ");
            d.setLayout(null);
            d.addWindowListener(new View_Marks_Event(this));

            rl=new JLabel("Roll No. : ");
            r=new TextField();
            r.addKeyListener(new View_Marks_Event(this));
            ok=new JButton("OK");
            d.setBounds(400, 200, 200, 110);
            rl.setBounds(25, 40, 70, 30);
            r.setBounds(95, 40, 70, 25);
            ok.setBounds(65, 75, 60, 25);
            ok.addActionListener(new View_Marks_Event(this));
            d.addWindowListener(new View_Marks_Event(this));

            d.add(rl);d.add(r);d.add(ok);
            //=========

                
                p2.add(stdl);p2.add(std);
                p2.add(ttypel);p2.add(ttype);
                p2.add(vtypel);p2.add(vtypes);p2.add(vtypec);

                p2.add(p21);
               
                ext=new JButton(" Close ");
                ext.addActionListener(new View_Marks_Event(this));
                              
                p3=new Panel(new FlowLayout());
                p3.setBackground(new Color(100,0,150));

                p3.add(ext);

                setLayout(new BorderLayout());
		add(p1,BorderLayout.NORTH);
                add(p2,BorderLayout.CENTER);
                add(p3,BorderLayout.SOUTH);
                addWindowListener(new View_Marks_Event(this));
                setVisible(true);
    }
        public void paint(Graphics g)
            {
              g.drawImage( image, 250, 215, null);
            }
       public Insets getInsets()
	{
		return new Insets(20,20,20,20);
	}



}


class View_Marks_Event extends WindowAdapter implements ActionListener,KeyListener,FocusListener,ItemListener
{
    View_Marks v;
    int i=0,j=0;
    ResultSet rs;
    String[][] data;
    
    String[] col={"Roll NO.","Hindi","English","Telugu","Maths","Science",
                "S.Studies","Year"};
    String[] col10={"Roll NO.","Hindi","English","Maths",
                "Science","S.Studies","Year"};
    String[] colsc={"Roll NO.","Hindi","English","Comp. Sc.",
                "Maths","Biology","Physics","Chemistry","Year"};
    String[] colcom={"Roll NO.","Hindi","English","Comp. Sc.","B.Studies",
                "Account","Economics","Year"};
    
    
    View_Marks_Event(View_Marks v1)
    {
        this.v=v1;
    }

    public void windowClosing(WindowEvent e)
		{

                    if(e.getSource()==v.d)
                                v.d.dispose();
                    else if(e.getSource()==v)
                    {
                                v.dispose();
				
                    } 
		}
    public void actionPerformed(ActionEvent e)
    {
        String s=null,sql="";
        DB_Connection con;
        String[] head=null;
        
        if (e.getSource()==v.vtypes)
            {
                v.d.setVisible(true);
            }else
        if(e.getSource()==v.ok)
        {
            
            System.out.print(s);
            try {
                con = new DB_Connection();
                Statement stmt=con.DB_Connect();

                sql="select * from marks"+v.std.getSelectedItem()+"_detail "
                        + "where ttype='"+v.ttype.getSelectedItem()+"' and admno='"
                        + v.r.getText()+"';";

                
               if(v.std.getSelectedIndex()<4)
                {
                head=col;
                data=new String[100][head.length];

                 try {
                        rs=stmt.executeQuery(sql);

                         while(rs.next())
                        {
                            data[i][j++]=rs.getString(1);
                            for(int k=3;k<10;k++)
                               data[i][j++]=rs.getString(k);
                            j=0;i++;
                        }i=0;
                        }
                        catch (SQLException ex)
                          {
                               JOptionPane.showMessageDialog(null,"Marks doesn't exists.");
                           }


                }else if(v.std.getSelectedIndex()==4)
                {
                    head=col10;
                    data=new String[100][head.length];
                     try {
                        rs=stmt.executeQuery(sql);

                         while(rs.next())
                        {
                            data[i][j++]=rs.getString(1);
                            for(int k=3;k<9;k++)
                               data[i][j++]=rs.getString(k);
                            j=0;i++;
                        }i=0;
                        }
                        catch (SQLException ex)
                          {
                               JOptionPane.showMessageDialog(null,"Marks doesn't exists.");
                           }


                }else if(v.std.getSelectedIndex()==5||v.std.getSelectedIndex()==7)
                {
                     head=colsc;int c=head.length;
                     data=new String[100][c];
                     try {
                        rs=stmt.executeQuery(sql);
                         while(rs.next())
                        {
                             data[i][j++]=rs.getString(1);
                            for(int k=3;k<11;k++)
                            {
                               data[i][j++]=rs.getString(k);
                            }
                            j=0;i++;

                        }
                        }
                        catch (SQLException ex)
                          {
                               JOptionPane.showMessageDialog(null,"Marks doesn't exists.");
                           }
                 }else if(v.std.getSelectedIndex()==6||v.std.getSelectedIndex()==8)
                {
                    head=colcom;
                     data=new String[100][head.length];
                    try {
                        rs=stmt.executeQuery(sql);
                         while(rs.next())
                        {
                             data[i][j++]=rs.getString(1);
                            for(int k=3;k<10;k++)
                               data[i][j++]=rs.getString(k);
                            j=0;i++;
                        }
                        }
                        catch (SQLException ex)
                          {
                               JOptionPane.showMessageDialog(null,"Marks doesn't exists.");
                           }

                 }

                } catch (connection_error ex)
            {
                JOptionPane.showMessageDialog(null,"Error in Connection!!");
            }
            v.d.dispose();
            new table(head,data);

        }else
         if(e.getSource()==v.ext)
        {
            v.dispose();
            
        }else
            if(e.getSource()==v.vtypec)
            {
                try {
                con = new DB_Connection();
                Statement stmt=con.DB_Connect();

                sql="select * from marks"+v.std.getSelectedItem()+"_detail "
                        + "where ttype='"+v.ttype.getSelectedItem()+"';";

                
               if(v.std.getSelectedIndex()<4)
                {i=0;j=0;
                head=col;
                data=new String[100][head.length];

                 try {
                        rs=stmt.executeQuery(sql);

                         while(rs.next())
                        {
                            data[i][j++]=rs.getString(1);
                            for(int k=3;k<10;k++)
                               data[i][j++]=rs.getString(k);
                            j=0;i++;
                        }
                        }
                        catch (SQLException ex)
                          {
                               JOptionPane.showMessageDialog(null,"Marks doesn't exists.");
                           }


                }else if(v.std.getSelectedIndex()==4)
                {i=0;j=0;
                    head=col10;
                    data=new String[100][head.length];
                     try {
                        rs=stmt.executeQuery(sql);

                         while(rs.next())
                        {
                            data[i][j++]=rs.getString(1);
                            for(int k=3;k<9;k++)
                               data[i][j++]=rs.getString(k);
                            j=0;i++;
                        }i=0;
                        }
                        catch (SQLException ex)
                          {
                               JOptionPane.showMessageDialog(null,"Marks doesn't exists.");
                           }


                }else if(v.std.getSelectedIndex()==5||v.std.getSelectedIndex()==7)
                {i=0;j=0;
                     head=colsc;int c=head.length;
                     data=new String[100][c];
                     try {
                        rs=stmt.executeQuery(sql);
                         while(rs.next())
                        {
                             data[i][j++]=rs.getString(1);
                            for(int k=3;k<11;k++)
                            {
                               data[i][j++]=rs.getString(k);
                            }
                            j=0;i++;

                        }
                        }
                        catch (SQLException ex)
                          {
                               JOptionPane.showMessageDialog(null,"Marks doesn't exists.");
                           }
                 }else if(v.std.getSelectedIndex()==6||v.std.getSelectedIndex()==8)
                {i=0;j=0;
                    head=colcom;
                     data=new String[100][head.length];
                    try {
                        rs=stmt.executeQuery(sql);

                         while(rs.next())
                        {
                             data[i][j++]=rs.getString(1);
                            for(int k=3;k<10;k++)
                               data[i][j++]=rs.getString(k);
                            j=0;i++;
                        }
                        }
                        catch (SQLException ex)
                          {
                               JOptionPane.showMessageDialog(null,"Marks doesn't exists.");
                           }

                 }

                } catch (connection_error ex)
            {
                JOptionPane.showMessageDialog(null,"Error in Connection!!");
            }
               
                    
                    new table(head,data);
                
            }
    }


    public void keyTyped(KeyEvent e) {

    }


    public void keyPressed(KeyEvent e)
    {
         int key=e.getKeyCode();
            if(e.getSource()==v.r)
            if((key>=48&&key<=57)||key==8||(key>=96&&key<=105))
                 v.r.setEditable(true);
            else
                v.r.setEditable(false);


    }


    public void keyReleased(KeyEvent e) {

    }


    public void focusGained(FocusEvent e) {

    }


    public void focusLost(FocusEvent e) {

    }


    public void itemStateChanged(ItemEvent e)
    { 
        



    }

}