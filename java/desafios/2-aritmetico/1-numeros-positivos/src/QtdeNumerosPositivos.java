package desafio.aritmetico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QtdeNumerosPositivos {
    public static void main(String[] args) throws IOException {

        // declaração de constante
        final int TOTAL_ENTRADAS = 6;

        String linha;
        Double n;
        int Pos, i;

        Pos=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (i = 0; i < TOTAL_ENTRADAS; i++) {
            linha = br.readLine();
            n = Double.parseDouble(linha);
            // Se n é maior ou igual zero -> totaliza a quantidade de números positivos
            if(n >= 0) {
                Pos++;
            }
        }

        System.out.println("" + Pos + " valores positivos");
    }
}


