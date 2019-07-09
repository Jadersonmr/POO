package brinquedo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalCrian�a {

	static ArrayList<Crian�a> lista = new ArrayList<Crian�a>();

	public static void main(String[] args) {
		
		String menu = "1 - Cadastrar Crian�as\n"
				+ "2 - Listar brinquedos de uma crian�a\n"
				+ "3 - Listar todas as crian�as e seus brinquedos\n"
				+ "4 - Listar crian�as que possuem um determinado brinquedo\n\n"
				+ "5 - Sair";
		int op = 0;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastrar();
				break;
			case 2:
				mostraBrinquedoCrian�a();
				break;
			case 3:
				mostrar();
				break;
			case 4:
				crian�asPossuemBrinquedos();
				break;
			}
		}while(op != 5);
	}
	
	static void cadastrar(){
		Crian�a c = new Crian�a();
		c.cadastra();
		lista.add(c);
	}
	
	static void mostraBrinquedoCrian�a(){
		String nomeBusca = JOptionPane.showInputDialog("Nome da crian�a");
		String ret = "";
		for (Crian�a c : lista) {
			if (c.nome.equals(nomeBusca)) {
				ret += c.listarBrinquedos()+"\n\n";
			}
		}
		if(ret.equals(""))
			ret = "Crian�a n�o encontrada";
		JOptionPane.showMessageDialog(null, ret);
	}
	
	static void mostrar(){
		String ret = "";
		for (Crian�a c : lista) {
			ret += c.nome+", "+c.sexo+", "+c.idade+" - "+c.listarBrinquedos()+"\n\n";
		}
		if(ret.equals(""))
			ret = "Sem cadastro";
		JOptionPane.showMessageDialog(null, ret);
	}
	
	static void crian�asPossuemBrinquedos(){
		String nomeBusca = JOptionPane.showInputDialog("Nome do brinquedo");
		String ret = "";
		for (Crian�a c : lista) {
			if(c.possuiBrinquedo(nomeBusca)){
				ret += c.nome+"\n";
			}
		}
		if(ret.equals(""))
			ret = "N�o existem crian�as com este brinquedo";
		JOptionPane.showMessageDialog(null, ret);
	}

}