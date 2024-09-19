public class CondicionalCase {
    public static void main(String[] args) throws Exception {
        
        String sigla = "M";

        switch (sigla) {
            case "P" ->  {
                System.out.println("Pequeno");
            }

            case "M" ->  {
                System.out.println("Medio");
            }

            case "G" ->  {
                System.out.println("Grande");
            }  

            default -> System.out.println("Indefinido");
        }

    }
}