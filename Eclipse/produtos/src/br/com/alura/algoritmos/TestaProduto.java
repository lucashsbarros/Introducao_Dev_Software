package br.com.alura.algoritmos;

public class TestaProduto {
	public static void main(String[] args) {
		
		Produto produtos[] = {
		new Produto("Lamborguini", 1000000),
		new Produto("Jipe", 46000),
		new Produto("Bras?lia", 16000),
		new Produto("Smart", 46000),
		new Produto("Fusca", 17000),
		null,
		null,
		null,
		null,
		
		
	};

		// FUN??O GEN?RICA
		
		//caso uma linguagem n?o souber o tamanho de um array, pode utlizar esse c?digo abaixo.
		// Repare que com esse c?digo ? aceito os campos NULL
		
		
		int maisBarato = buscaMenor(produtos,0, 4);

		System.out.println(maisBarato);
		System.out.println("O carro " + produtos[maisBarato].getNome()
		                              + " ? o mais barato e custa "
		                              + produtos[maisBarato].getPreco());
	}
	
	

	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
		for(int atual = inicio; atual <= termino ; atual++){ 
		    if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) { 
		        maisBarato = atual;
		    }            
		}
		return maisBarato;
	}
	
	
		
		// FUN??O QUE PODE SER UTILIZADA NO JAVA
		
		
	/*	int maisBarato = buscaMenor(produtos);

		System.out.println(maisBarato);
		System.out.println("O carro " + produtos[maisBarato].getNome()
		                              + " ? o mais barato e custa "
		                              + produtos[maisBarato].getPreco());
	}
	
	

	private static int buscaMenor(Produto[] produtos) {
		int maisBarato = 0;
		int termino = produtos.length - 1;
		for(int atual = 0; atual <= termino ; atual++){ 
		    if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) { 
		        maisBarato = atual;
		    }            
		}
		return maisBarato;
	}
	 */
}
