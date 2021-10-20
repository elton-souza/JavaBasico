public class tabuada {
    public static void main(String[] args){
        System.out.println("==== Tabuada ====");
        for(int i = 1; i <= 10; i++){           
            for(int x = 1; x <= 10; x++){
                System.out.println(i+" * "+x+" = "+i*x);
            }
            System.out.println("=============");
        }
    }
}
