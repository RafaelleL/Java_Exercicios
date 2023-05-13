import java.util.Scanner;
public class Lista01_04 {
    public static void main(String args[]) {
        
    // 4. Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela
    //possui. Considere sempre anos completos, e que um ano possui 365 dias.
    
    
    Scanner input = new Scanner(System.in);
    String n;
    System.out.println("Digite seu nome:");
    n = input.nextLine();

    int anos;
    System.out.println("Digite sua idade: ");
    anos = input.nextInt();

    int dias;
    dias=anos*365;
  
    System.out.println(n+  ", você já viveu "+dias+" dias.");
  
    }
}