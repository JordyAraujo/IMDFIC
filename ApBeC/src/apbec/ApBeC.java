/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apbec;
import java.util.Scanner;

/**
 *
 * @author jordy
 */
public class ApBeC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][] = new int[3][4], b[][] = new int[3][2], c[][] = new int[3][6];
        int cont = 1;
        Scanner leitor = new Scanner(System.in);
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 4;j++){
                System.out.println("Digite o " + cont + "o número da matriz A: ");
                cont++;
                a[i][j] = leitor.nextByte();
            }
        }
        cont = 1;
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 2;j++){
                System.out.println("Digite o " + cont + "o número da matriz B: ");
                cont++;
                b[i][j] = leitor.nextByte();
            }
        }
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 4;j++){
                c[i][j] = a[i][j];
            }
        }
        for(int i = 0;i < 3; i++){
            for(int j = 4; j < 6; j++){
                c[i][j]=b[i][j-4];
            }
        }
        for(int i = 0;i < 3; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
