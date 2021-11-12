package mainpackage;

import java.awt.*;
import java.awt.event.*;

public class Calc extends Frame implements ActionListener, KeyListener {

    //Declaro los componentes y variables.
    TextField t1;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
    Button bsuma, bresta, bmult, bdiv, bmod, bcalc, bc, bpts;
    double num1, num2, comprobador;
    double operador;

    public Calc() {

        System.out.println("Se ha iniciado la calculadora.");

        this.setTitle("Calculadora");
        this.setSize(500, 400);
        this.setLayout(new BorderLayout());
        this.addWindowListener(new Calc.Escuchador());

        //Defino la pantalla con un TextField
        t1 = new TextField();
        t1.setEditable(false);
        t1.setFont(new Font("Script fonts", Font.BOLD, 50));
        t1.addKeyListener(this);
        t1.setBackground(Color.LIGHT_GRAY);
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
        bc = new Button("        C       ");
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

    @Override
    public void actionPerformed(ActionEvent e) {

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
        Calc calc2 = new Calc();
        calc2.setVisible(true);
    }
}
