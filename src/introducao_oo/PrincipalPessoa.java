package introducao_oo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalPessoa {

	static ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	
	public static void main(String[] args) {
		
		String  menu = "1 - Cadastrar pessoa\n"
				+"2 - Listar todas\n"
				+"3 - Buscar por nome\n\n"
				+"4 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				Pessoa p = new Pessoa();
				p.cadastra();
				lista.add(p);
				break;
            case 2:
            	String str = "Pessoas cadastradas\n";
            	for (Pessoa pes : lista) {
					str += pes.seApresente();
				}
            	JOptionPane.showMessageDialog(null, str);
            	break;
            case 3:
            	String nomeBusca = JOptionPane.showInputDialog("Nome");
            	String ret = "";
            	for (Pessoa pes:lista) {
					if (pes.nome.equals(nomeBusca)) {
						ret += pes.verificaCondicao();
					}
				}
            	if (ret.equals("")) {
            		ret = "Não encontrado(a)";
            	}
				JOptionPane.showMessageDialog(null,ret);
            	break;
			}
		} while (op != 4);
	}
}