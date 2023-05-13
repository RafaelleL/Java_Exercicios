import java.util.Scanner;
 public class Lista01_09 {
     public static void main(String args[]){
         
    // 9- Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
    //desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.
        
        
    double si, aumento, salariof;
    
    Scanner salario = new Scanner(System.in);
    
    System.out.println("Digite seu salário: ");
    si = salario.nextDouble();
    
    System.out.println("\nSeu salario inicial é de R$ "+si);
    
    aumento=si*115/100;
    System.out.println("\nSeu salario com aumento é de R$ "+aumento);
    
    salariof=aumento*92/100;
    System.out.println("\nSeu salario final é de R$ "+salariof);

    
  }
}