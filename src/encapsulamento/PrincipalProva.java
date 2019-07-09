package encapsulamento;

public class PrincipalProva {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("José", 10, 8, 10);
		System.out.println(a1);//____________________________________(0,25)
		System.out.println(a2);//____________________________________(0,25)
		System.out.println(a3);//____________________________________(0,25)
		Turma t1 = new Turma(10);
		System.out.println(t1);//____________________________________(0,25)
		Turma t2 = new Turma(20);
		t2.getAlunos().add(a1);
		t2.getAlunos().add(a2);
		t2.getAlunos().add(a3);
		System.out.println(t2);//____________________________________(0,25)
		t1.setAlunos(t2.getAlunos());
		System.out.println(t2);//____________________________________(0,50)
		a1.setN1(a2.getN1());
		a1.setN2(a3.getN3());
		a1.setN3(a2.getN1());
		System.out.println(a1);//____________________________________(0,50)
	}

}