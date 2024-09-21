package Produto;

// Construindo a classe Produto
public class Produto {
	String nome;
	String marca;
	Double preco_custo;
	Double preco_venda;

// Função para calcular o lucro do produto
public double calcularLucro() {
	return preco_venda - preco_custo;
	}

public static void main(String[] args) {
	
	// Criando um objeto produto
	Produto produto = new Produto();
	
	// Atribuindo os nomes e valores para os atributos
	produto.nome = "Tênis";
	produto.marca = "Nike";
	produto.preco_custo = 150.0;
	produto.preco_venda = 950.0;
	
	// Exibindo para o usuario os atributos do produto
	System.out.println("Nome: " + produto.nome);
	System.out.println("Marca: " + produto.marca);
	System.out.println("Preço de custo: " + produto.preco_custo);
	System.out.println("Preço de venda: " + produto.preco_venda);
	System.out.println("Lucro: " + produto.calcularLucro());
}
}
