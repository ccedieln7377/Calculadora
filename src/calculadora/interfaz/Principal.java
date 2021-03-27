package calculadora.interfaz;

import javax.swing.*;

public class Principal extends JFrame {
    // Constructor
    public Principal() {
        super("Calculadora");
        //setSize(600, 400);

        setResizable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setContentPane(new FormularioPrincipal().getPanelPrincipal());

        pack();
        setVisible(true);

    }

    // Programa
    public static void main(String[] args) {
        Principal frame = new Principal();
    }
}
