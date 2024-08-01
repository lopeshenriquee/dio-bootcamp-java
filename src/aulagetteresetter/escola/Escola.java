package aulagetteresetter.escola;

public class Escola {
	//arquivo Escola.java
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.nome = "Felipe";
		//felipe.setNome("André");
		felipe.idade = 8;
		//felipe.setIdade("15");

		System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");
		// RESULTADO NO CONSOLE
		// O aluno Felipe tem 8 anos

	}

}
