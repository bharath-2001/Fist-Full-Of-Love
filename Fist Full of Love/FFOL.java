  /**
 * Write a description of class Input here.
 * 
 * @author (your name)  drereftr
 * @version (a version number or a date)
 */ 
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.*;
public class FFOL extends JFrame implements ActionListener {
    JFrame F;
    JPanel P;
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12;
    JTextField T;
    JPasswordField Pw;
    JRadioButton R,R1,R2,R3,R4;
    ButtonGroup G1,G2;
    JComboBox Cb;
    JMenuItem Mi;
    JCheckBoxMenuItem Cm;
    JLabel H,L1,L2,L3,L4,S,IL,L5,L6,L7,L8,L9,L10,Z1,Z2,Z3,Z4,Z5,Z6,Z7,Z8,Z9,Z10,Y5,Y6,Y7,Y8,Y9,Y10;Label sl1;
    
    String Name,Section,House,Year="",Write,Ts,Hs,S1,y;
    int Class,x=0,x2=0,f=1,n=1,Cs,Css;
    int Y1,Y2,M1;
    char house,nf='N';
    static String PP;
    
    public void ri()throws IOException
    {
        BufferedReader n = new BufferedReader(new FileReader("Nf.dat"));
        nf=(n.readLine()).charAt(0);
        n.close();
    }
    FFOL()
    {
        
        Calendar ca = Calendar.getInstance();
        Y1=ca.get(Calendar.YEAR)+1;
        Y2=(Y1+1);
        M1=ca.get(Calendar.MONTH);
            try 
            {
                ri();
            }
            catch (Exception a){ }
        F = new JFrame();
        F.setTitle("FIST FULL OF LOVE");
        F.setSize(360,700);
        F.setVisible(true);
        F.setLocation(450, 200);
        F.setDefaultCloseOperation(0);
        //F.setResizable(false);
        
        P = new JPanel();
        F.add(P);
        
        ImageIcon I = new ImageIcon("D:\\Fist Full of Love\\bg.jpeg");
        IL = new JLabel(I);
        P.add(IL);
        
        F.setLayout(new BorderLayout());
        F.setContentPane(IL);
        F.setLayout(new FlowLayout());
         B3 = new JButton(" NEXT ");
        B3.setBackground(Color.white);       
         sl1= new Label ("                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
         H= new JLabel("Loading.........");
            L1 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        L2 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        L3 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        L4 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        L5 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        L6 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        L7 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        L8 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        L9 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        L10 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z1 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z2 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z3 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z4 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z5 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z6 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z7 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z8 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z9 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Z10 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Y5 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Y6 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Y7 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Y8 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Y9 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        Y10 = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
       
         
         
         F.add(L1);
        F.add(L2);
        F.add(L3);
        F.add(L4);
        F.add(L5);
        F.add(L6);
        F.add(L7);
        F.add(L8);
        F.add(L9);
        F.add(L10);
        F.add(Z1);
        F.add(Z2);
        F.add(Z3);
        F.add(Z4);
        F.add(Z5);
        F.add(Z6);
        F.add(Z7);
        F.add(Z8);
        F.add(Z9);
        F.add(Z10);
         F.add(Y5);
        F.add(Y6);
        F.add(Y7);
        F.add(Y8);
        F.add(Y9);
        F.add(Y10);
         //F.add(B3);
         F.add(B3);
       //  F.add(H);
         int i;
        B3.addActionListener(this);
         
                
    }
      public void actionPerformed(ActionEvent e)
        {
          if(e.getSource()==B3)
          {
               F.remove(B3);
              F.setVisible(false);
              new Goto();
            }
        }
    public void ma()throws IOException
    {
        BufferedWriter m = new BufferedWriter(new FileWriter("Nf.dat"));
        m.write('N');
    }
    public static void main(String args[])
    {
       FFOL Mes = new FFOL();
    }
    
}
