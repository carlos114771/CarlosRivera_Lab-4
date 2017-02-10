/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg4;

import java.awt.Color;

/**
 *
 * @author Usuario Dell
 */
public class Duendes extends Piezas {

    char simbolo;

    public Duendes() {
        super();
    }

    public Duendes(char simbolo, Color color, String material) throws Mi_Excepcion {
        super(color, material);
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return super.toString() + "Duendes{" + "simbolo=" + simbolo + '}';
    }

    @Override
    public char[][] movimiento(char[][] Tabla, int ypos, int xpos) {
        try {
            char P = Tabla[ypos][xpos];
            Tabla[ypos][xpos + 1] = P;
            Tabla[ypos][xpos] = ' ';
        } catch (Exception e) {
        }
        return Tabla;
    }

}
