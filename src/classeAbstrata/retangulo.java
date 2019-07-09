
package classeAbstrata;

import javax.swing.JOptionPane;

public class retangulo extends quadrilateros{

    @Override
    public Double calculoDiamentro() {
        return getAltura()*getBase();
    }

    @Override
    public void cadastra() {  
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite a base")));
        setBase(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura")));
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public Double calculoPerimetro() {
      return (getAltura()*2) + (getBase()*2);
    }

    @Override
    public String toString() {
        return "Retangulo | Base: "+getBase()+" | Altura: "+getAltura()+"\n";
    }
    
}
