import java.util.Scanner;
public class DiasDeVida {
    public static void main(String[] args){
        Scanner lerTeclado = new Scanner(System.in);
        int idade, diasDeVida, dias = 365;

        System.out.print("Quer saber quantos dias você viveu? Digite sua idade: ");
        idade = lerTeclado.nextInt();

        diasDeVida = idade * dias;

        System.out.println("Você viveu "+diasDeVida+" dias");
    }   
}
