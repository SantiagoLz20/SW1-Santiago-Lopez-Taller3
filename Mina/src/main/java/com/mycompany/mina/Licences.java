
package com.mycompany.mina;

import javax.swing.JOptionPane;

/**
 *
 * @author Santiago L
 */
public class Licences {
    
    public void meets(int type)
    {
        int count=0;
        int total=0;
        do{
            int days=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de días: "));
            total=days+total;
            if(count==0)
            {
                JOptionPane.showMessageDialog(null, "Solicitúd aprobada.");
                if(total==type){count++;
                JOptionPane.showMessageDialog(null, "Licencia llegó al límite.");}
                else{
                    int continued=Integer.parseInt(JOptionPane.showInputDialog("Licencia continúa activa, elije una opción.\n" +"1. Prorroga\n" +"2. Finalizar novedad "));
                    if(continued==2){count++;}} 
            }else
            {
                JOptionPane.showMessageDialog(null, "Solicitúd denegada, solicita una nueva novedad.");
                count++;
            }
        }while(count==0);
    }
}
