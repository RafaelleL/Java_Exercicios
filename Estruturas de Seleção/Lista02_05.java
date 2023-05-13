import java.util.Scanner;
public class Lista02_05 {
    public static void main(String args[]) {
        
//05- Faça um programa que leia dois números e informe se o primeiro é maior, menor ou igual ao segundo.

double p, s;

Scanner input = new Scanner(System.in);
System.out.println("Informe o primeiro número:");
p = input.nextDouble();

System.out.println("Informe o segundo número:");
s = input.nextDouble();

if(p > s) {
    System.out.println("O primeiro é maior que o segundo");
} else if (p < s) {
    System.out.println("O primeiro é menor que o segundo");
    
} else {
    System.out.println("O primeiro é igual ao segundo");
    
    }
   }
  }
