package br.com.alura.algoritmos;

public class TestaMenorPreco {

	public static void main(String[] args) {
		
		double precos [] = new double[5];
		precos[0] = 1000000;
		precos[1] = 46000;
		precos[2] = 16000;
		precos[3] = 46000;
		precos[4] = 17000;
		
		int maisBarato = 0;
		
		
/*		executa do 0 ate 4 inclusive{
			se preco do atual < preco do mais barato {
				mais barato = atual
			}
				atual = atual + 1 ; 
		}
		imprime o maisbarato
		imprime o pre?o do mais barato */
		
		for (int atual = 0; atual <= 4; atual++) {
			if(precos[atual] < precos[maisBarato])
				maisBarato = atual;
		}
		System.err.println(maisBarato);
		System.err.println("O carro mais barato custa " + precos[maisBarato]);
		
	}
}

