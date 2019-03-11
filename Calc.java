package newCalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {

    public static void main(String[] args) {

        JFrame mainWind = new JFrame("Calculator");
        mainWind.setSize(400, 400);
        mainWind.setLocation(500, 200);
        mainWind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField = new JTextField("");
        CalcLog calcLog = new CalcLog();
//--------------------------------------------------------------------------------------------------------
        ActionListener btnListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(jTextField.getText() + ((JButton)e.getSource()).getText());
            }
        };

        ActionListener simvolListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( jTextField.getText() ==  null ){
                    return;
                }
                if ( jTextField.getText() != null && calcLog.getOper1() == 0) {
                    calcLog.setOper1( Integer.valueOf(jTextField.getText()));
                      jTextField.setText("");
                }
                calcLog.setChat( ((JButton)e.getSource()).getText());

            }
        };

        ActionListener clearListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                jTextField.setText("");
                calcLog.setOper1(0);
                calcLog.setOper2(0);
            }
        };

        ActionListener sumListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if ( jTextField.getText() != null && calcLog.getOper2() == 0) {
                    calcLog.setOper2( Integer.valueOf(jTextField.getText()));
                    jTextField.setText("");

                }
                jTextField.setText(Integer.toString(calcLog.getetResult()));
                calcLog.setOper1(0);
                calcLog.setOper2(0);
             }
        };

//--------------------------------------------------------------------------------------------------------
        Container container = mainWind.getContentPane();
        container.add(jTextField, BorderLayout.NORTH);
//--------------------------------------------------------------------------------------------------------

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1,3));
        container.add(jPanel, BorderLayout.CENTER);
//--------------------------------------------------------------------------------------------------------

        JPanel jPanelLeft = new JPanel();
        jPanelLeft.setLayout(new GridLayout(4, 3));
        jPanel.add(jPanelLeft);

        JButton but1 = new JButton("1");
        JButton but2 = new JButton("2");
        JButton but3 = new JButton("3");
        JButton but4 = new JButton("4");
        JButton but5 = new JButton("5");
        JButton but6 = new JButton("6");
        JButton but7 = new JButton("7");
        JButton but8 = new JButton("8");
        JButton but9 = new JButton("9");
        JButton but0 = new JButton("0");
        jPanelLeft.add(but7);
        jPanelLeft.add(but8);
        jPanelLeft.add(but9);
        jPanelLeft.add(but4);
        jPanelLeft.add(but5);
        jPanelLeft.add(but6);
        jPanelLeft.add(but1);
        jPanelLeft.add(but2);
        jPanelLeft.add(but3);
        jPanelLeft.add(but0);
        but1.addActionListener(btnListener);
        but2.addActionListener(btnListener);
        but3.addActionListener(btnListener);
        but4.addActionListener(btnListener);
        but5.addActionListener(btnListener);
        but6.addActionListener(btnListener);
        but7.addActionListener(btnListener);
        but8.addActionListener(btnListener);
        but9.addActionListener(btnListener);
        but0.addActionListener(btnListener);

//--------------------------------------------------------------------------------------------------------
        JPanel jPanelCenter = new JPanel();
        jPanelCenter.setLayout(new GridLayout(4, 1));
        jPanel.add(jPanelCenter);

        JButton butPlus = new JButton("+");
        JButton butMinus = new JButton("-");
        JButton butMnoz = new JButton("*");
        JButton butDel = new JButton("/");
        jPanelCenter.add(butPlus);
        jPanelCenter.add(butMinus);
        jPanelCenter.add(butMnoz);
        jPanelCenter.add(butDel);
        butPlus.addActionListener(simvolListener);
        butMinus.addActionListener(simvolListener);
        butMnoz.addActionListener(simvolListener);
        butDel.addActionListener(simvolListener);

//--------------------------------------------------------------------------------------------------------
        JPanel jPanelRight = new JPanel();
        jPanelRight.setLayout(new GridLayout(2, 1));
        jPanel.add(jPanelRight);

        JButton butC = new JButton("C");
        JButton butRes = new JButton("=");
        jPanelRight.add(butC);
        jPanelRight.add(butRes);
        butC.addActionListener(clearListener);
        butRes.addActionListener(sumListener);

        mainWind.setVisible(true);

    }
}
