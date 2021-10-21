import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args){
        double x,y,result;
        int keyb;
        Scanner getKeyb = new Scanner(System.in);

        System.out.println("----Tabuada----");
        System.out.print(" 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n Digite o número correspondente: ");
        keyb = getKeyb.nextInt();
        System.out.print("Digite o primeiro número: ");
        x = getKeyb.nextDouble();
        System.out.print("Digite o segundo número: ");
        y = getKeyb.nextDouble();

        if(keyb == 1){
            result = x + y;
            System.out.println("A soma entre os números é: "+result);
        }
        if(keyb == 2){
            result = x - y;
            System.out.println("A subtração entre os números é: "+result);
        }
        if(keyb == 3){
            result = x * y;
            System.out.print("A multiplicação entre os números é: "+result);
        }
        if(keyb == 4 ){
            result = x / y;
            System.out.println("A divisão entre os números é: "+result);
        }
    }
}
