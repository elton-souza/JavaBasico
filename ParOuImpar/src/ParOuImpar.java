import java.util.Scanner;
public class ParOuImpar {
    public static void main(String[] args){
        int numero;
        double resultado;
        Scanner lerTeclado = new Scanner(System.in);
        System.out.print("Digite um número e descubra se ele é impar ou par: ");
        numero = lerTeclado.nextInt();

        resultado = numero % 2;
        if(resultado == 1){
            System.out.print("O número digitado é IMPAR");
        }else{
            System.out.println("O número digitado é PAR");
        }
    }
}

