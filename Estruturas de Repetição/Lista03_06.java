import java.util.Scanner;
public class Lista03_06{
public static void main(String[] args){
    

Scanner input = new Scanner(System.in);

int i=1;
double preçoP,qtd,total=0;

System.out.println("Digite a quantidade de produtos a serem contados: ");
int num = input.nextInt();

while(i<=num){
    System.out.println("\nO preço do produto " +i+ " é de: " );
    preçoP = input.nextDouble();
    System.out.println("A quantidade do produto " +i+ " é de: ");
    qtd= input.nextDouble();
    total+=preçoP*qtd;
    i++;
    
}

System.out.println("\nO gasto total foi de: R$ "+total);
 }
}
    