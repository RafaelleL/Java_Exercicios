import java.util.Scanner;
public class  Lista01_15{
    public static  void main(String args[]) {
        
    //15
        
    double salariof, vendas, comissao, sfinal;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite o valor do seu salário fixo: ");
    salariof= input.nextDouble();
    
 
    System.out.println("Digite o valor das vendas:");
    vendas = input.nextDouble();
    
    comissao=vendas*4/100;
    System.out.println("O valor da sua comissão é R$ "+comissao);
    
    sfinal=salariof+comissao;
    System.out.println("O salario final é R$ "+sfinal);
    
    
    }
}