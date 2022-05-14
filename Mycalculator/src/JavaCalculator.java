import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {


    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel JavaCalculator;
    private JTextField textField;
    private JButton btnEquals;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnMinus;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnOne;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnNine;
    private JButton btnZero;
    private JButton btnClear;
    private JButton btnPlus;
    private JButton btnDivide;

    private void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textField.getText());
        textField.setText("");
    }


    public JavaCalculator()
    {

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField.getText() + btnOne.getText();
                textField.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textField.getText() + btnTwo.getText();
                textField.setText(btnTwoText);

            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textField.getText() + btnThree.getText();
                textField.setText(btnThreeText);

            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textField.getText() + btnFour.getText();
                textField.setText(btnFourText);

            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textField.getText() + btnFive.getText();
                textField.setText(btnFiveText);

            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textField.getText() + btnSix.getText();
                textField.setText(btnSixText);

            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textField.getText() + btnSeven.getText();
                textField.setText(btnSevenText);

            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textField.getText() + btnEight.getText();
                textField.setText(btnEightText);

            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textField.getText() + btnNine.getText();
                textField.setText(btnNineText);

            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textField.getText() + btnZero.getText();
                textField.setText(btnZeroText);

            }
        });

        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().equals(""))
                {
                    textField.setText("0.");
                }

                else if (textField.getText().contains("."))
                {
                    btnPoint.setEnabled(false);
                }
                else
                {
                    String btnPointText = textField.getText() + btnPoint.getText();
                    textField.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String button_text = btnPlus.getText();
               getOperator(button_text);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(textField.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textField.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textField.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textField.getText());
                        break;
                    case '%':
                        total2 = total1 % Double.parseDouble(textField.getText());
                        break;
                }
                textField.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textField.setText("");

            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
