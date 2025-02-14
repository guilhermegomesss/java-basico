public class SwitchCase {
    public static void main (String[] args){
        String sigla = "G";

        switch (sigla){
            case "P":{
                System.out.print("Pequeno");
                break;
            }
            case "M" :{
                System.out.print("Medio");
                break;
            }

            case "G" :{
                System.out.print("Grande");
                break;
            }

            default :
                System.out.println("Não consegui indentificar");
        }
    }

}