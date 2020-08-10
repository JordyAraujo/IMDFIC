/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letrasimpares;

import java.util.Scanner;

/**
 *
 * @author jordy
 */
public class LetrasImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
	System.out.println("Digite uma palavra:");
	String nome1 = leitor.next();
        for(int i = 1; i < nome1.length(); i = i + 2){
            System.out.println(nome1.charAt(i));
        }
    }
    
}
