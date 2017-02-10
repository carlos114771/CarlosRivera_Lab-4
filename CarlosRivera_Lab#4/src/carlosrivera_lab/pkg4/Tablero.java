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

    char[][] tamaño = new char[10][10];
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

    public void DrawBoard() {
      //  tamaño[0][0] = 'c';
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                System.out.print("[ " + tamaño[y][x] + " ]");
            }
            System.out.println(" ");
        }
    }

   


}
