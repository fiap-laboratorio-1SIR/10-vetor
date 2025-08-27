import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] x = new int[10];
        int aux;
        boolean achou;

        for(int i = 0; i < x.length; ) {
            aux = rd.nextInt(7);
            achou = false;
            for(int k = 0; k < i; k++) {
                if(aux == x[k]) {
                    achou = true;
                    break;
                }
            }
            if(achou == false) {
                x[i] = aux;
                System.out.print(x[i] + " ");
                i++;
            }
        }

    }
}
