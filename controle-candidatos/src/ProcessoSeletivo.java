import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};

        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealisadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealisadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
            
        }while(continuarTentando && tentativasRealisadas < 3);
        if(atendeu){
            System.out.println("Conseguimos entrar em contato com " + candidato + " NA " + tentativasRealisadas);
        }else {
            System.out.println("Não conseguimos entrar em contato com " + candidato + ", número máximo de tentativas " + tentativasRealisadas);
        }

    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n*" + (indice+1) + "é" + candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio", "Mirela","Daniela","Guilherme"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " +  candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + " Foi selecionado para a vaga ");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioPretendido > salarioBase ){
            System.out.println("Ligar para o candidato");
        }else if (salarioPretendido == salarioBase){
            System.out.println("Fazer contra proposta");
        }else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }
}