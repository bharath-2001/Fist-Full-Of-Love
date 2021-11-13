import java.io.*;
import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
import javax.swing.event.*;
import java. util.Calendar;
import java.util.Date;

     public class register implements ActionListener
    {
        JFrame f;
        JTextField UN,EI,CN,NM;
        JPasswordField PS;
        JButton sub,ex,dev,bor,ret,sl,up,b;
        Label s,ed,n,c,sec,bn,bno,sd,sl1,thank,dev1,sp1,sp2,bnn,M,S,L,E,P1,space;
        JPanel P;
        String sj,su,exl,cl3,cl,Y="",A,B,C,D,Re="",Write="",fi="";
        static String n1,n2,n3,n4,SN,SN1;JLabel IL,IL1;
        int refresh,finished,n0=0;                  int Css,Cs,OP;
        char Pro='Y',zx;char dc;
        int Y1,Y2,M1;JComboBox Cb,Sec;int go=5,m,ip;
        register()
        {
            f = new JFrame("FIST FULL OF LOVE");
            f . setSize(400,350);
            f.setVisible(true);
            f.setLocation(500,120);
            f.setResizable(false);
            f.setDefaultCloseOperation(0);
            
            P = new JPanel();
          
            f.add(P);
            P.setBackground(Color.cyan);
            NM = new JTextField(20);
            CN = new JTextField(20);
            EI = new JTextField(20);
            PS = new JPasswordField(20);
            PS.setEchoChar('*');
            //BN = new JTextField(05);
           
            L = new Label("                              NAME                       :-                                 ");
            M = new Label("                              CONTACT NUMBER             :-                                 ");
            E = new Label("                              EMAIL ID                   :-                                 ");
            P1 = new Label("                             PASSWORD                   :-                                 ");
            S = new Label("                              REGISTER AS USER                                              ");
            space = new Label("                                                     ");
        
               
            ex = new JButton("EXIT");
            ex.addActionListener(this);
            ex.setBackground(Color.red);
            
            sub = new JButton("CONTINUE");
            sub.addActionListener(this);
            sub.setBackground(Color.magenta);
            
             b = new JButton("< < BACK < <");
            b.addActionListener(this);
            b.setBackground(Color.magenta);
            
            P.add(S);
            P.add(L);
            P.add(NM);
            P.add(M);
            P.add(CN);
            P.add(E);
            P.add(EI);
            P.add(P1);
            P.add(PS);
            P.add(space);
            P.add(sub);
            P.add(b);
            P.add(ex);
            
            
            
            f.setVisible(false);
            f.setVisible(true);
            
        }
       public void actionPerformed(ActionEvent e)
        {
          if(e.getSource()==ex)
          {
              System.exit(0);
            }
            if(e.getSource()==sub)
            {
                A=NM.getText();
                B=CN.getText();
                C=EI.getText();
                D=PS.getText();
                Write=C+" "+D;
                if(A.isEmpty() || B.isEmpty()||C.isEmpty()||D.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Enter Correct Credentials");
                   //JOptionPane.showMessageDialog(null,"YOUR PASSWORD IS :-  "+D+"\n"+ "EMAIL ID IS :-  "+C);
                   new register();
               
                }
                else{
                try
                {
                    CHECK();
                }catch(IOException a){}
              }
                
                
       
            }
            if(e.getSource()==b)
            {
            f.setVisible(false);    
            new Goto();
            }
        }
        public void CHECK()throws IOException
        { 
          RandomAccessFile f2 = new RandomAccessFile("login.dat","rw");
                 int a1 = (int)f2.length();
                 f2.seek(a1);
                 String S1 = f2.readLine();
                 f2.writeBytes("\n"+Write);
                 f2.close();
                JOptionPane.showMessageDialog(null,"YOUR PASSWORD AND USERNAME IS UPDATED SUCESSFULLY");
                JOptionPane.showMessageDialog(null,"YOUR PASSWORD IS :-  "+D+"\n"+ "EMAIL ID IS :-  "+C);
                new Goto();
                f.setVisible(false);
                     //new goto();
         
           
       }
        public static void main(String args[])throws IOException
        {
        register S1 = new register();
        }
    }