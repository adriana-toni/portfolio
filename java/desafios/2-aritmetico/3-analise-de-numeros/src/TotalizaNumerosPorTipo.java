package desafio.aritmetico;

import java.io.IOException;
import java.util.Scanner;

public class TotalizaNumerosPorTipo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        // declaração de constante - Indica o total de valores de entrada esperados
        final int TOTAL_ENTRADAS = 5;

        // Totalizadores por tipo
        int  qtdeNumerosPares= 0;
        int  qtdeNumerosImares= 0;
        int  qtdeNumerosPositivos = 0;
        int  qtdeNumerosNegativos = 0;

        //continue a solução
        System.out.println("Digite 5 inteiros números:");
        for (int i = 0; i < TOTAL_ENTRADAS; i++) {
            int entrada = leitor.nextInt();
            if (entrada % 2 == 0) {
                qtdeNumerosPares++;
            } else {
                qtdeNumerosImares++;
            }
            if (entrada != 0) {
                if (entrada > 0) {
                    qtdeNumerosPositivos++;
                } else {
                    qtdeNumerosNegativos++;
                }
            }
        }

        System.out.println(qtdeNumerosPares + " par(es)");
        System.out.println(qtdeNumerosImares + " impar(es)");
        System.out.println(qtdeNumerosPositivos + " positivo(s)");
        System.out.println(qtdeNumerosNegativos + " negativo(s)");

        // Encerra o console
        leitor.close();
    }
}
