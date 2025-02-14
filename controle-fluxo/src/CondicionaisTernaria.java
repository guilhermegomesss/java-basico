public class CondicionaisTernaria {
    /*Condição ternária é um jeito de fazer condicionais de maneira mais curta  */
    public static void main (String[] args) {
        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.print(resultado);
    }
}