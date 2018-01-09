package matrizes;

import java.text.DecimalFormat;
import javax.swing.*;

public class MatrixWindow extends javax.swing.JFrame {

    // declaração de variáveis
    private int rows1;
    private int columns1;
    private int rows2;
    private int columns2;
    private String rowString1;
    private String columnString1;
    private String rowString2;
    private String columnString2;
    private String proportion1;
    private String proportion2;
    private String proportionTimes;
    private int numberOfMatrix;
    private boolean isTransp;
    DecimalFormat df = new DecimalFormat();

    // construtor
    public MatrixWindow() {
        initComponents();
        hideAlmostAll();
        numberOfMatrix = 0;
        isTransp = false;        
        df.applyPattern("0.####");
    }

    // esconde quase todos os campos ao iniciar o programa ou ao trocar o número de matrizes
    public void hideAlmostAll() {
        jLabelSize1.setVisible(false);
        jTFRows1.setVisible(false);
        jLabelPer1.setVisible(false);
        jTFColumns1.setVisible(false);
        jLabelRows1.setVisible(false);
        jLabelColumns1.setVisible(false);
        jButtonOK.setVisible(false);
        jLabelSize2.setVisible(false);
        jTFRows2.setVisible(false);
        jLabelPer2.setVisible(false);
        jTFColumns2.setVisible(false);
        jLabelRows2.setVisible(false);
        jLabelColumns2.setVisible(false);
        jLabelMatrix1.setVisible(false);
        jTFa00.setVisible(false);
        jTFa01.setVisible(false);
        jTFa02.setVisible(false);
        jTFa10.setVisible(false);
        jTFa11.setVisible(false);
        jTFa12.setVisible(false);
        jTFa20.setVisible(false);
        jTFa21.setVisible(false);
        jTFa22.setVisible(false);
        jLabelCalc1.setVisible(false);
        jButtonDet1.setVisible(false);
        jButtonOpp.setVisible(false);
        jButtonTransp.setVisible(false);
        jButtonTimesReal.setVisible(false);
        jButtonClear.setVisible(false);
        jLabelMatrix2.setVisible(false);
        jTFb00.setVisible(false);
        jTFb01.setVisible(false);
        jTFb02.setVisible(false);
        jTFb10.setVisible(false);
        jTFb11.setVisible(false);
        jTFb12.setVisible(false);
        jTFb20.setVisible(false);
        jTFb21.setVisible(false);
        jTFb22.setVisible(false);
        jLabelCalc2.setVisible(false);
        jButtonPlus.setVisible(false);
        jButtonMinus.setVisible(false);
        jButtonTimes.setVisible(false);
        jButtonDet2.setVisible(false);
    }

    // mostra todos os campos de tamanho para a primeira matriz + botão OK
    public void showAllSizeMatrix1() {
        jLabelSize1.setVisible(true);
        jTFRows1.setVisible(true);
        jLabelPer1.setVisible(true);
        jTFColumns1.setVisible(true);
        jLabelRows1.setVisible(true);
        jLabelColumns1.setVisible(true);
        jButtonOK.setVisible(true);
    }

    // mostra todos os campos de tamanho para a segunda matriz
    public void showAllSizeMatrix2() {
        jLabelSize2.setVisible(true);
        jTFRows2.setVisible(true);
        jLabelPer2.setVisible(true);
        jTFColumns2.setVisible(true);
        jLabelRows2.setVisible(true);
        jLabelColumns2.setVisible(true);
    }

    // mostra todos os campos para calcular a primeira matriz + botão Limpar
    public void showAllMatrix1() {
        jLabelMatrix1.setVisible(true);
        jTFa00.setVisible(true);
        jTFa01.setVisible(true);
        jTFa02.setVisible(true);
        jTFa10.setVisible(true);
        jTFa11.setVisible(true);
        jTFa12.setVisible(true);
        jTFa20.setVisible(true);
        jTFa21.setVisible(true);
        jTFa22.setVisible(true);
        jButtonClear.setVisible(true);
        jLabelCalc1.setVisible(true);
        jButtonDet1.setVisible(true);
        jButtonOpp.setVisible(true);
        jButtonTransp.setVisible(true);
        jButtonTimesReal.setVisible(true);
    }

    // mostra todos os campos para calcular a segunda matriz
    public void showAllMatrix2() {
        jLabelMatrix2.setVisible(true);
        jTFb00.setVisible(true);
        jTFb01.setVisible(true);
        jTFb02.setVisible(true);
        jTFb10.setVisible(true);
        jTFb11.setVisible(true);
        jTFb12.setVisible(true);
        jTFb20.setVisible(true);
        jTFb21.setVisible(true);
        jTFb22.setVisible(true);
        jLabelCalc2.setVisible(true);
        jButtonPlus.setVisible(true);
        jButtonMinus.setVisible(true);
        jButtonTimes.setVisible(true);
        jButtonDet2.setVisible(true);
    }

