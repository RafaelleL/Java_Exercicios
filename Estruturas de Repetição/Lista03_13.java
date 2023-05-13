import java.util.Scanner;
public class Lista03_13{
public static void main(String[]args){

//Suponha que você seja o programador dessa empresa, criar um programa que leia para cada candidato a idade, o sexo e se tem experiência no serviço (S ou N). 
//Para encerrar o programa, digite zero para idade. Calcule e escreva:
// O número de candidatos do sexo feminino;
// O número de candidatos do sexo masculino;

Scanner input=new Scanner(System.in);

int i=1, id, sexo, somaF=0, somaM=0;

while(1>=1){
    
    
    System.out.println("\nInforme sua idade: ");
    id = input.nextInt();
    
    if(id==0){
    break;
}
    System.out.println("Informe seu sexo: \n(Considere 1-feminino e 2-masculino): ");
    sexo = input.nextInt();
    
    if(sexo == 1){
    somaF+=1;
    somaM+=0;
    } else if(sexo == 2){
        somaM+=1;
        somaF+=0;
    }
    
    System.out.println("Possui experiencia no serviço? \n(1- para SIM e 2- para NÃO): ");
    int exp = input.nextInt();
    
  i++;
}
    System.out.println("\nA soma dos candidados é de: \nMasculino: "+somaM+"\nFeminio: "+somaF);

}
}
