import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Start extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    JFrame f;
    JLabel l, l1, l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JButton b,b1,b2;
    JTextField tf,tf1,tf2,tf3,tf4;
    JPasswordField pf,pf1,pf2;
    ImageIcon i;
    JTextArea ta;
    JComboBox cb;
    JPanel p,p1;
    JRadioButton r1,r2;
    String Coins="0";
    Font f2;
    BorderLayout b3= new BorderLayout();
    ButtonGroup g=new ButtonGroup();
    ButtonGroup g1=new ButtonGroup();
    Start() {
        f = new JFrame();
        f.setTitle("Welcome to Infinity Property");
        f.setSize(1375, 735);
        p=new JPanel();
        p.setSize(1375,735);
        f2=new Font("Times New Roman",Font.BOLD,40);
        l1=new JLabel("PROPERTIES");
        l1.setFont(f2);
        l1.setBounds(200,175,300,100);
        f.add(l1);
        f2=new Font("Times New Roman",Font.BOLD,32);
        l3 = new JLabel("Create New Account");
        l3.setFont(f2);
        l3.setBounds(852, 150, 300, 40);
        f.add(l3);
        f2=new Font("Times New Roman",Font.BOLD,18);
        l1= new JLabel("UserName");
        l1.setFont(f2);
        l1.setBounds(855, 20, 80, 80);
        f.add(l1);
        l2 = new JLabel("Password");
        l2.setFont(f2);
        l2.setBounds(1015, 20, 80, 80);
        f.add(l2);
        l4 = new JLabel("Name");
        l4.setFont(f2);
        l4.setBounds(855, 230, 80, 25);
        f.add(l4);
        l11=new JLabel("Gender");
        l11.setBounds(855,260,80,25);
        l11.setFont(f2);
        f.add(l11);
        l14=new JLabel("UserName");
        l14.setBounds(855,290,80,25);
        l14.setFont(f2);
        f.add(l14);
        l12=new JLabel("Male");
        l12.setBounds(1045,260,60,20);
        l12.setFont(f2);
        f.add(l12);
        l13=new JLabel("Female");
        l13.setBounds(1120,260,60,20);
        l13.setFont(f2);
        f.add(l13);
        r1=new JRadioButton();
        r1.setBounds(1025,260,18,18);
        f.add(r1);
        r2=new JRadioButton();
        r2.setBounds(1100,260,18,18);
        f.add(r2);
        g.add(r1);
        g.add(r2);
        l5 = new JLabel("Phone no.");
        l5.setFont(f2);
        l5.setBounds(855, 350, 80, 25);
        f.add(l5);
        l6 = new JLabel("Email");
        l6.setFont(f2);
        l6.setBounds(855, 320, 80, 25);
        f.add(l6);
        l10 = new JLabel("City");
        l10.setFont(f2);
        l10.setBounds(855, 380, 70, 25);
        f.add(l10);
        l7 = new JLabel("Address");
        l7.setFont(f2);
        l7.setBounds(855, 410, 80, 25);
        f.add(l7);
        l8 = new JLabel("Password");
        l8.setFont(f2);
        l8.setBounds(855, 510, 80, 25);
        f.add(l8);
        l9 = new JLabel("Confirm Password");
        l9.setFont(f2);
        l9.setBounds(855, 540, 160, 25);
        f.add(l9);
        f2=new Font("Times New Roman",Font.BOLD,15);
        b = new JButton("Log In");
        b.setFont(f2);
        b.setBounds(1225, 65, 90, 30);
        f.add(b);
        b1 = new JButton("Sign Up");
        b1.setFont(f2);
        b1.setBounds(915, 600, 90, 30);
        f.add(b1);
        b2 = new JButton("Reset");
        b2.setFont(f2);
        b2.setBounds(1045, 600, 90, 30);
        f.add(b2);
        tf = new JTextField();
        tf.setBounds(855, 70, 145, 22);
        f.add(tf);
        pf = new JPasswordField();
        pf.setBounds(1015, 70, 145, 22);
        f.add(pf);
        tf1 = new JTextField();
        tf1.setBounds(1025, 230, 145, 22);
        f.add(tf1);
        tf2 = new JTextField();
        tf2.setBounds(1025, 290, 145, 22);
        f.add(tf2);
        tf3 = new JTextField();
        tf3.setBounds(1025, 320, 145, 22);
        f.add(tf3);
        tf4 = new JTextField();
        tf4.setBounds(1025, 350, 145, 22);
        f.add(tf4);
        String s[]={"","Chandigarh","Jalandhar","Kapurthala"};
        cb=new JComboBox(s);
        cb.setBounds(1025,380,140,22);
        f.add(cb);
        ta=new JTextArea();
        ta.setBounds(1025,410,150,90);
        f.add(ta);
        pf1 = new JPasswordField();
        pf1.setBounds(1025, 510, 145, 22);
        f.add(pf1);
        pf2 = new JPasswordField();
        pf2.setBounds(1025, 540, 145, 22);
        f.add(pf2);
        l3=new JLabel();
        i=new ImageIcon("D:\\DCIM\\40.jpg");
        i=new ImageIcon(i.getImage().getScaledInstance(1375,735,Image.SCALE_REPLICATE));
        l3.setIcon(i);
        getContentPane().add(l3);
        p.add(l3);
        f.add(p);
        b2.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     String str1 = e.getActionCommand();
                     if (str1.equals("Reset")) {
                         tf1.setText("");
                         g.clearSelection();
                         tf2.setText("");
                         tf3.setText("");
                         ta.setText("");
                         cb.setSelectedItem("");
                         pf2.setText("");
                         pf1.setText("");
                         tf4.setText("");
                     }
                 }
             });
             b.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e1) {
                     String str2 = e1.getActionCommand();
                     if (str2.equals("Log In")) {
                         try {
                             boolean h = false;
                             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
                             String UserName = tf.getText();
                             String Password = pf.getText();
                             String Coins = "";
                             if (UserName != "" && Password != "") {
                                 try {
                                     String sql = "select * from userdetails where UserName='" + UserName + "' and Password='" + Password + "'";
                                     Statement statement = conn.createStatement();
                                     ResultSet myresult = statement.executeQuery(sql);
                                     while (myresult.next()) {
                                         String hello = myresult.getString("UserName");
                                         String hi = myresult.getString("Coins");
                                         System.out.println(hello);
                                         System.out.println(hi);
                                         Coins = hi;
                                         h = true;
                                     }
                                     if (h == true) {
                                         new BuySell(UserName, Coins);
                                     } else
                                         JOptionPane.showMessageDialog(null, "Invalid UserName or Password");
                                 } catch (Exception e) {
                                 } finally {
                                     conn.close();
                                 }
                             }
                         } catch (Exception ei) {
                         }
                     }
                 }
             });
             b1.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e2) {
                     String str = e2.getActionCommand();
                     if (str.equals("Sign Up")) {
                         try {
                             Class.forName("com.mysql.jdbc.Driver");
                         } catch (ClassNotFoundException i) {
                             System.out.println(i);
                         }
                         try (
                                 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234"); // MySQL

                                 Statement stmt1 = conn.createStatement();
                         ) {
                             String Gender = "";
                             String Name = tf1.getText();
                             String PhoneNo = tf4.getText();
                             String Email = tf3.getText();
                             String Address = ta.getText();
                             if (r1.isSelected())
                                 Gender = "Male";
                             if (r2.isSelected())
                                 Gender = "Female";
                             String City = (String) cb.getItemAt(cb.getSelectedIndex());
                             String Coins = "0";
                             String UserName = tf2.getText();
                             String Password = pf1.getText();
                             String sqlInsert = "insert into UserDetails values('" + UserName + "','" + Name + "','" + Gender + "','" + PhoneNo + "','" + Email + "','" + Address + "','" + City + "','" + Coins + "','" + Password + "')";
                             int countInserted = stmt1.executeUpdate(sqlInsert);
                             System.out.println(countInserted + " records inserted.\n");
                         } catch (SQLException ie) {
                             System.out.println(ie);
                         }

                          if (tf1.getText() == "" && tf4.getText() == "" && tf3.getText() == "" && ta.getText() == "" && pf1.getText() == "" && tf2.getText() == ""&&pf2.getText()=="") {
                              BuySell bs = new BuySell(tf2.getText(), Coins);
                          } else
                              JOptionPane.showMessageDialog(null, "Enter full details");
                     }
                 }
             });
        f.setLayout(b3);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Start s=new Start();
            }
        });
    }
}
