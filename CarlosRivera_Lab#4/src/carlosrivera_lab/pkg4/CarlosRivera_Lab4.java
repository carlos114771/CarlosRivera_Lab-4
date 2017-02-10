/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg4;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario Dell
 */
public class CarlosRivera_Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Jugador> Jugadores = new ArrayList();
        boolean Exit = true;
        int ID = 0;
        while (true) {
            try {
                String option = JOptionPane.showInputDialog(""
                        + "A) Agregar Jugador\n"
                        + "B) Eliminar Jugador\n"
                        + "C) Listar Jugaror"
                );
                switch (option) {
                    case "a":
                        Jugadores.add(CrearJugador(ID));
                        ID++;
                        break;
                    case "b":
                        int borrar = Integer.parseInt(JOptionPane.showInputDialog("Borrar Cual: "));
                        for (int i = 0; i <= Jugadores.size(); i++) {
                            if (borrar == Jugadores.get(i).getSerie()) {
                                Jugadores.remove(i);
                            }
                        }
                        break;
                    case "c":
                        for (int i = 0; i < Jugadores.size(); i++) {
                            System.out.println(Jugadores.get(i).toString());
                            System.out.println("-------------");
                        }
                        break;
                }
            } catch (NullPointerException e) {
                Exit = false;
            }
        }
    }

    public static Jugador CrearJugador(int Serie) {
        String Usuario = (JOptionPane.showInputDialog("Usuario: "));
        String Nombre = (JOptionPane.showInputDialog("Nombre: "));
        int Puntos = Integer.parseInt(JOptionPane.showInputDialog("Puntos: "));
        String Nacimiento = (JOptionPane.showInputDialog("Nacimiento: "));
        int Edad = Integer.parseInt(JOptionPane.showInputDialog("Edad: "));
        String Sexo = (JOptionPane.showInputDialog("Sexo: "));
        Jugador c = new Jugador(Nombre, Usuario, Puntos, Nacimiento, Edad, Sexo, Serie);
        return c;
    }
}
