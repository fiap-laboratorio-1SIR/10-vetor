import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.00");
        Scanner in = new Scanner(System.in);
        double[] media = new double[2];
        double nota;
        int total = 0;

        for(int i = 0; i < media.length; i++) {
            System.out.println("Aluno " + (i+1) + ": ");
            nota = 0;
            for(int k = 1; k <= 4; k++) {
                System.out.print("Nota " + k + " --> ");
                nota = nota + in.nextDouble();
            }
            media[i] = nota / 4;
            if(media[i] >= 6) {
                total++;
            }
            System.out.println("===============================");
        }

        System.out.println("\nMédia dos alunos");
        for(int i = 0; i < media.length; i++) {
            System.out.println("Aluno " + (i+1) + " --> " + formato.format(media[i]));
        }
        System.out.println("Total de alunos aprovados: " + total);
    }
}
