package banco;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {

	double limite;

	public void cadastrar(){
		super.cadastrar();
		setLimite(Double.parseDouble(JOptionPane.showInputDialog("Limite")));
	}
	
	public void saque(double valor){
		if (valor <= getLimite() && valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
		}else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente ou passa do limite");
		}
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
