package farmacia;

import javax.swing.JOptionPane;

public class Medicamento extends Produto{
    
    String receita;
    
    @Override
    public void cadastrar(){
    	super.cadastrar();
    	setReceita(JOptionPane.showInputDialog("Receita (s/n)"));
    }
    
    @Override
    public void vender(int qtd){
        super.vender(qtd);
        if (getReceita().equals("s")) {
			JOptionPane.showInputDialog("Nome do médico");
		}
    }

	public String getReceita() {
		return receita;
	}

	public void setReceita(String receita) {
		this.receita = receita;
	}
    
    
}
