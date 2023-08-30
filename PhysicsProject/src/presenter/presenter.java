/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presenter;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import model.MainClass;
import view.MainFrame;

/**
 *
 * @author Diego Patiño
 */
public class presenter {
     private ArrayList<String> units;
    private MainFrame frame;
    private MainClass calculator;

    public presenter() {
//        frame = new MainFrame(this);
        units = new ArrayList<>();
        calculator = new MainClass();
        initArray();
    }

    private void initArray() {
        units.add("Pa");
        units.add("psi");
        units.add("Atm");
        units.add("inHg");
        units.add("bar");
        units.add("mb");
        units.add("mmHg");

        for (int i = 0, j = 1; i < units.size() - 1; i++, j++) {
            double numb = randomNum();
            final String unitsF = units.get(i);
            final String unitsT = units.get(j);
            System.out.println(j + ". " + numb + unitsF + " -> " + unitsT + " = " + calculator.convertUnits(unitsF, unitsT, numb) + unitsT);
        }

    }

    private double randomNum() {
        int M = 0;
        int N = 500;
        return (double) Math.round(Math.random() * (N - M) + M * 10d) / 10d;
    }

    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static void main(String[] args) {
        new presenter();
    }
}
