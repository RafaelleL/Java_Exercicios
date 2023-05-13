import java.util.Scanner;

public class Lista03_09{
public static void main(String[]args){
    
    
Scanner input = new Scanner(System.in);

int id=1,op,qtdPessoas=0;

double mediaIdade=0, porcentagem=0;

double otimo=0, bom=0, regular=0, ruim=0;


while(id>=1){
System.out.println("\nInforme sua idade: ");
id = input.nextInt();
if (id == 0 ){
break;
}
    
System.out.println("Sua opinião é: \n[1]Ótimo \n[2]Bom \n[3]Regular \n[4]Ruim");
op = input.nextInt();

if(op == 1){
    otimo++;
}else if(op == 2){
    bom++;
}else if(op == 3){
    regular++;
}else if(op == 4){
    ruim++;
}
qtdPessoas++;
mediaIdade+=id;

}

mediaIdade=mediaIdade/qtdPessoas;

otimo=otimo*100/qtdPessoas;
bom=bom*100/qtdPessoas;
regular=regular*100/qtdPessoas;
ruim=ruim*100/qtdPessoas;


System.out.println("\nA quantidade de pessoas que respoderam a pesquisa é: "+qtdPessoas+"\nA média das idades é de "+mediaIdade+"anos.");
System.out.println("\nA porcentagem das opiniões é \n[1]= "+otimo+"\n[2]= "+bom+"\n[3]= "+regular+"\n[4]= "+ruim);

}
}