public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou do programa método main");
        a();
        System.out.println("Finalizou o programa no método main");
    }

    static void a() {
        System.out.println("Entrou no método a");
        b();
        System.out.println("Finalizou o método a");
    }

    static void b() {
        System.out.println("Entrou no método b");
        for (int i = 0; i <= 4; i ++ ) System.out.println(i);
        c();
        System.out.println("Finalizou o método b");
    }

    static void c() {
        System.out.println("Entrou no método c");
        Thread.dumpStack(); /* Imprime a pilha de chamadas (stack trace) da thread atual no console.
                            Isso ajuda a entender quais métodos foram chamados até este ponto. */
        System.out.println("Finalizou o método c");
    }
}
