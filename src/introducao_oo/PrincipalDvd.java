package introducao_oo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalDvd {

	static ArrayList<Dvd> lista = new ArrayList<Dvd>();
	
	public static void main(String[] args) {
		
		String menu = "1 - Cadastra DVD\n"
		              +"2 - Lista todos\n"
		              +"3 - Soma os valores\n"
		              +"4 - Procura DVD por ano de lançamento\n"
		              +"5 - procura DVD por titulo\n"
		              +"6 - Sair";
		int op = 0; 
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				Dvd d = new Dvd();
				d.cadastra();
				lista.add(d);
				break;
			case 2:
				String str = "DVDs cadastrados\n"
							+"Nome Ano de lançamento Valor\n\n";
            	for (Dvd dvd : lista) {
					str += dvd.todos();
				}
            	JOptionPane.showMessageDialog(null, str);
				break;
			case 3:
				double busca = 0;
				for (Dvd dvd:lista) {
					busca += dvd.valor;
				}
				JOptionPane.showMessageDialog(null, busca);
				break;
			case 4:
				int anoBusca = Integer.parseInt(JOptionPane.showInputDialog("Ano de lançamento"));
            	String ret = "";
            	for (Dvd dvd:lista) {
					if (dvd.ano == anoBusca){
						ret += dvd.todos();
					}else {
						ret = "Não encontrado(a)";
					}
				}
				JOptionPane.showMessageDialog(null,ret);
				break;
			case 5:
				String nomeBusca = JOptionPane.showInputDialog("Nome");
            	String ret1 = "";
            	for (Dvd dvd:lista) {
					if (dvd.nome.equals(nomeBusca)){
						ret1 += dvd.todos();
					}
				}
            	if (ret1.equals("")) {
            		ret1 = "Não encontrado(a)";
            	}
				JOptionPane.showMessageDialog(null,ret1);
				break;
			}
		} while (op != 6);
	}
}