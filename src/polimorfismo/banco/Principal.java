package polimorfismo.banco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	private static ArrayList<Conta> contas = new ArrayList<Conta>();
	
	private static int menu(){
		String m = "1 - cadastrar CC\n"
				+ "2 - cadastrar CE\n"
				+ "3 - cadastrar CN\n\n"
				+ "4 - Depósito\n"
				+ "5 - Saque\n"
				+ "6 - Transferência\n\n"
				+ "7 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));
	}
	
	private static Conta escolherConta(){
		String op = "Contas cadastradas (escolha)\n\n";
		int ordem = 1;
		for (Conta c : contas) {
			op = ordem+" "+c+"\n";
			ordem++;
		}
		int escolha = Integer.parseInt(JOptionPane.
				showInputDialog(op));
		return contas.get(escolha-1);
	}
	
	public static void main(String[] args) {
		
		int op = 0;
		do{
			op = menu();
			switch (op) {
			case 1:
				Conta cc = new Conta();
				cc.cadastra();
				contas.add(cc);
				break;
			case 2:
				ContaEspecial ce = new ContaEspecial();
				ce.cadastra();
				contas.add(ce);
				break;
			case 3:
				ContaUnivers cn = new ContaUnivers();
				cn.cadastra();
				contas.add(cn);
				break;
			case 4:
				Conta d = escolherConta();
				Double vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				d.deposito(vl);
				JOptionPane.showMessageDialog(null, d);
				break;
			case 5:
				Conta s = escolherConta();
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				s.saque(vl);
				JOptionPane.showMessageDialog(null, s);
				break;
			case 6:
				Conta or = escolherConta();
				Conta des = escolherConta();
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				or.transferencia(vl, des);
				JOptionPane.showMessageDialog(null, or);
				JOptionPane.showMessageDialog(null, des);
				break;

			}
		}while(op!=7);
		
	}

}
