import java.util.Scanner;

public class Iphone {
	public static void main(String[] args) {
    	
 
        Scanner menu = new Scanner (System.in);
        int opcao = 0;
        		
        while (opcao !=4) {         
	        System.out.println("-----------------------------");
	        System.out.println("Digite a opcao desejada");
	        System.out.println("1 - telefone");
	        System.out.println("2 - Reprodutor Musical");
	        System.out.println("3 - Navegador de Internet");
	        System.out.println("4 - Sair");
	        System.out.println("-----------------------------");
	
	        opcao = menu.nextInt();
	
			System.out.print("\n");
	        
	            switch (opcao) {
	                case 1: 
	                	new AparelhoTelefone().atender(); 
	                	break;		
	                case 2: 
	                	new ReprodutorMusical().tocar();
	                	break;
	                case 3: 
	                	new NavegadorInternet().atualizarPagina();
	                	break;
	                case 4: 
	                	menu.close();
	                default: 
	                	System.out.println("Opção Inválida!");
	            }
	        }
    }
}

   
