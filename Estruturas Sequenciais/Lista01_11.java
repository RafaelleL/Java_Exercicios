import java.util.Scanner;
public class Lista01_11 {
    public static void main(String args[]) {
        
    // 11 - A empresa Hipotheticus paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra. Faça um algoritmo para calcular 
    //e imprimir o salário bruto e o salário líquido de um determinado funcionário.
    //Considere que o salário líquido é igual ao salário bruto descontando-se 10% de impostos.
    
    double hrnormal, hrextra;
    
    
    Scanner input = new Scanner (System.in);
    System.out.println("Sua hora normal trabalhada é: " );
    hrnormal = input.nextDouble();

    System.out.println("Sua hora extra trabalhada é: ");
    hrextra= input.nextDouble();
    
    double salariob;
    salariob=hrnormal*10+hrextra*15;
    System.out.println("\nSeu salário bruto é de R$"+salariob);
    
    double salariol;
    salariol=salariob*90/100;
    System.out.println("Seu salário líquido é de R$ "+salariol);

   
   }
}