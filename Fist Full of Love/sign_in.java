import java.io.*;
import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
import javax.swing.event.*;
import java. util.Calendar;
import java.util.Date;

     public class sign_in implements ActionListener
    {
        JFrame f;
        JTextField UN;
        JPasswordField PS;
        JButton sub,ex,dev,bor,ret,sl,up;
        Label s,ed,n,c,sec,bn,bno,sd,sl1,thank,dev1,sp1,sp2,bnn,M,S,L;
        JPanel P;
        String sj,su,exl,cl3,cl,Y="",A,B,C,Re="",Write="",fi="";
        static String n1,n2,n3,n4,SN,SN1;JLabel IL,IL1;
        int refresh,finished,n0=0;                  int Css,Cs,OP;
        char Pro='Y',zx;char dc;
        int Y1,Y2,M1;JComboBox Cb,Sec;int go=5,m,ip;String ss;int css=1;
        sign_in()   
        {
            f = new JFrame("FIST FULL OF LOVE");
            f . setSize(300,250);
            f.setVisible(true);
            f.setLocation(500,120);
            f.setResizable(false);
            f.setDefaultCloseOperation(0);
            
            P = new JPanel();
          
            f.add(P);
            P.setBackground(Color.cyan);
            UN = new JTextField(20);
           // Class = new JTextField(20);
           // Section = new JTextField(20);
            PS = new JPasswordField(20);
             PS.setEchoChar('*');
            //BN = new JTextField(05);
           
            L = new Label("   ENTER EMAIL ID:-     ");
            M = new Label("   ENTER PASSWORD               :-     ");
            S = new Label("            LOGIN  AS  USER                ");
          
        
               
            ex = new JButton("EXIT");
            ex.addActionListener(this);
            ex.setBackground(Color.red);
            
            sub = new JButton("CONTINUE");
            sub.addActionListener(this);
            sub.setBackground(Color.green);
            
            P.add(S);
            P.add(L);
            P.add(UN);
            P.add(M);
            P.add(PS);
            P.add(sub);
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
                A=UN.getText();
                B=PS.getText();
                Write=A+" "+B;
                 if(A.isEmpty() || B.isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"Enter Correct Credentials");
                   //JOptionPane.showMessageDialog(null,"YOUR PASSWORD IS :-  "+D+"\n"+ "EMAIL ID IS :-  "+C);
                   UN.setText("");
                   PS.setText("");
                   new sign_in();
                   
                }
                else{
                try
                {
                    CHECK();
                }catch(IOException a){}}
            
            }
        }
        public void CHECK()throws IOException
       {   
          
           RandomAccessFile ff = new RandomAccessFile("login.dat","rw");
            for(int i=1;i<ff.length();i++){
             ss=ff.readLine();
              if(ss.equals(Write))
              {
                css=0;
                JOptionPane.showMessageDialog(null,"LOGIN SUCESSFULL");
                break;
              }
             
            }
                 if(css==1)
            {
              JOptionPane.showMessageDialog(null,"LOGIN UNSUCESSFULL");
              new Goto();  
               f.setVisible(false);
            }
            if(css==0){
               new mainpage();
                f.setVisible(false);}
                
          
            ff.close();
            
         
    
       }
       public static void main(String args[])throws IOException
        {
          sign_in S1 = new sign_in();
        }
    }   