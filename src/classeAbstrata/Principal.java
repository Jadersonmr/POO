
package classeAbstrata;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
    static ArrayList<Geometrica> formas = new ArrayList<Geometrica>();   
    public static void main(String[] args) {
 	int op = 0;
	do{
            op = menu();
            switch (op) {
		case 1:
                    int tipo = escolherCadastro();
                    cadastra(tipo);
                break;
                case 2:
                    imprimeDados();
                break;
		case 3:
                    Geometrica busca = buscaGeometrica();
                    JOptionPane.showMessageDialog(null, busca.calculoDiamentro());
		break;
		case 4:
                    busca = buscaGeometrica();
                    JOptionPane.showMessageDialog(null, busca.calculoPerimetro());
            }
	}while(op<5);		     
    }
        
    private static int escolherCadastro(){
	String op = "Escolha o tipo de Forma: 1 - Retangulo | 2- Quadrado | 3-Ciculo";
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(op));
        if (escolha == 1 || escolha == 2 || escolha == 3) {
            return escolha;            
        } else {
            escolherCadastro();
        }
        return 0;
    }
    
    private static Geometrica buscaGeometrica(){
	String op = "Formas cadastradas(escolha)\n\n";
	int ordem = 1;
        for (Geometrica g : formas) {
            op += ordem+" "+g+"\n";
            ordem++;
        }
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(op));
        return formas.get(escolha-1);
    }
    
    private static int menu(){
        String m = "1 - Cadastrar Forma\n"
                    + "2 - Imprimir Dados\n"
                    + "3 - Perímetros\n"
                    + "4 - Areas\n"
                    + "5 - Sair";
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
   
    private static void imprimeDados() {
        String msg = "Formas Cadastradas\n\n";
        for (Geometrica forma : formas) {
            msg+=forma;
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    private static void cadastra(int tipo) {
                    if (tipo == 1) {
                        retangulo r = new retangulo();
                        r.cadastra();
                        formas.add(r);
                    } else if (tipo == 2) {
                        quadrado q = new quadrado();
                        q.cadastra();
                        formas.add(q);
                    } else if (tipo == 3) {
                        circulo c = new circulo();
                        c.cadastra();
                        formas.add(c);                
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro na Operação");
                    }
    }
}
