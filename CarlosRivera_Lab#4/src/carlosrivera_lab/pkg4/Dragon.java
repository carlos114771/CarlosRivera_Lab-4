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
public class Dragon extends Piezas {

    char simbolo;

    public Dragon() {
        super();
    }

    public Dragon(char simbolo, Color color, String material) throws Mi_Excepcion {
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
        return super.toString() + "Dragon{" + "simbolo=" + simbolo + '}';
    }

    @Override
    public char[][] movimiento(char[][] Tabla, int ypos, int xpos) {
        String submenu, subopcion;
        submenu = "a- diagonal izquierda arriba\n"
                + "b- diagonal izquierda abajo\n"
                + "c- diagonal dercha arriba\n"
                + "d- diagonal derecha abajo\n";
        subopcion = JOptionPane.showInputDialog(submenu);
        int Dis = Integer.parseInt(JOptionPane.showInputDialog("Distancia?: "));
        switch (subopcion) {
            case "a":
                try {
                    ExceptionCus.Ocupado(Tabla, ypos - Dis, xpos - Dis);
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos - Dis][xpos - Dis] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "b":
                try {
                    ExceptionCus.Ocupado(Tabla, ypos - Dis, xpos + Dis);
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos - Dis][xpos + Dis] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "c":
                try {
                    ExceptionCus.Ocupado(Tabla, ypos + Dis, xpos - Dis);
                    char P = Tabla[ypos][xpos];
                    Tabla[ypos + Dis][xpos - Dis] = P;
                    Tabla[ypos][xpos] = ' ';
                } catch (Exception e) {
                }
                return Tabla;
            case "d":
                try {
                    ExceptionCus.Ocupado(Tabla, ypos + Dis, xpos - Dis);
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
