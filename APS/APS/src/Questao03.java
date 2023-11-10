
public class Questao03 {
    public static int Questao03(String senha) {
        boolean Maiuscula = false;
        boolean Minuscula = false;
        boolean Numero = false;
        boolean Especial = false;

        String caractereEspeciais = "!@#$%^&*()-+";

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                Maiuscula = true;
            } else if (Character.isLowerCase(c)) {
                Minuscula = true;
            } else if (Character.isDigit(c)) {
                Numero = true;
            } else if (caractereEspeciais.contains(String.valueOf(c))) {
                Especial = true;
            }
        }

        boolean criteriosAtendidos = Maiuscula && Minuscula && Numero && Especial;

        int caracteresFaltando = 0;

         if (!Maiuscula) {
            caracteresFaltando++;
        }if (!Minuscula) {
            caracteresFaltando++;
        }if (!Numero) {
            caracteresFaltando++;
        }if (!Especial) {
             caracteresFaltando++;
        }if (senha.length() + caracteresFaltando < 6) {
            caracteresFaltando = 6 - senha.length();
        }
         return caracteresFaltando;
    }
         public static void main(String[] args) {
            String senha = "Ya3";
            int caractereFaltando = Questao03(senha);
            System.out.println(caractereFaltando);

    }


}
