import java.util.Random;

public class terceira_questao {


    public static void main(String[] args) {
        double[] faturamentoDiario = gerarFaturamentoAnual();
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;

        double totalFaturamento = 0;
        int diasComFaturamento = 0;


        for (double faturamento: faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                totalFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento superior à média anual: " + diasFaturamentoAcimaMedia(
                faturamentoDiario,
                diasComFaturamento,
                totalFaturamento
        ));
    }

    private static double[] gerarFaturamentoAnual() {
        double[] faturamentoDiario = new double[365];
        Random random = new Random();

        for (int i = 0; i < faturamentoDiario.length; i++) {
            //Simular dias úteis com faturamento e finais de semana e feriados sem faturamento
            if (i % 7 == 5 || i % 7 == 6) {
                faturamentoDiario[i] = 0;
            } else {
                faturamentoDiario[i] = 500 + (5000 - 500) * random.nextDouble();
            }
        }

        return faturamentoDiario;
    }

    private static double diasFaturamentoAcimaMedia(double[] faturamentoDiario, int diasComFaturamento, double totalFaturamento) {

        double mediaFaturamento = 0;
        int diasAcimaMedia = 0;

        if (diasComFaturamento > 0) {
            mediaFaturamento = totalFaturamento / diasComFaturamento;
        }

        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0 && faturamento > mediaFaturamento) {
                diasAcimaMedia++;
            }
        }

        return diasAcimaMedia;
    }
}
