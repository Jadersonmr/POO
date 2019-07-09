package farmacia;

import javax.swing.JOptionPane;

public class Cliente {
    
    private String nome;
    private double saldo;

    public void cadastrar(){
        setNome(JOptionPane.showInputDialog("Nome"));
        setSaldo(0);
    }
    
    @Override
    public String toString() {
    	return getNome()+" - "+getSaldo();
    }
    
    public void aumentarDivida(double valor, int qtd) {
    	setSaldo(getSaldo() + valor * qtd);
	}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
