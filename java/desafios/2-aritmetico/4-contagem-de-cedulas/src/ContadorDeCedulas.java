package desafio.aritmetico;

import java.io.IOException;
import java.util.Scanner;

public class ContadorDeCedulas {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //continue a solucao de acordo com as notas do enunciado
        int notasInseridas = leitor.nextInt();

        int notas100 = 0;
        int notas50  = 0;
        int notas20  = 0;
        int notas10  = 0;
        int notas5   = 0;
        int notas2   = 0;
        int notas1   = 0;

        if (notasInseridas > 0 && notasInseridas < 1000000) {
            // atual = variável auxiliar
            int atual = notasInseridas;
            notas100 = atual / 100;
            atual -= notas100 * 100;

            notas50 = atual / 50;
            atual -=  notas50 * 50;

            notas20 = atual / 20;
            atual -=  notas20 * 20;

            notas10 = atual / 10;
            atual -=  notas10 * 10;

            notas5 = atual / 5;
            atual -= notas5 * 5;

            notas2 = atual / 2;
            atual -= notas2 * 2;

            notas1 = atual;
        }

        //continue a solucao de acordo com os exemplos de saída
        System.out.println(notasInseridas);
        System.out.println(  notas100 + " nota(s) de R$ 100,00");
        System.out.println(  notas50  + " nota(s) de R$ 50,00");
        System.out.println(  notas20  + " nota(s) de R$ 20,00");
        System.out.println(  notas10  + " nota(s) de R$ 10,00");
        System.out.println(  notas5   + " nota(s) de R$ 5,00");
        System.out.println(  notas2   + " nota(s) de R$ 2,00");
        System.out.println(  notas1   + " nota(s) de R$ 1,00");

        // finaliza o console
        leitor.close();
    }
}
