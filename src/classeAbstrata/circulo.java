
package classeAbstrata;

import javax.swing.JOptionPane;

public class circulo extends Geometrica {
    private double raio;
    @Override
    public Double calculoPerimetro() {
        return calculoDiamentro()*Math.PI;
    }
    
    @Override
    public Double calculoDiamentro() {
        return 2*getRaio();
    }
    @Override
    public void cadastra() {
        setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio")));
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public String toString() {
        return "Circulo | Raio: "+getRaio()+"\n";
    }

}
