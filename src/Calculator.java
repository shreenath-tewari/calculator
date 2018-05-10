import java.io.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame {

    protected JTextField inputArea;

    protected JButton addButton;
    protected JButton subButton;
    protected JButton mulButton;
    protected JButton divButton;
    protected JButton equalsButton;

    protected int a;
    protected int b;

    protected String operation;

    public Calculator() {

        operation = "";

        inputArea = new JTextField();
        inputArea.setBounds(10, 10, 280, 30);

        addButton = new JButton("+");
        addButton.setBounds(10, 60, 50, 20);
        subButton = new JButton("-");
        subButton.setBounds(90, 60, 50, 20);
        mulButton = new JButton("X");
        mulButton.setBounds(160, 60, 50, 20);
        divButton = new JButton("/");
        divButton.setBounds(240, 60, 50, 20);
        equalsButton = new JButton("=");
        equalsButton.setBounds(115, 90, 70, 25);

        add(inputArea);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);
        add(equalsButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a = Integer.parseInt(inputArea.getText());
                inputArea.setText("");
                operation = "add";
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a = Integer.parseInt(inputArea.getText());
                inputArea.setText("");
                operation = "sub";
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a = Integer.parseInt(inputArea.getText());
                inputArea.setText("");
                operation = "mul";
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                a= Integer.parseInt(inputArea.getText());
                inputArea.setText("");
                operation = "div";
            }
        });

        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                b = Integer.parseInt(inputArea.getText());
                if(operation.equals("add")) {
                    operation = "";
                    int c = a + b;
                    inputArea.setText(c + "");
                }
                else if(operation.equals("sub")){
                    operation = "";
                    int c = a - b;
                    inputArea.setText(c + "");
                }
                else if(operation.equals("mul")){
                    operation = "";
                    int c = a * b;
                    inputArea.setText(c + "");
                }
                else if(operation.equals("div")){
                    operation = "";
                    int c = a / b;
                    inputArea.setText(c + "");
                }


            }
        });



        setLayout(null);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}