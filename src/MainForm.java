import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class MainForm {
    private JPanel panelMain;
    private JTextField txtDisplej;
    private JButton btOdmocnina;
    private JButton btX2;
    private JButton bt1Lx;
    private JButton btCE;
    private JButton btC;
    private JButton btDEL;
    private JButton btDeleno;
    private JButton bt7;
    private JButton bt8;
    private JButton btPM;
    private JButton bt0;
    private JButton btDot;
    private JButton btResult;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt9;
    private JButton btKrat;
    private JButton btMinus;
    private JButton btPlus;

    private boolean False = false;
    private String display = "";
    private String Operator = "";
    private Boolean PlusMinus = true;
    private Double TEMP;
    private Double ValueA = 0.0;
    private Double ValueB = 0.0;
    private Double FinalValue = 0.0;

    public MainForm() {
        bt1.addActionListener(new ActionListener() {
            // 1 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "1");
            }
        });

        bt2.addActionListener(new ActionListener() {
            // 2 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "2");
            }
        });

        bt3.addActionListener(new ActionListener() {
            // 3 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "3");
            }
        });

        bt4.addActionListener(new ActionListener() {
            // 4 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "4");
            }
        });

        bt5.addActionListener(new ActionListener() {
            // 5 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "5");
            }
        });

        bt6.addActionListener(new ActionListener() {
            // 6 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "6");
            }
        });

        bt7.addActionListener(new ActionListener() {
            // 7 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "7");
            }
        });

        bt8.addActionListener(new ActionListener() {
            // 8 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "8");
            }
        });

        bt9.addActionListener(new ActionListener() {
            // 9 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "9");
            }
        });

        bt0.addActionListener(new ActionListener() {
            // 0 //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                txtDisplej.setText(display + "0");
            }
        });

        btPM.addActionListener(new ActionListener() {
            // +/- //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                try {
                    if (display.length() != 0) {
                        TEMP = Double.parseDouble(display) * (-1);
                        txtDisplej.setText(TEMP.toString());
                        btDot.setEnabled(False);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nezadal/a jste žádnou hodnotu.", "Chyba", 0);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Výsledek nelze negovat", "Chyba", 0);
                }

            }
        });

        btDot.addActionListener(new ActionListener() {
            // . //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                if (PlusMinus == true && txtDisplej.getText().length() != 0) {
                    txtDisplej.setText(display + ".");
                    PlusMinus = false;
                } else {
                    txtDisplej.setText("0.");
                    PlusMinus = false;
                }
            }
        });

        btC.addActionListener(new ActionListener() {
            // C //
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplej.setText("");
            }
        });

        btCE.addActionListener(new ActionListener() {
            // CE //
            @Override
            public void actionPerformed(ActionEvent e) {
                ValueA = 0.0;
                ValueB = 0.0;
                FinalValue = 0.0;
                Operator = "";
                PlusMinus = true;
                txtDisplej.setText("");

                btPlus.setEnabled(true); // +
                btMinus.setEnabled(true); // -
                btKrat.setEnabled(true); // *
                btDeleno.setEnabled(true); // /
                btOdmocnina.setEnabled(true); // odmocnina
                bt1Lx.setEnabled(true); // 1/x
                btResult.setEnabled(true); // =
                btPM.setEnabled(true); // +/-
                btDEL.setEnabled(true); // <-
                bt0.setEnabled(true); // 0
                bt1.setEnabled(true); // 1
                bt2.setEnabled(true); // 2
                bt3.setEnabled(true); // 3
                bt4.setEnabled(true); // 4
                bt5.setEnabled(true); // 5
                bt6.setEnabled(true); // 6
                bt7.setEnabled(true); // 7
                bt8.setEnabled(true); // 8
                bt9.setEnabled(true); // 9
                btDot.setEnabled(true); // .
                btC.setEnabled(true); // C
                btX2.setEnabled(true); // x^2
            }
        });

        btDEL.addActionListener(new ActionListener() {
            // DEL //
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplej.getText().length() != 0) {
                    display = txtDisplej.getText();
                    txtDisplej.setText(display.substring(0, display.length() - 1));
                }
            }
        });

        btOdmocnina.addActionListener(new ActionListener() {
            // Odmocnina //
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplej.getText().length() != 0) {
                    ValueA = Double.parseDouble(txtDisplej.getText());
                    TEMP = Math.sqrt(ValueA);
                    txtDisplej.setText(TEMP.toString());

                }
            }
        });

        btPlus.addActionListener(new ActionListener() {
            // + //
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplej.getText().length() != 0) {
                    ValueA = Double.parseDouble(txtDisplej.getText());
                    Operator = "+";
                    txtDisplej.setText("");
                    PlusMinus = true;

                    btPlus.setEnabled(false); // +
                    btKrat.setEnabled(false); // *
                    btMinus.setEnabled(false); // -
                    btDeleno.setEnabled(false); // /
                    btOdmocnina.setEnabled(false); // odmocnina
                    bt1Lx.setEnabled(false); // 1/x
                    btX2.setEnabled(false); // x^2
                    btPM.setEnabled(true); // +/-

                    btResult.setEnabled(true); // =

                } else {
                    JOptionPane.showMessageDialog(null, "Nezadal/a jste žádnou hodnotu.", "Chyba", 0);
                }
            }
        });

        btResult.addActionListener(new ActionListener() {
            // = //
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplej.getText().length() != 0) {
                    ValueB = Double.parseDouble(txtDisplej.getText());
                    switch (Operator) {
                        case "+":
                            FinalValue = ValueA + ValueB;
                            break;
                        case "-":
                            FinalValue = ValueA - ValueB;
                            break;
                        case "*":
                            FinalValue = ValueA * ValueB;
                            break;
                        case "/":
                            if (ValueB != 0) {
                                FinalValue = ValueA / ValueB;
                            } else {
                                JOptionPane.showMessageDialog(null, "Nulou nelze dělit.", "Chyba", 0);
                            }
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Nezadal/a jste žádnou hodnotu.", "Chyba", 0);
                }
                txtDisplej.setText(FinalValue.toString());

                ValueA = FinalValue;

                btMinus.setEnabled(true);
                btPlus.setEnabled(true);
                btDeleno.setEnabled(true);
                btKrat.setEnabled(true);
                bt1Lx.setEnabled(true);
                btOdmocnina.setEnabled(true);
                btX2.setEnabled(true);
                btPM.setEnabled(true); // +/-
            }
        });

        bt1Lx.addActionListener(new ActionListener() {
            // 1/x //
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                System.out.println(display);
                if ("0".equals(display) || "".equals(display)) {
                    JOptionPane.showMessageDialog(null, "Nulou nelze dělit.", "Chyba", 0);
                } else {
                    TEMP = 1 / Double.parseDouble(display);
                    txtDisplej.setText(TEMP.toString());
                }
            }
        });
        btMinus.addActionListener(new ActionListener() {
            // - //
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplej.getText().length() != 0) {
                    ValueA = Double.parseDouble(txtDisplej.getText());
                    System.out.println(ValueA);
                    Operator = "-";
                    txtDisplej.setText("");

                    PlusMinus = true;

                    btPlus.setEnabled(false); // +
                    btKrat.setEnabled(false); // *
                    btMinus.setEnabled(false); // -
                    btDeleno.setEnabled(false); // /
                    btOdmocnina.setEnabled(false); // odmocnina
                    bt1Lx.setEnabled(false); // 1/x
                    btX2.setEnabled(false); // x^2
                    btPM.setEnabled(true); // +/-

                    btResult.setEnabled(true); // =

                } else {
                    JOptionPane.showMessageDialog(null, "Nezadal/a jste žádnou hodnotu.", "Chyba", 0);
                }
            }
        });
        btKrat.addActionListener(new ActionListener() {
            // * //
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplej.getText().length() != 0) {
                    ValueA = Double.parseDouble(txtDisplej.getText());
                    System.out.println(ValueA);
                    Operator = "*";
                    txtDisplej.setText("");

                    PlusMinus = true;

                    btPlus.setEnabled(false); // +
                    btKrat.setEnabled(false); // *
                    btMinus.setEnabled(false); // -
                    btDeleno.setEnabled(false); // /
                    btOdmocnina.setEnabled(false); // odmocnina
                    bt1Lx.setEnabled(false); // 1/x
                    btX2.setEnabled(false); // x^2
                    btPM.setEnabled(true); // +/-

                    btResult.setEnabled(true); // =

                } else {
                    JOptionPane.showMessageDialog(null, "Nezadal/a jste žádnou hodnotu.", "Chyba", 0);
                }
            }
        });

        btDeleno.addActionListener(new ActionListener() {
            // / //
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplej.getText().length() != 0) {
                    ValueA = Double.parseDouble(txtDisplej.getText());
                    System.out.println(ValueA);
                    Operator = "/";
                    txtDisplej.setText("");

                    PlusMinus = true;

                    btPlus.setEnabled(false); // +
                    btKrat.setEnabled(false); // *
                    btMinus.setEnabled(false); // -
                    btDeleno.setEnabled(false); // /
                    btOdmocnina.setEnabled(false); // odmocnina
                    bt1Lx.setEnabled(false); // 1/x
                    btX2.setEnabled(false); // x^2
                    btPM.setEnabled(true); // +/-

                    btResult.setEnabled(true); // =

                } else {
                    JOptionPane.showMessageDialog(null, "Nezadal/a jste žádnou hodnotu.", "Chyba", 0);
                }
            }
        });
        btX2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display = txtDisplej.getText();
                TEMP = Double.parseDouble(display) * Double.parseDouble(display);
                txtDisplej.setText(TEMP.toString());
            }
        });
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        JFrame frame = new JFrame("Kalkulačka");
        frame.setContentPane(new MainForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}