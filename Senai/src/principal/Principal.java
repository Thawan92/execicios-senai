package principal;

import aluno.Aluno;
import prof.Professor;
import turma.Turma;

public class Principal {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 18, 7.5);
		Aluno aluno2 = new Aluno("Maria", 20, 8.0);
		Professor professor = new Professor("Carlos", 35, 5000.0);

		Turma turma1 = new Turma();
		turma1.adicionarAluno(aluno1);
		turma1.adicionarAluno(aluno2);
		turma1.defeinirprofessor(professor);
		turma1.exibirInformacoesTurma();
		    }
		}
