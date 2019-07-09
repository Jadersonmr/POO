package polimorfismo.banco;

import javax.swing.JOptionPane;

public class Conta {
	
	protected int nr, ag;
	protected String corr;
	protected double saldo;
	
	public boolean transferencia(double vl, Conta destino){
		if(saque(vl)){
			if(destino.deposito(vl)){
				return true;
			}else{
				deposito(vl);
				return false;
			}
		}else{
			return false;
		}
		
	}
	
	public boolean saque(double vl){
		if(getSaldo()>=vl && vl>0){
			setSaldo(getSaldo()-vl);
			return true;
		}
		return false;
	}
	
	
	public boolean deposito(double vl){
		if(vl > 0){
			setSaldo(getSaldo()+vl);
			return true;
		}
		return false;
	}
	
	void cadastra(){
		setCorr(JOptionPane.showInputDialog("Correntista"));
		setNr(Integer.parseInt(JOptionPane.showInputDialog("Nr")));
		setAg(Integer.parseInt(JOptionPane.showInputDialog("Ag")));
		setSaldo(0);
	}
	
	@Override
	public String toString() {
		return getNr()+": "+getCorr()+" R$ "+getSaldo();
	}
	
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public int getAg() {
		return ag;
	}
	public void setAg(int ag) {
		this.ag = ag;
	}
	public String getCorr() {
		return corr;
	}
	public void setCorr(String corr) {
		this.corr = corr;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
