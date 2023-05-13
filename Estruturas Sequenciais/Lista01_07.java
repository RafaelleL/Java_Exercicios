 import java.util.Scanner;
 public class Lista01_07 {
    public static void main(String args[]) {
  
      
      //7- Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3).
      
      double n1, n2, n3;
      
      Scanner input  = new Scanner(System.in);
      
      System.out.println("Digite sua primeira nota");
      n1 = input.nextDouble();
      
      System.out.println("Digite sua segunda nota");
      n2 = input.nextDouble();
      
      System.out.println("Digite sua terceira nota");
      n3 = input.nextDouble();
      
     double media;
     media=(n1+n2*2+n3*3)/6;
     
     System.out.println("A sua média ponderada é de " +media);

    }
}