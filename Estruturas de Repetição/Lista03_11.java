import java.util.Scanner;
public class Lista03_11{
public static void main(String[]args){

//Faça um programa que leia a idade e a altura de várias pessoas. Calcule e informe a média das alturas das pessoas com mais de 50 anos. 
//Para encerrar o programa digite zero para idade.

Scanner input=new Scanner(System.in);

int i=1,qtdp=0;
int id=1;
double h=0, media=0,total=0;


while(i>=1){
    System.out.println("\nInforme sua idade: ");
    id=input.nextInt();
    if(id == 0){
    break;
    }
    
   System.out.println("Informe sua altura: ");
   h=input.nextDouble();
  
   if(id>50){
   media+=h;
   qtdp+=1;
   } else if(id<=50){
    h+=0;
    qtdp+=0;
   }
   i++;
   total=media/qtdp;

   }
     System.out.println("\nA média das alturas é de: "+total);

}
}