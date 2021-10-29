import java.util.*;
public class Baskhara {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);
        double delta,x1,x2;
        int a,b,c;
        System.out.print("Digite a = ");
        a = lerTeclado.nextInt();
        System.out.print("Digite b = ");
        b = lerTeclado.nextInt();
        System.out.print("Digite c = ");
        c = lerTeclado.nextInt();


        delta =  (b * b) + (-4 * (a * c));

        if(delta >= 0){
            x1 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            x2 = ((-(b) + Math.sqrt(delta)) / 2 * a);
            System.out.print("X1 = "+x1+"\nX2 = "+x2);
        }else{
            System.out.println("Delta = "+ delta);
            System.out.print("Não existe Raiz"); System.out.println("Delta = "+ delta);
            System.out.print("Não existe Raiz");
        }
    }
}
