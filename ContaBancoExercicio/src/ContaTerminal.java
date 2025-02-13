import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {
        Scanner capturaDados = new Scanner(System.in);
        
        System.out.print("Digite seu nome ");
        String nome = capturaDados.nextLine();

        System.out.print("Digite o nome da Agência : ");
        String nomeAgencia = capturaDados.nextLine();

        System.out.print("Digite o número da Agência : ");
        int numero = capturaDados.nextInt();


        System.out.print("Digite seu saldo : R$ ");
        double saldo = capturaDados.nextDouble();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é  "
        + nomeAgencia  + " conta " + numero + " e seu saldo R$ " + saldo  + " já está disponível para saque .");

   }
   
}