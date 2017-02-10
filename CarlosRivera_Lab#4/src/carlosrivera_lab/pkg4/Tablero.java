/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg4;

/**
 *
 * @author Usuario Dell
 */
public class Tablero {

    char[][] tamaño = new char[9][9];
    Piezas pieza;

    public Tablero() {
    }

    public Tablero(Piezas pieza) {
        this.pieza = pieza;
    }

    public char[][] getTamaño() {
        return tamaño;
    }

    public void setTamaño(char[][] tamaño) {
        this.tamaño = tamaño;
    }

    public Piezas getPieza() {
        return pieza;
    }

    public void setPieza(Piezas pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Tablero{" + "tama\u00f1o=" + tamaño + ", pieza=" + pieza + '}';
    }

}
