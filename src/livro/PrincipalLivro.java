package livro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalLivro {

	static ArrayList<Livro> livros = new ArrayList<Livro>();

	public static void main(String[] args) {
		String menu = "1 - Cadastrar livro\n"
				+ "2 - Listar todos os livros\n"
				+ "3 - Pesquisar por autor\n"
				+ "4 - Pesquisar por faixa de valor\n\n"
				+ "5 - Sair";
		int op = 0;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastra();
				break;
			case 2:
				mostrar();
				break;
			case 3:
				pesquisaAutor();
				break;
			case 4:
				pesquisaValor();
				break;
			}
		}while(op != 5);
	}

	static void cadastra(){
		Livro l = new Livro();
		l.cadastra();
		livros.add(l);
	}

	static void mostrar(){
		String lista = "";
		for (Livro liv: livros){
			lista += liv.autor+" - "+liv.titulo+" - R$"+liv.preco+"\n";
		}
		if(lista.equals(""))
			lista = "Sem cadastro";
		JOptionPane.showMessageDialog(null, lista);
	}
	
	static void pesquisaAutor(){
		String busca = JOptionPane.showInputDialog("Nome do autor");
		String lista = "";
		for (Livro liv: livros){
			if (liv.autor.equalsIgnoreCase(busca)) {
				lista += liv.autor+" - "+liv.titulo+" - R$"+liv.preco+"\n";
			}
		}
		if(lista.equals(""))
			lista = "Sem cadastro";
		JOptionPane.showMessageDialog(null, lista);
	}

	static void pesquisaValor(){
		double min,max;
		min = Double.parseDouble(JOptionPane.showInputDialog("Valor minímo"));
		max = Double.parseDouble(JOptionPane.showInputDialog("Valor máximo"));
		String lista = "";
		for (Livro liv: livros){
			if (liv.preco >= min && liv.preco <= max) {
				lista += liv.autor+" - "+liv.titulo+" - R$"+liv.preco+"\n";
			}
		}
		if(lista.equals(""))
			lista = "Sem cadastro";
		JOptionPane.showMessageDialog(null, lista);
	}

}