package brinquedo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalCriança {

	static ArrayList<Criança> lista = new ArrayList<Criança>();

	public static void main(String[] args) {
		
		String menu = "1 - Cadastrar Crianças\n"
				+ "2 - Listar brinquedos de uma criança\n"
				+ "3 - Listar todas as crianças e seus brinquedos\n"
				+ "4 - Listar crianças que possuem um determinado brinquedo\n\n"
				+ "5 - Sair";
		int op = 0;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastrar();
				break;
			case 2:
				mostraBrinquedoCriança();
				break;
			case 3:
				mostrar();
				break;
			case 4:
				criançasPossuemBrinquedos();
				break;
			}
		}while(op != 5);
	}
	
	static void cadastrar(){
		Criança c = new Criança();
		c.cadastra();
		lista.add(c);
	}
	
	static void mostraBrinquedoCriança(){
		String nomeBusca = JOptionPane.showInputDialog("Nome da criança");
		String ret = "";
		for (Criança c : lista) {
			if (c.nome.equals(nomeBusca)) {
				ret += c.listarBrinquedos()+"\n\n";
			}
		}
		if(ret.equals(""))
			ret = "Criança não encontrada";
		JOptionPane.showMessageDialog(null, ret);
	}
	
	static void mostrar(){
		String ret = "";
		for (Criança c : lista) {
			ret += c.nome+", "+c.sexo+", "+c.idade+" - "+c.listarBrinquedos()+"\n\n";
		}
		if(ret.equals(""))
			ret = "Sem cadastro";
		JOptionPane.showMessageDialog(null, ret);
	}
	
	static void criançasPossuemBrinquedos(){
		String nomeBusca = JOptionPane.showInputDialog("Nome do brinquedo");
		String ret = "";
		for (Criança c : lista) {
			if(c.possuiBrinquedo(nomeBusca)){
				ret += c.nome+"\n";
			}
		}
		if(ret.equals(""))
			ret = "Não existem crianças com este brinquedo";
		JOptionPane.showMessageDialog(null, ret);
	}

}