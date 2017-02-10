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
public class ExceptionCus extends Exception{
    
     public ExceptionCus(String message) {
        super(message);
    }
    
    static void Ocupado(char[][] tabla, int PosY, int PosX) throws ExceptionCus, Exception {
        System.out.println(PosY);
        System.out.println(PosX);
    if (!(tabla[PosY][PosX] == ' ')) {
        throw  new ExceptionCus("Ocupado");
    } else {
        System.out.println("no");
    }
    }
}
