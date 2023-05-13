import java.util.Scanner;
public class Lista03_04{
public static void main(String[] args){
    
//4. Construa um programa que leia o conjunto de 7 números inteiros e mostre qual foi o maior valor fornecido.


Scanner input= new Scanner(System.in);
int i=1;
int num=0,maior=0;

while(i<=7){
    System.out.println("Digite o valor do número " +i+ " inteiro: ");
    num=input.nextInt();
    if(num > maior){
    maior=num;
}
 i++;
}

    System.out.println("\nO maior numero digitado é: "+maior);


}
}