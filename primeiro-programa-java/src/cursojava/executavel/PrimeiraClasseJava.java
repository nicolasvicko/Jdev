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
		
		
		/* Para cada elemento no objeti disciplina, vou pedira matéria e nota */
		for (int pos = 1; pos <=4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" ?");
			
			/*Instanciando a disciplina e setando no objeto */
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		
		
		/*Removendo disciplinas da lista Aluno */
		
		int escolha =JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
		if(escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3 ou 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
		}
		
		
		
		
		System.out.println(aluno1);
		System.out.println("Média da nota é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
		
		
		
		
		
		
	}

}
