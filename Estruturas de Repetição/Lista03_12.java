import java.util.Scanner;
public class Lista03_12{
public static void main(String[]args){

//Faça um programa que leia vários números, quando o zero for digitado o programa será finalizado. 
//Mostre no final desse programa a soma dos números positivos, a soma dos negativos e a soma total dos positivos e negativos juntos.

Scanner input=new Scanner(System.in);

int i=1;
double somaT=0,somaPos=0,somaNeg=0,num;

while(i>=1){

System.out.println("Digite um número: ");
num = input.nextDouble();

if (num==0){
num=0;
break;

} else if(num>=1){
somaPos+=num;
somaNeg+=0;
} else if(num<=-1){
somaPos+=0;
somaNeg+=num;
}

i++;
somaT=somaPos+(somaNeg);
}
System.out.println("\nA soma dos números positivos é: "+somaPos+"\nA soma dos números negativos é: "+somaNeg+"\nA soma total é: "+somaT);

}
}
