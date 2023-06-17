package domain;

import javax.swing.JOptionPane;

public class ProductoEnlatado extends Producto{
    private String conserva;
    private double sinDrenar;
    private double drenado;

    @Override
    public void PedirDatos() {
        this.conserva = JOptionPane.showInputDialog(null,
                "Ingrese el tipo de conserva usado",
                "Conserva de enlatado", JOptionPane.QUESTION_MESSAGE);
        this.sinDrenar = Double.parseDouble(
                JOptionPane.showInputDialog(null,
                        "Ingrese el gramaje sin drenar",
                        "Gramaje neto sin drenar", JOptionPane.QUESTION_MESSAGE)
        );
        this.drenado = Double.parseDouble(
                JOptionPane.showInputDialog(null,
                        "Ingrese el gramaje drenado",
                        "Gramaje neto drenado", JOptionPane.QUESTION_MESSAGE)
        );
        String format = "Producto enlatado\n" + 
                        "Fecha de Caducidad: %s\n" +
                        "Número de lote: %d\n" +
                        "Conserva: %s\n" +
                        "Gramaje sin drenar: %.2fg\n" +
                        "Gramaje drenado: %.2fg\n";
        JOptionPane.showMessageDialog(null,
                String.format(format, fechaCad, lote,
                        conserva, sinDrenar, drenado),
                "Información del Producto", JOptionPane.PLAIN_MESSAGE);
    }
}
