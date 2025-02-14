public class CondicionaisEncadeada {
    /*Condicionais encandeadas é quando não nos limitamos ao (if) e ao (else),
poderiamos ter uma terceira, quarta ou inúmeras condições  
*/
    
    public static void main(String[] args) {
        int nota = 8 ; 

        if (nota >= 7 )
            System.out.print("if");

        else if (nota == 10)
            System.out.print("elseif");

        else 
            System.out.print("else");

    }
}