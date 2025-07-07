import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);  // Important when using setBounds()

        ImageIcon i1 = new ImageIcon("img1.jpg");
        JLabel label = new JLabel(i1);
        label.setBounds(0, 0, i1.getIconWidth(), i1.getIconHeight());
        add(label);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,80,400,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD, 40));
        add(heading);

        JLabel name = new JLabel("Please Enter Your Name");
        name.setBounds(740,170,250,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD, 20));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(740,200,300,25);
        tfname.setFont(new Font("Mongolian Baiti",Font.BOLD, 40));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(740,270,120,25);
        rules.addActionListener(this);        
        add(rules);

        back = new JButton("Back");
        back.setBounds(920,270,120,25);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules){
            String name = tfname.getText();
            new Rules(name);
        }   else if (ae.getSource() == back){
                setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
