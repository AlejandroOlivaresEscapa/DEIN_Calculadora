package mainpackage;

import java.awt.*;
import java.awt.event.*;

public class Class extends Frame implements ActionListener, KeyListener {

    //Declaro los componentes y variables.
    TextField t1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button bsuma, bresta, bmult, bdiv, bmod, bcalc, bc, bpts;
    double num1, num2, comprobador;
    double operador;

    public Class() {

        System.out.println("Se ha iniciado la calculadora.");

        this.setTitle("Calculadora");
        this.setSize(400, 400);
        this.setLayout(new BorderLayout());
        this.addWindowListener(new Class.Escuchador());

        //Defino la pantalla con un TextField
        t1 = new TextField();
        t1.setFont(new Font("Script fonts", Font.BOLD, 50));
        t1.addKeyListener(this);
        t1.setBackground(Color.GRAY);
        this.add(t1, BorderLayout.NORTH);

        //Defino el panel con los numeros de la calculadora.
        Panel bot = new Panel();
        bot.setLayout(new GridLayout(4, 3));
        b7 = new Button("7");
        bot.add(b7);
        b8 = new Button("8");
        bot.add(b8);
        b9 = new Button("9");
        bot.add(b9);

        b4 = new Button("4");
        bot.add(b4);
        b5 = new Button("5");
        bot.add(b5);
        b6 = new Button("6");
        bot.add(b6);

        b1 = new Button("1");
        bot.add(b1);
        b2 = new Button("2");
        bot.add(b2);
        b3 = new Button("3");
        bot.add(b3);

        bpts = new Button(".");
        bot.add(bpts);
        b0 = new Button("0");
        bot.add(b0);
        bcalc = new Button("=");
        bot.add(bcalc);

        this.add(bot, BorderLayout.CENTER);

        //Defino el panel con los numeros de la calculadora.
        Panel operadores = new Panel();
        operadores.setLayout(new GridLayout(6, 1));
        bc = new Button("C");
        bc.setBackground(Color.CYAN);
        operadores.add(bc);
        bsuma = new Button("+");
        bsuma.setBackground(Color.CYAN);
        operadores.add(bsuma);
        bresta = new Button("-");
        bresta.setBackground(Color.CYAN);
        operadores.add(bresta);
        bmult = new Button("*");
        bmult.setBackground(Color.CYAN);
        operadores.add(bmult);
        bdiv = new Button("/");
        bdiv.setBackground(Color.CYAN);
        operadores.add(bdiv);
        bmod = new Button("%");
        bmod.setBackground(Color.CYAN);
        operadores.add(bmod);

        this.add(operadores, BorderLayout.EAST);

        //Añado ActionListener a todos los botones creados.
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bpts.addActionListener(this);
        bsuma.addActionListener(this);
        bresta.addActionListener(this);
        bmult.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        bcalc.addActionListener(this);
        bc.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String numpantalla, numeroin;

        if (e.getSource() == b1) {
            numeroin = t1.getText();
            numpantalla = numeroin + "1";
            t1.setText(numpantalla);
        }
        if (e.getSource() == b2) {
            numeroin = t1.getText();
            numpantalla = numeroin + "2";
            t1.setText(numpantalla);
        }
        if (e.getSource() == b3) {
            numeroin = t1.getText();
            numpantalla = numeroin + "3";
            t1.setText(numpantalla);
        }
        if (e.getSource() == b4) {
            numeroin = t1.getText();
            numpantalla = numeroin + "4";
            t1.setText(numpantalla);
        }
        if (e.getSource() == b5) {
            numeroin = t1.getText();
            numpantalla = numeroin + "5";
            t1.setText(numpantalla);
        }
        if (e.getSource() == b6) {
            numeroin = t1.getText();
            numpantalla = numeroin + "6";
            t1.setText(numpantalla);
        }
        if (e.getSource() == b7) {
            numeroin = t1.getText();
            numpantalla = numeroin + "7";
            t1.setText(numpantalla);
        }
        if (e.getSource() == b8) {
            numeroin = t1.getText();
            numpantalla = numeroin + "8";
            t1.setText(numpantalla);
        }
        if (e.getSource() == b9) {
            numeroin = t1.getText();
            numpantalla = numeroin + "9";
            t1.setText(numpantalla);
        }
        if (e.getSource() == b0) {
            numeroin = t1.getText();
            numpantalla = numeroin + "0";
            t1.setText(numpantalla);
        }

        if (e.getSource() == bpts) {  //ADD DECIMAL PTS
            numeroin = t1.getText();
            numpantalla = numeroin + ".";
            t1.setText(numpantalla);
        }

        //Operadores
        if (e.getSource() == bsuma) {                     //Suma
            try {
                double comprobador;
                num1 = Double.parseDouble(t1.getText());
            } catch (NumberFormatException f) {
                t1.setText("Invalid Format");
                return;
            }
            numpantalla = "";
            t1.setText(numpantalla);
            comprobador = 1;
        }
        if (e.getSource() == bresta) {                    //Resta
            try {
                num1 = Double.parseDouble(t1.getText());
            } catch (NumberFormatException f) {
                t1.setText("Invalid Format");
                return;
            }
            numpantalla = "";
            t1.setText(numpantalla);
            comprobador = 2;
        }
        if (e.getSource() == bmult) {                   //Multiplicacion
            try {
                num1 = Double.parseDouble(t1.getText());
            } catch (NumberFormatException f) {
                t1.setText("Invalid Format");
                return;
            }
            numpantalla = "";
            t1.setText(numpantalla);
            comprobador = 3;
        }
        if (e.getSource() == bdiv) {                   //Division
            try {
                num1 = Double.parseDouble(t1.getText());
            } catch (NumberFormatException f) {
                t1.setText("Invalid Format");
                return;
            }
            numpantalla = "";
            t1.setText(numpantalla);
            comprobador = 4;
        }
        if (e.getSource() == bmod) {                  //Para el resto de la división
            try {
                num1 = Double.parseDouble(t1.getText());
            } catch (NumberFormatException f) {
                t1.setText("Invalid Format");
                return;
            }
            numpantalla = "";
            t1.setText(numpantalla);
            comprobador = 5;
        }

        //Boton para calcular
        if (e.getSource() == bcalc) {
            System.out.println("Calculando...");
            try {
                num2 = Double.parseDouble(t1.getText());
            } catch (NumberFormatException f) {
                t1.setText("ENTER NUMBER FIRST ");
                return;

            }
            if (comprobador == 1) {
                operador = num1 + num2;
            }
            if (comprobador == 2) {
                operador = num1 - num2;
            }
            if (comprobador == 3) {
                operador = num1 * num2;
            }
            if (comprobador == 4) {
                operador = num1 / num2;
            }
            if (comprobador == 5) {
                operador = num1 % num2;
            }
            t1.setText(String.valueOf(operador));
        }

        //Boton para limpiar pantalla y memoria
        if (e.getSource() == bc) {
        num1 = 0;
        num2 = 0;
        comprobador = 0;
        operador = 0;
        numpantalla = "";
        t1.setText(numpantalla);
        }
    }

    //Todos los abstractos
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    private static class Escuchador implements WindowListener {

        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }

        @Override
        public void windowOpened(WindowEvent e) {
        }

        @Override
        public void windowClosed(WindowEvent e) {
        }

        @Override
        public void windowIconified(WindowEvent e) {
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
        }

        @Override
        public void windowActivated(WindowEvent e) {
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
        }
    }

    public static void main(String[] args) {
        Class calc2 = new Class();
        calc2.setVisible(true);
    }
}
