package farmacia;

import javax.swing.JOptionPane;

public class Produto {

    private String nome;
    private double valor;
    private int estoque;
    
    public void cadastrar(){
        setNome(JOptionPane.showInputDialog("Nome"));
        setValor(Double.parseDouble(JOptionPane.showInputDialog("Valor")));
        setEstoque(Integer.parseInt(JOptionPane.showInputDialog("Estoque")));
    }
    
    public void vender(int qtd){
    	if (getEstoque() > 0) {
			setEstoque(getEstoque() - qtd);
		}
        JOptionPane.showMessageDialog(null, "Não possui estoque");
    }

    @Override
    public String toString() {
		return getNome()+" - "+getValor()+" - "+getEstoque();
	}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
