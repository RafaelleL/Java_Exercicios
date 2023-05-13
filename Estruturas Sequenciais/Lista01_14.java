import java.util.Scanner;
public class Lista01_14 {
    public static void main(String args[]) {
        
        //14
        
      double preço, novopreço;
      
      Scanner valor = new Scanner(System.in);
      System.out.println("Digite o valor do produto:");
      preço = valor.nextDouble();
      
      novopreço=preço-(preço*10/100);
      
      System.out.println("\nO valor desse produto com desconto é R$ " +novopreço);
     
     valor.close();
    }
}