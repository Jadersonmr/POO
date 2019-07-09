package geometria;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        
        int formas = Integer.parseInt(JOptionPane.showInputDialog("Numero de formas"));
        for (int i = 0; i < formas; i++) {
        	
        	int op = 0;
        	String menu = "1 - Quadrado\n"
        				+ "2 - Retângulo\n"
        				+ "3 - Círculo\n\n"
        				+ "4 - Sair";
        	
            do {
            	op = Integer.parseInt(JOptionPane.showInputDialog(menu));
				switch (op) {
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				}
			} while (op != 4);
        }

    }
}
