package aulaconstrutor.sistemaCadastro;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema com atributos
		Pessoa marcos = new Pessoa("12345678910","Marcos");
		
		//definimos o endereço de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}