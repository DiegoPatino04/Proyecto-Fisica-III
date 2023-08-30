package model;

import java.util.HashMap;

/**
 *
 * @author Diego Patiño
 */
public class MainClass {
     private HashMap<String, Double> constants;

    public MainClass() {
        constants = new HashMap();
        initConstants();
    }

    /**
     *
     */
    private void initConstants() {
        constants.put("Pa", 101325.0);
        constants.put("bar", 1.01325);
        constants.put("mb", 1013.25);
        constants.put("mmHg", 760.0);
        constants.put("psi", 14.696);
        constants.put("inHg", 29.9213);
    }

    /**
     *
     * @param unitsF
     * @param unitsT
     * @param value
     * @return
     */
    public Double convertUnits(String unitsF, String unitsT, double value) {
        Double valueR = 0.0;
        if (unitsT.equals("Atm")) {
            valueR = value / constants.get(unitsF);
        } else if (unitsF.equals("Atm")) {
            valueR = value * constants.get(unitsT);
        } else {
            valueR = (value / constants.get(unitsF)) * constants.get(unitsT);
        }
        return (double) Math.round(valueR * 10000d) / 10000d;
    }

    /**
     *
     * @param force
     * @param area
     * @return
     */
    public double calculatePressure(double force, double area) {
        return force / area;
    }
}
