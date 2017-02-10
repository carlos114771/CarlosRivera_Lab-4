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
public  class Mago extends Piezas {
    char simbolo;
    public Mago() {
        super();
    }

    public Mago(char simbolo, Color color, String material) throws Mi_Excepcion {
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
        return super.toString() + "Mago{" + '}';
    }

    @Override
    public boolean movimiento() {

    }

}
