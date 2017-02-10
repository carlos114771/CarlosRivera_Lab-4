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
public class Mi_Excepcion  extends Exception{

    public Mi_Excepcion(String string) {
        super(string);
    }


 
static void Ocupado(char[][] tabla, int PosY, int PosX) throws Mi_Excepcion, Exception {
    if (!(tabla[PosY][PosX] == ' ')) {
        throw  new  Mi_Excepcion("Ocupado");
    } else {
    }
    }
    
}
