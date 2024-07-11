
package bank.management.system;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton saving, fd, current, recurring;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;
    
    SignupThree(String formno){
        this.formno= formno;
        
        setLayout (null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1. getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(120,10,100,100);
        add(label);
        
        
        JLabel l1 = new JLabel("Page 3: Account Details:");
        l1.setFont( new Font("Raleway",Font.BOLD,30));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont( new Font("Raleway",Font.BOLD,22));
        type.setBounds(100, 140, 200, 30);
        add(type);
        
        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway",Font.BOLD,16));
        saving.setBackground(Color.WHITE);
        saving.setBounds(100, 180, 170, 20);
        add(saving);
        
        
        fd = new JRadioButton("Fixed Deposit Account");
        fd.setFont(new Font("Raleway",Font.BOLD,16));
        fd.setBackground(Color.WHITE);
        fd.setBounds(350, 180, 210, 20);
        add(fd);
        
        current = new JRadioButton("Current Account");
        current.setFont(new Font("Raleway",Font.BOLD,16));
        current.setBackground(Color.WHITE);
        current.setBounds(100, 220, 170, 20);
        add(current);
        
        recurring = new JRadioButton("Recurring Account");
        recurring.setFont(new Font("Raleway",Font.BOLD,16));
        recurring.setBackground(Color.WHITE);
        recurring.setBounds(350, 220, 210, 20);
        add(recurring);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(saving);
        groupaccount.add(current);
        groupaccount.add(recurring);
        groupaccount.add(fd);
        
        
        JLabel card = new JLabel("Card Number");
        card.setFont( new Font("Raleway",Font.BOLD,22));
        card.setBounds(100, 300, 200, 30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont( new Font("Raleway",Font.BOLD,22));
        number.setBounds(330, 300, 300, 30);
        add(number);
        
        JLabel carddetails = new JLabel("Your 16 Digit Card Number");
        carddetails.setFont( new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(100, 330, 300, 20);
        add(carddetails);
        
        JLabel pin = new JLabel("PIN");
        pin.setFont( new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont( new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);
        
        JLabel pindetails = new JLabel("Your 4 Digit Pin Number");
        pindetails.setFont( new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100, 400, 300, 20);
        add(pindetails);
        
        JLabel service = new JLabel("Service Required");
        service.setFont( new Font("Raleway",Font.BOLD,22));
        service.setBounds(100, 450, 200, 30);
        add(service);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);
        
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);
       
        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Box");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declear that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100, 680, 600, 30);
        add(c7);
        
        
        submit = new JButton("submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font ("Raleway",Font.BOLD,14));
        submit.addActionListener(this);
        submit.setBounds(250, 720, 100,30);
        add(submit);
        
         
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font ("Raleway",Font.BOLD,14));
        cancel.setBounds(420, 720, 100,30);
        cancel.addActionListener(this);

        add(cancel);   
        
        
                
        
        
        getContentPane().setBackground(new Color(215, 252, 252));

        setSize(850, 820);
        setLocation(520, 100);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null ;
            if(saving.isSelected()){               
                accountType = "Saving Account" ;              
            }else if (fd.isSelected()){
                accountType = "Fixed Deposit";
            }else if(current.isSelected()){
                accountType = "Current Account";
            }else if(recurring.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040396000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected()) {
                facility = facility + " ATM Card";
            }else if (c2.isSelected()) {
                facility = facility + " Internet Banking";
            }else if (c3.isSelected()) {
                facility = facility + " Mobile Banking"; 
            }else if(c4.isSelected()) {
                facility = facility + " Email & SMS Alerts";
            }else if(c5.isSelected()) {
                facility = facility +  " Cheque Book";
            }else if (c6.isSelected()) {
                facility = facility + " E-Statement";
            }
            
            
            
            try{
                
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }else{
                    conn Conn = new conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";     
                    String query2= "insert into login  values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";     

                    Conn.s.executeUpdate(query1);
                    Conn.s.executeUpdate(query2);

                    
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                    
                    setVisible(false);
                    new Deposit (pinnumber).setVisible(false);
                }
            }catch(Exception e){
                System.out.println(e);
            }
            
            
            
        }else if (ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
            
        }
        
    }
    
    public static void main(String args[]) {
       new SignupThree("");
    }
}
