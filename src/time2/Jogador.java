package time2;

import javax.swing.JOptionPane;

public class Jogador {
    
    private String nome;
    private int numeroCamisa;
    private int qtdGols;

    public void jogador(){
    	cadastra();
    }
    
    public void cadastra(){
    	setNome(JOptionPane.showInputDialog("Nome do jogador"));
    	setNumeroCamisa(Integer.parseInt(JOptionPane.showInputDialog("Numero da camisa")));
    	setQtdGols(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de gols")));
    }
    
    public String toString(){
    	return getNome()+" ("+getNumeroCamisa()+") "+getQtdGols();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public int getQtdGols() {
        return qtdGols;
    }

    public void setQtdGols(int qtdGols) {
        this.qtdGols = qtdGols;
    }


}
