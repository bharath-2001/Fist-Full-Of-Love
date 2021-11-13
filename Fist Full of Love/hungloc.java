import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java. util.Calendar;
import java.util.Date;  

 class hungloc extends JFrame implements ActionListener
{
         JFrame f1; 
         int jn,Y1,Y3,Y2,M1,Z1,Z2,Z3,M2,q=0;
         String Y,Y0;
         JPanel P;
         Label Sc,name,clas,BNO,BNN,Bd,Sd,BNO1,space;//JButton con,back,ex;
         JTextField t1,t2,t3;
         static String bp;
         
         int l,c=0,z=0,h2,p;
         static String N,BN1,BN2,BD,SD,SN;
        String m ,S2,DC,T2,DC1;
        int c0=0;      
         String Write="",A,B,C;
         JButton con,back,na,na2,na3,na4,na5,na1;
         int len,sum;
         String cop,cop1;
        String plu;int cal2=0;int BP=0;
              int cal1=0; String bh;int cal=0;
      hungloc()
      {
           f1 = new JFrame(" FIST FULL OF LOVE");
           f1 . setSize(400,300);
           f1.setVisible(true);
           f1.setLocation(500,120);
           f1.setResizable(false);
           f1.setDefaultCloseOperation(0);
            
           P = new JPanel();
           f1.add(P); 
           
           
        
            na = new JButton(N);
            na1 = new JButton(C);
            na2 = new JButton(BN2);
            na3 = new JButton(BD);
            na4 = new JButton(SD);
            
          
           Sc = new Label ("                                                                                                                             LANDMARK     ::                                                                                                                                ");
           //Sc.setBackground(Color.red);   
            name = new Label ("              FOOD CAN BE SERVED TO HOW MANY PEOPLE   :-                               ");
            clas = new Label ("              Your CONTACT NUMBER                  :-                                  ");
            space = new Label("                                                                                       ");
            con = new JButton("> > SUBMIT > >");
            con.addActionListener(this);
            con.setBackground(Color.green);
            
            t1 = new JTextField(20);
            t2 = new JTextField(20);
            t3 = new JTextField(20);
            
            //back = new JButton("< < BACK  < <");
            //back.addActionListener(this);
            //back.setBackground(Color.red);
            
           P.add(name);
           P.add(t1);
           P.add(clas);
           P.add(t2);
           P.add(Sc);
           P.add(space);
           P.add(t3);
           P.add(space);
           P.add(con);
        }
      public void actionPerformed(ActionEvent e) 
      {
          if(e.getSource()==con)
          {
           A=t1.getText();
           B=t2.getText();
           C=t3.getText();
           Write=A+" "+B+" "+C;   
              try{
            Bhv1();
           }catch(Exception a){}
          
            new mainpage(); 
            f1.setVisible(false);
        }
             
                
                
      }
      public  void Bhv1() throws IOException
      {
            RandomAccessFile ff = new RandomAccessFile("list_hunger.dat","rw");
          
                 int a1 = (int)ff.length();
                 ff.seek(a1);
                 String S1 = ff.readLine();
                 ff.writeBytes("\n"+Write);
                 ff.close();
                 f1.setVisible(false);
                 JOptionPane.showMessageDialog(null,"SUCCESSFULLY UPDATED HUNGER LOCATION \n GREAT !! You are a Responsible Citizen ");
                     //new goto();
          
      
          
              }
            
      
   
   public static void main(String args[])throws IOException
      {
        hungloc n = new hungloc(); 
      }
    }