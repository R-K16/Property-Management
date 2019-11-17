import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Pay extends JFrame {
    JFrame f;
    JPanel p;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    ImageIcon i;
    Font f2;
    JRadioButton r1,r2,r3,r4;
    ButtonGroup g=new ButtonGroup();
    BorderLayout b;
    JButton b1,b2;
    JTextField tf,tf2,tf3,tf1;
    String UserName;
    JPasswordField tf4;
    ButtonGroup g1=new ButtonGroup();
    Pay( String a)
    {
        UserName=a;
        f=new JFrame("PayMethod");
        f.setSize(851,635);
        f2=new Font("Times New Roman",Font.BOLD,28);
        l= new JLabel("PROPERTIES");
        l.setFont(f2);
        l.setBounds(40,140, 180, 30);
        f.add(l);
        f2=new Font("Times New Roman",Font.BOLD,32);
        l1=new JLabel("Upgrade To View Properties");
        l1.setFont(f2);
        l1.setBounds(300,60,400,40);
        f.add(l1);
        f2=new Font("Times New Roman",Font.BOLD,22);
        l2=new JLabel("Name");
        l2.setFont(f2);
        l2.setBounds(300,150,250,30);
        f.add(l2);
        l4=new JLabel("Card");
        l4.setBounds(300,185,250,30);
        l4.setFont(f2);
        f.add(l4);
        l5=new JLabel("Credit");
        l5.setBounds(530,185,150,28);
        l5.setFont(f2);
        f.add(l5);
        l6=new JLabel("Debit");
        l6.setBounds(620,185,150,28);
        l6.setFont(f2);
        f.add(l6);
        r1=new JRadioButton();
        r1.setBounds(510,190,18,18);
        f.add(r1);
        r2=new JRadioButton();
        r2.setBounds(600,190,18,18);
        f.add(r2);
        g.add(r1);
        g.add(r2);
        l7=new JLabel("Expiry");
        l7.setBounds(300,255,250,30);
        l7.setFont(f2);
        f.add(l7);
        l8=new JLabel("Date/Year");
        l8.setBounds(350,290,250,30);
        l8.setFont(f2);
        f.add(l8);
        l10=new JLabel("Cvv No");
        l10.setBounds(350,325,250,30);
        l10.setFont(f2);
        f.add(l10);
        l11=new JLabel("Plans");
        l11.setBounds(300,360,250,30);
        l11.setFont(f2);
        f.add(l11);
        r4=new JRadioButton();
        r4.setBounds(510,365,18,18);
        f.add(r4);
        r3=new JRadioButton();
        r3.setBounds(510,395,18,18);
        f.add(r3);
        g1.add(r3);
        g1.add(r4);
        l12=new JLabel("500 Coins (Rs. 700 Only)");
        l12.setBounds(530,362,250,25);
        l12.setFont(f2);
        f.add(l12);
        l13=new JLabel("800 Coins (Rs. 1000 Only)");
        l13.setBounds(530,392,250,25);
        l13.setFont(f2);
        f.add(l13);
        tf=new JTextField();
        tf.setBounds(510,150,200,25);
        f.add(tf);
        tf1=new JTextField();
        tf1.setBounds(510,220,200,25);
        f.add(tf1);
        tf2=new JTextField();
        tf2.setBounds(510,290,50,20);
        f.add(tf2);
        tf3=new JTextField();
        tf3.setBounds(570,290,50,20);
        f.add(tf3);
        tf4=new JPasswordField();
        tf4.setBounds(540,325,50,20);
        f.add(tf4);
        l4=new JLabel("Card Number");
        l4.setBounds(300,220,150,30);
        l4.setFont(f2);
        f.add(l4);
        b1=new JButton("Submit");
        b1.setFont(f2);
        b1.setBounds(370,465,110,30);
        f.add(b1);
        b2=new JButton("Clear");
        b2.setFont(f2);
        b2.setBounds(500,465,110,30);
        f.add(b2);
        p=new JPanel();
        p.setAlignmentY(Component.CENTER_ALIGNMENT);
        p.setAlignmentX(Component.CENTER_ALIGNMENT);
        p.setSize(851,635);
        f.add(p,BorderLayout.CENTER);
        l3=new JLabel();
        i=new ImageIcon("D:\\DCIM\\44.jpg");
        i=new ImageIcon(i.getImage().getScaledInstance(851,635,Image.SCALE_REPLICATE));
        l3.setIcon(i);
        getContentPane().add(l3);
        p.add(l3);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                String str2 = e1.getActionCommand();
                if (str2.equals("Submit"))
                {
                    try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
                    }
                    catch(ClassNotFoundException i)
                    {
                        System.out.println(i);
                    }
                    try(
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234"); // MySQL

                            Statement stmt1 = conn.createStatement();

                    )
                    {
                        String Coins="0";
                        if(r3.isSelected()) {
                             Coins ="800";
                        }
                        else
                        {
                             Coins="500";
                        }
                        String query = "update userdetails set Coins ='"+Coins+"' where UserName='"+UserName+"'";
                        Statement st=conn.createStatement();
                        int i=st.executeUpdate(query);
                        String Name=tf.getText();
                        String Card="";
                        String CardNumber=tf1.getText();
                        String ExpiryDate=tf2.getText();
                        String Year=tf3.getText();
                        String CVVNo=tf4.getText();
                        if(r1.isSelected())
                            Card="Credit";
                        if(r2.isSelected())
                            Card="Debit";
                        String sqlInsert = "insert into paying values('"+Name+"','"+Card+"','"+CardNumber+"','"+ExpiryDate+"','"+Year+"','"+CVVNo+"')";
                        int countInserted= stmt1.executeUpdate(sqlInsert);
                        new City(Coins,UserName);
                    }
                    catch (Exception e)
                    {}
                    }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = e.getActionCommand();
                if (str1.equals("Clear"))
                {
                    tf1.setText("");
                    g.clearSelection();
                    g1.clearSelection();
                    tf2.setText("");
                    tf3.setText("");
                    tf.setText("");
                    tf4.setText("");
                }
            }
        });
        f.setLayout(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {

    }
}
