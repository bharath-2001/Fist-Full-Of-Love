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
public class foodlocation extends JFrame implements ActionListener{
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
    JLabel H,L1,L2,L3,L4,S,IL,L5,L6,L7,L8,L9,L10,Z1,Z2,Z3,Z4,Z5,Z6,Z7,Z8,Z9,Z10;
    
    String Name,Section,House,Year="",Write,Ts,Hs,S1,y;
    int Class,x=0,x2=0,f=1,n=1,Cs,Css;
    int Y1,Y2,M1;
    char house,nf='N';
    static String PP;
    
    
    foodlocation()
    {
        
       
        F = new JFrame();
        F.setTitle("FIST FULL OF LOVE");
        F.setSize(500,500);
        F.setVisible(true);
        F.setLocation(450, 200);
        F.setDefaultCloseOperation(0);
        //F.setResizable(false);
        
        P = new JPanel();
        F.add(P);
        
        ImageIcon I = new ImageIcon("D:\\Fist Full of Love\\foodlocation.jpeg");
        IL = new JLabel(I);
        P.add(IL);
        
        F.setLayout(new BorderLayout());
        F.setContentPane(IL);
        F.setLayout(new FlowLayout());
        
        S = new JLabel("                                                                                                   ");
        
        H = new JLabel("                                   FOOD AVAILABLE LOCATION                                     ");
        H.setBackground(Color.green);
        
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
        
        T = new JTextField(15);
        Pw = new JPasswordField(15);
        
     
        
        B1 = new JButton("   Submit   ");
        B1.setBackground(Color.green);
        
        B2 = new JButton("   Back   ");
        B2.setBackground(Color.green);
        
      
    
        
            
        B1.addActionListener(this);
        B2.addActionListener(this);
       
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
        F.add(B1);
        F.add(B2);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==B1)
        {
             F.setVisible(false);
           new fodloc();
        }
        if(e.getSource()==B2)
        {
             F.setVisible(false);
            new mainpage();
        }
    }
    public static void main(String args[])
    {
        foodlocation Mes = new foodlocation();
    }
    
}
