/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tamanhovetores;

/**
 *
 * @author jordy
 */
public class TamanhoVetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int tchar = 2, tshort = 2, tlong = 8, tfloat = 4, tdouble = 8;
        int tamchar = tchar * 10, tamshort = tshort * 10, tamlong = tlong * 10, tamfloat = tfloat * 10, tamdouble = tdouble * 10;
        
        System.out.println("Espaço ocupado pelo vetor de char: " + tamchar);
        System.out.println("Espaço ocupado pelo vetor de short: " + tamshort);
        System.out.println("Espaço ocupado pelo vetor de long: " + tamlong);
        System.out.println("Espaço ocupado pelo vetor de float: " + tamfloat);
        System.out.println("Espaço ocupado pelo vetor de double: " + tamdouble);
    }
    
}
