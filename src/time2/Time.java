package time2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {

    private String nome;
    private ArrayList<Jogador> listaJogadores = new ArrayList<Jogador>();

    public void cadastrar(){
        setNome(JOptionPane.showInputDialog("Digite o nome do time"));
        String mais = JOptionPane.showInputDialog("Cadastrar jogadores? s ou n");
		while(mais.equals("s")){
			listaJogadores.add(new Jogador());
			mais = JOptionPane.showInputDialog("Mais Jogadores? s ou n");
		}
    }
    
    public String listar(){
    	String ret = "";
    	for(Jogador j : listaJogadores){
    		ret += j.getNome()+"\n";
    	}
    	if (ret.equals("")) {
			ret = "Nao possui jogadores";
		}
    	return ret;
    }
    
    public void artilheiro(){
    	Jogador artilheiro = listaJogadores.get(0);
    	for (Jogador j : listaJogadores) {
    		if (j.getQtdGols() > artilheiro.getQtdGols()) {
				//artilheiro = Jogador.getNome();
			}
		}
    	JOptionPane.showMessageDialog(null, artilheiro);
    }
    
    public int gols(){
    	int gols = 0;
    	for (Jogador j : listaJogadores) {
			gols += j.getQtdGols();
		}
		return gols;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Jogador> getJogadores() {
        return listaJogadores;
    }

    public void setJogadores(ArrayList<Jogador> jogadores) {
        this.listaJogadores = jogadores;
    }
    
}
