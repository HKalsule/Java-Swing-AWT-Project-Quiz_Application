import java.awt.*;
import javax.swing.*;

public class Rules extends JFrame{
    Rules(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Rules");
        heading.setBounds(50,20,700,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD, 40));
        add(heading);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Rules();
    }
}
