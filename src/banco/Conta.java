package banco;

import javax.swing.JOptionPane;

public class Conta {

	int numero;
	int agencia;
	String nomeCorrentista;
	double saldo;
	
	public void deposito(double valor){
		setSaldo(getSaldo() + valor);
	}
	
	public void saque(double valor){
		if (valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
		}else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		}
	}
	
	public void cadastrar(){
		setNomeCorrentista(JOptionPane.showInputDialog("Nome"));
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
		setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Agencia")));
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}
	
	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
