import java.util.Scanner;
public class Lista01_08 {
    public static void main(String args[]) {
    
    // 8- Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respectivamente por 10, 12 e 15 reais.
    //Construa um algoritmo em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
    // informe quanto será o valor arrecadado.

    int p, m, g, qtp, qtm, qtg;
    p=10;
    m=12;
    g=15;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Digite a quantidade de camisetas pequenas: ");
    qtp = input.nextInt();
    
    
    System.out.println("Digite a quantidade de camisetas médias: ");
    qtm = input.nextInt();
    
    
    System.out.println("Digite a quantidade de camisetas grandes:");
    qtg = input.nextInt();
    
    int total;
    total=p*qtp + m*qtm + g*qtg;
    
    System.out.println("\n"+ "O valor arrecadado é de R$ " +total+ ".");

    
    }
}