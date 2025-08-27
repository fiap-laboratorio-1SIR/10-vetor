import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] x = new int[10];

        // preenchimento e impressão antes da ordenação
        System.out.println("antes da ordenação");
        for(int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(5, 89);
            System.out.print(x[i] + " ");
        }

        // lógica para ordenar (crescente)

        System.out.println("\ndepois da ordenação");
        for(int i = 0; i < x.length; i++) {
           System.out.print(x[i] + " ");
        }

    }
}
