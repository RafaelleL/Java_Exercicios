import java.util.Scanner;
  public class Lista02_11 {
      public static void main(String args[]) {
          

    //11. A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.
    
Scanner input = new Scanner(System.in);
System.out.println("Informe seu salário bruto: ");
double salariob = input.nextDouble();

System.out.println("Informe o valor da prestação desejado: ");
double p = input.nextDouble();



if(p > salariob*30/100) {
    System.out.println("\nEmpréstimo não pode ser concedido");
} else if(p <= salariob*30/100) {
    System.out.println("\nEmpréstimo aprovado!");
}
    
      }
  }