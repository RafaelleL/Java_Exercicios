import java.util.Scanner;
public class Lista02_06 {
    public static void main(String args[]) {
        
//6. Fazer um programa que receba um número e mostre se ele é positivo, negativo ou nulo (0)

Scanner numero = new Scanner(System.in);

System.out.println("Informe o número:");
double n = numero.nextDouble();

if(n >= 1) {
    System.out.println("\nO número é positivo.");
    
} else if (n <= -1) {
    System.out.println("\nO número é negativo.");
    
} else if (n == 0) {
    System.out.println("\nO número é nulo.");
    
   }
  }
}