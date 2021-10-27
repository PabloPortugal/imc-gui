package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.model.CalculadoraIMC;
import br.senai.sp.jandira.model.Fontes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tela {

    public void criaTela() {

        Fontes fonte = new Fontes();
        CalculadoraIMC imc = new CalculadoraIMC();

        JFrame tela = new JFrame();
        tela.setSize(370,800);
        tela.setTitle("Calculadora IMC");
        tela.setLayout(null);

        JLabel lblTitulo = new JLabel("Cálculo de IMC");
        lblTitulo.setFont(fonte.criaFonteParaTitulo());
        lblTitulo.setBounds(105, 10, 150, 30);
        lblTitulo.setForeground(Color.blue);
        tela.getContentPane().add(lblTitulo);

        JLabel lblPeso = new JLabel("Digite o seu peso:");
        lblPeso.setBounds(15, 55, 150, 30);
        tela.getContentPane().add(lblPeso);

        JTextField txtPeso = new JTextField();
        txtPeso.setBounds(130,58,90,30);
        tela.getContentPane().add(txtPeso);

        JLabel lblAltura = new JLabel();
        lblAltura.setText("Digite a sua altura:");
        lblAltura.setBounds(15, 100, 150, 30);
        tela.getContentPane().add(lblAltura);

        JTextField txtAltura = new JTextField();
        txtAltura.setBounds(130,98,90,30);
        tela.getContentPane().add(txtAltura);

        JButton btnCalcular = new JButton("CALCULAR");
        btnCalcular.setBounds(45,140,150,60);
        btnCalcular.setBackground(Color.GRAY);
        tela.getContentPane().add(btnCalcular);

        btnCalcular.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                double peso = Double.parseDouble(txtPeso.getText());
                double altura = Double.parseDouble(txtAltura.getText());
                imc.setPeso(peso);
                imc.setAltura(altura);
                imc.calcularIMC();
                imc.getEstadoDoIMC();
                String ShowIMCtoString = Double.toString(imc.getIMC());
                String imcEstado = imc.getEstadoDoIMC();


                JLabel lblResultado = new JLabel();
                lblResultado.setText("Resultados: ");
                lblResultado.setFont(fonte.criarFonteSubtitulo());
                lblResultado.setBounds(15, 220, 130, 90);
                tela.getContentPane().add(lblResultado);

                JLabel lblIMC = new JLabel();
                lblIMC.setText("Valor do IMC: ");
                lblIMC.setBounds(15, 290, 90, 60);
                tela.getContentPane().add(lblIMC);

                JLabel lblIMCFinal = new JLabel();
                lblIMCFinal.setText(ShowIMCtoString);
                tela.getContentPane().add(lblIMCFinal);
                lblIMCFinal.setBounds(100, 275, 100, 90);

                JLabel lblEstadoIMC = new JLabel();
                lblEstadoIMC.setText("Estado do IMC: ");
                lblEstadoIMC.setBounds(15, 340, 90, 60);
                tela.getContentPane().add(lblEstadoIMC);

                JLabel lblGetEstadoIMC = new JLabel();
                lblGetEstadoIMC.setText(imcEstado);
                lblGetEstadoIMC.setBounds(115, 325, 200, 90);
                tela.getContentPane().add(lblGetEstadoIMC);
                SwingUtilities.updateComponentTreeUI(tela);


            }
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
