
package com.mycompany.mina;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
/**
 *
 * @author Santiago L
 */
public class News extends Licences {
    private String Name;
    private int Document;

    public News(String Name, int Document) {
        this.Name = Name;
        this.Document = Document;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getDocument() {
        return Document;
    }

    public void setDocument(int Document) {
        this.Document = Document;
    }

    public void record()
    {
        JOptionPane.showMessageDialog(null, "Registra la fecha de ingreso: ");
        int year=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año: "));
        int month=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes: "));
        int day=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día: "));
        int hour=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la hora: "));
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        
        calendar1.set(year, month, day, hour, 0);
        Date date1= calendar1.getTime();
        JOptionPane.showMessageDialog(null, "Registra la fecha de salida: ");
        year=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año: "));
        month=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes: "));
        day=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el día: "));
        hour=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la hora: "));
        
        calendar2.set(year, month, day, hour, 0);
        Date date2= calendar2.getTime();
        long difference=Math.abs(calendar2.getTimeInMillis()-calendar1.getTimeInMillis());
        long hours=TimeUnit.MILLISECONDS.toHours(difference);
        
        if(hours>=8)
        {
            JOptionPane.showMessageDialog(null, "Trabajaste: "+hours+" horas.");
        }
        else
        {
            long missing=8-hours;
            JOptionPane.showMessageDialog(null, "Trabajaste: "+hours+" horas, te faltan: "+missing);
        }
    }
    public void news()
    {
        int option;
        do{
            option=Integer.parseInt(JOptionPane.showInputDialog("1. Licencias\n" +"2. incapacidades\n" +"3. Vacaciones\n" +"4. Permisos\n" +"0. Volver al menú principal\n" +"Ingrese una opción."));

                switch(option)
                {
                    case 1:
                        int typeLicence=Integer.parseInt(JOptionPane.showInputDialog("1. Licencia temporal\n" +"2. Licencia maternidad\n" +"3. Licencia paternidad\n" +"Elige un opción"));
                        licence(typeLicence);
                        break;
                    case 2:
                        inability();
                        break;
                    case 3:
                        vacation();
                        break;
                    case 4:
                        permissions();
                        break;
                    case 0:
                        JOptionPane.showMessageDialog(null, "Regresando al menú principal.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida.");
                }
        }while(option!=0);
    }
    public void licence(int type)
    {
        switch(type)
        {
            case 1:
                temporalLicense();
                break;
            case 2:
                maternityLicense();
                break;
            case 3:
                paternityLeave();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
        }
    }
    public void temporalLicense()
    {
        int type=4;
        meets(type);
    }
    public void maternityLicense()
    {
        int type=180;
        meets(type);
    }
    public void paternityLeave()
    {
        int type=15;
        meets(type);
    }
    
    public void inability()
    {
        int type=20;
        meets(type); 
    }
    public void vacation()
    {
        int type=15;
        meets(type);
    }
    public void permissions()
    {
        int count[]= new int[2];
        count[1]=Integer.parseInt(JOptionPane.showInputDialog("Ingresa las horas del permiso: "));
        int hours=count[0]+count[1];
        if (hours<=5)
            {
                count[0]=count[1];
                JOptionPane.showMessageDialog(null, "Solicitud aprobada");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Solicitud supera las horas, solicita 1 día de vacaciones o una licencia temporal.");
            }   
    }
}
