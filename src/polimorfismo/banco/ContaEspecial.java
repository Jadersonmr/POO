package polimorfismo.banco;

import javax.swing.JOptionPane;

public class ContaEspecial extends Conta {
	
	private double limite;
	
	@Override
	public boolean saque(double vl) {
		if(getSaldo()+getLimite()>=vl && vl>0){
			setSaldo(getSaldo()-vl);
			return true;
		}
		return false;
	}
	
	@Override
	void cadastra() {
		super.cadastra();
		setLimite(Double.parseDouble(JOptionPane.showInputDialog("Limite")));
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	

}
