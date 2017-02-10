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
public class Arqueros extends Piezas {

    char simbolo;

    public Arqueros() {
        super();
    }

    public Arqueros(Color color, String material) throws Mi_Excepcion {
        super(color, material);
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return super.toString() + "Arqueros{" + "simbolo=" + simbolo + '}';
    }

    @Override
    public char[][] movimiento(char[][] Tabla, int ypos, int xpos) {
        String submenu, subopcion;
        submenu = "a- derecha\n"
                + "b- izquierda\n"
                + "c- arriba\n"
                + "d- abajo\n"
                + "e- arriba-izq\n"
                + "f- arriba-der\n"
                + "g- abajo-izq\n"
                + "h- abajo-der\n";
        subopcion = JOptionPane.showInputDialog(submenu);
        int Dis = Integer.parseInt(JOptionPane.showInputDialog("Distancia?: "));
        switch (subopcion) {
            case "a":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos][xpos + Dis] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "b":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos][xpos - Dis] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "c":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos - Dis][xpos] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "d":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos + Dis][xpos] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "e":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos - Dis][xpos - Dis] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "f":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos - Dis][xpos + Dis] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "g":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos + Dis][xpos - Dis] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "h":
                try {
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos + Dis][xpos - Dis] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
        }
        return Tabla;

    }
}
