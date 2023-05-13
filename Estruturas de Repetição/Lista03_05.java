import java.util.Scanner;
public class Lista03_05{
public static void main(String[] args) {
    
// Construa um programa que leia o conjunto de 7 números inteiros e mostre qual foi o maior e o menor valor fornecido.

Scanner in = new Scanner(System.in);
	int num = 0, maior = 0, menor = 0;
	
int i=1;

	    while(i<=7){
		
		System.out.println("Insira um valor:");
		num = in.nextInt();
		
		if(i == 1){
			
			maior = num;
			menor = num;
		}
		
		if(num > maior){
			
			maior = num;
		}
		
		if(num < menor){
			
			menor = num;
		}
		i++;
	}
	
	System.out.print("Maior: "+ maior +"\nMenor: "+ menor);
}
}