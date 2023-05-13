import java.util.Scanner;
public class Lista01_02 {
   public static void main(String[] args) {
        
    // 2. Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados para um haras.    
 
  int cavalos,ferraduras;
  
  Scanner c = new Scanner(System.in);
  System.out.println("Quantidade de cavalos:");
  cavalos = c.nextInt();
  
  ferraduras = cavalos*4;
  
  System.out.println("Serão necessárias " +ferraduras+" ferraduras.");
  }
}
