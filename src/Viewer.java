import javax.swing.*;
import java.awt.*;

public class Viewer {
    private JTextField textField;

    Viewer() {

        Controller controller = new Controller(this);

        textField = new JTextField();
        textField.setBounds(5, 5, 272, 75);
        textField.setFont(new Font("Italic",Font.BOLD,15));
        textField.setForeground(Color.BLACK);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        textField.setBackground(new Color(213, 246, 246));

        JButton buttonDel = new JButton("C");
        buttonDel.setBounds(5, 85, 60, 60);
        buttonDel.addActionListener(controller);
        buttonDel.setActionCommand("C");
        buttonDel.setBackground(new Color(213, 246, 246));

        JButton buttonPercent = new JButton("%");
        buttonPercent.setBounds(75, 85, 60, 60);
        buttonPercent.addActionListener(controller);
        buttonPercent.setActionCommand("%");
        buttonPercent.setBackground(new Color(213, 246, 246));

        JButton buttonBracket = new JButton("<");
        buttonBracket.setBounds(145, 85, 60, 60);
        buttonBracket.addActionListener(controller);
        buttonBracket.setActionCommand("Backspace");
        buttonBracket.setBackground(new Color(213, 246, 246));

        JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.setBounds(215, 85, 60, 60);
        buttonMultiplication.addActionListener(controller);
        buttonMultiplication.setActionCommand("*");
        buttonMultiplication.setBackground(new Color(213, 246, 246));

        JButton button7 = new JButton("7");
        button7.setBounds(5, 155, 60, 60);
        button7.addActionListener(controller);
        button7.setActionCommand("7");
        button7.setBackground(new Color(213, 246, 246));

        JButton button8 = new JButton("8");
        button8.setBounds(75, 155, 60, 60);
        button8.addActionListener(controller);
        button8.setActionCommand("8");
        button8.setBackground(new Color(213, 246, 246));

        JButton button9 = new JButton("9");
        button9.setBounds(145, 155, 60, 60);
        button9.addActionListener(controller);
        button9.setActionCommand("9");
        button9.setBackground(new Color(213, 246, 246));

        JButton buttonDivision = new JButton("/");
        buttonDivision.setBounds(215, 155, 60, 60);
        buttonDivision.addActionListener(controller);
        buttonDivision.setActionCommand("/");
        buttonDivision.setBackground(new Color(213, 246, 246));


        JButton button4 = new JButton("4");
        button4.setBounds(5, 225, 60, 60);
        button4.addActionListener(controller);
        button4.setActionCommand("4");
        button4.setBackground(new Color(213, 246, 246));

        JButton button5 = new JButton("5");
        button5.setBounds(75, 225, 60, 60);
        button5.addActionListener(controller);
        button5.setActionCommand("5");
        button5.setBackground(new Color(213, 246, 246));

        JButton button6 = new JButton("6");
        button6.setBounds(145, 225, 60, 60);
        button6.addActionListener(controller);
        button6.setActionCommand("6");
        button6.setBackground(new Color(213, 246, 246));

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(215, 225, 60, 60);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("+");
        buttonPlus.setBackground(new Color(213, 246, 246));

        JButton button1 = new JButton("1");
        button1.setBounds(5, 295, 60, 60);
        button1.addActionListener(controller);
        button1.setActionCommand("1");
        button1.setBackground(new Color(213, 246, 246));

        JButton button2 = new JButton("2");
        button2.setBounds(75, 295, 60, 60);
        button2.addActionListener(controller);
        button2.setActionCommand("2");
        button2.setBackground(new Color(213, 246, 246));

        JButton button3 = new JButton("3");
        button3.setBounds(145, 295, 60, 60);
        button3.addActionListener(controller);
        button3.setActionCommand("3");
        button3.setBackground(new Color(213, 246, 246));

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(215, 295, 60, 60);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("-");
        buttonMinus.setBackground(new Color(213, 246, 246));

        JButton buttonComma = new JButton(",");
        buttonComma.setBounds(5, 365, 60, 60);
        buttonComma.addActionListener(controller);
        buttonComma.setActionCommand(",");
        buttonComma.setBackground(new Color(213, 246, 246));

        JButton buttonNull = new JButton("0");
        buttonNull.setBounds(75, 365, 60, 60);
        buttonNull.addActionListener(controller);
        buttonNull.setActionCommand("0");
        buttonNull.setBackground(new Color(213, 246, 246));

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(145, 365, 130, 60);
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("=");
        buttonEqual.setBackground(new Color(213, 246, 246));

        JFrame frame = new JFrame("Calculator");
        frame.setSize(297, 468);
        frame.setLayout(null);
        frame.add(buttonDel);
        frame.add(buttonPercent);
        frame.add(buttonBracket);
        frame.add(buttonMultiplication);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonDivision);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(buttonPlus);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(buttonMinus);
        frame.add(buttonComma);
        frame.add(buttonNull);
        frame.add(buttonEqual);
        frame.add(textField);
        frame.setBackground(new Color(45, 210, 210));
        frame.setLocation(50, 100);
        frame.setVisible(true);
    }

    public void update(String text)  {
        textField.setText(text);
    }

}
