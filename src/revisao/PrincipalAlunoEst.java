package revisao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalAlunoEst {
	
	//static int qt = 0;
	//static TipoAluno[] alunos = new TipoAluno[100];
	static ArrayList<TipoAluno> alunos = new ArrayList<TipoAluno>();
	
	public static void main(String[] args) {
		String menu = "1 - Cadastrar Aluno\n"+
				"2 - Verificar situação\n\n" +
				"3 - Sair";
		int op = 0;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1)
				cadastraAluno();
			else
				if(op ==2){
					String msg = "*** RELAÇÃO DE ALUNOS ***\n\n";
					for(int i=0; i< alunos.size(); i++){
						msg += verificaSituacao(alunos.get(i))+"\n";
					}
					JOptionPane.showMessageDialog(null, msg);
				}
					
		}while(op != 3);
		
	}
	
	static String verificaSituacao(TipoAluno a){
		double m = ((a.n1*30)+(a.n2*30)+(a.n3*30)+(a.n4*10))/100;
		if(m >= 7)
			return a.nome+" APROVADO(A)";
		else
			if(m<2)
				return a.nome+" REPROVADO(A)";
			else
				return a.nome+" RECUPERAÇÃO. AF: "+(12-m);
		
	}
	
	static void cadastraAluno(){
		TipoAluno a = new TipoAluno();
		a.nome = JOptionPane.showInputDialog("Nome:");
		a.n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		a.n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		a.n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
		a.n4 = Double.parseDouble(JOptionPane.showInputDialog("Nota 4"));
		alunos.add(a);
		//alunos[qt] = a;
		//qt++;
	}

}
