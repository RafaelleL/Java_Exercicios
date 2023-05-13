import java.util.Scanner;
public class Lista02_09 {
    public static void main(String args[]) {
        
    //9- Faça um programa que receba quatro notas de um aluno, calcule e imprima a média aritmética das notas e a mensagem de 
    //aprovado para média superior ou igual a 7.0 ou a mensagem de reprovado para média inferior a 7.0.
    
    
 Scanner input = new Scanner(System.in);
 
 System.out.println("Insira sua primeira nota: ");
 double n1 = input.nextDouble();
 
 System.out.println("Insira sua segunda nota: ");
 double n2 = input.nextDouble();
 
 System.out.println("Insira sua terceira nota: ");
 double n3 = input.nextDouble();
 
 System.out.println("Insira sua quarta nota: ");
 double n4 = input.nextDouble();
 
 
double media=(n1+n2+n3+n4)/4;

System.out.println("\nSua média aritmética é: "+media);

if (media>=7.0) {
    System.out.println("Aprovado!");
} else if (media<7.0) {
    System.out.println("Reprovado!");
}

  }
}