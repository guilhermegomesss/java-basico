import java.util.Scanner;

public class PrimeiroDesafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        double saldoInicial = scanner.nextDouble();

        
        double primeiraTransacao = scanner.nextDouble();
        double segundaTransacao = scanner.nextDouble();
        double terceiraTransacao = scanner.nextDouble();


        double saldoFinal = saldoInicial + primeiraTransacao + segundaTransacao + terceiraTransacao;
        
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}