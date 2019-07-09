package time;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	
	static ArrayList<Time> listaTimes = new ArrayList<Time>();
    
    public static void main(String[] args) {
        
        String menu = "1 - Cadastrar times\n"
                     +"2 - Listar todos jogadores de um time\n"
                     +"3 - Verificar artilheiro\n"
                     +"4 - Time que fez mais gols no campeonato\n"
                     +"5 - Sair";
        int op = 0;
        do {            
        	op = Integer.parseInt(JOptionPane.showInputDialog(menu));    
            switch(op){
                case 1:
                    cadastrarTime();
                    break;
                case 2:
                    lista();
                	break;
                case 3:
                    artilheiro();
                	break;
                case 4:
                	maisGols();
                	break;
            }    
        } while (op != 5);
        
    }
    
    static void cadastrarTime(){
    	Time t = new Time();
        t.cadastrar();
        listaTimes.add(t);
    }
    
    static void lista(){
    	String busca = JOptionPane.showInputDialog("Nome do time");
    	String ret = "";
    	for (Time t : listaTimes) {
			if (t.getNome().equals(busca)) {
				ret += t.listar();
			}
		}
    	if (ret.equals("")) {
			ret = "Time não encontrado";
		}
    	JOptionPane.showMessageDialog(null, ret);
    }
    
    static void artilheiro(){
    	int gols = 0;
    	String artilheiro = "";
    	for (Time t : listaTimes) {
			if (t.artilheiro() > gols) {
				gols = t.artilheiro();
				artilheiro = t.getArtilheiro();
			}
		}
    	JOptionPane.showMessageDialog(null,"Artilheiro: "+artilheiro+" gols: "+gols);
    }
    
    static void maisGols(){
    	int gols = 0;
    	String timeGol = "";
    	for (Time t : listaTimes) {
    		if (t.gols() > gols) {
				gols = t.gols();
				timeGol = t.getNome();
			}
		}
    	JOptionPane.showMessageDialog(null, timeGol);
    }

}
