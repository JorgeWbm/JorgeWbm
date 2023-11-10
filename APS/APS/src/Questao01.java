import java.util.Scanner;

public class Questao01 {
    public static void main (String [] args){
        double indicePoluentes;

        Scanner scannerIdcP = new Scanner(System.in);

        System.out.println("Qual índice de poluição da sua indústria? ");

        indicePoluentes = scannerIdcP.nextDouble();

        if (indicePoluentes >= 0.05 && indicePoluentes <= 0.29) {
            System.out.println("Seu índice de poluição está aceitável, bom trabalho!");
        }else if (indicePoluentes >= 0.3 && indicePoluentes <0.4) {
            System.out.println("Seu índice de poluição está alto, O grupo 1 será informado! Por favor, suspendam as suas atividades!");
        }else if (indicePoluentes >= 0.4 && indicePoluentes <0.5) {
            System.out.println("Seu índice de poluição está alto, Os grupo 1 e 2 serão informados! Por favor, suspendam as suas atividades!");
        }else if (indicePoluentes >= 0.5) {
            System.out.println("Seu índice de poluição está alto, Os grupo 1, 2 e 3 serão informados! Por favor, suspendam as suas atividades!");
        }
        scannerIdcP.close();
    }
}

                                                //  <---     ____________   _______             _______
                                                //           |___   ____|  |__   __|           |__   __|
                                                //              |  |         |   |     ______     |  |
                                                //              |  |          |   |   |      |   |  |
                                                //        ___   |  |           |   | |   ||   | |  |
                                                //        | |___|  |     __     |   |  |   |  |   |     __
                                                //        |________|    |__|     |____|     |____|     |__|
                                                //                                                           --–>