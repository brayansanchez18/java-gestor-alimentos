package domain;

import javax.swing.JOptionPane;

public class ProductoRefrigerado extends Producto {
    private String codigoSupervision;

    @Override
    public void PedirDatos() {
        this.codigoSupervision = JOptionPane.showInputDialog(null, "ingrese el codigo de supervision");

        String cadena = "Producto Refrigerado\n" +
                        "fecha de caducidad: %s\n" +
                        "stock: %d\n" +
                        "codigo de supervision: %s\n";
        JOptionPane.showMessageDialog(null, String.format(cadena, fechaCad, lote, codigoSupervision));
    }

    public String getCodigoSupervision() { return codigoSupervision; }
    public void setCodigoSupervision(String codigoSupervision) { this.codigoSupervision = codigoSupervision; }

    @Override
    public String toString() {
        return super.toString() + "Codigo del organismo de supervision alimentaria: " + codigoSupervision + "\n";
    }
}