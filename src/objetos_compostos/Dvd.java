package objetos_compostos;

import javax.swing.JOptionPane;

public class Dvd {
	
	String nome = "";
	int ano = 0;
	double valor = 0.1;
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome Dvd");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
	}
	
	String mostraDados(){
		return "DVD("+nome + " - "+ ano+ " - "+valor+")\n";
	}

}
