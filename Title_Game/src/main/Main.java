package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {
    

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("JAVAX");
        
        
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        
        GamePanel gamePanel = new GamePanel(500,200, Color.gray);
        GamePanel gamePanel2 = new GamePanel(500,200, Color.gray);
        GamePanel gamePanel3 = new GamePanel(500,200, Color.white);
        GamePanel gamePanel4 = new GamePanel(500,200, Color.white);
       
        
        mainPanel.add(gamePanel, BorderLayout.NORTH);
        mainPanel.add(gamePanel2, BorderLayout.SOUTH);
        
        
        
        JPanel guiPanel = new JPanel();
        guiPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        guiPanel.setLayout(new GridLayout(0, 1));
        guiPanel.setBackground(Color.LIGHT_GRAY);

        JLabel label = new JLabel("Enter your name below:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Enter");
        button.setBackground(Color.blue);
        
        guiPanel.add(label, BorderLayout.WEST);
        guiPanel.add(textField, BorderLayout.EAST);
        
        
        guiPanel.add(button);
        
        mainPanel.add(guiPanel, BorderLayout.CENTER);
        

        
        ImageIcon javaImage = new ImageIcon("Image/Java_Image.png"); 
        Image image = javaImage.getImage();
        Image modifiedImage = image.getScaledInstance(100,100,java.awt.Image.SCALE_SMOOTH);
        javaImage = new ImageIcon(modifiedImage);
        
       

        
        window.add(mainPanel);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        
        button.addActionListener(e -> {
            window.setVisible(false);
            String name = textField.getText();
            java_Intro introWindow = new java_Intro();
            introWindow.display(name);
            
        });
        
        
        
    }

}