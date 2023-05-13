import java.util.Scanner;
public class Lista01_05 {
    public static void main(String args[]) {
     
     //5- Um motorista deseja colocar no seu tanque X R$ de gasolina. Escreva um algoritmo para ler o
     //preço do litro da gasolina e o valor pago, e exibir quantos litros ele conseguiu colocar no tanque.
     
     double vpago, vlitro;
     
     Scanner input = new Scanner(System.in);
     
     System.out.println("Digite o valor desejado: ");
     vpago = input.nextDouble();
     
     Scanner litro = new Scanner(System.in);
     System.out.println("Preço do litro da gasolina: ");
     vlitro = input.nextDouble();
     
     double total;
     total= vpago/vlitro;
     
     System.out.println("\nVocê colocou " +total+ " litros.");
   
    }
}