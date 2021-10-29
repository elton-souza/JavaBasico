import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        double n1, n2, n3, n4, media;
        Scanner getKeyb = new Scanner(System.in);

        System.out.println("==== Média Aluno ====");

        System.out.print("Digite a N1: ");
        n1 = getKeyb.nextDouble();
        System.out.print("Digite a N2: ");
        n2 = getKeyb.nextDouble();
        System.out.print("Digite a N3: ");
        n3 = getKeyb.nextDouble();
        System.out.print("Digite a N4: ");
        n4 = getKeyb.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("==================");
        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        }
        if (media <= 3) {
            System.out.println("Situação: Reprovado");
        }
        if (media > 3 && media <= 6) {
            System.out.println("Situação: Recuperação");
        }
        System.out.println("==================");
    }
}
