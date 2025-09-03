import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {

        Random rd = new Random();
        int[] x = new int[rd.nextInt(1, 16)];
        int grau = 0;
        int frequencia;

        for(int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(2, 10);
            System.out.print(x[i] + " ");
        }

        // descobrir o grau do vetor
        for(int i = 0; i < x.length; i++) {
            frequencia = 0;
            for(int k = 0; k < x.length; k++) {
                if(x[i] == x[k]) {
                    frequencia++;
                }
            }
            if(frequencia > grau) {
                grau = frequencia;
            }
        }
        System.out.println("\ngrau do vetor = " + grau);
    }
}
