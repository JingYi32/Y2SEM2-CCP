
package no18;
import java.awt.Color;
import javax.swing.*;
public class NewMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(null);

        JLabel l = new JLabel("I LOVE");
        JPanel panel1 = new JPanel();
        panel1.setBounds(5, 15, 100, 30);
        panel1.setBackground(Color.green);
        panel1.add(l);
        frame.add(panel1);
        
        JLabel l2 = new JLabel("CCP");
        JPanel panel2 = new JPanel();
        panel2.setBounds(150, 150, 100, 30);
        panel2.setBackground(Color.orange);
        panel2.add(l2);
        frame.add(panel2);
       
        frame.setVisible(true);
    }
    
}
