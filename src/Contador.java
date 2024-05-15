import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Digite o primeiro parâmetro"); 
                int parametroUm = verificarNumeroInteiro(terminal);
                System.out.println("Digite o segundo parâmetro");   
                int parametroDois = verificarNumeroInteiro(terminal);

			    //chamando o método contendo a lógica de contagem
			    contar(parametroUm, parametroDois);	
                break;
		    }catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		    }
        }		
	}

    static int verificarNumeroInteiro(Scanner terminal){
        while (true) {
            String input = terminal.next();
            input = input.replaceAll("[^0-9]", "");
            try {
                //conversão do valor digitado para um número inteiro
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                //se a entrada digitada não for convertida para um número interio a exception é disparada e o loop continua
                System.out.println("Entrada inválida. Digite um número inteiro válido.");
            }
        }
    }

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR ou IGUAL que parametroDois e lançar a exceção
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os números com base na variável contagem

        for(int indice = 1; indice <= contagem;indice ++){
            System.out.println("Imprimindo o número " + indice);
        }
	}
}