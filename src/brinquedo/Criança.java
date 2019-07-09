package brinquedo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Criança {

	String nome, sexo;
	int idade;
	ArrayList<Brinquedo> listaBrinquedos = new ArrayList<Brinquedo>();
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome da criança");
		sexo = JOptionPane.showInputDialog("Sexo");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		String mais = JOptionPane.showInputDialog("Cadastrar brinquedos? S ou N");
		while(mais.equals("S")){
			Brinquedo b = new Brinquedo();
			b.cadastra();
			if (b.idadeMinima <= idade) {
			  listaBrinquedos.add(b);
			}else {
			  JOptionPane.showMessageDialog(null, "Brinquedo não permitido para essa idade");
			}
			mais = JOptionPane.showInputDialog("Mais brinquedos? S ou N");
		}
	}
	
	String listarBrinquedos(){
		String ret = "";
		for (Brinquedo brin : listaBrinquedos) {
			ret += brin.mostraDados();
		}
		if(ret.equals(""))
			ret = "Não possui Brinquedos\n";
		return ret;
	}
	
	boolean possuiBrinquedo(String nomeBrinquedo){
		for (Brinquedo brinquedo : listaBrinquedos) {
			if(brinquedo.nome.equals(nomeBrinquedo))
				return true;
		}
		return false;
	}

}