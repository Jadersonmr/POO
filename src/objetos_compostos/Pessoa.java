package objetos_compostos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pessoa {
	
	String nome = "";
	double peso = 0.1, altura=0.1;
	ArrayList<Dvd> listaDvds = new ArrayList<Dvd>();
	
	double calculaImc(){
		return peso/(altura*altura);
	}
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome Pessoa");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
		String mais = JOptionPane.showInputDialog("Cadastrar DVDs? S ou N");
		while(mais.equals("S")){
			Dvd d = new Dvd();
			d.cadastra();
			listaDvds.add(d);
			mais = JOptionPane.showInputDialog("Mais DVDs? S ou N");
		}
	}
	
	String verificaCondicao(){
		double imc = calculaImc();
		if(imc < 18)
			return "Abaixo do peso";
		else
			if(imc > 29)
				return "Acima do peso";
			else
				return "Peso ideal";
	}
	
	String seApresente(){
		//DecimalFormat df = new DecimalFormat("##.00");
		return nome;
	}
	
	boolean possuiDvd(String nmDvd){
		for (Dvd dvd : listaDvds) {
			if(dvd.nome.equals(nmDvd))
				return true;
		}
		return false;
	}
	
	String listarDvds(){
		String ret = "";
		for (Dvd dvd : listaDvds) {
			ret += dvd.mostraDados();
		}
		if(ret.equals(""))
			ret = "N�o possui DVDs\n";
		
		return ret;
	}

}
