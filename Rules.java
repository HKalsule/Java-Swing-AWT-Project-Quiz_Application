import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton start;
    JButton back;
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50,20,700,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD, 40));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Mongolian Baiti",Font.BOLD, 20));
        rules.setText("<html>" +
            "1. You must enter your name to start the quiz.<br><br>" +
            "2. The quiz contains 10 multiple-choice questions.<br><br>" +
            "3. Each question carries 1 mark.<br><br>" +
            "4. No negative marking for wrong answers.<br><br>" +
            "5. You will have 15 minutes to complete the quiz.<br><br>" +
            "6. Do not refresh or close the window during the quiz.<br><br>" +
            "7. Once submitted, answers cannot be changed.<br><br>" +
            "8. Avoid using unfair means during the quiz.<br><br>" +
            "9. You can view your score at the end of the quiz.<br><br>" +
            "10. Click the 'Rules' button after entering your name to begin." +
            "</html>");
        add(rules);

        start = new JButton("Start");
        start.setBounds(150,500,120,25);
        start.addActionListener(this);        
        add(start);

        back = new JButton("Back");
        back.setBounds(300,500,120,25);
        back.addActionListener(this);
        add(back);

        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){

        }else {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}
