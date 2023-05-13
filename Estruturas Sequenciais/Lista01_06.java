import java.util.Scanner;
public class Lista01_06 {
    public static void main(String args[]) {
    
     //6- O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
     //que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
     //balança já desconte o peso do prato.
     
    double quilo, pesopq;
    quilo=12.0;
    
    Scanner peso = new Scanner (System.in);
    System.out.println("Peso do prato: ");
    pesopq = peso.nextDouble();
    
    double vpagar;
    vpagar=pesopq*quilo;
    System.out.println("O valor a pagar é de R$ " +vpagar);

    
    }
}