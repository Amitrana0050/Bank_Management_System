
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class Login extends JFrame implements ActionListener{
    
    
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    
    Login(){
        
        
        
        
        setTitle("AUTOMATED TELLER MACHINE");
        
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1. getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(350,10,100,100);
        add(label);
        
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1. getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel labell = new JLabel(ii3);
        labell.setBounds(630,350,100,100);
        add(labell);
        
        
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD,38));
        text.setBounds(250, 125, 450, 40);
        add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Railway", Font.BOLD,28));
        cardno.setBounds(150, 190, 375, 30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 190, 230, 30);
        cardTextField.setFont( new Font("Arial",Font.BOLD, 14));
        add (cardTextField);
        
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Railway", Font.BOLD,28));
        pin.setBounds(150, 250, 375, 30);
        add(pin);
        
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 250, 230, 30);
        pinTextField.setFont( new Font("Arial",Font.BOLD, 14));
        add (pinTextField);
        
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230, 30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        
        
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1. getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel labelll = new JLabel(iii3);
        labelll.setBounds(0,0,850,480);
        add(labelll);
//        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        
        setSize(850,480);
        setVisible(true);
        setLocation(520,280);
         
        
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == clear){
            
            cardTextField.setText("");
            pinTextField.setText("");
        }else if (ae.getSource() == login) {
            conn Conn = new conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try {
               ResultSet rs =  Conn.s.executeQuery(query);
               if (rs.next ()){
                   setVisible(false);
                   new Transaction(pinnumber).setVisible(true);
               } else {
                   JOptionPane.showMessageDialog(null, " Incorrect Card Number or Pin");
               }
            }catch(Exception e){
                System.out.println(e);
            }
            
        }else if (ae.getSource() == signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
        
        
    }
    
    public static void main(String args[]){

    new Login();
    
    }
}
