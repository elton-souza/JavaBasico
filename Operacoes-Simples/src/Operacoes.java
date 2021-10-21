import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args){
        double x,y;
        Scanner getKeyb = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        x = getKeyb.nextDouble();
        System.out.print("Digite o segundo número: ");
        y = getKeyb.nextDouble();

        System.out.println("A soma entre os números é: "+ (x+y));
        System.out.println("A subtração entre os números é: "+ (x-y));
        System.out.println("A multiplicação entre os números é: "+ (x*y));
        System.out.println("A divisão entre os números é: "+ (x/y));
    }
}
