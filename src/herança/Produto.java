package herança;

import javax.swing.JOptionPane;

public class Produto {

	private String nome;
	private int estoque;
	private double valor;
	
	public void vender(Cliente c, String nome, int qtdVendida){
		if (nome == getNome() && qtdVendida <= getEstoque()){
			setEstoque(getEstoque() - qtdVendida);
			c.setDivida(c.getDivida() + valor);
		}else {
			JOptionPane.showMessageDialog(null, "Estoque insuficiente");
		}
	}
	
	public void cadastra(){
		nome = JOptionPane.showInputDialog("Nome");
		estoque = Integer.parseInt(JOptionPane.showInputDialog("Estoque"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
	}
	
	public String toString(){
		return getNome() +" - "+ getEstoque()+" - R$ "+getValor();
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
