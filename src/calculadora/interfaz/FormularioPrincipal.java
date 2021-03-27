package calculadora.interfaz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioPrincipal {
    private JPanel panelPrincipal;
    private JTextField num1;
    private JTextField num2;
    private JButton Suma;
    private JButton Resta;
    private JButton Multiplicacion;
    private JTextField res;
    private JButton Division;
    private JButton Limpiar;
    private JButton Salir;

    public FormularioPrincipal() {
        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double numero1 = Double.parseDouble(num1.getText());
                    double numero2 = Double.parseDouble(num2.getText());
                    double resultado = numero1 + numero2;
                    res.setText(String.format("%.2f", resultado));
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Ingrese un valor numérico.");
                }
            }
        });

        Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double numero1 = Double.parseDouble(num1.getText());
                    double numero2 = Double.parseDouble(num2.getText());
                    double resultado = numero1 - numero2;
                    res.setText(String.format("%.2f", resultado));
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Ingrese un valor numérico.");
                }
            }
        });



        Multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double numero1 = Double.parseDouble(num1.getText());
                    double numero2 = Double.parseDouble(num2.getText());
                    double resultado = numero1 * numero2;
                    res.setText(String.format("%.2f", resultado));
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Ingrese un valor numérico.");
                }
            }
        });

        Division.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    double numero1 = Double.parseDouble(num1.getText());
                    double numero2 = Double.parseDouble(num2.getText());
                    double resultado = numero1 / numero2;
                    res.setText(String.format("%.2f", resultado));
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,
                            "Error: Ingrese un valor numérico.");
                }
            }
        });





        Limpiar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                num1.setText("");
                num2.setText("");
                res.setText("");
            }
        });

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resp = JOptionPane.showConfirmDialog(null,
                        "¿Desea finalizar el programa",
                        "Convertidor",
                        JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }
}