    // escondem cada JTextField da primeira matriz
    public void hideJTFa00() {
        jTFa00.setVisible(false);
    }

    public void hideJTFa01() {
        jTFa01.setVisible(false);
    }

    public void hideJTFa02() {
        jTFa02.setVisible(false);
    }

    public void hideJTFa10() {
        jTFa10.setVisible(false);
    }

    public void hideJTFa11() {
        jTFa11.setVisible(false);
    }

    public void hideJTFa12() {
        jTFa12.setVisible(false);
    }

    public void hideJTFa20() {
        jTFa20.setVisible(false);
    }

    public void hideJTFa21() {
        jTFa21.setVisible(false);
    }

    public void hideJTFa22() {
        jTFa22.setVisible(false);
    }

    // escondem cada JTextField da segunda matriz
    public void hideJTFb00() {
        jTFb00.setVisible(false);
    }

    public void hideJTFb01() {
        jTFb01.setVisible(false);
    }

    public void hideJTFb02() {
        jTFb02.setVisible(false);
    }

    public void hideJTFb10() {
        jTFb10.setVisible(false);
    }

    public void hideJTFb11() {
        jTFb11.setVisible(false);
    }

    public void hideJTFb12() {
        jTFb12.setVisible(false);
    }

    public void hideJTFb20() {
        jTFb20.setVisible(false);
    }

    public void hideJTFb21() {
        jTFb21.setVisible(false);
    }

    public void hideJTFb22() {
        jTFb22.setVisible(false);
    }

    // apaga os textos nos JTextField das matrizes    
    public void clearMatrix() {
        // primeira matriz
        jTFa00.setText("");
        jTFa01.setText("");
        jTFa02.setText("");
        jTFa10.setText("");
        jTFa11.setText("");
        jTFa12.setText("");
        jTFa20.setText("");
        jTFa21.setText("");
        jTFa22.setText("");
        // segunda matriz
        jTFb00.setText("");
        jTFb01.setText("");
        jTFb02.setText("");
        jTFb10.setText("");
        jTFb11.setText("");
        jTFb12.setText("");
        jTFb20.setText("");
        jTFb21.setText("");
        jTFb22.setText("");
    }

    // apaga os textos nos JTextField de tamanhos  
    public void clearSize() {
        // primeira matriz
        jTFRows1.setText("");
        jTFColumns1.setText("");
        // segunda matriz
        jTFRows2.setText("");
        jTFColumns2.setText("");
    }

