package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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
		
		/* String disciplina1 = JOptionPane.showInputDialog("Disciplina 1 ?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1 do Aluno?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2 ?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2 do Aluno?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3 ?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3 do Aluno?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4 ?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4 do Aluno?"); */
		
		
		
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
		
		Disciplina disciplina1  = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2  = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3  = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4  = new Disciplina();
		disciplina4.setDisciplina("Ingrês");
		disciplina4.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina4);
		
		
		
		
		
		System.out.println(aluno1);
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado": "Reprovado"));
		
		
		
		
		
		
	}

}
