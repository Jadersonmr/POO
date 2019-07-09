package encapsulamento;

public class Aluno {
	private String nome;
	private double n1 = 1, n2 = 1, n3 = 1;
	public static boolean intervalo;

	public Aluno() {
		this("João", 5, 6, 7);
	}

	public Aluno(String nome, double n1, double n2, double n3) {
		setNome(nome);
		setN1(n1);
		setN2(n2);
		setN3(n3);
	}

	public Aluno(String nome) {
		setNome(nome);
	}

	public double calculaMedia() {
		return (getN1() + getN2() + getN3()) / 3;
	}

	public String toString() {
		return getNome() + ": " + calculaMedia();
	}
	
	public int compareTo(Aluno outro) {
		if (calculaMedia() > outro.calculaMedia())
			return 1;
		else if (calculaMedia() == outro.calculaMedia())
			return 0;
		else
			return -1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public static boolean isIntervalo() {
		return intervalo;
	}

	public static void setIntervalo(boolean intervalo) {
		Aluno.intervalo = intervalo;
	}
}
