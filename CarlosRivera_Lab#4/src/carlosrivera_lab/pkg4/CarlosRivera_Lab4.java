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
        Caballero caballero = new Caballero();
        Scanner sc = new Scanner(System.in);

        int jugador = 0;
        int contador = 0;
        int x, y;
        boolean estado = false;
        Tablero tablero = new Tablero();
        tablero.tamaño[0][0] = 'C';
        tablero.tamaño[0][2] = 'F';
        tablero.tamaño[0][3] = 'A';
        tablero.tamaño[0][4] = 'R';
        tablero.tamaño[0][5] = 'M';
        tablero.tamaño[0][6] = 'A';
        tablero.tamaño[0][7] = 'F';
        tablero.tamaño[0][9] = 'C';
        tablero.tamaño[1][0] = 'D';
        tablero.tamaño[1][2] = 'A';
        tablero.tamaño[1][3] = 'D';
        tablero.tamaño[1][4] = 'C';
        tablero.tamaño[1][5] = 'F';
        tablero.tamaño[1][6] = 'D';
        tablero.tamaño[1][7] = 'A';
        tablero.tamaño[1][9] = 'D';
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
                            tablero.DrawBoard();
                            int Ypos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion en Y: "));
                            int Xpos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion en X: "));
                            char Pieza = tablero.tamaño[Ypos][Xpos];
                            switch (Pieza) {
                                case 'C':
                                    tablero.tamaño = caballero.movimiento(tablero.tamaño, Ypos, Xpos);
                                    break;

                            }
                            tablero.DrawBoard();

                            contador++;

                        } while (estado != true);

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
