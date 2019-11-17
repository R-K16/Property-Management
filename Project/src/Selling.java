import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Selling extends JFrame {
    JFrame f;
    JPanel p;
    JLabel l13,l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
    ImageIcon i;
    JTextField tf,tf1,tf2,tf3,tf4,tf5,tf6;
    Font f2;
    JButton jb,jb1,jb2;
    JComboBox cb,cb1;
    JRadioButton r1,r2;
    ButtonGroup g=new ButtonGroup();
    BorderLayout b =new BorderLayout();
    Selling()
    {
        f = new JFrame();
        f.setTitle("Sale");
        f.setSize(851, 635);
        f2=new Font("Times New Roman",Font.BOLD,28);
        l= new JLabel("PROPERTIES");
        l.setFont(f2);
        l.setBounds(40,140, 180, 30);
        f.add(l);
        f2=new Font("Times New Roman",Font.BOLD,18);
        l1 = new JLabel("Owner Name");
        l1.setFont(f2);
        l1.setBounds(340, 60, 130, 25);
        f.add(l1);
        tf = new JTextField();
        tf.setBounds(500, 60, 155, 22);
        f.add(tf);
        l2 = new JLabel("Contact No.");
        l2.setFont(f2);
        l2.setBounds(340, 95, 130, 25);
        f.add(l2);
        tf1 = new JTextField();
        tf1.setBounds(500, 95, 155, 22);
        f.add(tf1);
        l4 = new JLabel("Plot Area(in sqft.)");
        l4.setFont(f2);
        l4.setBounds(340, 125, 150, 25);
        f.add(l4);
        tf2 = new JTextField();
        tf2.setBounds(500, 125, 155, 22);
        f.add(tf2);
        l5 = new JLabel("Location");
        l5.setFont(f2);
        l5.setBounds(340, 155, 130, 25);
        f.add(l5);
        tf3 = new JTextField();
        tf3.setBounds(500, 155, 155, 22);
        f.add(tf3);
        l6 = new JLabel("LandMark");
        l6.setFont(f2);
        l6.setBounds(340, 185, 130, 25);
        f.add(l6);
        l13= new JLabel("City");
        l13.setFont(f2);
        l13.setBounds(340, 215, 130, 25);
        f.add(l13);
        String s1[]={"","Chandigarh","Jalandhar","Kapurthala"};
        cb1=new JComboBox(s1);
        cb1.setBounds(500,215,155,22);
        f.add(cb1);
        tf4 = new JTextField();
        tf4.setBounds(500, 185, 155, 22);
        f.add(tf4);
        l7 = new JLabel("Floors");
        l7.setFont(f2);
        l7.setBounds(340, 245, 130, 25);
        f.add(l7);
        String s11[]={"","Ground Floor","First Floor","Second Floor","Single Story","Double Story","Triple Story","Top Floor"};
        cb=new JComboBox(s11);
        cb.setBounds(500,245,155,22);
        f.add(cb);
        l8 = new JLabel("Bedrooms");
        l8.setFont(f2);
        l8.setBounds(340, 275, 130, 25);
        f.add(l8);
        tf5 = new JTextField();
        tf5.setBounds(500, 275, 155, 22);
        f.add(tf5);
        r1=new JRadioButton();
        r1.setBounds(510,305,18,18);
        f.add(r1);
        r2=new JRadioButton();
        r2.setBounds(570,305,18,18);
        f.add(r2);
        g.add(r1);
        g.add(r2);
        l9 = new JLabel("Furnished");
        l9.setFont(f2);
        l9.setBounds(340, 305, 130, 25);
        f.add(l9);
        l11 = new JLabel("Yes");
        l11.setFont(f2);
        l11.setBounds(530, 300, 60, 25);
        f.add(l11);
        l12 = new JLabel("No");
        l12.setFont(f2);
        l12.setBounds(590, 300, 60, 25);
        f.add(l12);
        l10 = new JLabel("Sale Price(in Rs.)");
        l10.setFont(f2);
        l10.setBounds(340, 335, 150, 25);
        f.add(l10);
        tf6 = new JTextField();
        tf6.setBounds(500, 335, 155, 22);
        f.add(tf6);
        jb = new JButton("Submit");
        jb.setFont(f2);
        jb.setBounds(420, 380, 90, 30);
        f.add(jb);
        jb1 = new JButton("Clear");
        jb1.setFont(f2);
        jb1.setBounds(530, 380, 90, 30);
        f.add(jb1);
        jb2 = new JButton("Logout");
        jb2.setFont(f2);
        jb2.setBounds(475, 415, 100, 30);
        f.add(jb2);
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
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e2) {
                String str =  e2.getActionCommand();
                if (str.equals("Submit"))
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
                        String OwnerName=tf.getText();
                        String ContactNo=tf1.getText();
                        String PlotArea=tf2.getText();
                        String Location=tf3.getText();
                        String LandMark=tf4.getText();
                        String City= (String)cb1.getItemAt(cb1.getSelectedIndex());
                        String Floors= (String)cb.getItemAt(cb.getSelectedIndex());
                        String BedRooms=tf5.getText();
                        String SalePrice=tf6.getText();
                        String Furnished="";
                        if(r1.isSelected())
                            Furnished="Yes";
                        if(r2.isSelected())
                            Furnished="No";
                        String sqlInsert = "insert into properties values('"+OwnerName+"','"+ContactNo+"','"+PlotArea+"','"+Location+"','"+LandMark+"','"+Floors+"','"+BedRooms+"','"+Furnished+"','"+SalePrice+"','"+City+"')";
                        int countInserted= stmt1.executeUpdate(sqlInsert);
                        System.out.println(countInserted + " records inserted.\n");
                    }
                    catch(SQLException ie)
                    {
                        System.out.println(ie);
                    }
                    if(tf.getText()!=""&&tf1.getText()!=""&&tf3.getText()!=""&&tf4.getText()!=""&&tf5.getText()!=""&&tf6.getText()!="")
                    {
                        JOptionPane.showMessageDialog(null, "Enter full details");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Successfully Submitted");
                    }
                }
            }
        });
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str1 = e.getActionCommand();
                if (str1.equals("Clear"))
                {
                    tf1.setText("");
                    g.clearSelection();
                    tf2.setText("");
                    tf3.setText("");
                    tf.setText("");
                    cb.setSelectedItem("");
                    cb1.setSelectedItem("");
                    tf5.setText("");
                    tf6.setText("");
                    tf4.setText("");
                }
            }
        });
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        f.setLayout(b);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

            }
        });

    }
}
