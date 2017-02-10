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
public abstract  class Mago extends Piezas {

    public Mago() {
        super();
    }

    public Mago(Color color, String material) throws Mi_Excepcion {
        super(color, material);
    }

    @Override
    public String toString() {
        return super.toString() + "Mago{" + '}';
    }

}
