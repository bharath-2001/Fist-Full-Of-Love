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
public class Goto extends JFrame implements ActionListener{
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
    JLabel H,L1,L2,L3,L4,S,IL;
    
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
    Goto()
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
        F.setTitle("  FIST FULL OF LOVE  ");
        F.setSize(250,250);
        F.setVisible(true);
        F.setLocation(450, 200);
        F.setDefaultCloseOperation(0);
        //F.setResizable(false);
        
        P = new JPanel();
        F.add(P);
        
       
        
      
        
        B2 = new JButton("      REGISTER AS USER     ");
        B2.setBackground(Color.cyan);
        
        B1 = new JButton("     LOG IN      ");
        B1.setBackground(Color.white);
        
        B3 = new JButton("   EXIT   ");
        B3.setBackground(Color.red);
        H = new JLabel("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        P.add(H);
        P.add(H);
        P.add(B1);
        P.add(H);
        P.add(H);
        P.add(B2);
        P.add(H);
        P.add(H);
        P.add(B3);
         
        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==B2)
        {
            new register();
            P.remove(B1);
            P.remove(B2);
            P.remove(B3);
            F.setVisible(false);
        }
        if(e.getSource()==B1)
        {
            new sign_in();
            P.remove(B1);
            P.remove(B2);
            P.remove(B3);F.setVisible(false);
        }
        if(e.getSource()==B3)
        {
            System.exit(0);F.setVisible(false);
        }
    }
    public void wri()throws IOException
    {
        BufferedWriter ff = new BufferedWriter(new FileWriter("Now.dat"));
        
                F.setVisible(false);
    }
    public void ma()throws IOException
    {
        BufferedWriter m = new BufferedWriter(new FileWriter("Nf.dat"));
        m.write('N');
    }
    public static void main(String args[])
    {
        Goto Mes = new Goto();
    }
    
}
