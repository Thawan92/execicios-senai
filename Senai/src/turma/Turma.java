package turma;


import java.util.ArrayList;
import aluno.Aluno;
import prof.Professor;

public class Turma{
	private Professor professor;
	private ArrayList<Aluno> alunos;
	
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void defeinirprofessor(Professor professor) {
		this.professor = professor;
	}
	
	public void exibirInformacoesTurma() {
		System.out.println("Turma");
		exibirAlunos();
		exibirProfessor();
	}
	  private void exibirAlunos() {
	        System.out.println("Alunos:");
	        for (Aluno aluno : alunos) {
	            System.out.println("Nome: " + aluno.getNome());
	            System.out.println("Idade: " + aluno.getIdade());
	            System.out.println("Nota: " + aluno.getNota());
	            System.out.println();
	        }
	    }

	    private void exibirProfessor() {
	        System.out.println("Professor:");
	        System.out.println("Nome: " + professor.getNome());
	        System.out.println("Idade: " + professor.getIdade());
	        System.out.println();
	    }
	}