package desafio.introducao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FolhaPagamento {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // número do colaborador
    System.out.print("Informe o número do coladorador: ");
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numColaborador = Integer.parseInt(st.nextToken());

    // quantidade de horas trabalhadas
    System.out.print("Informe a quantidade de horas trabalhadas: ");
    st = new StringTokenizer(br.readLine());
    int qtdeHoras = Integer.parseInt(st.nextToken());

    // valor hora
    System.out.print("Informe o valor-hora: ");
    st = new StringTokenizer(br.readLine());
    double valorHora = Double.parseDouble(st.nextToken());

   // O salário do colaborador é
   System.out.println(String.format("NUMBER = %d ", numColaborador));
   System.out.println(String.format("SALARY = U$ %.2f ", (qtdeHoras * valorHora)));
  }
}