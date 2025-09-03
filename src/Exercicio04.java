import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat mascara = new DecimalFormat("0.00");
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril",
                        "Maio", "Junho", "Julho", "Agosto",
                        "Setembro", "Outubro", "Novembro", "Dezembro"};
        double[] temperatura = new double[mes.length];
        double mediaAnual = 0;

        for (int i = 0; i < mes.length; i++) {
            System.out.print("Temperatura média de " + mes[i] + " ");
            temperatura[i] = sc.nextDouble();
            mediaAnual = mediaAnual + temperatura[i];
        }

        mediaAnual = mediaAnual / mes.length;
        System.out.println("Média anual: " + mascara.format(mediaAnual));
        System.out.println("Meses do ano com temperatura acima da média anual");
        for(int i = 0; i < mes.length; i++) {
            if(temperatura[i] > mediaAnual) {
                System.out.println(mes[i]);
            }
        }
    }
}
