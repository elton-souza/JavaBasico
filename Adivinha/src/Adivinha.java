import java.util.*;
public class Adivinha {
    public static void main(String[] args){
        int sort,keyB; 
        Scanner getKeyB = new Scanner(System.in);
        Random getSort = new Random();
        sort = getSort.nextInt(10)+1;

        for(int i = 1; i <= 10;i++){
            System.out.print("Adivinhe qual número foi sorteado entre 0 a 10: ");
            keyB = getKeyB.nextInt();
            if(keyB > sort){
                System.out.println("O número sorteado é menor que "+keyB);
            }
            else if(keyB < sort){
                System.out.println("O número sorteado é maior que "+keyB);
            }
            else if(keyB == sort){
                System.out.println("Você acertou! O número sorteado era "+sort);
                break;
            }
            else{
                System.out.print("Sua tentativas acabaram! \nO número sorteado era "+sort);  
            }
        }

    }   
}
