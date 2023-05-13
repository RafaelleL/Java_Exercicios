import java.util.Scanner;
public class Lista02_02 {
    public static void main(String args[]) {
        
    //02
    
    double  n, metade;
    
    Scanner numero = new Scanner(System.in);
    System.out.println("Digite um valor:");
    n = numero.nextDouble();
    
    metade=n*0.5;
    
    if(metade < 12) {
        System.out.println("A metade do número é menor que 12");
        
    }
  }
}