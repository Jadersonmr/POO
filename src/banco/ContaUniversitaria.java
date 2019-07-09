package banco;

import javax.swing.JOptionPane;

public class ContaUniversitaria extends Conta {

	public void deposito(double valor){
		if (getSaldo()+valor <= 2000 && valor <= 2000) {
			setSaldo(getSaldo() + valor);
		}else {
			JOptionPane.showMessageDialog(null, "O valor passou do limite do saldo.");
		}
	}

}
