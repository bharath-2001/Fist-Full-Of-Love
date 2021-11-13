   import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Calendar;
import java.util.Date;
 public class mainpage implements ActionListener
    {JFrame f1;
     JPanel P1;   
     Label name,clas,BNO,BNN,Sd,Bd,Sc;
     JButton con,back,na,na2,na3,na4,na5,na1,ext;
      int Y1,Y2,Y3,M1,Z1,Z2,Z3,M2,q=0;static String Y,Y0;static String S1,S2,bno,bnn,S4,S5,S6,S7,S8,S10;
      static String wr,r,fi="",wr1,r1,fi1="",wr2,wr3,gh,mn,bp,jn,SN; 
  
         mainpage()
         {
            f1 = new JFrame(" FIST FULL OF LOVE ");
           f1 . setSize(400,300);
           f1.setVisible(true);
           f1.setLocation(500,120);
           f1.setResizable(false);
            f1.setDefaultCloseOperation(0);
            
            P1 = new JPanel();
          
            f1.add(P1);
            
            
            Sc = new Label ("                        "+SN+"                     ");
            Sc.setBackground(Color.red); 
            name = new Label ("                                                                                                                                                                                                                                                                                                                                                                                                 ");
            clas = new Label ( " \n");
            BNO = new Label  ("   BOOK NUMBER :-                   ");
            BNN = new Label  ("   BOOK NAME :-                     ");
            Bd  = new Label  ("   BORROWING DATE :-                ");
            Sd  = new Label  ("                  WE ARE FAMILY LET US SHARE FOOD ::                              ");
              Sd.setBackground(Color.green);          
            con = new JButton("> > > >  PIN FOOD LOCATION  > > > >");
            con.addActionListener(this);
            con.setBackground(Color.cyan);
            
            back = new JButton("> > > > PIN HUNGER LOCATION > > > >");
            back.addActionListener(this);
            back.setBackground(Color.cyan);
           
            ext = new JButton("EXIT");
            ext.addActionListener(this);
            ext.setBackground(Color.red);
            
            P1.add(Sd);
            P1.add(name);
            P1.add(clas);
            P1.add(con);
            P1.add(name);
            P1.add(back);
            P1.add(name);
            P1.add(ext);
        
        }
        
             public void actionPerformed(ActionEvent e) 
             {
                 if(e.getSource()==con)
                 {
                  
                   P1.remove(Sc);
                   P1.remove(name);
                   P1.remove(clas);
                   P1.remove(BNO);
                   P1.remove(BNN);
                   P1.remove(Bd);
                   P1.remove(Sd);
                   P1.remove(con);
                   P1.remove(back);
                    new foodlocation();
                   f1.setVisible(false);
                }            
                if(e.getSource()==back)
                {
                  
                    
                    
                    P1.remove(Sc);
                    P1.remove(name);
                    P1.remove(clas);
                    P1.remove(BNO);
                    P1.remove(BNN);
                    P1.remove(Bd);
                    P1.remove(Sd);
                    P1.remove(con);
                    P1.remove(back);
                    f1.setVisible(false);
                    new hungerlocation();
                }
                if(e.getSource()==ext)
                {
                 System.exit(0);
                }
            }
             public static void main(String args[])
            {
              mainpage o= new mainpage();
           }
         
                }