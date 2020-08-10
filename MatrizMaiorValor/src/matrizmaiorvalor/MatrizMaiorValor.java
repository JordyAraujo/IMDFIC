/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizmaiorvalor;
import java.util.Scanner;

/**
 *
 * @author jordy
 */
public class MatrizMaiorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m, n, maior = -99999, cont = 1;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número de linhas:");
        m = leitor.nextByte();
        System.out.println("Agora o número de colunas:");
        n = leitor.nextByte();
	int matriz[][] = new int[m][n];
        for(int i = 0;i < m; i++){
            for(int j = 0;j < n;j++){
                System.out.println("Digite o " + cont + "o número da matriz: ");
                cont++;
                matriz[i][j] = leitor.nextByte();
                if(matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("O maior valor encontrado na matriz é: " + maior);
    }
    
}
