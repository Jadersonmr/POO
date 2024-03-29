package introducao_oo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Pessoa {

	String nome;
	double peso, altura;
	
	double calculaImc(){
		return peso/(altura*altura);
	}
	
	void cadastra(){
		nome = JOptionPane.showInputDialog("Nome");
		peso = Double.parseDouble(JOptionPane.showInputDialog("peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));
	}
	
	String verificaCondicao(){
		double imc = calculaImc();
		if (imc < 18) {
			return "Abaixo do peso";
		}else {
			if (imc > 29) {
				return "Acima do peso";
			}else{
				return "Peso ideal";
			}
		}
	}
	
	String seApresente(){
		DecimalFormat df = new DecimalFormat("##.00");
		return nome +": "+df.format(calculaImc())+"\n";
	}

}