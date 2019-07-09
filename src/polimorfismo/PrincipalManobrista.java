package polimorfismo;

import java.util.ArrayList;

public class PrincipalManobrista {
	
	public static void main(String[] args) {
		Manobrista mano = new Manobrista();
		ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
		lista.add(new Aviao());
		lista.add(new Automovel());
		lista.add(new Navio());
		lista.add(new DiscoVoador());
		for (Veiculo v : lista) {
			mano.estaciona(v);
		}
	}

}
