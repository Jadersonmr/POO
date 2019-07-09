package herança;

import javax.swing.JOptionPane;

public class Cliente {

	private String nome;
	private double divida;
	
	public void cadastra(){
		nome = JOptionPane.showInputDialog("Nome");
		setDivida(0);
	}
	
	public String toString(){
		return getNome() +" - "+ getDivida();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDivida() {
		return divida;
	}
	public void setDivida(double divida) {
		this.divida = divida;
	}
}
