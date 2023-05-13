import java.util.Scanner;
public class Lista03_07{
public static void main(String[]args){

//Construa um programa que leia vários números inteiros e positivos, calculando ao final da seqüência a soma e a média desses números. 
//A seqüência termina quando o usuário entrar com um valor negativo (esse valor não deve fazer parte de nenhum dos cálculos).

Scanner input= new Scanner(System.in);
int i=1;

int media=0,num=0,qtdNum=0,soma=0;

while(i>=1){
    System.out.println("Informe um número inteiro e positivo: ");
    num = input.nextInt();
    if(num<=0){
    num=0;
    qtdNum+=0;
    break;
    
    }else if(num>=1){
    qtdNum+=1;
    soma+=num;
    }
    i++;
}
 
    System.out.println("\nA soma é : "+soma+" \nA média é : "+(soma/qtdNum));

 }
}