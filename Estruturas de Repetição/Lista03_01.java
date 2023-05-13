import  java.util.Scanner;
  public class Lista03_01 {
    public static void main(String[] args) {
        
        //1
        
    Scanner input = new Scanner(System.in);
    
    int i=1;
    double pesoCx=0,pesoFinal=0;
    
    while(i<=7){
        System.out.println("Digite o peso da " +i+ " caixa");
        pesoCx = input.nextDouble();
        pesoFinal +=pesoCx;
        i++;
    }
    
    System.out.println("\nO peso final é "+pesoFinal);
        
    }
}