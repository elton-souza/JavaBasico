import java.util.Scanner;
public class Conversao { 
    public static void main(String[] args) {
        double celsius, fah;
        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Conversão de Celsius para Fahrenheit");
        System.out.print("Digite a temperatura em Celsius: ");
        celsius = lerTeclado.nextDouble();

        fah = (celsius * 1.8) + 32;

        System.out.print(celsius+" Graus Celsius equivale a "+fah+" Fahrenheit");
    }
}
