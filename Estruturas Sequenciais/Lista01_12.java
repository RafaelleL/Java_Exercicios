import java.util.Scanner;
public class Lista01_12 {
    public static void main(String args[]) {
        
     // 12 -  A granja Frangotech possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com 
    //um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. Sabendo que 
   // o anel com chip custa R$4,00 e o anel de alimento custa R$3,50, faça um algoritmo para calcular o gasto total da granja para marcar todos os seus frangos. 
   
    double qtf, frango, chip, alimento;
    chip=4;
    alimento=3.50;
    frango=chip+2*alimento;
    
    Scanner frangos = new Scanner(System.in);
    System.out.println("Quantidade de frangos a marcar:");
    qtf= frangos.nextDouble();
    
    double total;
    total=qtf*frango;
    
    System.out.println("\nO gasto total será de R$ "+total);
    
   }
}