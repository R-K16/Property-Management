import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class City extends JFrame {
    JFrame jf;
    JButton jb,jb1;
    JPanel pi;
    Font f2;
    JLabel l2,l3,l5;
    JComboBox cb;
    ImageIcon i;
    BorderLayout b=new BorderLayout();
    City( String r,String h)
    {
        String a=r;
        String w=h;
        jf=new JFrame("City");
        jf.setSize(657,375);
        jf.setVisible(true);
        jf.setLayout(b);
        f2=new Font("Times New Roman",Font.BOLD,22);
        l5= new JLabel("PROPERTIES");
        l5.setFont(f2);
        l5.setBounds(40,105, 150, 30);
        jf.add(l5);
        l2=new JLabel("Select Your City");
        l2.setBounds(250,80,195,25);
        l2.setFont(f2);
        jf.add(l2);
        String s[]={"","Chandigarh","Jalandhar","Kapurthala"};
        cb=new JComboBox(s);
        cb.setBounds(250,130,195,22);
        jf.add(cb);
        f2=new Font("Times New Roman",Font.BOLD,20);
        jb=new JButton("Submit");
        jb.setBounds(290,190,100,30);
        jb.setFont(f2);
        jf.add(jb);
        pi=new JPanel();
        pi.setAlignmentY(Component.CENTER_ALIGNMENT);
        pi.setAlignmentX(Component.CENTER_ALIGNMENT);
        pi.setSize(675,375);
        jf.add(pi,BorderLayout.CENTER);
        l3=new JLabel();
        i=new ImageIcon("D:\\DCIM\\41.jpg");
        i=new ImageIcon(i.getImage().getScaledInstance(675,375,Image.SCALE_REPLICATE));
        l3.setIcon(i);
        getContentPane().add(l3);
        pi.add(l3);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sss = e.getActionCommand();
                if (sss.equals("Submit")) {
                    int x=Integer.parseInt(a);
                    x=x-10;
                    String j=String.valueOf(x);
                    String City1 = (String) cb.getItemAt(cb.getSelectedIndex());
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    } catch (ClassNotFoundException i) {
                        System.out.println(i);
                    }
                    try (
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234"); // MySQL

                            Statement stmt1 = conn.createStatement();

                    ) {

                        String query = "update userdetails set Coins ='" + j + "' where UserName='" + w + "'";
                        Statement st = conn.createStatement();
                        int i = st.executeUpdate(query);
                        new Selection(City1);
                    } catch (Exception ei) {
                    }
                }
            }
        });
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
        }
    });
        }
}
