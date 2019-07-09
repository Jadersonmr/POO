package banco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	static ArrayList<Conta> conta = new ArrayList<Conta>();
	static ArrayList<ContaEspecial> contaEsp = new ArrayList<ContaEspecial>();
	static ArrayList<ContaUniversitaria> contaUni = new ArrayList<ContaUniversitaria>();

	public static void main(String[] args) {
		
		String menu =  "1 - Conta corrente\n"
                +"2 - Conta especial\n"
                +"3 - Conta universitária\n"
                +"4 - Depositar\n"
                +"5 - Saque\n"
                +"6 - Transfêrencia\n"
                +"7 - Sair";
		int op = 0;
		do {
			
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				Conta c = new Conta();
				c.cadastrar();   
				conta.add(c);
				break;
			case 2:
				ContaEspecial c1 = new ContaEspecial();
				c1.cadastrar();
				contaEsp.add(c1);
				break;
			case 3:
				ContaUniversitaria c2 = new ContaUniversitaria();
				c2.cadastrar();
				contaUni.add(c2);
				break;
			case 4:
				buscaContaDeposito();
				break;
			case 5:
				buscaContaSaque();
				break;
			case 6:
				buscaContaTransferencia();
				break;
			}
		}while (op != 7);
	}

	static public void buscaContaDeposito(){
		int busca = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
		for (Conta c : conta) {
			if (c.getNumero() == busca) {
				c.deposito(Double.parseDouble(JOptionPane.showInputDialog("Saldo: "+c.getSaldo()+"\n Digite a quantidade")));
			}
		}
		for (ContaEspecial c : contaEsp) {
			if (c.getNumero() == busca) {
				c.deposito(Double.parseDouble(JOptionPane.showInputDialog("Saldo: "+c.getSaldo()+"\n Digite a quantidade")));
			}
		}
		for (ContaUniversitaria c : contaUni) {
			if (c.getNumero() == busca) {
				c.deposito(Double.parseDouble(JOptionPane.showInputDialog("Saldo: "+c.getSaldo()+"\n Digite a quantidade")));
			}
		}
	}
	
	static public void buscaContaSaque(){
		int busca = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
		for (Conta c : conta) {
			if (c.getNumero() == busca) {
				c.saque(Double.parseDouble(JOptionPane.showInputDialog("Saldo: "+c.getSaldo()+"\n Digite a quantidade")));
			}
		}
		for (ContaEspecial c : contaEsp) {
			if (c.getNumero() == busca) {
				c.saque(Double.parseDouble(JOptionPane.showInputDialog("Saldo: "+c.getSaldo()+"\n Digite a quantidade")));
			}
		}
		for (ContaUniversitaria c : contaUni) {
			if (c.getNumero() == busca) {
				c.saque(Double.parseDouble(JOptionPane.showInputDialog("Saldo: "+c.getSaldo()+"\n Digite a quantidade")));
			}
		}
	}
	
	static public void buscaContaTransferencia(){
		int busca = Integer.parseInt(JOptionPane.showInputDialog("Numero"));
		for (Conta c : conta) {
			if (c.getNumero() == busca) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "+c.getSaldo()+"\n Digite a quantidade"));
				c.saque(valor);
				buscaContaTransferir(valor);
			}
		}
		
		for (ContaEspecial c : contaEsp) {
			if (c.getNumero() == busca) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "+c.getSaldo()+"\n Digite a quantidade"));
				c.saque(valor);
				buscaContaTransferir(valor);
			}
		}
		for (ContaUniversitaria c : contaUni) {
			if (c.getNumero() == busca) {
				double valor = Double.parseDouble(JOptionPane.showInputDialog("Saldo: "+c.getSaldo()+"\n Digite a quantidade"));
				c.saque(valor);
				buscaContaTransferir(valor);
			}
		}
	}
	
	static public void buscaContaTransferir(double valor){
		int busca = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta para transferir"));
		for (Conta c : conta) {
			if (c.getNumero() == busca) {
				c.deposito(valor);
			}
		}
		for (ContaEspecial c : contaEsp) {
			if (c.getNumero() == busca) {
				c.deposito(valor);
			}
		}
		for (ContaUniversitaria c : contaUni) {
			if (c.getNumero() == busca) {
				c.deposito(valor);
			}
		}
	}

}
