import java.math.BigInteger;

 class Questao02 {
    public static void main (String [] args){

                BigInteger totalGraos = BigInteger.ZERO;
                BigInteger graosNoQuadrado = BigInteger.ONE;

                for (int quadrado = 1; quadrado <= 64; quadrado++) {
                    totalGraos = totalGraos.add(graosNoQuadrado);
                    graosNoQuadrado = graosNoQuadrado.multiply(BigInteger.valueOf(2));
                }
                System.out.println("O monge esperava receber um total de " + totalGraos + " grãos.");
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