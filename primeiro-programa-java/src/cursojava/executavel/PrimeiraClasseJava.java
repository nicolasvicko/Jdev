package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

			/* new Aluno() é uma instância (criação de objeto) */
			/* Aluno1 é uma referência para o objeto aluno */
			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + "?");
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
			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");
				
				/* Instanciando a disciplina e setando no objeto */
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				aluno1.getDisciplinas().add(disciplina);
			}
			/* Removendo disciplinas da lista Aluno */
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");
			if (escolha == 0) {
				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3 ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}
			alunos.add(aluno1);
		}
		/* Imprimindo lista de alunos */
		for (Aluno aluno : alunos) {
			/* Imprimindo somente se for alex e executando método */
			if (aluno.getNome().equalsIgnoreCase("Alex")) {
				System.out.println(aluno);
				System.out.println("Média da nota é = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado());
				System.out.println("_______________________________________________");
				break;
			}
		}
		
		for (Aluno aluno : alunos) {
			/* Removendo Aluno*/
			if (aluno.getNome().equalsIgnoreCase("Vicko")) {
				alunos.remove(aluno);
				System.out.println("_______________________________________________");
				break;
			}else {
				System.out.println(aluno);
				System.out.println("Média da nota é = " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado());
				System.out.println("_______________________________________________");
				break;
			}
		}
		
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram da lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas materias são:");
			
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}

	}

}
