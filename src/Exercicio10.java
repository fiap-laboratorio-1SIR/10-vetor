import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] x = new int[100000];
        int aux;

        // preenchimento e impressão antes da ordenação
        System.out.println("antes da ordenação");
        for(int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(5, 89);
            //System.out.print(x[i] + " ");
        }

        // lógica para ordenar (crescente)
        for(int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }

        System.out.println("\ndepois da ordenação");
        for(int i = 0; i < x.length; i++) {
           //System.out.print(x[i] + " ");
        }
    }
}
