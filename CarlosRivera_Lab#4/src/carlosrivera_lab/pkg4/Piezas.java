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
public abstract class Piezas {

    Color color;
    String material;

    public Piezas() {
    }

    public Piezas(Color color, String material) throws Mi_Excepcion {
        this.color = color;
        this.material = material;
        setColor(color);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) throws Mi_Excepcion {
        if (color == Color.BLACK) {
            this.color = color;
        } else if (color == Color.WHITE) {
            this.color = color;
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public abstract char[][] movimiento(char[][] Tabla, int ypos, int xpos);
}
