/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.Empresa;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class MetodoEmpresa extends ArrayListEmpresa{
    /**
     *
     * @param nombre
     * @param nempresa
     * @param salario
     */
    
    // <editor-fold defaultstate="collapsed" desc="Añadir a los atributos de ArrayListEmpresa">
    //Añadiendo a el ArrayList
    public void add(String nombre, int nempresa, float salario)
    {
        Nombre.add(nombre);
        nEmpresa.add(nempresa);
        Salario.add(salario);
        Nomina.add(Calcular_Nomina(salario));
    }
    
    //Calculando la nomina y devolviendola
    private float Calcular_Nomina(float salario)
    {
        float NominaTotal = 0;
        float SalarioINSS = salario - salario*(float)INSS;//Calcular el descuento del inss al salario
        
        //Aplicando formula para calcular nomina
        if(SalarioINSS < 8333.34)
        {
            return SalarioINSS;
        }
        if(SalarioINSS > 8333.33 && SalarioINSS < 16666.67)
        {
            NominaTotal = SalarioINSS - (SalarioINSS-(float)sobre_exceso[0])*(float)aplicable[0];
            
        }
        else if(SalarioINSS < 29666.67)
        {
            NominaTotal = SalarioINSS - ((SalarioINSS-(float)sobre_exceso[1])*(float)aplicable[1] + (float)Impuesto_Base[0]);
            
        }
        else if(SalarioINSS < 41666.67)
        {
            NominaTotal = SalarioINSS - ((SalarioINSS-(float)sobre_exceso[2])*(float)aplicable[2] + (float)Impuesto_Base[1]);
        }
        else
        {
            NominaTotal = SalarioINSS - ((SalarioINSS-(float)sobre_exceso[3])*(float)aplicable[3] + (float)Impuesto_Base[2]);
        }

        return NominaTotal;
    }
    
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Mostrar en JTable El ArrayList">
    //Mostrando en JTable
    public void mostrar(JTable datos)
    {
        String nombreColumnas [] = {"index", "Nombre", "Carrera", "Carnet","Nomina Total"};
        String data [][] = new String[Nombre.size()][nombreColumnas.length];
        for (int i = 0 ; i < Nombre.size() ; i++)
        {
            data[i][0] = String.valueOf(i); 
            data[i][1] = String.valueOf(Nombre.get(i));
            data[i][2] = String.valueOf(nEmpresa.get(i));
            data[i][3] = String.valueOf(Salario.get(i));
            data[i][4] = String.valueOf(Nomina.get(i));
        }
       datos.setModel(new DefaultTableModel(data, nombreColumnas));
    }
    //</editor-fold>
    
}
