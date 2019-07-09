
package classeAbstrata;

import javax.swing.JOptionPane;

public class quadrado extends quadrilateros {

    @Override
    public Double calculoDiamentro() {
        return getLado()*getLado();
    }

    public double getLado() {
        return lado3;
    }

    public void setLado(double lado) {
        this.lado3 = lado;
    }
    
    @Override
    public void cadastra() {
        setLado(Double.parseDouble(JOptionPane.showInputDialog("Digite o Lado")));        
    }

    @Override
    public Double calculoPerimetro() {
       return getLado()*4;
    }
   
    @Override
    public String toString() {
        return "Quadrado | Lados: "+getLado()+"\n";
    }
    
}
