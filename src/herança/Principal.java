package herança;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
	static ArrayList<Medicamento> listaMed = new ArrayList<Medicamento>();
	static ArrayList<Perfumaria> listaPerf = new ArrayList<Perfumaria>();
	
	public static void main(String[] args) {
		
		String menu = "1 - Cadastrar cliente\n"
                +"2 - Cadastrar medicamento\n"
                +"3 - Cadastrar perfumaria\n"
                +"4 - Vender medicamento\n"
                +"5 - Vender perfumaria\n"
                +"6 - Listar dados de todos os clientes\n"
                +"7 - Listar dados de todos os produtos\n"
                +"8 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				Cliente c = new Cliente();
				c.cadastra();
				listaClientes.add(c);
				break;
			case 2:
				Medicamento m = new Medicamento();
				m.cadastra();
				listaMed.add(m);
				break;
			case 3:
				Perfumaria p = new Perfumaria();
				p.cadastra();
				listaPerf.add(p);
				break;
			case 4:
				vendaMed();
				break;
			case 5:
				
				break;
			case 6:
				listaCliente();
				break;
			case 7:
				listaProduto();
				break;
			}
		} while (op != 8);
	
	}

	public static void vendaMed(){
		String cliente = JOptionPane.showInputDialog("Nome do cliente");
		for (Cliente c : listaClientes) {
			if (cliente == c.toString()) {
				String produto = JOptionPane.showInputDialog("Nome do medicamento");
				int qtdVendida = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));
				Medicamento m = new Medicamento();
				m.vender(c , produto, qtdVendida);
			}
		}
	}
	
	public static void listaCliente(){
		String msg = "";
		for (Cliente c : listaClientes) {
			msg += c.toString()+"\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

	public static void listaProduto(){
		String msg = "";
		for (Medicamento m : listaMed) {
			msg += m.toString()+"\n";
		}
		for (Perfumaria p : listaPerf) {
			msg += p.toString()+"\n";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
