import java.util.Scanner;
public class Lista03_02{
public static void main(String[] args){
          
        //2- Construa um programa que leia a quantidade (Q) e o preço (PR) de 7 produtos diferentes, comprados por uma empresa, e apresente o total gasto por ela.
        
Scanner input = new Scanner(System.in);

int i=1;
double preçoP, qnt,preçoFinal=0;

while(i<=7){
    System.out.println("O preço do produto " +i+ " é de: " );
    preçoP = input.nextDouble();
    System.out.println("A quantidade do produto " +i+ " é de: ");
    qnt= input.nextDouble();
    preçoFinal +=preçoP*qnt;
    i++;

}

System.out.println("\n"+ "O preço total é R$ " +preçoFinal);

      }
  }