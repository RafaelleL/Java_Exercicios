import java.util.Scanner;
public class Lista02_08 {
    public static void main(String args[]) {
        
//8. Faça um programa que leia a altura e o sexo de uma pessoa, calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
// a. Para homens: (72.7 * h) – 58
// b. Para mulheres: (62.1 * h) – 44.7 


Scanner input = new Scanner(System.in);
System.out.println("Digite 1 para feminino e 2 para masculino: ");
int s = input.nextInt();

System.out.println("Informe sua altura: ");
double h = input.nextDouble();

double pesoF, pesoM;
 pesoF = ((62.1*h)-44.7); 
 pesoM = ((72.7*h)-58);  

 
if (s == 1) {
    System.out.println("\nSeu peso ideal é: " + pesoF);
} else if (s == 2) {
    System.out.println("\nSeu peso ideal é: " + pesoM);
}
  }
}