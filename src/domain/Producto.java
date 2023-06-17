package domain;

import javax.swing.JOptionPane;

public abstract class Producto {
    protected String fechaCad;
    protected int lote;

    public abstract void PedirDatos();

    public Producto() {
        this.fechaCad = JOptionPane.showInputDialog("ingrese fecha de caducidad del producto");
        this.lote = Integer.parseInt(JOptionPane.showInputDialog("ingrese numero de lote"));
        this.PedirDatos();
    }

    public String getFechaCad() { return this.fechaCad; }
    public void setFechaCad(String fechaCad) { this.fechaCad = fechaCad; }

    public int getLote() { return this.lote; }
    public void setLote(int lote) { this.lote = lote; }


    @Override
    public String toString() {
        return "{" +
            " fechaCad='" + getFechaCad() + "'" +
            ", lote='" + getLote() + "'" +
            "}";
    }

}
