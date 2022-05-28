package desafio.introducao;

import java.util.Scanner;

public class VisitaFeira {
  public static void main(String[] args){
    
    Scanner leitor = new Scanner(System.in);

    System.out.print("Informe a quantidade de pimentões amarelos : ");
    int a = leitor.nextInt();
    System.out.print("Informe a quantidade de pimentões vermelhos : ");
    int b = leitor.nextInt();
    
    // O total de pimentões é = X
    System.out.println("X = " + (a + b));
  }
}