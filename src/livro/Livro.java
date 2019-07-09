package livro;

import javax.swing.JOptionPane;

public class Livro {

	String titulo, autor;
	Double preco;

	public void cadastra(){
		setTitulo(JOptionPane.showInputDialog("Titulo: "));
		setAutor(JOptionPane.showInputDialog("Autor: "));
		setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço: ")));
	}
	


	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo.toLowerCase();
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		if (autor.contains(" ")) {
			this.autor = autor;
		}else {
			JOptionPane.showMessageDialog(null, "Digite o nome e sobrenome");
		}
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		if (preco > 0) {
			this.preco = preco;
		}else {
			JOptionPane.showMessageDialog(null, "Preço inválido");
		}
	}

}