import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
		}
		
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm < parametroDois) {
			System.out.println("Calculating");
		} else
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		int numeroAtual = parametroUm;

		for(int indice=0; indice <= contagem;indice++) {
            System.out.println("Imprimindo o numéro " + (indice+1) + ": " + numeroAtual);
			numeroAtual++;
        }
	}

	static void ParametrosInvalidosException (String validarMessage) {
		validarMessage = "O segundo parâmetro deve ser maior que o primeiro";
		System.out.println(validarMessage);
	}
}
