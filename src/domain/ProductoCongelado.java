package domain;

import javax.swing.JOptionPane;

public class ProductoCongelado extends Producto {
    private double congelacionRecomendada;

    @Override
    public void PedirDatos() {
        this.congelacionRecomendada = Double.parseDouble(
            JOptionPane.showInputDialog(null, "ingrese la temperatura de congelacion recomendada")
        );

        String cadena = "Producto Congelado\n" +
                        "fecha de caducidad: %s\n" +
                        "stock: %d\n" +
                        "temperatura de congelacion recomendada: %.2f °C\n";
        JOptionPane.showMessageDialog(null, String.format(cadena, fechaCad, lote, congelacionRecomendada));
    }

    public double getCongelacionRecomendada() { return congelacionRecomendada; }
    public void setCongelacionRecomendada(double congelacionRecomendada) { this.congelacionRecomendada = congelacionRecomendada; }

}