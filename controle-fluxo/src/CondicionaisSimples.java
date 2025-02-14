public class CondicionaisSimples {
// A condicional simples só é executada caso a condição seja verdadeira
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;
    
        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.print(saldo);
    }
 
}