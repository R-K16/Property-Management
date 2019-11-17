import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Selection extends JFrame  {
    JFrame f;
    JLabel l, l1, l2,l3,l5;
    ImageIcon i;
    JPanel p;
    JTable table;
    JButton jb;
    Font f2;
    String City1;
    DefaultTableModel model;
    JScrollPane pi;
    BorderLayout b =new BorderLayout();
    int x;
    public Selection(String r)
    {
        super();
        City1=r;
        f=new JFrame("Properties");
        f.setLayout(b);
        f.setSize(1375,735);
        System.out.println(City1);
        model = new DefaultTableModel();
        model.addColumn("OwnerName");
        model.addColumn("Contact Number");
        model.addColumn("PlotArea(in sqft.)");
        model.addColumn("Location");
        model.addColumn("LandMark");
        model.addColumn("Floors");
        model.addColumn("Furnished");
        model.addColumn("BedRooms");
        model.addColumn("SalePrice(in Rs.)");
        table=new JTable(model);
        pi = new JScrollPane(table);
        pi.setBounds(180, 300, 1000, 200);
        f.add(pi) ;
        p=new JPanel();
        p.setSize(1375,735);
        f2=new Font("Times New Roman",Font.BOLD,40);
        l1=new JLabel("PROPERTIES");
        l1.setFont(f2);
        l1.setBounds(200,175,300,100);
        f.add(l1);
        f2=new Font("Times New Roman",Font.BOLD,15);
        jb = new JButton("Logout");
        jb.setFont(f2);
        jb.setBounds(1005, 180, 100, 30);
        f.add(jb);
        l3=new JLabel();
        i=new ImageIcon("D:\\DCIM\\40.jpg");
        i=new ImageIcon(i.getImage().getScaledInstance(1375,735,Image.SCALE_REPLICATE));
        l3.setIcon(i);
        getContentPane().add(l3);
        p.add(l3);
        f.add(p);
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
            String OwnerName,PlotArea, Location, LandMark, Floors, Furnished, BedRooms, SalePrice,ContactNo;
            try {
                String sql = "select * from properties where City='"+City1+"'";
                Statement statement = conn.createStatement();
                ResultSet myresult = statement.executeQuery(sql);
                while (myresult.next())
                {
                    OwnerName=myresult.getString("OwnerName");
                    PlotArea=myresult.getString("PlotArea");
                    Location=myresult.getString("Location");
                    LandMark=myresult.getString("LandMark");
                    Floors=myresult.getString("Floors");
                    Furnished=myresult.getString("Furnished");
                    BedRooms=myresult.getString("BedRooms");
                    SalePrice=myresult.getString("SalePrice");
                    ContactNo=myresult.getString("ContactNo");
                    String[] welcome={OwnerName,ContactNo,PlotArea,Location,LandMark,Floors,Furnished,BedRooms,SalePrice};
                    model.addRow(welcome);
                    }
            }catch (Exception e)
            {}finally {
                conn.close();
            }
        }
        catch (Exception e)
        {
        }
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {

        }
    });

           }

    }

