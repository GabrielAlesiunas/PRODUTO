package Produto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Construindo a classe Produto
public class Pessoas {
    String 		nome;
    Double 		altura;
    LocalDate 	dataNascimento;
    String 		email;

    // Construtor da classe Pessoas
    public Pessoas(String nomeCompleto, double altura, String dataNascimento) {
        this.nome = nomeCompleto;
        this.altura = altura;

        // Converte a string da data de nascimento para o formato LocalDate e verifica se a data não é futura
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Lança uma exceção se a data de nascimento for posterior à data atual
        if(this.dataNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de nascimento não pode ser no futuro.");
        }


        // Aqui está chamando uma função e atribuindo ela para o this.email
        this.email = gerarEmail(nomeCompleto);
    }

    // Função para criar o email diretamente no construtor
    private String gerarEmail(String nomeCompleto){
        String[] partesNome = nomeCompleto.toLowerCase().split(" ");
        return partesNome[0] + "." + partesNome[partesNome.length - 1] + "@dominio.com";
    }

    // Aqui exibe as informações para o usuário
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args){
    	
        // Criando um objeto pessoa e colocando informações de exemplo
        Pessoas pessoa = new Pessoas("Gabriel Alesiunas", 1.71, "21/11/2005");
        pessoa.exibirInformacoes();
    }
}
