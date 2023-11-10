import java.util.Scanner;

public class Questao10 {
     public static void main (String[] args){
         double nota1, nota2, nota3, soma, media;
         Scanner aluno = new Scanner(System.in);

         System.out.println("Nome do aluno: ");
         String nome = aluno.nextLine();

         System.out.println("Primeira nota de " + nome + ": ");
         nota1 = aluno.nextDouble();
         System.out.println("Segunda nota de " + nome + ": ");
         nota2 = aluno.nextDouble();
         System.out.println("Terceira nota de " + nome + ": ");
         nota3 = aluno.nextDouble();

         soma = nota1+nota2+nota3;
         media = soma /3;



         if (media < 0 || media > 10) {
             System.out.println("Nota Inválida!");
    }else{
             System.out.println("A média das notas de " + nome + " é: " + media );

         }
     }
}
