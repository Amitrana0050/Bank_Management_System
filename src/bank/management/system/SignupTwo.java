package bank.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {

    JTextField  addhar, pan;
    JButton next;
    JRadioButton  syes, sno, eyes, eno;
    JComboBox religion, category, income, occupation, education;
    String formno;
     SignupTwo(String formno) {
         
         this.formno=formno;
        
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1. getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(55,10,100,100);
        add(label);
        

        
        
        setTitle("NEW ACCOUNT APPLICATION FORM :- PAGE 2");
   

        

        JLabel additionalDetails = new JLabel("Page 2: Additional  Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 28));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Raleway", Font.BOLD, 20));
        Religion.setBounds(100, 140, 100, 30);
        add(Religion);
        
        
        String valReligion [] = {"Hindu ","Muslim","Sikh","Christian","Others"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion );
        


        JLabel Category = new JLabel("Category:");
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        Category.setBounds(100, 190, 200, 30);
        add(Category);
        
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Others"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel Income = new JLabel("Income:");
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100, 240, 200, 30);
        add(Income);
        
        String valincome [] = {"Null", " 0 <1,50,000", " 1,50,000 <2,50,000"," 2,50,000 <5,00,000"," 5,00,000 Upto 10,00,000"};
        income = new JComboBox(valincome); 
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel Educational = new JLabel("Educational");
        Educational.setFont(new Font("Raleway", Font.BOLD, 20));
        Educational.setBounds(100, 290, 200, 30);
        add(Educational);

        JLabel Qualification = new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        Qualification.setBounds(100, 318, 200, 30);
        add(Qualification);
        
        String educationalValues [] ={"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others" }; 
        education = new JComboBox(educationalValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
       

        JLabel Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        Occupation.setBounds(100, 390, 200, 30);
        add(Occupation);
        
        
        String occupationValues [] ={"Salaried", "Self-Employed", "Business", "Student", "Retired","Others" }; 
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

      

        JLabel PanNumber = new JLabel("PAN Number:");
        PanNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        PanNumber.setBounds(100, 440, 200, 30);
        add(PanNumber);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel Addhar = new JLabel("Addhar Number :");
        Addhar.setFont(new Font("Raleway", Font.BOLD, 20));
        Addhar.setBounds(100, 490, 200, 30);
        add(Addhar);

        addhar = new JTextField();
        addhar.setFont(new Font("Raleway", Font.BOLD, 14));
        addhar.setBounds(300, 490, 400, 30);
        add(addhar);

        JLabel Senior = new JLabel("Senior Citizen:");
        Senior.setFont(new Font("Raleway", Font.BOLD, 20));
        Senior.setBounds(100, 540, 200, 30);
        add(Senior);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.white);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.white);
        add(sno);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        

        JLabel Exisiting = new JLabel("Exisiting Account:");
        Exisiting.setFont(new Font("Raleway", Font.BOLD, 20));
        Exisiting.setBounds(100, 590, 200, 30);
        add(Exisiting);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.white);
        add(eyes);

        eno = new JRadioButton("No");
        eno .setBounds(450, 590, 100, 30);
        eno .setBackground(Color.white);
        add(eno );

        ButtonGroup exisitinggroup = new ButtonGroup();
        exisitinggroup.add(eyes);
        exisitinggroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 150, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(850, 800);
        setLocation(520, 100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";

        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

       
        String exisitingaccount = null; 
        if (eyes.isSelected()) {
            exisitingaccount = "Yes";
        } else if (eno.isSelected()) {
            exisitingaccount = "no";

        } 

        String span = pan.getText();
        String saddhar = addhar.getText();
        

        try {
            if (span.equals("")) {    
                JOptionPane.showMessageDialog(null, "Pan Card is required ");
            }else if (saddhar.equals("")) {
                JOptionPane.showMessageDialog(null, "Addhar Card  is required ");
            }
            conn c = new conn();
            String query = "insert into signuptwo values('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','"+ seducation+"','" + soccupation + "','" + span + "','" + saddhar + "','" + seniorcitizen + "','" + exisitingaccount + "')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String args[]) {
        new SignupTwo("");
    }

}
