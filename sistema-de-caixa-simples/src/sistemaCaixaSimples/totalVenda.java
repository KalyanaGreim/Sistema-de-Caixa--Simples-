package sistemaCaixaSimples;

import java.util.Scanner;

public class totalVenda {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float valorProduto = 0;
		int quantidadeVendida = 0;
		float comissao = 0;
		float diferenca;
		String um="O valor do troco é ";
		String dois="O valor entregue não é suficiente. Faltou ";
		String troco;
		float valorTotal = 0;		
		
		System.out.println("Qual o nome do produto: ");
		String produto = entrada.nextLine();
		System.out.println("Qual valor do produto: ");
		valorProduto = entrada.nextFloat();
		System.out.println("Quantos produtos foram vendidos:");
		quantidadeVendida= entrada.nextInt();
		
		float valorPagar= (valorProduto * quantidadeVendida); 
		
		if(quantidadeVendida >= 100) {
			comissao = (float) (valorPagar * 0.15);
			valorTotal=valorPagar+comissao;
		} else if (quantidadeVendida < 100) { 
			comissao = (float) (valorPagar * 0.1);
			valorTotal=valorPagar+comissao;
		}
		System.out.println("Valor entregue pelo cliente:");
		float valorCliente = entrada.nextFloat();
		
		if(valorPagar < valorCliente) {
			diferenca = valorCliente - valorPagar;
			troco = um + diferenca;
		} else {
			diferenca = valorPagar - valorCliente;
			troco = dois + diferenca;			
		}	
		
		System.out.print("Produto: " + produto + 
				"\nValor do Produto: " + valorProduto + 
				"\nUnidades: " + quantidadeVendida + 
				"\nTotal: " + valorTotal +
				"\nTroco: " + troco +
				"\nComissão: " + comissao);		
		
		entrada.close();
		
	}
	
}
