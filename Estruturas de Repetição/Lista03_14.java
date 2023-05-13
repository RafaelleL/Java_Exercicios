import java.util.Scanner;
public class Lista03_14{
public static void main(String[]args){

//

Scanner input=new Scanner(System.in);

int i=1;
int matricula,clas;
double salariob, abono=0,salariop=0;

while(i>=1){
    System.out.println("\nInsira o número da matrícula :");
    matricula = input.nextInt();
    
    if(matricula == 0){
        break;
    }
    
    System.out.println("Insira seu salário base: ");
    salariob = input.nextDouble();
    
    System.out.println("Insira sua classificação: \n(1)Excelente, (2) Bom e (3)Regular.");
    clas = input.nextInt();
    
    if(clas == 1){
    abono=salariob*80/100;
    } else if(clas == 2){
    abono=salariob*50/100;
    } else if(clas == 3){
    abono=salariob*30/100;
    }
    
    salariop=salariob+abono;
    System.out.println("Seu salário a ser pago é = R$ "+salariop);
    
    i++;
    
}

}
}


    