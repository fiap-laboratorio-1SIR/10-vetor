import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtd, aux, j;

        System.out.print("Qual a quantidade de números? ");
        qtd = in.nextInt();

        int[] x = new int[qtd];

        // entrada de dados
        for(int i = 0; i < x.length; i++) {
            System.out.print("Valor --> ");
            x[i] = in.nextInt();
        }

        System.out.println("\nValores antes da inversão");
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }

        // invertendo os elementos
        j = x.length - 1;
        for(int i = 0; i < x.length / 2; i++) {
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
            j--;
        }

        System.out.println("\nValores depois da inversão");
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
    }
}
