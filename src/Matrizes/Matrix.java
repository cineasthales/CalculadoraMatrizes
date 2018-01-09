package matrizes;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Matrix {

    ///////////////////////////////////////////////////////////////////
    // declaração de variáveis e vetores
    private double matrix1[][];
    private double matrix2[][];
    private double matrixResult[][];
    private String matrixTransp[][];
    private double matrixDet[][];
    private double det1;
    private double det2;
    private double detResult;
    private int rows1;
    private int columns1;
    private String proportion1;
    private int rows2;
    private int columns2;
    private String proportion2;

    ///////////////////////////////////////////////////////////////////
    // construtor de uma matriz
    Matrix(int rows, int columns, String proportion, String a00, String a01,
            String a02, String a10, String a11, String a12, String a20,
            String a21, String a22, boolean isTransp) {
        // se matriz transposta
        if (isTransp == true) {
            matrixTransp = new String[3][3];
            this.proportion1 = "33";
            matrixTransp[0][0] = "[" + a00 + "]";
            matrixTransp[0][1] = "[" + a10 + "]";
            matrixTransp[0][2] = "[" + a20 + "]";
            matrixTransp[1][0] = "[" + a01 + "]";
            matrixTransp[1][1] = "[" + a11 + "]";
            matrixTransp[1][2] = "[" + a21 + "]";
            matrixTransp[2][0] = "[" + a02 + "]";
            matrixTransp[2][1] = "[" + a12 + "]";
            matrixTransp[2][2] = "[" + a22 + "]";
            // se posição da matriz transposta estiver vazia, não mostrar colchetes
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrixTransp[i][j].equals("[]")) {
                        matrixTransp[i][j] = "";
                    }
                }
            }
            // se outros cálculos com 1 matriz
        } else {
            this.rows1 = rows;
            this.columns1 = columns;
            matrix1 = new double[this.rows1][this.columns1];
            this.proportion1 = proportion;
            detResult = 0;
            switch (this.proportion1) {
                case "11":
                    matrix1[0][0] = Double.parseDouble(a00);
                    break;
                case "12":
                    matrix1[0][0] = Double.parseDouble(a00);
                    matrix1[0][1] = Double.parseDouble(a01);
                    break;
                case "13":
                    matrix1[0][0] = Double.parseDouble(a00);
                    matrix1[0][1] = Double.parseDouble(a01);
                    matrix1[0][2] = Double.parseDouble(a02);
                    break;
                case "21":
                    matrix1[0][0] = Double.parseDouble(a00);
                    matrix1[1][0] = Double.parseDouble(a10);
                    break;
                case "22":
                    matrix1[0][0] = Double.parseDouble(a00);
                    matrix1[0][1] = Double.parseDouble(a01);
                    matrix1[1][0] = Double.parseDouble(a10);
                    matrix1[1][1] = Double.parseDouble(a11);
                    break;
                case "23":
                    matrix1[0][0] = Double.parseDouble(a00);
                    matrix1[0][1] = Double.parseDouble(a01);
                    matrix1[0][2] = Double.parseDouble(a02);
                    matrix1[1][0] = Double.parseDouble(a10);
                    matrix1[1][1] = Double.parseDouble(a11);
                    matrix1[1][2] = Double.parseDouble(a12);
                    break;
                case "31":
                    matrix1[0][0] = Double.parseDouble(a00);
                    matrix1[1][0] = Double.parseDouble(a10);
                    matrix1[2][0] = Double.parseDouble(a20);
                    break;
                case "32":
                    matrix1[0][0] = Double.parseDouble(a00);
                    matrix1[0][1] = Double.parseDouble(a01);
                    matrix1[1][0] = Double.parseDouble(a10);
                    matrix1[1][1] = Double.parseDouble(a11);
                    matrix1[2][0] = Double.parseDouble(a20);
                    matrix1[2][1] = Double.parseDouble(a21);
                    break;
                case "33":
                    matrix1[0][0] = Double.parseDouble(a00);
                    matrix1[0][1] = Double.parseDouble(a01);
                    matrix1[0][2] = Double.parseDouble(a02);
                    matrix1[1][0] = Double.parseDouble(a10);
                    matrix1[1][1] = Double.parseDouble(a11);
                    matrix1[1][2] = Double.parseDouble(a12);
                    matrix1[2][0] = Double.parseDouble(a20);
                    matrix1[2][1] = Double.parseDouble(a21);
                    matrix1[2][2] = Double.parseDouble(a22);
                    break;
            }
        }
    }

    /////////////////////////////////////////////////////
    // construtor de duas matrizes
    Matrix(int rows, int columns, String proportion1, String a00, String a01,
            String a02, String a10, String a11, String a12, String a20,
            String a21, String a22, int rows2, int columns2, String proportion2, String b00, String b01,
            String b02, String b10, String b11, String b12, String b20,
            String b21, String b22) {
        detResult = 0;
        // primeira matriz
        this.rows1 = rows;
        this.columns1 = columns;
        matrix1 = new double[this.rows1][this.columns1];
        this.proportion1 = proportion1;
        switch (this.proportion1) {
            case "11":
                matrix1[0][0] = Double.parseDouble(a00);
                break;
            case "12":
                matrix1[0][0] = Double.parseDouble(a00);
                matrix1[0][1] = Double.parseDouble(a01);
                break;
            case "13":
                matrix1[0][0] = Double.parseDouble(a00);
                matrix1[0][1] = Double.parseDouble(a01);
                matrix1[0][2] = Double.parseDouble(a02);
                break;
            case "21":
                matrix1[0][0] = Double.parseDouble(a00);
                matrix1[1][0] = Double.parseDouble(a10);
                break;
            case "22":
                matrix1[0][0] = Double.parseDouble(a00);
                matrix1[0][1] = Double.parseDouble(a01);
                matrix1[1][0] = Double.parseDouble(a10);
                matrix1[1][1] = Double.parseDouble(a11);
                break;
            case "23":
                matrix1[0][0] = Double.parseDouble(a00);
                matrix1[0][1] = Double.parseDouble(a01);
                matrix1[0][2] = Double.parseDouble(a02);
                matrix1[1][0] = Double.parseDouble(a10);
                matrix1[1][1] = Double.parseDouble(a11);
                matrix1[1][2] = Double.parseDouble(a12);
                break;
            case "31":
                matrix1[0][0] = Double.parseDouble(a00);
                matrix1[1][0] = Double.parseDouble(a10);
                matrix1[2][0] = Double.parseDouble(a20);
                break;
            case "32":
                matrix1[0][0] = Double.parseDouble(a00);
                matrix1[0][1] = Double.parseDouble(a01);
                matrix1[1][0] = Double.parseDouble(a10);
                matrix1[1][1] = Double.parseDouble(a11);
                matrix1[2][0] = Double.parseDouble(a20);
                matrix1[2][1] = Double.parseDouble(a21);
                break;
            case "33":
                matrix1[0][0] = Double.parseDouble(a00);
                matrix1[0][1] = Double.parseDouble(a01);
                matrix1[0][2] = Double.parseDouble(a02);
                matrix1[1][0] = Double.parseDouble(a10);
                matrix1[1][1] = Double.parseDouble(a11);
                matrix1[1][2] = Double.parseDouble(a12);
                matrix1[2][0] = Double.parseDouble(a20);
                matrix1[2][1] = Double.parseDouble(a21);
                matrix1[2][2] = Double.parseDouble(a22);
                break;
        }
        // segunda matriz
        this.rows2 = rows2;
        this.columns2 = columns2;
        matrix2 = new double[this.rows2][this.columns2];
        this.proportion2 = proportion2;
        switch (this.proportion2) {
            case "11":
                matrix2[0][0] = Double.parseDouble(b00);
                break;
            case "12":
                matrix2[0][0] = Double.parseDouble(b00);
                matrix2[0][1] = Double.parseDouble(b01);
                break;
            case "13":
                matrix2[0][0] = Double.parseDouble(b00);
                matrix2[0][1] = Double.parseDouble(b01);
                matrix2[0][2] = Double.parseDouble(b02);
                break;
            case "21":
                matrix2[0][0] = Double.parseDouble(b00);
                matrix2[1][0] = Double.parseDouble(b10);
                break;
            case "22":
                matrix2[0][0] = Double.parseDouble(b00);
                matrix2[0][1] = Double.parseDouble(b01);
                matrix2[1][0] = Double.parseDouble(b10);
                matrix2[1][1] = Double.parseDouble(b11);
                break;
            case "23":
                matrix2[0][0] = Double.parseDouble(b00);
                matrix2[0][1] = Double.parseDouble(b01);
                matrix2[0][2] = Double.parseDouble(b02);
                matrix2[1][0] = Double.parseDouble(b10);
                matrix2[1][1] = Double.parseDouble(b11);
                matrix2[1][2] = Double.parseDouble(b12);
                break;
            case "31":
                matrix2[0][0] = Double.parseDouble(b00);
                matrix2[1][0] = Double.parseDouble(b10);
                matrix2[2][0] = Double.parseDouble(b20);
                break;
            case "32":
                matrix2[0][0] = Double.parseDouble(b00);
                matrix2[0][1] = Double.parseDouble(b01);
                matrix2[1][0] = Double.parseDouble(b10);
                matrix2[1][1] = Double.parseDouble(b11);
                matrix2[2][0] = Double.parseDouble(b20);
                matrix2[2][1] = Double.parseDouble(b21);
                break;
            case "33":
                matrix2[0][0] = Double.parseDouble(b00);
                matrix2[0][1] = Double.parseDouble(b01);
                matrix2[0][2] = Double.parseDouble(b02);
                matrix2[1][0] = Double.parseDouble(b10);
                matrix2[1][1] = Double.parseDouble(b11);
                matrix2[1][2] = Double.parseDouble(b12);
                matrix2[2][0] = Double.parseDouble(b20);
                matrix2[2][1] = Double.parseDouble(b21);
                matrix2[2][2] = Double.parseDouble(b22);
                break;
        }
    }

    ///////////////////////////////////////////////////////////////////
    // muda a proporção 1 (usado para multiplicação de matrizes)
    public void setProportion1(String p) {
        proportion1 = p;
    }

    ///////////////////////////////////////////////////////////////////
    // getter do determinante
    public double getDetResult() {
        return detResult;
    }

    ///////////////////////////////////////////////////////////////////
    // mostra matriz resultado
    public void showResult() {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.####");
        switch (proportion1) {
            case "11":
                JOptionPane.showMessageDialog(null, "[" + df.format(matrixResult[0][0]) + "]",
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case "12":
                JOptionPane.showMessageDialog(null, "[" + df.format(matrixResult[0][0]) + "] " + "[" + df.format(matrixResult[0][1]) + "]",
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case "13":
                JOptionPane.showMessageDialog(null, "[" + df.format(matrixResult[0][0]) + "] " + "[" + df.format(matrixResult[0][1]) + "] " + "[" + df.format(matrixResult[0][2]) + "]",
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case "21":
                JOptionPane.showMessageDialog(null, "[" + df.format(matrixResult[0][0]) + "]\n" + "[" + df.format(matrixResult[1][0]) + "]",
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case "22":
                JOptionPane.showMessageDialog(null, "[" + df.format(matrixResult[0][0]) + "] " + "[" + df.format(matrixResult[0][1]) + "]\n" + "[" + df.format(matrixResult[1][0]) + "] " + "[" + df.format(matrixResult[1][1]) + "]",
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case "23":
                JOptionPane.showMessageDialog(null, "[" + df.format(matrixResult[0][0]) + "] " + "[" + df.format(matrixResult[0][1]) + "] " + "[" + df.format(matrixResult[0][2]) + "]\n" + "[" + df.format(matrixResult[1][0]) + "] " + "[" + df.format(matrixResult[1][1]) + "] " + "[" + df.format(matrixResult[1][2]) + "]",
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case "31":
                JOptionPane.showMessageDialog(null, "[" + df.format(matrixResult[0][0]) + "]\n" + "[" + df.format(matrixResult[1][0]) + "]\n" + "[" + df.format(matrixResult[2][0]) + "]",
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case "32":
                JOptionPane.showMessageDialog(null, "[" + df.format(matrixResult[0][0]) + "] " + "[" + df.format(matrixResult[0][1]) + "]\n" + "[" + df.format(matrixResult[1][0]) + "] " + "[" + df.format(matrixResult[1][1]) + "]\n" + "[" + df.format(matrixResult[2][0]) + "] " + "[" + df.format(matrixResult[2][1]) + "]",
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case "33":
                JOptionPane.showMessageDialog(null, "[" + df.format(matrixResult[0][0]) + "] " + "[" + df.format(matrixResult[0][1]) + "] " + "[" + df.format(matrixResult[0][2]) + "]\n" + "[" + df.format(matrixResult[1][0]) + "] " + "[" + df.format(matrixResult[1][1]) + "] " + "[" + df.format(matrixResult[1][2]) + "]\n" + "[" + df.format(matrixResult[2][0]) + "] " + "[" + df.format(matrixResult[2][1]) + "] " + "[" + df.format(matrixResult[2][2]) + "]",
                        "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
        }
    }

    // mostra matriz transposta
    public void showTransp() {
        JOptionPane.showMessageDialog(null, matrixTransp[0][0] + " " + matrixTransp[0][1] + " " + matrixTransp[0][2] + "\n" + matrixTransp[1][0] + " " + matrixTransp[1][1] + " " + matrixTransp[1][2] + "\n" + matrixTransp[2][0] + " " + matrixTransp[2][1] + " " + matrixTransp[2][2],
                "Resultado", JOptionPane.PLAIN_MESSAGE);
    }

    ///////////////////////////////////////////////////////////////////
    ///////////////////// MÉTODOS COM 1 MATRIZ ////////////////////////
    ///////////////////////////////////////////////////////////////////
    // matriz oposta
    public void opp() {
        matrixResult = new double[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixResult[i][j] = matrix1[i][j] * -1;
            }
        }
    }

    ///////////////////////////////////////////////////////////////////
    // multiplicação de matriz por número real
    public void timesReal(double real) {
        matrixResult = new double[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixResult[i][j] = matrix1[i][j] * real;
            }
        }
    }

    ///////////////////////////////////////////////////////////////////
    // copia matrix1[][] para matrixDet[][] (usado para determinante de 1 matriz)
    public void copyMatrixDet() {
        matrixDet = new double[this.rows1][this.columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixDet[i][j] = matrix1[i][j];
            }
        }
    }

    //determinante de matriz 1x1
    public void det11() {
        detResult = matrixDet[0][0];
    }

    // determinante de matriz 2x2
    public void det22() {
        detResult = (matrixDet[0][0] * matrixDet[1][1])
                - (matrixDet[0][1] * matrixDet[1][0]);
    }

    // determinante de matriz 3x3
    public void det33() {
        detResult = (matrixDet[0][0] * matrixDet[1][1] * matrixDet[2][2])
                + (matrixDet[0][1] * matrixDet[1][2] * matrixDet[2][0])
                + (matrixDet[0][2] * matrixDet[1][0] * matrixDet[2][1])
                - (matrixDet[2][0] * matrixDet[1][1] * matrixDet[0][2])
                - (matrixDet[2][1] * matrixDet[1][2] * matrixDet[0][0])
                - (matrixDet[2][2] * matrixDet[1][0] * matrixDet[0][1]);
    }

    ///////////////////////////////////////////////////////////////////
    ///////////////////// MÉTODOS COM 2 MATRIZES //////////////////////
    ///////////////////////////////////////////////////////////////////
    // soma de duas matrizes
    public void plus() {
        matrixResult = new double[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    ///////////////////////////////////////////////////////////////////
    // subtração de duas matrizes
    public void minus() {
        matrixResult = new double[rows1][columns1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
    }

    ///////////////////////////////////////////////////////////////////
    // determinante de duas matrizes quadradas    
    public void det2Matrix() {
        // estabelece o tamanho do vetor matrixDet[][] de acordo com a primeira matriz
        matrixDet = new double[rows1][columns1];
        // substitui todos os elementos do vetor matrixDet[][] pelos do vetor matrix1[][]
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrixDet[i][j] = matrix1[i][j];
            }
        }
        // verificação da primeira matriz
        if (rows1 == 1 && columns1 == 1) {
            det11();
        } else if (rows1 == 2 && columns1 == 2) {
            det22();
        } else if (rows1 == 3 && columns1 == 3) {
            det33();
        }
        det1 = detResult;
        // estabelece o tamanho do vetor matrixDet[][] de acordo com a segunda matriz
        matrixDet = new double[rows2][columns2];
        // substitui todos os elementos do vetor matrixDet[][] pelos do vetor matrix2[][]
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrixDet[i][j] = matrix2[i][j];
            }
        }
        // verificação da segunda matriz
        if (rows2 == 1 && columns2 == 1) {
            det11();
        } else if (rows2 == 2 && columns2 == 2) {
            det22();
        } else if (rows2 == 3 && columns2 == 3) {
            det33();
        }
        det2 = detResult;
        // multiplica os determinantes de cada matriz para resultar o determinante de ambas
        detResult = det1 * det2;
    }

    ///////////////////////////////////////////////////////////////////
    // multiplicação de duas matrizes    
    public void times() {
        // estabelece o tamanho do vetor matrixResult[][]:
        // -> linhas de matrix1[][]
        // -> colunas de matrix2[][]
        matrixResult = new double[rows1][columns2];
        double accumulator = 0;
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int c = 0; c < rows2; c++) {
                    accumulator = accumulator + matrix1[i][c] * matrix2[c][j];
                }
                matrixResult[i][j] = accumulator;
                accumulator = 0;
            }
        }
    }

}
