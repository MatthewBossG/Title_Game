package main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class java_Intro {

    public static void display(String name) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("JAVA Education");
        window.setPreferredSize(new Dimension(1300, 900));

        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel secondaryPanel = new JPanel(new BorderLayout());
        JPanel middlePanel = new JPanel(new BorderLayout());
        JPanel middleLeftPanel = new JPanel(new BorderLayout());
        JPanel middleRightPanel = new JPanel(new BorderLayout());

        ImageIcon javaImage = new ImageIcon("/mnt/data/Java_Image.png");
        JLabel imageLabel = new JLabel(javaImage);

        mainPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.setPreferredSize(new Dimension(750, 110));
        window.add(mainPanel, BorderLayout.NORTH);

        secondaryPanel.setBackground(Color.LIGHT_GRAY);
        secondaryPanel.setPreferredSize(new Dimension(750, 200));
        window.add(secondaryPanel, BorderLayout.SOUTH);

        middlePanel.setBackground(Color.GRAY);
        middlePanel.setPreferredSize(new Dimension(750, 50));
        window.add(middlePanel, BorderLayout.WEST);
        
        middleLeftPanel.setBackground(Color.WHITE);
        middleLeftPanel.setPreferredSize(new Dimension (300, 100));
        window.add(middleLeftPanel, BorderLayout.CENTER);
        
       
        

        String javaSummary = "<html>Java is a widely-used, object-oriented programming language developed by Sun Microsystems (now owned by Oracle) in the mid-1990s. Known for its 'write once, run anywhere' capability, Java enables applications to run on various platforms without modification due to its use of the Java Virtual Machine (JVM). Java is structured around objects and classes, allowing for modular, reusable code, which makes it popular for building enterprise applications, Android apps, web applications, and more. Its syntax, similar to C++, along with strong memory management, security features, and an extensive standard library, make Java a versatile choice for both beginners and experienced developers. The language is designed to be platform-independent, highly secure, and performance-efficient, especially for large-scale applications.</html>";
        
        JLabel label = new JLabel(javaSummary);
        label.setFont(new Font("Serif", Font.PLAIN, 30));
        label.setForeground(Color.white);
        middlePanel.add(label, BorderLayout.CENTER);
        
        String javaSummary2 = "<html>Why Java? Java is a powerful, versatile language that opens doors to countless opportunities in the tech world. Known for its platform independence (\"write once, run anywhere\"), Java is ideal for building robust, high-performance applications across various devices and operating systems. Its object-oriented nature encourages clean, modular code that's easier to maintain and scale, making it the language of choice for enterprise-level applications. Java's rich ecosystem, backed by extensive libraries and frameworks, accelerates development and supports a wide range of applications—from Android development to web applications and beyond. Plus, Java’s active community and extensive documentation make it a welcoming language for beginners and experienced developers alike.</html>";
        
        JLabel label2 = new JLabel(javaSummary);
        label2.setFont(new Font("Serif", Font.PLAIN, 22));
        label2.setForeground(Color.white);
        secondaryPanel.add(label2, BorderLayout.CENTER);
        
        
        JLabel topLabel = new JLabel(name + " Let's Begin your Java Education");
        topLabel.setFont(new Font("Italic", Font.BOLD, 35));
        topLabel.setForeground(Color.white);

        mainPanel.add(topLabel, BorderLayout.CENTER);
        middlePanel.add(imageLabel, BorderLayout.WEST);
        
        
        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.white);
                g2d.setStroke(new BasicStroke(15)); 
                for(int i=0; i<1000; i++) {
	                g2d.drawRect(20+i, 50+i, 450-i, 500-i);
	                
	                i+=19;
                }
                
                g2d.setColor(new Color(Color.HSBtoRGB(191 / 360f, 100 / 100f, 85 / 100f)));
                g2d.drawLine(80,255,80,360);
                g2d.drawLine(80,250,200,220);
                g2d.drawLine(80,360,200,390);
                g2d.drawLine(200,220,200,250);
                g2d.drawLine(200,390,200,360);
                
                
                
                g2d.drawLine(260,220,260,280);
                g2d.drawLine(260,220,380,250);
                g2d.drawLine(260,390,380,360);
                g2d.drawLine(260,290,380,290);
                g2d.drawLine(380,290,380,350);
                
                
                g2d.setColor(Color.CYAN);
                g2d.setStroke(new BasicStroke(5)); 
                g2d.drawLine(75,255,75,320); 
                
                g2d.drawLine(255,220,255,260); 

            }
        };

        
        drawingPanel.setPreferredSize(new Dimension(500, 500));
        middleLeftPanel.add(drawingPanel, BorderLayout.WEST);
        
        
        
        
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    
    
    
}

