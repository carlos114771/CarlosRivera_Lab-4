/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg4;

import java.util.ArrayList;
import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        int jugador = 0;
        int contador = 0;
        int x, y;
        boolean estado = false;
        Tablero tablero = new Tablero();
        ArrayList<Jugador> Jugadores = new ArrayList();
        boolean Exit = true;
        int ID = 0;
        while (true) {
            try {
                String option = JOptionPane.showInputDialog(""
                        + "A) Agregar Jugador\n"
                        + "B) Eliminar Jugador\n"
                        + "C) Listar Jugaror\n"
                        + "D) Simulacion\n"
                        + "E) Salir\n"
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
                    case "d":
                        do {
                            if (contador % 2 == 0) {
                                jugador = 1;
                            } else {
                                jugador = 2;
                            }
                            System.out.println("Jugador " + jugador);
                            System.out.println(tablero);
                            System.out.println("Ingrese la primera posicion ");
                            x = sc.nextInt();
                            System.out.println("Ingrese la segunda posicion ");
                            y = sc.nextInt();
                        } while (estado != false);

                        break;
                    case "e":
                        System.exit(0);
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
