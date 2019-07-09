package encapsulamento;

import java.util.ArrayList;

public class Turma {
	private int numero;
	private ArrayList<Aluno> alunos = new ArrayList<>();

	public Turma(int nr) {
		setNumero(nr);
	}

	public String toString() {
		return "Turma número: " + getNumero() + " - " + alunos.size() + " alunos";
	}

	public Turma clone() {
		Turma nova = new Turma(0);
		nova.setNumero(getNumero());
		for (Aluno a : alunos) {
			nova.getAlunos().add(a);
		}
		return nova;
	}

	public int compareTo(Turma outra) {
		if (getAlunos().size() > outra.getAlunos().size())
			return 1;
		else if (getAlunos().size() == outra.getAlunos().size())
			return 0;
		else
			return -1;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
}