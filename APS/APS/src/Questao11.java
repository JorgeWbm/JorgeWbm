import java.util.Scanner;


public class Questao11 {
    public static void main (String[] args) {
        int Nmercadoria;
        Scanner mercadoria = new Scanner(System.in);

        System.out.print("Digite o número total de mercadorias no estoque: ");
        Nmercadoria = mercadoria.nextInt();

        // Verificação para garantir que o número de mercadorias seja positivo
        if (Nmercadoria <= 0) {
            System.out.println("Por favor, insira um número válido de mercadorias.");
            return;
        }

        // Entrada do valor de cada mercadoria
        System.out.print("Digite o valor de cada mercadoria: ");
        double valorPorMercadoria = mercadoria.nextDouble();

        // Verificação para garantir que o valor seja positivo
        if (valorPorMercadoria < 0) {
            System.out.println("Por favor, insira um valor válido para as mercadorias.");
            return;
        }

        // Cálculo do valor total em estoque
        double valorTotal = Nmercadoria * valorPorMercadoria;

        // Cálculo da média de valor das mercadorias
        double mediaValor = valorTotal / Nmercadoria;

        // Saída dos resultados
        System.out.println("O valor total em estoque é: " + valorTotal);
        System.out.println("A média de valor das mercadorias é: " + mediaValor);
    }
}








