package introducao_oo;

import javax.swing.JOptionPane;

public class Dvd {

	String nome;
	int ano;
	double valor;
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de lançamento"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
	}
	
	String todos(){
		return nome+" ,"+ano+" ,"+valor+"\n";
	}
}