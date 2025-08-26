import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanho;
        boolean especial = true;

        System.out.print("Qual o total de valores? ");
        tamanho = sc.nextInt();

        int[] x = new int[tamanho];

        // entrada de dados
        for(int i = 0; i < x.length; i++) {
            System.out.print("Digite o " + (i+1) + "º --> ");
            x[i] = sc.nextInt();
        }

        // verifica se o vertor NÃO é especial
        for(int i = 0; i < x.length-1; i++) {
            if(x[i] % 2 == x[i+1] % 2) {
                especial = false;
                break;
            }
        }
        if(especial == true) {
            System.out.println("O array é especial");
        }
        else {
            System.out.println("O array não é especial");
        }
    }
}
