import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class myCal implements ActionListener
{
    static JFrame frame;
    static JPanel panel;
    static JTextField answerField;
    static JButton zero,one,two,three,four,five,six,seven,eight,nine,dotButton,cButton,addButton,divButton,subButton,mulButton,modButton,equalButton;

    String leftValue,middleValue,rightValue,finalValue;
    myCal()
    {
        leftValue = "";
        middleValue = "";
        rightValue = "";
        finalValue = "";
    }

    public static void main(String[] args) 
    {
        frame = new JFrame("Calaculater");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(305,480);
        frame.setResizable(false);

        panel = new JPanel();
        panel.setLayout(null);

        answerField = new JTextField();
        answerField.setBounds(20,30,265,60);
        answerField.setEditable(false);

        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        dotButton = new JButton(".");
        cButton = new JButton("C");
        divButton = new JButton("/");
        mulButton = new JButton("X");
        subButton = new JButton("-");
        addButton = new JButton("+");
        equalButton = new JButton("=");
        modButton = new JButton("%");

        cButton.setBounds(20,110,55,45);
        divButton.setBounds(90,110,55,45);
        mulButton.setBounds(160,110,55,45);
        subButton.setBounds(230,110,55,45);
        seven.setBounds(20,170,55,45);
        eight.setBounds(90,170,55,45);
        nine.setBounds(160,170,55,45);
        addButton.setBounds(230,170,55,45);
        four.setBounds(20,230,55,45);
        five.setBounds(90,230,55,45);
        six.setBounds(160,230,55,45);
        modButton.setBounds(230,230,55,45);
        one.setBounds(20,290,55,45);
        two.setBounds(90,290,55,45);
        three.setBounds(160,290,55,45);
        equalButton.setBounds(230,290,55,105);
        zero.setBounds(20,350,125,45);
        dotButton.setBounds(160,350,55,45);

        cButton.setFont(new Font("Arial",Font.PLAIN,20));
        one.setFont(new Font("Arial",Font.PLAIN,20));
        two.setFont(new Font("Arial",Font.PLAIN,20));
        three.setFont(new Font("Arial",Font.PLAIN,20));
        four.setFont(new Font("Arial",Font.PLAIN,20));
        five.setFont(new Font("Arial",Font.PLAIN,20));
        six.setFont(new Font("Arial",Font.PLAIN,20));
        seven.setFont(new Font("Arial",Font.PLAIN,20));
        eight.setFont(new Font("Arial",Font.PLAIN,20));
        nine.setFont(new Font("Arial",Font.PLAIN,20));
        zero.setFont(new Font("Arial",Font.PLAIN,20));
        dotButton.setFont(new Font("Arial",Font.PLAIN,30));
        mulButton.setFont(new Font("Arial",Font.PLAIN,20));
        divButton.setFont(new Font("Arial",Font.PLAIN,20));
        subButton.setFont(new Font("Arial",Font.PLAIN,30));
        equalButton.setFont(new Font("Arial",Font.PLAIN,20));
        addButton.setFont(new Font("Arial",Font.PLAIN,20));
        answerField.setFont(new Font("Arial",Font.PLAIN,20));
        modButton.setFont(new Font("Arial",Font.PLAIN,20));

        myCal calculate = new myCal();
        zero.addActionListener(calculate);
        one.addActionListener(calculate);
        two.addActionListener(calculate);
        three.addActionListener(calculate);
        four.addActionListener(calculate);
        five.addActionListener(calculate);
        six.addActionListener(calculate);
        seven.addActionListener(calculate);
        eight.addActionListener(calculate);
        nine.addActionListener(calculate);
        dotButton.addActionListener(calculate);
        cButton.addActionListener(calculate);
        addButton.addActionListener(calculate);
        mulButton.addActionListener(calculate);
        subButton.addActionListener(calculate);
        divButton.addActionListener(calculate);
        equalButton.addActionListener(calculate);
        modButton.addActionListener(calculate);

        frame.add(panel);
        panel.add(answerField);
        panel.add(zero);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);
        panel.add(dotButton);
        panel.add(divButton);
        panel.add(mulButton);
        panel.add(subButton);
        panel.add(addButton);
        panel.add(equalButton);
        panel.add(cButton);
        panel.add(modButton);

        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String actionValue = e.getActionCommand();
        System.out.print(actionValue);

        if(actionValue.charAt(0) >= '0' && actionValue.charAt(0) <= '9' || actionValue.charAt(0) == '.')
        {
            if(!middleValue.equals(""))
            {
                rightValue += actionValue;
            }
            else
            {
                leftValue += actionValue;
            }
            answerField.setText(leftValue + " " + middleValue + " " + rightValue);
        }
        else if(actionValue.charAt(0) == 'C')
        {
            leftValue = "";
            middleValue = "";
            rightValue = "";
            finalValue = "";
            answerField.setText("");
        }
        else if(actionValue.charAt(0) == '+' || actionValue.charAt(0) == '/' || actionValue.charAt(0) == '-' || actionValue.charAt(0) == 'X' || actionValue.charAt(0) == '%')
        {
            middleValue = actionValue;
            answerField.setText(leftValue + " " + middleValue + " " + rightValue);
        }
        else if(actionValue.charAt(0) == '=')
        {
            if(middleValue.equals("+"))
            {
                float fvalue = Float.parseFloat(leftValue) + Float.parseFloat(rightValue);
                System.out.println(fvalue);
                finalValue = Float.toString(fvalue);
                answerField.setText(finalValue);
                leftValue = finalValue;
                finalValue = "";
                rightValue = "";
                middleValue = "";
            }
            else if(middleValue.equals("-"))
            {
                float fvalue = Float.parseFloat(leftValue) - Float.parseFloat(rightValue);
                System.out.println(fvalue);
                finalValue = Float.toString(fvalue);
                answerField.setText(finalValue);
                leftValue = finalValue;
                finalValue = "";
                rightValue = "";
                middleValue = "";
            }
            else if(middleValue.equals("/"))
            {
                float fvalue = Float.parseFloat(leftValue) / Float.parseFloat(rightValue);
                finalValue = Float.toString(fvalue);
                answerField.setText(finalValue);
                leftValue = finalValue;
                finalValue = "";
                rightValue = "";
                middleValue = "";
            }
            else if(middleValue.equals("X"))
            {
                float fvalue = Float.parseFloat(leftValue) * Float.parseFloat(rightValue);
                finalValue = Float.toString(fvalue);
                answerField.setText(finalValue);
                leftValue = finalValue;
                finalValue = "";
                rightValue = "";
                middleValue = "";
            }
            else
            {
                float fvalue = Float.parseFloat(leftValue) % Float.parseFloat(rightValue);
                finalValue = Float.toString(fvalue);
                answerField.setText(finalValue);
                leftValue = finalValue;
                finalValue = "";
                rightValue = "";
                middleValue = "";
            }
        }
    }
}
