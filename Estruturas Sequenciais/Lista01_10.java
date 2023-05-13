import java.util.Scanner;
public class Lista01_10 {
    public static void main(String args[]) {

    // 10. A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de queijo, uma fatia de presunto e uma rodela de hambúrguer. 
    //Sabendo que cada fatia de queijo ou presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em que 
    //o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em quilos) de queijo, presunto e carne necessários para compra.    
     
    double qtds, queijo, presunto, hmb; //quantidade de sanduiche, queijo, presunto e hambúrguer em quilos 
    queijo=0.05;
    presunto=0.05;
    hmb=0.1;
    qtds= queijo + presunto+ hmb; 
    
    Scanner sanduiches = new Scanner(System.in);
    
    System.out.println("Quantidade de sanduíches a fazer: "); 
    qtds= sanduiches.nextDouble();
    
    double qtdQueijo=queijo*qtds;
    System.out.println("\nA quantidade de queijo necessária é de " +qtdQueijo+" kg"); 
    
   
   double qtdPresunto=presunto*qtds;
   System.out.println("\nA quantidade de presunto necessária é de " +qtdPresunto+" kg"); 
  
   
   double qtdCarne=hmb*qtds;
   System.out.println("\nA quantidade de carne necessária é de " +qtdCarne+" kg"); 

    
   }
}