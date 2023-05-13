import java.util.Scanner;
public class Lista03_10{
public static void main(String[]args){
    
Scanner input=new Scanner(System.in);


double ht=0,vh=0;
double salariob=0;

double salariol=0,impostoR=0,inss=0;

int i=1;


while(i<=10){
System.out.println("\nInforme sua hora trabalhada: ");
ht = input.nextDouble();

System.out.println("Informe o valor da hora trabalhada: ");
vh = input.nextDouble();
salariob=ht*vh;

inss=salariob*0.11;
salariob-=inss;


if(salariob<900){
    salariol=salariob;
    
}else if(salariob>=900 && salariob<=1800){
    salariol=salariob-135;

     
}else if(salariob>1801){
    salariol=salariob-360;
}
System.out.println("Salario liquido do "+i+"º funcinário = R$ "+salariol);


i++;

}

}
}
