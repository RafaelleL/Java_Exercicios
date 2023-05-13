import java.util.Scanner;
  public class Lista02_10 {
      public static void main(String args[]) {
          

     // 10. Faça um programa que calcule e imprima o salário reajustado de um funcionário de acordo com seguinte regra:
    //a. salários até R$ 300,00, reajuste de 50%
    //b. salários maiores que R$ 300,00, reajuste de 30%
    
    
Scanner salario = new Scanner(System.in);

System.out.println("Informe seu salário: ");
double s = salario.nextDouble();

if(s<=300) {
    System.out.println("\n"+ "Seu reajuste salarial é de R$ "+(s*150)/100);
    
} else if(s>300) {
        System.out.println("\n"+ "Seu reajuste salarial é de R$ "+(s*130)/100);
}
      }
  }