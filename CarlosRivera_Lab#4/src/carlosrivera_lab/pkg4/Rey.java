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
public class Rey extends Piezas {

    public Rey() {
        super();
    }

    public Rey(Color color, String material) throws Mi_Excepcion {
        super(color, material);
    }

    @Override
    public String toString() {
        return super.toString() + "Rey{" + '}';
    }

    @Override
    public boolean movimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
