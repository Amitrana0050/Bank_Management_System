 
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.ResultSet;
public class Withdrawl extends JFrame implements ActionListener {
    
    JTextField amount;
    JButton withdrawl,back;
    String pinnumber;
    
    Withdrawl(String pinnumber){
        this.pinnumber = pinnumber;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to Withdraw");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170, 350, 320,25);
        add(amount);
        
        withdrawl = new JButton("Withdraw ");
        withdrawl.setBounds(355, 520, 150,30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        back = new JButton("Back");
        back.setBounds(355, 555, 150,30);
        back.addActionListener(this);
        image.add(back);

        setLayout(null);
        setSize(900, 900);
        setLocation(350, 50 );
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==withdrawl) {
            try {
                String number = amount.getText();
                Date date = new Date();
                if (amount.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");

                } else {
                    conn Conn = new conn();
                    ResultSet rs = Conn.s.executeQuery("select * from bank where pin = '" + pinnumber + "'");
                    int balance = 0;
                    while (rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));

                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if (ae.getSource() != back && balance < Integer.parseInt(number)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    String query = "insert into bank values('" + pinnumber + "','" + date + "','Withdrawl','" + number + "')";
                    Conn.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(null, "Rs " + number + " Withdrawl Successfully");
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);

                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }else if ( ae.getSource() == back) {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);

        }
    }
    
    public static void main(String args[]) {
        new Withdrawl("");
       
    }
}
