import java.util.Scanner;
public class Lista03_08{
public static void main(String[]args){
    
//Anacleto tem 1,50m e cresce 2 centímetros por ano, enquanto Felisberto tem 1,10 e cresce 3 centímetros por ano. 
//Construa um programa que calcule e apresente quantos anos serão necessários para que Felisberto seja maior que Anacleto.

int ano=0;
float a=1.50f;
float f=1.10f;

while(f<a){
    
 a+=0.02f;
 f+=0.03f;
 ano++;
}
 System.out.println("Anacleto tem 1,50m e cresce 2 centímetros por ano, enquanto Felisberto tem 1,10 e cresce 3 centímetros por ano.");
 System.out.println("\nPortanto, serão necessários "+ano+" anos para que Felisberto seja maior que Anacleto.");

}
}
