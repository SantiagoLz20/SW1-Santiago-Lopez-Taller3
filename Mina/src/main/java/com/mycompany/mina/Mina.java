package com.mycompany.mina;

import javax.swing.JOptionPane;

/**
 *
 * @author Santiago L
 */
public class Mina {

    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Ingresa tu nombre: ");
        int document=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu cedula: "));
        int option;
        News person = new News(name,document);
        do
        {
            option=Integer.parseInt(JOptionPane.showInputDialog("1. Ingreso Turno\n" +"2. Novedad\n" +"0. Salir\n" +"Ingrese la opcion que desea."));
            switch(option)
            {
                case 1:
                    person.record();
                    break;
                case 2:
                    person.news();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Gracias por ingresar.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción invalida.");
            }
        }while(option!=0);
    }
}