package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private double total3 = 0.0;
    private double total4 = 0.0;
    private char operasimtk;

    private JPanel panelcalculator;
    private JTextField field1;
    private JTextField field2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn0;
    private JButton btntambah;
    private JButton btnkurang;
    private JButton btnkali;
    private JButton btnbagi;
    private JButton btntitik;
    private JButton btnclear;
    private JButton btnsamadengan;
    private JButton btnconvert;
    private JLabel labelnote1;
    private JLabel labelnote2;
    private JTextField fieldtext;
    private JTextField field3;
    private JButton btnconvert2;

    private void getOperator (String btntext) {
        operasimtk = btntext.charAt(0);
        total1 = total1 + Double.parseDouble(field1.getText());
        field1.setText("");
    }

    public Calculator() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn1text = field1.getText() + btn1.getText();
                field1.setText(btn1text);
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn2text = field1.getText() + btn2.getText();
                field1.setText(btn2text);
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn3text = field1.getText() + btn3.getText();
                field1.setText(btn3text);
            }
        });

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn4text = field1.getText() + btn4.getText();
                field1.setText(btn4text);
            }
        });

        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn5text = field1.getText() + btn5.getText();
                field1.setText(btn5text);
            }
        });

        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn6text = field1.getText() + btn6.getText();
                field1.setText(btn6text);
            }
        });

        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn7text = field1.getText() + btn7.getText();
                field1.setText(btn7text);
            }
        });

        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn8text = field1.getText() + btn8.getText();
                field1.setText(btn8text);
            }
        });

        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn9text = field1.getText() + btn9.getText();
                field1.setText(btn9text);
            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btn0text = field1.getText() + btn0.getText();
                field1.setText(btn0text);
            }
        });

        btntitik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (field1.getText().equals("")) {
                    field1.setText("0.");
                } else if (field1.getText().contains(".")) {
                    btntitik.setEnabled(false);
                } else {
                    String btntitiktext = field1.getText() + btntitik.getText();
                    field1.setText(btntitiktext);
                }
                btntitik.setEnabled(true);
            }
        });

        btntambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btntambah.getText();
                getOperator(button_text);
            }
        });

        btnkurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnkurang.getText();
                getOperator(button_text);
            }
        });

        btnkali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnkali.getText();
                getOperator(button_text);
            }
        });

        btnbagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnbagi.getText();
                getOperator(button_text);
            }
        });

        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = 0;
                total2 = 0;
                field1.setText("");
            }
        });

        btnsamadengan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (operasimtk) {
                    case '+':
                        total2 = total1 + Double.parseDouble(field1.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(field1.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(field1.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(field1.getText());
                        break;
                }
                field1.setText(Double.toString(total2));
                total1 = 0;
            }
        });

        btnconvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (total1 > 0) {
                    total3 = total1 * 0.000068;
                    field2.setText(Double.toString(total3));
                    fieldtext.setText("Konversi IDR ke USD dari " +
                            total1 + " IDR adalah " +
                            total3 + " USD.");
                    total1 = 0;
                    total2 = 0;
                }
                else if (total2 > 0) {
                    total3 = total2 * 0.000068;
                    field2.setText(Double.toString(total3));
                    fieldtext.setText("Konversi IDR ke USD dari " +
                            total2 + " IDR adalah " +
                            total3 + " USD.");
                    total1 = 0;
                    total2 = 0;
                }
            }
        });

        btnconvert2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (total1 > 0) {
                    total4 = total1 * 14617.25;
                    field3.setText(Double.toString(total4));
                    fieldtext.setText("Konversi USD ke IDR dari " +
                            total1 + " USD adalah " +
                            total4 + " IDR.");
                    total1 = 0;
                    total2 = 0;
                }
                else if (total2 > 0) {
                    total4 = total2 * 14617.25;
                    field3.setText(Double.toString(total4));
                    fieldtext.setText("Konversi USD ke IDR dari " +
                            total2 + " USD adalah " +
                            total4 + " IDR.");
                    total1 = 0;
                    total2 = 0;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().panelcalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(725,500);
    }

}
