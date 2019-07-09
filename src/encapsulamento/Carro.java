package encapsulamento;

import javax.swing.JOptionPane;

public class Carro {
	
	private String nome, placa;
	
	public void cadastra(){
		setNome(JOptionPane.showInputDialog("Nome: "));
		setPlaca(JOptionPane.showInputDialog("Placa: "));
	}

	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if (validaPlaca(placa.toUpperCase()))
		    this.placa = placa;
		else
			setPlaca(JOptionPane.showInputDialog("Informe uma placa válida!"));
	}
	
	private boolean validaPlaca(String p){
		return(p.length() == 8 && p.indexOf(" ") == 3);
	}
	

}
