import java.util.Scanner;

public class Questao09 {
    public static void main (String[] args) {
        Scanner scannernumeros = new Scanner(System.in);
        int n1, n2, n3, n4, menor, maior;

        System.out.println("Escreva o seu primeiro número: ");
        n1 = scannernumeros.nextInt();
        System.out.println("Escreva o seu segundo número: ");
        n2 = scannernumeros.nextInt();
        System.out.println("Escreva o seu terceiro número: ");
        n3 = scannernumeros.nextInt();
        System.out.println("Escreva o seu quarto número: ");
        n4 = scannernumeros.nextInt();

        menor = nMenor(n1, n2, n3, n4);
        maior = nMaior(n1, n2, n3, n4);

        System.out.println("O menor número é: " + menor);
        System.out.println("O maior número é: " + maior);
    }

    private static int nMenor(int a, int b, int c, int d){
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
    private static int nMaior(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
}

