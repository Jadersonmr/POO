package brinquedo;

import javax.swing.JOptionPane;

public class Brinquedo {

	String nome;
	int idadeMinima;
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome brinquedo");
		idadeMinima = Integer.parseInt(JOptionPane.showInputDialog("Idade mínima"));
	}

	String mostraDados(){
		return "("+nome+" - "+idadeMinima+")\n";
	}
}
