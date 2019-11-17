import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuySell extends JFrame {
    JFrame f,jf;
    JPanel p,pi;
    JLabel l,l1,l2,l3,l4,l5;
    ImageIcon i;
    JButton b1,b2;
    JComboBox cb;
    String Coins;
    BorderLayout b=new BorderLayout();
    Font f2;
    BuySell(String r,String t)
    {
        Coins=t;
        f = new JFrame();
        f.setTitle("Choice");
        f.setSize(675, 375);
        f2=new Font("Times New Roman",Font.BOLD,22);
        l5= new JLabel("PROPERTIES");
        l5.setFont(f2);
        l5.setBounds(45,105, 150, 30);
        f.add(l5);
        f2=new Font("Times New Roman",Font.BOLD,18);
        l= new JLabel("Hello");
        l.setFont(f2);
        l.setBounds(240,60, 50, 25);
        f.add(l);
        l1 =new JLabel(r);
        l1.setFont(f2);
        l1.setBounds(290,60, 100, 25);
        f.add(l1);
        l2=new JLabel("You Have "+Coins+" Coins");
        l2.setFont(f2);
        l2.setBounds(240,90, 160, 25);
        f.add(l2);
        l4= new JLabel("Select Your Choice");
        l4.setFont(f2);
        l4.setBounds(240,120, 150,25);
        f.add(l4);
        b1 = new JButton("Buy");
        b1.setFont(f2);
        b1.setBounds(310, 175, 90, 30);
        f.add(b1);
        b2 = new JButton("Sale");
        b2.setFont(f2);
        b2.setBounds(410, 175, 90, 30);
        f.add(b2);
        p=new JPanel();
        p.setAlignmentY(Component.CENTER_ALIGNMENT);
        p.setAlignmentX(Component.CENTER_ALIGNMENT);
        p.setSize(675,375);
        f.add(p,BorderLayout.CENTER);
        l3=new JLabel();
        i=new ImageIcon("D:\\DCIM\\41.jpg");
        i=new ImageIcon(i.getImage().getScaledInstance(675,375,Image.SCALE_REPLICATE));
        l3.setIcon(i);
        getContentPane().add(l3);
        p.add(l3);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                String str2 = e1.getActionCommand();
                if (str2.equals("Buy"))
                {
                    if(Coins.equals("0")) {
                        new Pay(r);
                    }
                    else
                        new City(Coins,r);
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e2) {
                String str2 = e2.getActionCommand();
                if (str2.equals("Sale"))
                {
                    new Selling();
                }
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
