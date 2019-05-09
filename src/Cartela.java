import java.util.ArrayList;

public class Cartela {

	/**
	 * Criado para gerar um numero aleatorio
	 * 
	 * @return retorna o numero.
	 */
	public static Integer retornaNumero() {
		Integer numero = (int) (Math.random() * 100);

		return numero;

	}

	/**
	 * Metodo retornar a cartela pronta.
	 * 
	 * @param largura
	 * @param altura
	 * @return
	 */
	public static ArrayList<ArrayList<Integer>> retornarCartela(Integer largura, Integer altura) {

		ArrayList<ArrayList<Integer>> cartela = new ArrayList<>();
		cartela = criarCartela(largura, altura);

		return cartela;

	}

	public static ArrayList<ArrayList<Integer>> criarCartela(Integer largura, Integer altura) {

		ArrayList<ArrayList<Integer>> cartela = new ArrayList<>();

		for (int k = 0; k < altura; k++) {
			ArrayList<Integer> array = new ArrayList<>();
			for (int i = 0; i < largura; i++) {
				Integer numero = retornaNumero();
				numero = repitidosCartela(numero, cartela, array);
				array.add(numero);
			}

			cartela.add(array);

		}
		
		// cartela = repitidosCartela(cartela);
		return cartela;

	}

	public static Integer repitidosCartela(Integer numero, ArrayList<ArrayList<Integer>> cartela,
			ArrayList<Integer> array) {

		Boolean repitir = true;
		do {
			repitir = false;
			for (int k = 0; k < array.size(); k++) {
				if (numero == array.get(k)) {
					numero = retornaNumero();
					repitir = true;
				}
			}
			for (int i = 0; i < cartela.size(); i++) {
				ArrayList<Integer> aux = cartela.get(i);
				for (int j = 0; j < aux.size(); j++) {
					if (numero == aux.get(j)) {
						numero = retornaNumero();
						repitir = true;
					}
				}
			}

		} while (repitir);
		return numero;

	}
//	public static ArrayList<ArrayList<Integer>> repitidosCartela(ArrayList<ArrayList<Integer>> cartela) {
//
//		Integer aux;
//
//		Integer seguir = 0;
//		do {
//			seguir = 0;
//			for (int b = 0; b < cartela.size(); b++) {
//				ArrayList<Integer> array = cartela.get(b);
//				for (int c = 0; c < array.size(); c++) {
//					aux = array.get(c);
//					for (int i = 0; i < cartela.size(); i++) {
//						ArrayList<Integer> array1 = cartela.get(i);
//						for (int k = 0; k < array1.size(); k++) {
//							if (aux == array.get(c)) {
//								
//							} else if (aux == array1.get(k)) {
//								array1.set(k, retornaNumero());
//								seguir = 1;
//
//							}
//						}
//						cartela.set(i, array1);
//					}
//				}
//			}
//		} while (seguir != 0);
//		return cartela;
//	}

//	public static ArrayList<ArrayList<Integer>> repitidosCartela(ArrayList<ArrayList<Integer>> cartela) {
//
//		Integer aux;
//
//		for (int i = 0; i < cartela.size(); i++) {
//			ArrayList<Integer> array = cartela.get(i);
//			for (int k = 0; k < array.size(); k++) {
//				aux = array.get(k);
//				Boolean seguir = false;
//				do {
//					for (int j = 0; j < array.size(); j++) {
//						if (array.get(j) != aux) {
//							while (aux == array.get(j)) {
//
//								array.set(j, retornaNumero());
//								seguir = false;
//							}
//						}
//					}
//				} while (seguir == true);
//				cartela.set(i, array);
//			}
//		}
//
//		return cartela;
//	}

}
