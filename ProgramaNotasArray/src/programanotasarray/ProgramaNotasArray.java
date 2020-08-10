/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programanotasarray;

/**
 *
 * @author jordy
 */
import java.util.Scanner;

public class ProgramaNotasArray {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas a serem lidas");
		int quantidade = leitor.nextInt();
		double notas[] = new double[quantidade];
                int j = 0;
		for (int i = 0; i < quantidade; i++) {
                        j = i + 1;
			System.out.println("Digite a nota de número " + j);
			notas[i] = leitor.nextDouble();
		}
		// /t
                System.out.println("NOTA\tÍNDICE\tPOSIÇÃO");
                j = 0;
                for (int i = 0; i < quantidade; i++) {
                    j = i + 1;
                    System.out.println(notas[i] + "\t" + i + "\t" + j);
                }
	}
}