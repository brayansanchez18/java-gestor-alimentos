package domain;

import javax.swing.JOptionPane;

public class ProductoFresco extends Producto {
    private String fechaEmbazado, paisOrigen;

    @Override
    public void PedirDatos() {
        this.fechaEmbazado = JOptionPane.showInputDialog(null, "ingrese la fecha de embazado del producto"); 
        this.paisOrigen = JOptionPane.showInputDialog(null, "ingresa el pais de origen del producto");

        String cadena = "Producto Fresco\n" +
                        "fecha de caducidad: %s\n" +
                        "stock: %d\n" +
                        "fecha de embazado del producto: %s\n" +
                        "pais de origen del producto: %s\n";
        JOptionPane.showMessageDialog(null, String.format(cadena, fechaCad, lote, fechaEmbazado, paisOrigen));
    }

    public String getFechaEmbazado() { return fechaEmbazado; }
    public void setFechaEmbazado(String fechaEmbazado) { this.fechaEmbazado = fechaEmbazado; }

    public String getPaisOrigen() { return paisOrigen; }
    public void setPaisOrigen(String paisOrigen) { this.paisOrigen = paisOrigen; }

    @Override
    public String toString() {
        return super.toString() + "Fecha de envasado: " + fechaEmbazado + "\n" +
                                                "Pais de Origen: " + paisOrigen + "\n";
    }
}