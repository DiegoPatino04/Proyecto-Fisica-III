/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Diego Patiño
 */
public class MainFrame {
     private JLabel txtDensity;
    private JLabel txtPressureInit;
    private JLabel txtHeight;
    private JTextField density;
    private JTextField pressureInt;
    private JTextField height;
    private JButton calculate;
    private JButton convert;

    public MainFrame(ActionListener listener) {
        setBackground(Color.LIGHT_GRAY);
        this.initComponents(listener);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void initComponents(ActionListener listener) {
        this.setLayout(new GridLayout(4, 2));
        txtDensity = new JLabel("Ingrese la densidad");
        txtPressureInit = new JLabel("Ingrese la presion inicial");
        txtHeight = new JLabel("Ingrese la altura");
        density = new JTextField(15);
        pressureInt = new JTextField(15);
        height = new JTextField(15);
        calculate = new JButton("Calcular");
        calculate.addActionListener(listener);
        calculate.setActionCommand("calculate");
        convert = new JButton("Convertir unidades");
        convert.addActionListener(listener);
        convert.setActionCommand("convert");

        this.add(txtDensity);
        this.add(density);
        this.add(txtHeight);
        this.add(height);
        this.add(txtPressureInit);
        this.add(pressureInt);
        this.add(calculate);
        this.add(convert);

    }

    private void setBackground(Color LIGHT_GRAY) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setSize(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setDefaultCloseOperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLayout(GridLayout gridLayout) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JLabel txtDensity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JTextField density) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(JButton calculate) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
