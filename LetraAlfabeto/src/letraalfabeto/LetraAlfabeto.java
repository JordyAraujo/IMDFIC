import java.util.Scanner;

public class LetraAlfabeto {

    public static void main(String args[]){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma das 5 primeiras letras do alfabeto:");

        char letra = leitor.nextLine().charAt(0);

        switch(letra){

            case 'a':

                System.out.print("a");

                break;

            case 'b':

                System.out.print("b");

                break;

            case 'c':

                System.out.print("c");

            case 'd':

                System.out.print("d");

            case 'e':

                System.out.print("e");

            default:

                System.out.print("letra não cadastrada");

        }   

    }

}