import java.util.Scanner;
public class Lista02_07 {
    public static void main(String args[]) {
        
//07

Scanner numero = new Scanner(System.in);
System.out.println("Informe o número:");
int n = numero.nextInt();

if(n % 2==0) {
    System.out.println("O número é par");
} else {
    System.out.println("O número é ímpar");
  }
 }
}