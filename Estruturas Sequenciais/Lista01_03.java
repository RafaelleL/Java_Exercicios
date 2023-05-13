import java.util.Scanner;
public class Lista01_03 {
    public static void main(String args[]) {
        
    // 3    
    double qtp, qtb, broas, paes, porcentagem;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Digite quantidade paes do dia:");
    qtp = input.nextDouble();

    System.out.println("Digite quantidade broas do dia:");
    qtb = input.nextDouble();
    
    broas = 1.50;
    paes = 0.12;

    double total;
    total= qtp*paes+qtb*broas;
    System.out.println("\nO total arrecadado do dia foi R$ "+total);
    

    porcentagem = (total*10/100);
    System.out.println("O dinheiro da conta poupança é R$ "+porcentagem);

      
    }
}