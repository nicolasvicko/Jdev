package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/* Objeto ainda não existe na memória, está invalido*/
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		aluno1.idade = 50;
		
		System.out.println("Nome do aluno1 é = " + aluno1.nome);
		System.out.println("Idade do aluno1 é = " + aluno1.idade);
		
		
		/* Agora temos um objeto real, na memória*/
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		
		
		
	}

}
