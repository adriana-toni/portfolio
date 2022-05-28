package desafio.aritmetico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GeraNumerosParesAteNumeroInformado {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // parâmetro de entrada maior do que zero
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numeroInformado = Integer.parseInt(st.nextToken());

        // numeroPar = variável auxiliar que gerar os números pares até o numeroInformado
        for (int numeroPar = 1; numeroPar <= numeroInformado; numeroPar++) {
            // Verifica se o numeroPar gerado é um número par, se for imprime no console
            if (numeroPar % 2 == 0) {
                System.out.println(numeroPar);
            }
        }
    }
}
