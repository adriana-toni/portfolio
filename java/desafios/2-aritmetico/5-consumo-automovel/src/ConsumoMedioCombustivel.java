package desafio.aritmetico;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ConsumoMedioCombustivel {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        // change the locale of the scanner
        leitor.useLocale(Locale.ENGLISH);

        //declare as variaveis corretamente
        int distanciaPercorrida = leitor.nextInt();
        double combustivelConsumido = leitor.nextDouble();

        // apura o consumo médio de combustível do automóvel
        double media =  distanciaPercorrida / combustivelConsumido;

        // variável auxiliar para conversão de valor
        Double mediaDouble = new Double(media);
        System.out.println(String.format(Locale.ENGLISH, "%.3f km/l",  mediaDouble.floatValue()));

        // Finaliza o console
        leitor.close();
    }
}