    // verificação dos dados digitados nos JTextField da primeira matriz
    private boolean verifyNumbersMatrix1() {
        boolean b = false;
        switch (proportion1) {
            case "11":
                if (jTFa00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa00.getText()) == true) {
                    b = true;
                }
                break;
            case "12":
                if (jTFa00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa00.getText()) == true
                        && jTFa01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa01.getText()) == true) {
                    b = true;
                }
                break;
            case "13":
                if (jTFa00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa00.getText()) == true
                        && jTFa01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa01.getText()) == true
                        && jTFa02.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa02.getText()) == true) {
                    b = true;
                }
                break;
            case "21":
                if (jTFa00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa00.getText()) == true
                        && jTFa10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa10.getText()) == true) {
                    b = true;
                }
                break;
            case "22":
                if (jTFa00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa00.getText()) == true
                        && jTFa01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa01.getText()) == true
                        && jTFa10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa10.getText()) == true
                        && jTFa11.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa11.getText()) == true) {
                    b = true;
                }
                break;
            case "23":
                if (jTFa00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa00.getText()) == true
                        && jTFa01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa01.getText()) == true
                        && jTFa02.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa02.getText()) == true
                        && jTFa10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa10.getText()) == true
                        && jTFa11.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa11.getText()) == true
                        && jTFa12.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa12.getText()) == true) {
                    b = true;
                }
                break;
            case "31":
                if (jTFa00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa00.getText()) == true
                        && jTFa10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa10.getText()) == true
                        && jTFa20.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa20.getText()) == true) {
                    b = true;
                }
                break;
            case "32":
                if (jTFa00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa00.getText()) == true
                        && jTFa01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa01.getText()) == true
                        && jTFa10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa10.getText()) == true
                        && jTFa11.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa11.getText()) == true
                        && jTFa20.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa20.getText()) == true
                        && jTFa21.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa21.getText()) == true) {
                    b = true;
                }
                break;
            case "33":
                if (jTFa00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa00.getText()) == true
                        && jTFa01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa01.getText()) == true
                        && jTFa02.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa02.getText()) == true
                        && jTFa10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa10.getText()) == true
                        && jTFa11.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa11.getText()) == true
                        && jTFa12.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa12.getText()) == true
                        && jTFa20.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa20.getText()) == true
                        && jTFa21.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa21.getText()) == true
                        && jTFa22.getText().matches("[0-9.-]+") && verifyMinusDots(jTFa22.getText()) == true) {
                    b = true;
                }
                break;
        }
        return b;
    }

    // verificação dos dados digitados nos JTextField da segunda matriz
    private boolean verifyNumbersMatrix2() {
        boolean b = false;
        switch (proportion2) {
            case "11":
                if (jTFb00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb00.getText()) == true) {
                    b = true;
                }
                break;
            case "12":
                if (jTFb00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb00.getText()) == true
                        && jTFb01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb01.getText()) == true) {
                    b = true;
                }
                break;
            case "13":
                if (jTFb00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb00.getText()) == true
                        && jTFb01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb01.getText()) == true
                        && jTFb02.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb02.getText()) == true) {
                    b = true;
                }
                break;
            case "21":
                if (jTFb00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb00.getText()) == true
                        && jTFb10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb10.getText()) == true) {
                    b = true;
                }
                break;
            case "22":
                if (jTFb00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb00.getText()) == true
                        && jTFb01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb01.getText()) == true
                        && jTFb10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb10.getText()) == true
                        && jTFb11.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb11.getText()) == true) {
                    b = true;
                }
                break;
            case "23":
                if (jTFb00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb00.getText()) == true
                        && jTFb01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb01.getText()) == true
                        && jTFb02.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb02.getText()) == true
                        && jTFb10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb10.getText()) == true
                        && jTFb11.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb11.getText()) == true
                        && jTFb12.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb12.getText()) == true) {
                    b = true;
                }
                break;
            case "31":
                if (jTFb00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb00.getText()) == true
                        && jTFb10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb10.getText()) == true
                        && jTFb20.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb20.getText()) == true) {
                    b = true;
                }
                break;
            case "32":
                if (jTFb00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb00.getText()) == true
                        && jTFb01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb01.getText()) == true
                        && jTFb10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb10.getText()) == true
                        && jTFb11.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb11.getText()) == true
                        && jTFb20.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb20.getText()) == true
                        && jTFb21.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb21.getText()) == true) {
                    b = true;
                }
                break;
            case "33":
                if (jTFb00.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb00.getText()) == true
                        && jTFb01.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb01.getText()) == true
                        && jTFb02.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb02.getText()) == true
                        && jTFb10.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb10.getText()) == true
                        && jTFb11.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb11.getText()) == true
                        && jTFb12.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb12.getText()) == true
                        && jTFb20.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb20.getText()) == true
                        && jTFb21.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb21.getText()) == true
                        && jTFb22.getText().matches("[0-9.-]+") && verifyMinusDots(jTFb22.getText()) == true) {
                    b = true;
                }
                break;
        }
        return b;
    }

    // verificações do sinal negativo e do ponto
    public boolean verifyMinusDots(String s) {
        boolean b = true;
        // verifica se String possui apenas o sinal negativo
        if (s.equals("-")) {
            b = false;
        }
        // verifica se sinal negativo está em outra posição da String que não a primeira
        if (b == true) {
            char cMinus;
            for (int i = 1; i < s.length(); i++) {
                cMinus = s.charAt(i);
                if (cMinus == '-') {
                    b = false;
                }
            }
        }
        // verifica o número de pontos na String
        if (b == true) {            
            char cDot;
            int totalDots = 0;
            for (int j = 0; j < s.length(); j++) {
                cDot = s.charAt(j);
                if (cDot == '.') {
                    totalDots++;
                    if (totalDots > 1) {
                        b = false;
                    }
                }
            }
        }
        // verifica se a primeira ou a última posição da String tem ponto
        if (b == true) {
            char cFirst = s.charAt(0);
            char cLast = s.charAt(s.length() - 1);
            if (cFirst == '.' || cLast == '.') {
                b = false;
            }
        }
        return b;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelMatrix = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelAuthor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabelVersion = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabelOption = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButtonOption1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButtonOption2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jLabelSize1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabelSize2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButtonOK = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jTFColumns2 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jTFRows1 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabelPer2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabelColumns1 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabelColumns2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel18 = new javax.swing.JPanel();
        jTFColumns1 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabelRows1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabelRows2 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabelPer1 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jTFRows2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel23 = new javax.swing.JPanel();
        jLabelMatrix1 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabelCalc1 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jButtonDet1 = new javax.swing.JButton();
        jButtonTimesReal = new javax.swing.JButton();
        jButtonOpp = new javax.swing.JButton();
        jButtonTransp = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jTFa00 = new javax.swing.JTextField();
        jTFa10 = new javax.swing.JTextField();
        jTFa20 = new javax.swing.JTextField();
        jTFa01 = new javax.swing.JTextField();
        jTFa11 = new javax.swing.JTextField();
        jTFa21 = new javax.swing.JTextField();
        jTFa02 = new javax.swing.JTextField();
        jTFa12 = new javax.swing.JTextField();
        jTFa22 = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jButtonClear = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabelMatrix2 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabelCalc2 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jButtonTimes = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButtonMinus = new javax.swing.JButton();
        jButtonDet2 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jTFb00 = new javax.swing.JTextField();
        jTFb01 = new javax.swing.JTextField();
        jTFb02 = new javax.swing.JTextField();
        jTFb10 = new javax.swing.JTextField();
        jTFb11 = new javax.swing.JTextField();
        jTFb12 = new javax.swing.JTextField();
        jTFb20 = new javax.swing.JTextField();
        jTFb21 = new javax.swing.JTextField();
        jTFb22 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matrizes");
        setResizable(false);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMatrix.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabelMatrix.setText("Matrizes");
        jPanel1.add(jLabelMatrix);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 60));

        jLabelAuthor.setText("por Thales Cézar Castro");
        jPanel2.add(jLabelAuthor);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 150, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 460, 20));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 70, 30));

        jLabelVersion.setText("v. 1.0");
        jPanel4.add(jLabelVersion);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 50, 40));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 40));

        jLabelOption.setText("Escolha uma opção:");
        jPanel6.add(jLabelOption);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 30));

        jButtonOption1.setText("Calcular 1 Matriz");
        jButtonOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOption1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonOption1);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 140, 40));

        jButtonOption2.setText("Calcular 2 Matrizes");
        jButtonOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOption2ActionPerformed(evt);
            }
        });
        jPanel9.add(jButtonOption2);

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 150, 40));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 460, 10));

        jLabelSize1.setText("Qual o tamanho da matriz 1?");
        jPanel8.add(jLabelSize1);

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, 30));

        jLabelSize2.setText("Qual o tamanho da matriz 2?");
        jPanel10.add(jLabelSize2);

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 160, 30));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonOK.setText("OK");
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        jPanel11.add(jButtonOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 90));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 70, 100));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFColumns2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFColumns2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 50, 40));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFRows1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFRows1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 50, 40));

        jLabelPer2.setText("por");
        jPanel15.add(jLabelPer2);

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 30, 30));

        jLabelColumns1.setText("colunas");
        jPanel16.add(jLabelColumns1);

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 50, -1));

        jLabelColumns2.setText("colunas");
        jPanel17.add(jLabelColumns2);

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 50, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jTFColumns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFColumns1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFColumns1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFColumns1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 50, 40));

        jLabelRows1.setText("linhas");
        jPanel19.add(jLabelRows1);

        getContentPane().add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 50, -1));

        jLabelRows2.setText("linhas");
        jPanel20.add(jLabelRows2);

        getContentPane().add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 50, -1));

        jLabelPer1.setText("por");
        jPanel21.add(jLabelPer1);

        getContentPane().add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 30, 30));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFRows2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFRows2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 50, 40));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 460, 10));

        jLabelMatrix1.setText("DIGITE AQUI SUA MATRIZ 1");
        jPanel23.add(jLabelMatrix1);

        getContentPane().add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 200, 20));

        jLabelCalc1.setText("Cálculos com 1 matriz:");
        jPanel24.add(jLabelCalc1);

        getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 220, 20));

        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDet1.setText("Determinante");
        jButtonDet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDet1ActionPerformed(evt);
            }
        });
        jPanel25.add(jButtonDet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, -1));

        jButtonTimesReal.setText("Multiplicar por Número Real");
        jButtonTimesReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimesRealActionPerformed(evt);
            }
        });
        jPanel25.add(jButtonTimesReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, -1));

        jButtonOpp.setText("Matriz Oposta");
        jButtonOpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOppActionPerformed(evt);
            }
        });
        jPanel25.add(jButtonOpp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, -1));

        jButtonTransp.setText("Matriz Transposta");
        jButtonTransp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTranspActionPerformed(evt);
            }
        });
        jPanel25.add(jButtonTransp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, -1));

        getContentPane().add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 210, 130));

        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTFa00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFa00ActionPerformed(evt);
            }
        });
        jPanel26.add(jTFa00, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 43, -1));
        jPanel26.add(jTFa10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 43, -1));
        jPanel26.add(jTFa20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 43, -1));
        jPanel26.add(jTFa01, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 43, -1));
        jPanel26.add(jTFa11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 43, -1));
        jPanel26.add(jTFa21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 43, -1));
        jPanel26.add(jTFa02, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 43, -1));
        jPanel26.add(jTFa12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 43, -1));
        jPanel26.add(jTFa22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 43, -1));

        getContentPane().add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 100));

        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonClear.setText("Limpar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel27.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 40));

        getContentPane().add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 210, 60));

        jLabelMatrix2.setText("DIGITE AQUI SUA MATRIZ 2");
        jPanel28.add(jLabelMatrix2);

        getContentPane().add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 20));

        jLabelCalc2.setText("Cálculos com 2 matrizes:");
        jPanel29.add(jLabelCalc2);

        getContentPane().add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 220, 20));

        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonTimes.setText("Multiplicação");
        jButtonTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTimesActionPerformed(evt);
            }
        });
        jPanel30.add(jButtonTimes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, -1));

        jButtonPlus.setText("Soma");
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });
        jPanel30.add(jButtonPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 200, -1));

        jButtonMinus.setText("Subtração");
        jButtonMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinusActionPerformed(evt);
            }
        });
        jPanel30.add(jButtonMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, -1));

        jButtonDet2.setText("Determinante de 2 Matrizes");
        jButtonDet2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDet2ActionPerformed(evt);
            }
        });
        jPanel30.add(jButtonDet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, -1));

        getContentPane().add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 210, 140));

        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel31.add(jTFb00, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 43, -1));
        jPanel31.add(jTFb01, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 43, -1));
        jPanel31.add(jTFb02, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 43, -1));
        jPanel31.add(jTFb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 43, -1));
        jPanel31.add(jTFb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 43, -1));
        jPanel31.add(jTFb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 43, -1));
        jPanel31.add(jTFb20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 43, -1));
        jPanel31.add(jTFb21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 43, -1));
        jPanel31.add(jTFb22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 43, -1));

        getContentPane().add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 210, 140));

        setSize(new java.awt.Dimension(435, 629));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFa00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFa00ActionPerformed

    }//GEN-LAST:event_jTFa00ActionPerformed

    private void jButtonOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOption2ActionPerformed
        hideAlmostAll();
        clearMatrix();
        clearSize();
        showAllSizeMatrix1();
        showAllSizeMatrix2();
        numberOfMatrix = 2;
    }//GEN-LAST:event_jButtonOption2ActionPerformed

    private void jButtonOppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOppActionPerformed
        if (numberOfMatrix == 2) {
            JOptionPane.showMessageDialog(null, "Não é possível realizar esta operação com duas matrizes.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean b = verifyNumbersMatrix1();
            if (b == true) {
                Matrix m = new Matrix(rows1, columns1, proportion1, jTFa00.getText(),
                        jTFa01.getText(), jTFa02.getText(), jTFa10.getText(), jTFa11.getText(),
                        jTFa12.getText(), jTFa20.getText(), jTFa21.getText(), jTFa22.getText(), isTransp);
                m.opp();
                m.showResult();
            } else {
                JOptionPane.showMessageDialog(null, "Certifique-se de que a(s) matriz(es) não possui(em) espaços\nem branco, nem letras ou outros caracteres inválidos.\nSe houver número negativo, coloque o sinal antes do número.\nSe houver número decimal, coloque apenas um ponto e na posição correta.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonOppActionPerformed

    private void jButtonTranspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTranspActionPerformed
        if (numberOfMatrix == 2) {
            JOptionPane.showMessageDialog(null, "Não é possível realizar esta operação com duas matrizes.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean b = verifyNumbersMatrix1();
            if (b == true) {
                isTransp = true;
                Matrix m = new Matrix(columns1, rows1, proportion1, jTFa00.getText(),
                        jTFa01.getText(), jTFa02.getText(), jTFa10.getText(), jTFa11.getText(),
                        jTFa12.getText(), jTFa20.getText(), jTFa21.getText(), jTFa22.getText(), isTransp);
                m.showTransp();
                isTransp = false;
            } else {
                JOptionPane.showMessageDialog(null, "Certifique-se de que a(s) matriz(es) não possui(em) espaços\nem branco, nem letras ou outros caracteres inválidos.\nSe houver número negativo, coloque o sinal antes do número.\nSe houver número decimal, coloque apenas um ponto e na posição correta.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonTranspActionPerformed

    private void jButtonTimesRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimesRealActionPerformed
        if (numberOfMatrix == 2) {
            JOptionPane.showMessageDialog(null, "Não é possível realizar esta operação com duas matrizes.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean b = verifyNumbersMatrix1();
            if (b == true) {
                String realString = JOptionPane.showInputDialog(null, "Digite um número real.", "", JOptionPane.PLAIN_MESSAGE);
                if (realString.matches("[0-9.-]+") && verifyMinusDots(realString)) {
                    double real = Double.parseDouble(realString);
                    Matrix m = new Matrix(rows1, columns1, proportion1, jTFa00.getText(),
                            jTFa01.getText(), jTFa02.getText(), jTFa10.getText(), jTFa11.getText(),
                            jTFa12.getText(), jTFa20.getText(), jTFa21.getText(), jTFa22.getText(), isTransp);
                    m.timesReal(real);
                    m.showResult();
                } else {
                    JOptionPane.showMessageDialog(null, "Entrada Inválida. Não é um número real.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Certifique-se de que a(s) matriz(es) não possui(em) espaços\nem branco, nem letras ou outros caracteres inválidos.\nSe houver número negativo, coloque o sinal antes do número.\nSe houver número decimal, coloque apenas um ponto e na posição correta.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonTimesRealActionPerformed

    private void jButtonDet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDet1ActionPerformed
        if (numberOfMatrix == 2) {
            JOptionPane.showMessageDialog(null, "Não é possível realizar esta operação com duas matrizes.",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean b = verifyNumbersMatrix1();
            if (b == true) {
                if (rows1 == columns1) {
                    Matrix m = new Matrix(rows1, columns1, proportion1, jTFa00.getText(),
                            jTFa01.getText(), jTFa02.getText(), jTFa10.getText(), jTFa11.getText(),
                            jTFa12.getText(), jTFa20.getText(), jTFa21.getText(), jTFa22.getText(), isTransp);
                    m.copyMatrixDet();
                    switch (proportion1) {
                        case "11":
                            m.det11();
                            break;
                        case "22":
                            m.det22();
                            break;
                        case "33":
                            m.det33();
                            break;
                    }
                    JOptionPane.showMessageDialog(null, "Determinante: " + df.format(m.getDetResult()),
                            "Resultado", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Não é possível calcular determinante de matriz não quadrada.",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Certifique-se de que a(s) matriz(es) não possui(em) espaços\nem branco, nem letras ou outros caracteres inválidos.\nSe houver número negativo, coloque o sinal antes do número.\nSe houver número decimal, coloque apenas um ponto e na posição correta.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonDet1ActionPerformed

    private void jButtonDet2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDet2ActionPerformed
        boolean b1 = verifyNumbersMatrix1();
        boolean b2 = verifyNumbersMatrix2();
        if (b1 == true && b2 == true) {
            if (rows1 == columns1 && rows2 == columns2) {
                Matrix m = new Matrix(rows1, columns1, proportion1, jTFa00.getText(),
                        jTFa01.getText(), jTFa02.getText(), jTFa10.getText(), jTFa11.getText(),
                        jTFa12.getText(), jTFa20.getText(), jTFa21.getText(), jTFa22.getText(),
                        rows2, columns2, proportion2, jTFb00.getText(), jTFb01.getText(),
                        jTFb02.getText(), jTFb10.getText(), jTFb11.getText(), jTFb12.getText(),
                        jTFb20.getText(), jTFb21.getText(), jTFb22.getText());
                m.det2Matrix();
                JOptionPane.showMessageDialog(null, "Determinante das duas matrizes: " + df.format(m.getDetResult()),
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "É preciso que as duas matrizes sejam quadradas.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Certifique-se de que a(s) matriz(es) não possui(em) espaços\nem branco, nem letras ou outros caracteres inválidos.\nSe houver número negativo, coloque o sinal antes do número.\nSe houver número decimal, coloque apenas um ponto e na posição correta.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDet2ActionPerformed

    private void jButtonTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTimesActionPerformed
        boolean b1 = verifyNumbersMatrix1();
        boolean b2 = verifyNumbersMatrix2();
        if (b1 == true && b2 == true) {
            if (columns1 == rows2) {
                Matrix m = new Matrix(rows1, columns1, proportion1, jTFa00.getText(),
                        jTFa01.getText(), jTFa02.getText(), jTFa10.getText(), jTFa11.getText(),
                        jTFa12.getText(), jTFa20.getText(), jTFa21.getText(), jTFa22.getText(),
                        rows2, columns2, proportion2, jTFb00.getText(), jTFb01.getText(),
                        jTFb02.getText(), jTFb10.getText(), jTFb11.getText(), jTFb12.getText(),
                        jTFb20.getText(), jTFb21.getText(), jTFb22.getText());
                m.times();
                proportionTimes = String.valueOf(rows1) + String.valueOf(columns2);
                m.setProportion1(proportionTimes);
                m.showResult();
                m.setProportion1(proportion1);
            } else {
                JOptionPane.showMessageDialog(null, "Número de colunas na matriz 1 diferente do número de linhas da matriz 2.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Certifique-se de que a(s) matriz(es) não possui(em) espaços\nem branco, nem letras ou outros caracteres inválidos.\nSe houver número negativo, coloque o sinal antes do número.\nSe houver número decimal, coloque apenas um ponto e na posição correta.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonTimesActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        boolean b1 = verifyNumbersMatrix1();
        boolean b2 = verifyNumbersMatrix2();
        if (b1 == true && b2 == true) {
            if (proportion1.equals(proportion2)) {
                Matrix m = new Matrix(rows1, columns1, proportion1, jTFa00.getText(),
                        jTFa01.getText(), jTFa02.getText(), jTFa10.getText(), jTFa11.getText(),
                        jTFa12.getText(), jTFa20.getText(), jTFa21.getText(), jTFa22.getText(),
                        rows2, columns2, proportion2, jTFb00.getText(), jTFb01.getText(),
                        jTFb02.getText(), jTFb10.getText(), jTFb11.getText(), jTFb12.getText(),
                        jTFb20.getText(), jTFb21.getText(), jTFb22.getText());
                m.plus();
                m.showResult();
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível somar matrizes de tamanhos diferentes.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Certifique-se de que a(s) matriz(es) não possui(em) espaços\nem branco, nem letras ou outros caracteres inválidos.\nSe houver número negativo, coloque o sinal antes do número.\nSe houver número decimal, coloque apenas um ponto e na posição correta.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinusActionPerformed
        boolean b1 = verifyNumbersMatrix1();
        boolean b2 = verifyNumbersMatrix2();
        if (b1 == true && b2 == true) {
            if (proportion1.equals(proportion2)) {
                Matrix m = new Matrix(rows1, columns1, proportion1, jTFa00.getText(),
                        jTFa01.getText(), jTFa02.getText(), jTFa10.getText(), jTFa11.getText(),
                        jTFa12.getText(), jTFa20.getText(), jTFa21.getText(), jTFa22.getText(),
                        rows2, columns2, proportion2, jTFb00.getText(), jTFb01.getText(),
                        jTFb02.getText(), jTFb10.getText(), jTFb11.getText(), jTFb12.getText(),
                        jTFb20.getText(), jTFb21.getText(), jTFb22.getText());
                m.minus();
                m.showResult();
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível subtrair matrizes de tamanhos diferentes.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Certifique-se de que a(s) matriz(es) não possui(em) espaços\nem branco, nem letras ou outros caracteres inválidos.\nSe houver número negativo, coloque o sinal antes do número.\nSe houver número decimal, coloque apenas um ponto e na posição correta.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMinusActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        clearMatrix();
        if (numberOfMatrix == 1) {
            rowString1 = jTFRows1.getText();
            columnString1 = jTFColumns1.getText();
            if (rowString1.matches("[1-3]+") && columnString1.matches("[1-3]+")
                    && rowString1.length() == 1 && columnString1.length() == 1) {
                rows1 = Integer.parseInt(rowString1);
                columns1 = Integer.parseInt(columnString1);
                proportion1 = String.valueOf(rows1) + String.valueOf(columns1);
                showAllMatrix1();
                switch (rows1) {
                    case 1:
                        hideJTFa10();
                        hideJTFa11();
                        hideJTFa12();
                        hideJTFa20();
                        hideJTFa21();
                        hideJTFa22();
                        break;
                    case 2:
                        hideJTFa20();
                        hideJTFa21();
                        hideJTFa22();
                }
                switch (columns1) {
                    case 1:
                        hideJTFa01();
                        hideJTFa02();
                        hideJTFa11();
                        hideJTFa12();
                        hideJTFa21();
                        hideJTFa22();
                    case 2:
                        hideJTFa02();
                        hideJTFa12();
                        hideJTFa22();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você deve preencher de 1 a 3 linhas e de 1 a 3 colunas.",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (numberOfMatrix == 2) {
            rowString1 = jTFRows1.getText();
            columnString1 = jTFColumns1.getText();
            rowString2 = jTFRows2.getText();
            columnString2 = jTFColumns2.getText();
            if (rowString1.matches("[1-3]+") && columnString1.matches("[1-3]+")
                    && rowString2.matches("[1-3]+") && columnString2.matches("[1-3]+")
                    && rowString1.length() == 1 && columnString1.length() == 1
                    && rowString2.length() == 1 && columnString2.length() == 1) {
                rows1 = Integer.parseInt(rowString1);
                columns1 = Integer.parseInt(columnString1);
                proportion1 = String.valueOf(rows1) + String.valueOf(columns1);
                rows2 = Integer.parseInt(rowString2);
                columns2 = Integer.parseInt(columnString2);
                proportion2 = String.valueOf(rows2) + String.valueOf(columns2);
                showAllMatrix1();
                showAllMatrix2();
                switch (rows1) {
                    case 1:
                        hideJTFa10();
                        hideJTFa11();
                        hideJTFa12();
                        hideJTFa20();
                        hideJTFa21();
                        hideJTFa22();
                        break;
                    case 2:
                        hideJTFa20();
                        hideJTFa21();
                        hideJTFa22();
                }
                switch (columns1) {
                    case 1:
                        hideJTFa01();
                        hideJTFa02();
                        hideJTFa11();
                        hideJTFa12();
                        hideJTFa21();
                        hideJTFa22();
                    case 2:
                        hideJTFa02();
                        hideJTFa12();
                        hideJTFa22();
                }
                switch (rows2) {
                    case 1:
                        hideJTFb10();
                        hideJTFb11();
                        hideJTFb12();
                        hideJTFb20();
                        hideJTFb21();
                        hideJTFb22();
                        break;
                    case 2:
                        hideJTFb20();
                        hideJTFb21();
                        hideJTFb22();
                }
                switch (columns2) {
                    case 1:
                        hideJTFb01();
                        hideJTFb02();
                        hideJTFb11();
                        hideJTFb12();
                        hideJTFb21();
                        hideJTFb22();
                    case 2:
                        hideJTFb02();
                        hideJTFb12();
                        hideJTFb22();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você deve preencher de 1 a 3 linhas e de 1 a 3 colunas das duas matrizes",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOption1ActionPerformed
        hideAlmostAll();
        clearMatrix();
        clearSize();
        showAllSizeMatrix1();
        numberOfMatrix = 1;
    }//GEN-LAST:event_jButtonOption1ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clearMatrix();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jTFColumns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFColumns1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFColumns1ActionPerformed

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged

    }//GEN-LAST:event_formWindowStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatrixWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrixWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDet1;
    private javax.swing.JButton jButtonDet2;
    private javax.swing.JButton jButtonMinus;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonOpp;
    private javax.swing.JButton jButtonOption1;
    private javax.swing.JButton jButtonOption2;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtonTimes;
    private javax.swing.JButton jButtonTimesReal;
    private javax.swing.JButton jButtonTransp;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelCalc1;
    private javax.swing.JLabel jLabelCalc2;
    private javax.swing.JLabel jLabelColumns1;
    private javax.swing.JLabel jLabelColumns2;
    private javax.swing.JLabel jLabelMatrix;
    private javax.swing.JLabel jLabelMatrix1;
    private javax.swing.JLabel jLabelMatrix2;
    private javax.swing.JLabel jLabelOption;
    private javax.swing.JLabel jLabelPer1;
    private javax.swing.JLabel jLabelPer2;
    private javax.swing.JLabel jLabelRows1;
    private javax.swing.JLabel jLabelRows2;
    private javax.swing.JLabel jLabelSize1;
    private javax.swing.JLabel jLabelSize2;
    private javax.swing.JLabel jLabelVersion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextField jTFColumns1;
    private javax.swing.JTextField jTFColumns2;
    private javax.swing.JTextField jTFRows1;
    private javax.swing.JTextField jTFRows2;
    private javax.swing.JTextField jTFa00;
    private javax.swing.JTextField jTFa01;
    private javax.swing.JTextField jTFa02;
    private javax.swing.JTextField jTFa10;
    private javax.swing.JTextField jTFa11;
    private javax.swing.JTextField jTFa12;
    private javax.swing.JTextField jTFa20;
    private javax.swing.JTextField jTFa21;
    private javax.swing.JTextField jTFa22;
    private javax.swing.JTextField jTFb00;
    private javax.swing.JTextField jTFb01;
    private javax.swing.JTextField jTFb02;
    private javax.swing.JTextField jTFb10;
    private javax.swing.JTextField jTFb11;
    private javax.swing.JTextField jTFb12;
    private javax.swing.JTextField jTFb20;
    private javax.swing.JTextField jTFb21;
    private javax.swing.JTextField jTFb22;
    // End of variables declaration//GEN-END:variables
}
