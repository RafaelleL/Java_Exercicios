import java.util.Scanner;
public class Lista03_03 {
public static void main(String[] args){

//3- Construa um programa que leia o número de horas trabalhadas diárias (NH) de um funcionário por um período de 7 dias (ele trabalhou todos os 30 dias) 
//e apresente o salário bruto recebido por ele nesse período, sabendo que o valor do salário é R$ 10,00/hora trabalhada.

Scanner input = new Scanner(System.in);

int i=1;
double horastrb, salariob=0;

while(i<=7){
    System.out.println("No período do dia " +i+ ", digite o total de horas trabalhadas");
    horastrb =input.nextDouble();
    salariob =horastrb*10;
    i++;
}
System.out.println("\nSeu salário bruto semanal é de: R$ " +salariob);

 }
}