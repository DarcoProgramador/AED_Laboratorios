/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab5.Empresa;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class ArrayListEmpresa {
    //Atributos Alumnos
    ArrayList<String> Nombre = new ArrayList<>();
    ArrayList<Integer> nEmpresa = new ArrayList<>();
    ArrayList<Float> Salario = new ArrayList<>();
    ArrayList<Float> Nomina = new ArrayList<>();
    //https://www.toptrabajos.com/blog/ni/descuentos-planilla-nicaragua/
    static double INSS = 0.07;//Porcentaje INSS
    static double aplicable[] = {0.15,0.20,0.25,0.30};//porcentaje aplicable
    static double Impuesto_Base[] = {1250.00,3750.00,6875.00};//Impuesto base para salarios mayores a 16,666.67
    static double sobre_exceso[] = {8333.33,16666.66,29166.66,41666.66};//sobre Exceso a sumar
    
}
