package test;

import javax.swing.JOptionPane;

import domain.*;

public class TestGestor {
    public static void main(String[] args) {
        String[] opciones = {"producto congelado", "producto enlatado", "producto fresco", "producto refrigerado"};
        String seleccion = (JOptionPane.showInputDialog(null, "selecciona el tipo de producto a insertar", "gestor de alimentos", JOptionPane.PLAIN_MESSAGE, null, opciones, "selecciona")).toString();

        System.out.println(seleccion);

        switch (seleccion) {
            case "producto congelado":
                ProductoCongelado productoCongelado = new ProductoCongelado();
                break;
            
            case "producto enlatado":
                ProductoEnlatado productoEnlatado = new ProductoEnlatado();
                break;

            case "producto fresco":
                ProductoFresco productoFresco = new ProductoFresco();
                break;

            case "producto refrigerado":
                ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado();
                break;
        
            default:
                break;
        }

    }
}