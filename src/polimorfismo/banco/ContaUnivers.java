package polimorfismo.banco;

public class ContaUnivers extends Conta {
	
	@Override
	public boolean deposito(double vl) {
		if(getSaldo()+vl <= 2000)
			return super.deposito(vl);
		return false;
	}

}
