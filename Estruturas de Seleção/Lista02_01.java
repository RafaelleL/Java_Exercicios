import java.util.Scanner;
public class Lista02_01 {
    public static void main(String args[]) {
    
    //01
        
    double n, dobro;
    
    Scanner numero = new Scanner(System.in);
    System.out.println("Digite um valor:");
    n = numero.nextDouble();
    
    dobro=n*2;
    
    if(dobro > 35) {
    System.out.println("Seu dobro é maior que 35.");
    
    }
  }
}