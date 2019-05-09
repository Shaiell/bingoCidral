import java.util.ArrayList;

/**
 * Classe para execução da segunda lista da prova.
 * 
 * @author Jean Christian de Lima Ribeiro Cidral.
 * @version 1.0
 *
 */

public class Principal {

	/**
	 * Função para inicialização do exercício.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		boolean continuar = true;

		do {
			String[] opcoes = { "Criar Cartela" };
			int opcao = Console.mostrarMenu(opcoes, "Menu", null);

			switch (opcao) {
			case 1:
				criarCartela();
				break;

			case -1:
				System.out.println("Saindo...");
				continuar = false;
				break;
			}

		} while (continuar == true);

	}

	public static Integer InformeTamanhoDaLargura() {

		int largura = Console.recuperaInteiro("Informe a largura da tabela: ");
		return largura;

	}

	public static Integer InformeTamanhoDaAltura() {

		int altura = Console.recuperaInteiro("Informa a altura da cartela: ");
		return altura;

	}

	public static void criarCartela() {

		Integer largura = InformeTamanhoDaLargura();
		Integer altura = InformeTamanhoDaAltura();

		ArrayList<ArrayList<Integer>> cartela = Cartela.retornarCartela(largura, altura);

		imprimirtabela(cartela);

	}

	private static void imprimirtabela(ArrayList<ArrayList<Integer>> cartela) {

		System.out.print("[");
		for (int i = 0; i < cartela.size(); i++) {
			ArrayList<Integer> aux = cartela.get(i);
			System.out.print("\t");
			mostrarVetor(aux);
		}
		System.out.println("]");
	}

	/**
	 * Imprime um vetor primitivo de inteiros na tela
	 * 
	 * @param vetor de inteiros a ser impresso.
	 */
	public static void mostrarVetor(ArrayList<Integer> vetor) {
		if (vetor.size() == 0) {
			System.out.println("[]");
		} else if (vetor.size() == 1) {
			System.out.println("[" + vetor.get(0) + "]");
		} else {
			System.out.print("[");
			for (int i = 0; i < vetor.size() - 1; i++) {
				System.out.printf(vetor.get(i) + ",");
			}
			System.out.println(vetor.get(vetor.size()-1) + "]");
		}
	}
}
