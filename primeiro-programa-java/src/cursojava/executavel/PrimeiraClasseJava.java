package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/* Objeto ainda não existe na memória, está invalido*/
		Aluno aluno1 = new Aluno();
		aluno1.setNome("João");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("25/02/1993");
		aluno1.setRegistroGeral("99.999.999.-6");
		aluno1.setNumeroCpf("999.999.999-99");
		aluno1.setNomeMae("Lene");
		aluno1.setNomePai("cimar");
		aluno1.setDataMatricula("19/08/2022");
		aluno1.setNomeEscola("Oscar Brito");
		aluno1.setSerieMatriculado("3");
		aluno1.setNota1(90.4);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(60.10);
		
		
		
		System.out.println("Nome do aluno1 é = " + aluno1.getNome());
		System.out.println("Idade do aluno1 é = " + aluno1.getIdade());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		
		
		/* Agora temos um objeto real, na memória*/
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		
		
		
	}

}
