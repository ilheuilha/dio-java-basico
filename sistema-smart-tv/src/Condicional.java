// Em java quando só existe uma linha após o if não precisa das { }
public class Condicional {
    public static void main(String[] args) throws Exception {

        double saldo = 25.0;
        double saque = 30.0;

        if (saque < saldo) {
            
            saldo = saldo - saque;

            System.out.println(saldo);
        }else{
            System.out.println("saldo insuficiente");
        }
        
        /* IF ternário
         * int nota = 7
         * String resultado = nota > 7 ? "Aprovado":" Reprovado "; - Simples
         * String resultado = nota > 7 ? "Aprovado": nota >=5 && nota < 7 ? "EM recuperação":"Reprovado"; - COmposto
         */

    }
}



