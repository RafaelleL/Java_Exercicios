import java.util.Scanner;
public class Lista01_13 {
    public static void main(String args[]) {
     //13- Um tonel de refresco é feito com 8 partes de água mineral e 2 partes de suco de maracujá. Faça um algo ritmo para calcular quantos litros
     // de água e de suco são necessários para se fazer X litros de refresco (informados pelo usuário).
     
     double l,agua,suco;
     
     Scanner Lrefresco = new Scanner(System.in);
     System.out.println("Insira em litros a quantidade de refresco a se fazer: ");
     l = Lrefresco.nextDouble();
     
     agua=l*0.8;
     suco=l*0.2;
     
     System.out.println("\nA quantidade de agua necessários é de "+agua+" litros.");
     System.out.println("A quantidade de suco necessários é de "+suco+" litros");
     
     Lrefresco.close();
     
    }
}