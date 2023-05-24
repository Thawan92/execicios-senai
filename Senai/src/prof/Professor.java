package prof;

import pessoa.Pessoa;
import turma.Turma;
import java.util.ArrayList;
public class Professor extends Pessoa{
	private double salario;
	
	private ArrayList<Turma> turma;
	
	public Professor(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
}
	


