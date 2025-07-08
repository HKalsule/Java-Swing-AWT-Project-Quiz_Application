import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;


public class quiz extends JFrame {

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];

    JLabel number,question;
    JRadioButton opt1,opt2,opt3,opt4;

    public static int timer = 15;

    quiz() {
        setBounds(50, 0, 1000, 800);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon("img3.jpg");
        JLabel label = new JLabel(i1);
        label.setBounds(0, 0, i1.getIconWidth(), 400);
        add(label);

        number = new JLabel();
        number.setBounds(100, 450, 50, 20);
        number.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(number);

        question = new JLabel();
        question.setBounds(150, 450, 900, 20);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

        questions[0][0] = "What is the capital of France?";
        questions[0][1] = "Berlin";
        questions[0][2] = "Madrid";
        questions[0][3] = "Paris";
        questions[0][4] = "Rome";

        questions[1][0] = "Which planet is known as the Red Planet?";
        questions[1][1] = "Earth";
        questions[1][2] = "Mars";
        questions[1][3] = "Jupiter";
        questions[1][4] = "Saturn";

        questions[2][0] = "Who wrote 'Romeo and Juliet'?";
        questions[2][1] = "Charles Dickens";
        questions[2][2] = "William Shakespeare";
        questions[2][3] = "Leo Tolstoy";
        questions[2][4] = "Jane Austen";

        questions[3][0] = "What is the largest ocean on Earth?";
        questions[3][1] = "Atlantic Ocean";
        questions[3][2] = "Indian Ocean";
        questions[3][3] = "Pacific Ocean";
        questions[3][4] = "Arctic Ocean";

        questions[4][0] = "Which gas do plants absorb from the atmosphere?";
        questions[4][1] = "Oxygen";
        questions[4][2] = "Carbon Dioxide";
        questions[4][3] = "Nitrogen";
        questions[4][4] = "Hydrogen";

        questions[5][0] = "Who was the first President of India?";
        questions[5][1] = "Jawaharlal Nehru";
        questions[5][2] = "Rajendra Prasad";
        questions[5][3] = "APJ Abdul Kalam";
        questions[5][4] = "B. R. Ambedkar";

        questions[6][0] = "Which element has the chemical symbol 'O'?";
        questions[6][1] = "Osmium";
        questions[6][2] = "Oxygen";
        questions[6][3] = "Gold";
        questions[6][4] = "Silver";

        questions[7][0] = "How many continents are there on Earth?";
        questions[7][1] = "5";
        questions[7][2] = "6";
        questions[7][3] = "7";
        questions[7][4] = "8";

        questions[8][0] = "What is the square root of 144?";
        questions[8][1] = "11";
        questions[8][2] = "12";
        questions[8][3] = "13";
        questions[8][4] = "14";

        questions[9][0] = "Which is the smallest prime number?";
        questions[9][1] = "0";
        questions[9][2] = "1";
        questions[9][3] = "2";
        questions[9][4] = "3";

        answers[0][1] = "Paris";
        answers[1][1] = "Mars";
        answers[2][1] = "William Shakespeare";
        answers[3][1] = "Pacific Ocean";
        answers[4][1] = "Carbon Dioxide";
        answers[5][1] = "Rajendra Prasad";
        answers[6][1] = "Oxygen";
        answers[7][1] = "7";
        answers[8][1] = "12";
        answers[9][1] = "2";

        opt1 = new JRadioButton();
        opt1.setBounds(170,500,700,30);
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(170,550,700,30);
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(170,600,700,30);
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(170,650,700,30);
        add(opt4);

        ButtonGroup groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        JButton next = new JButton("Next");
        next.setBounds(370,710,120,25);
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        add(next);

        JButton lifeline = new JButton("50-50");
        lifeline.setBounds(170,710,120,25);
        lifeline.setBackground(new Color(30,144,255));
        lifeline.setForeground(Color.WHITE);
        add(lifeline);

        JButton Submit = new JButton("Submit");
        Submit.setBounds(570,710,120,25);
        Submit.setBackground(new Color(30,144,255));
        Submit.setForeground(Color.WHITE);
        Submit.setEnabled(false);
        add(Submit);

        start(1);

        setVisible(true);
    }

    public void paint(Graphics g){
    super.paint(g);
    g.setColor(Color.RED);
    g.setFont(new Font("Tahoma", Font.BOLD, 18));
    String time = "Time Left: " + timer + " seconds";
    
    if(timer>0){
    g.drawString(time, 750, 500); 
    }
    timer --;

    try {
        Thread.sleep(1000);
        repaint();
    } catch (Exception e){
        e.printStackTrace();
    }
}


    public void start(int count){
        question.setText("" + (count + 1) + ".");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt2.setText(questions[count][2]);
        opt3.setText(questions[count][3]);
        opt4.setText(questions[count][4]);
    }
    public static void main(String[] args) {
        new quiz();
    }
}
