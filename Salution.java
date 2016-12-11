package fedoraclicker;


import fedoraclicker.SNum;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class Salution 
    {
    
    private JTextArea DisplayFedora;

    private void displayGUI()
    {
        JFrame frame = new JFrame("Fedora Clicker");
      

        JPanel contentPane = new JPanel();
        contentPane.setOpaque(true);
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // this is the side panel 
        
        JLabel label1 = new JLabel("Fedora Upgrades");
                                
        label1.setSize(300, 30);
        label1.setLocation(770, 25);
        label1.setFont(new Font("IMPACT", Font.PLAIN, 25));
        
    // this is the main button 

        ImageIcon fedora = new ImageIcon("fedora.jpg");
        JButton fedora1 = new JButton(fedora); 
        
        fedora1.setSize(150, 150);
        fedora1.setLocation(300, 220);
        
        //Instantiating clicked & upList
        final SNum clicked = new SNum(0);
        final Upgrades upList = new Upgrades();
        final Timer timer = new Timer(1000, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (upList.get(1)==true) {
                    clicked.SNumAdd(1,0);
                    System.out.println(clicked);
                }
            }
        });


        fedora1.addActionListener( new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               if (upList.get(0)==true) {
                    clicked.SNumAdd(5,0);
                    System.out.println(clicked);
                    upList.set(5, true);
               }
               else if (upList.get(0)==false && upList.get(2)==false) {
                    clicked.SNumAdd(1,0);
                    System.out.println(clicked);
               }
               else if (upList.get(1)==true) {
                    upList.set(6, true);
               }
               else if (upList.get(2)==true) {
                    clicked.SNumAdd(10,0);
                    System.out.println(clicked);
                    upList.set(7, true);
               }
               else if (upList.get(3)==true) {
                   clicked.SNumAdd(50,0);
                   System.out.println(clicked);
                   upList.set(8, true);
               }
           }
        });
                
    // trilby modifier: increases clicks by 5     
                
        ImageIcon trilby = new ImageIcon("trilby.jpg");
        JButton trilby1 = new JButton(trilby);
        trilby1.setSize(64, 64);
        trilby1.setLocation(820, 70); 
        trilby1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (clicked.checkVal(14) && upList.get(5) != true) {
                    upList.set(0, true);
                    clicked.SNumSub(15, 0);
                    System.out.println(clicked);
                }
            }
        });
       
        JLabel label2 = new JLabel("\"Stylish\" Trilby");
        label2.setSize(300, 30);
        label2.setLocation(805, 130);
        label2.setFont(new Font("Courier", Font.PLAIN, 15));
        
        JLabel label3 = new JLabel("5 tips per click (Cost: 15 tips)");
        label3.setSize(300, 30);
        label3.setLocation(760, 150);
        label3.setFont(new Font ("Courier", Font.PLAIN, 15));

        ImageIcon tophat = new ImageIcon("tophat.jpg");
        JButton tophat1 = new JButton(tophat);
        tophat1.setSize(64, 64);
        tophat1.setLocation(820, 200);
        tophat1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (clicked.checkVal(99) && upList.get(6)!=true) {
                    upList.set(1, true);
                    clicked.SNumSub(100, 0);
                    timer.start();
                }
            }
        });
        
        JLabel label4 = new JLabel("Top Hat That");
        label4.setSize(300, 30);
        label4.setLocation(810, 260);
        label4.setFont(new Font ("Courier", Font.PLAIN, 15));
        
        JLabel label5 = new JLabel("1 tip per second (Cost: 100 tips)");
        label5.setSize(300, 30);
        label5.setLocation(750, 280);
        label5.setFont(new Font ("Courier", Font.PLAIN, 15));
                
        ImageIcon forever = new ImageIcon("fvr.png");
        JButton forever1 = new JButton(forever);
        forever1.setSize(64, 64);
        forever1.setLocation(820, 330);
        forever1.addActionListener(new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (clicked.checkVal(199) && upList.get(7) != true) {
                    upList.set(2, true);
                    upList.set(0, false);
                    clicked.SNumSub(200, 0);
                    System.out.println(clicked);
                }
            }
        });
        
        JLabel label6 = new JLabel("Le 9GAG");
        label6.setSize(300, 30);
        label6.setLocation(822, 390);
        label6.setFont(new Font ("Courier", Font.PLAIN, 15));
        
        JLabel label7 = new JLabel("10 tips per click (Cost: 200 tips)");
        label7.setSize(300, 30);
        label7.setLocation(750, 410);
        label7.setFont(new Font ("Courier", Font.PLAIN, 15));
        
        ImageIcon neckbeard = new ImageIcon("neckbeard.jpg");
        JButton nck = new JButton(neckbeard);
        nck.setSize(64, 64);
        nck.setLocation(820, 460);
        nck.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (clicked.checkVal(299) && upList.get(8) != true) {
                    upList.set(3, true);
                    upList.set(2, false);
                    clicked.SNumSub(300, 0);
                    System.out.println(clicked);
                }
            }
        });
        
        JLabel label8 = new JLabel("Reddit MRA");
        label8.setSize(300, 30);
        label8.setLocation(812, 520);
        label8.setFont(new Font ("Courier", Font.PLAIN, 15));
        
        JLabel label9 = new JLabel("50 Tips for m'lady (Cost: 300 tips)");
        label9.setSize(300, 30);
        label9.setLocation(740, 540);
        label9.setFont(new Font ("Courier", Font.PLAIN, 15));

        contentPane.add(label1);
        contentPane.add(label2); 
        contentPane.add(label3);
        contentPane.add(label4); 
        contentPane.add(label5);  
        contentPane.add(label6);
        contentPane.add(label7); 
        contentPane.add(label8); 
        contentPane.add(label9); 

        contentPane.add(nck); 
        contentPane.add(fedora1);
        contentPane.add(trilby1); 
        contentPane.add(tophat1); 
        contentPane.add(forever1);
        

        frame.setContentPane(contentPane);
        frame.setSize(1000, 800);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        
        
    }

    public static void main(String... args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                new Salution().displayGUI();
            }
        });
    }
}






