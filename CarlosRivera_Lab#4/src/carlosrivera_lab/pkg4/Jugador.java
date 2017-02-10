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
public class Jugador {
    String Nombre;
    String Usuario;
    int Puntos;
    String Nacimiento;
    int Edad;
    String Sexo;
    int Serie;

    public Jugador(String Nombre, String Usuario, int Puntos, String Nacimiento, int Edad, String Sexo, int Serie) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Puntos = Puntos;
        this.Nacimiento = Nacimiento;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Serie = Serie;
    }

    public int getSerie() {
        return Serie;
    }

    public void setSerie(int Serie) {
        this.Serie = Serie;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    public String getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(String Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    public String toString() {
    return "Usuario: "+Usuario+"\n"
            + "Nombre: "+Nombre+"\n"
            + "Puntos: "+Puntos+"\n"
            + "Nacimiento: "+Nacimiento+"\n"
            + "Edad: "+Edad+"\n"
            + "Sexo: "+Sexo+""
            + "";
    }
    
}
