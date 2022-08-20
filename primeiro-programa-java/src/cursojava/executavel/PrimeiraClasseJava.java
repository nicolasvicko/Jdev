package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		
		/* Objeto ainda não existe na memória, está invalido*/
		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do Aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do Aluno?");
		String rg = JOptionPane.showInputDialog("Qual o RG do Aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do Aluno?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe do Aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai do Aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matrícula?");
		String NomeEscola = JOptionPane.showInputDialog("Qual ao nome da escola?");
		String serieMatricula = JOptionPane.showInputDialog("Qual a série?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do Aluno?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do Aluno?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do Aluno?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do Aluno?");
		
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(NomeEscola);
		aluno1.setSerieMatriculado(serieMatricula);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
		
		System.out.println("Nome do aluno1 é = " + aluno1.getNome());
		System.out.println("Idade do aluno1 é = " + aluno1.getIdade());
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado": "Reprovado"));
		
		
		/* Agora temos um objeto real, na memória*/
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno();
		
		
		
		
	}

}
