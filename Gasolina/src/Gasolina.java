import java.util.Scanner;
public class Gasolina {
    public static void main(String[] args){
        Scanner lerTeclado = new Scanner(System.in);
        double gasolina, litros, valor;

        System.out.print("Valor da gasolina: ");
        gasolina = lerTeclado.nextDouble();
        System.out.print("Quantos reais de gasolina você deseja colocar: ");
        valor = lerTeclado.nextDouble();

        litros = valor / gasolina;

        System.out.printf("Consegue encher %.2f litros no tanque", litros);
    }
}
