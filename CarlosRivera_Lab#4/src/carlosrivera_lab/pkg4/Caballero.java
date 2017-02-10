/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg4;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario Dell
 */
public class Caballero extends Piezas {

    char simbolo;

    public Caballero() {
        super();
    }

    public Caballero(char simbolo, Color color, String material) throws Mi_Excepcion {
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
        return super.toString() + "Caballero{" + "simbolo=" + simbolo + '}';
    }

    @Override
    public char[][] movimiento(char[][] Tabla, int ypos, int xpos) {
        String submenu, subopcion;
        submenu = "a- derecha\n"
                + "b- izquierda\n"
                + "c- arriba\n"
                + "d- abajo\n";
        subopcion = JOptionPane.showInputDialog(submenu);
        switch (subopcion) {
            case "a":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos][xpos + 1] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "b":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos][xpos - 1] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "c":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos - 1][xpos] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "d":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos + 1][xpos] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
        }
        return Tabla;
    }
}
