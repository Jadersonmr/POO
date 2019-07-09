package farmacia;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalFarmacia {
	
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    private static int menu(){
		String m = "1 - Cadastrar cliente\n"
                + "2 - Cadastrar medicamento\n"
				+ "3 - Cadastrar equipamento médico\n"
				+ "4 - Cadastrar perfumaria\n\n"
				+ "5 - Vender\n"
				+ "6 - Pagar conta\n"
                + "7 - Relatório dos clientes\n"
                + "8 - Relatório dos produtos\n\n"
				+ "9 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    
    public static void main(String[] args) {
        
        int op = 0;
        do {            
            op = menu();
            switch (op){
                case 1:
                    Cliente c = new Cliente();
                    c.cadastrar();
                    clientes.add(c);
                    break;
                case 2:
                    Medicamento m = new Medicamento();
                    m.cadastrar();
                    produtos.add(m);
                    break;
                case 3:
                    EquipamentoMedico eqm = new EquipamentoMedico();
                    eqm.cadastrar();
                    produtos.add(eqm);
                    break;
                case 4:
                    Perfumaria p = new Perfumaria();
                    p.cadastrar();
                    produtos.add(p);
                    break;
                case 5:
                    String nome = JOptionPane.showInputDialog("Digite o nome do produto");
                    for (Produto prod : produtos) {
						if (prod.getNome().equals(nome)) {
							String cliente = JOptionPane.showInputDialog("Digite o nome do cliente");
							for (Cliente cl : clientes) {
								if (cl.getNome().equals(cliente)) {
									int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
									prod.vender(qtd);
									cl.aumentarDivida(prod.getValor(), qtd);
								}
							}
						}
					}
                    break;
                case 6:
                	String cliente = JOptionPane.showInputDialog("Digite o nome do cliente");
					for (Cliente cl : clientes) {
						if (cl.getNome().equals(cliente)) {
							int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantia a pagar"));
							cl.setSaldo(cl.getSaldo() - valor);
						}
					}
                    break;
                case 7:
                	String msg = "";
                    for (Cliente cli : clientes) {
						msg += cli + "\n"; 
					}
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 8:
                	String msgp = "";
                    for (Produto pro : produtos) {
						msgp += pro + "\n"; 
					}
                    JOptionPane.showMessageDialog(null, msgp);
                    break;
            }    
        } while (op != 9);
        
    }
}
