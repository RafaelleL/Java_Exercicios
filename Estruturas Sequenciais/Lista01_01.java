import java.util.Scanner;
public class Lista01_01 {
    public static  void main(String args[]) {
        
    // 1- A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler as 
    //dimensões de um terreno e depois exibir a área do terreno.
        
        
      double b,h;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Digite o comprimento: ");
      b = input.nextDouble();
      
      System.out.println("Digite a altura: ");
      h = input.nextDouble();
      
      double area;
      area=b*h;
      
      System.out.println("A área do terreno é " +area);
    }
}