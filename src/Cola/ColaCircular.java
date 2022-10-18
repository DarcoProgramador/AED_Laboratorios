/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cola;

import static java.lang.Math.abs;

/**
 *
 * @author david
 */
public class ColaCircular {
    int inicio;
    int fin;
    int tam;
    String[] cola;
    boolean extraido;
    boolean insertado;
    //creando cola
    public ColaCircular(int tam){
        cola = new String[tam];
        inicio = 0;
        fin = inicio;
        tam = 0;
        extraido = true;
        insertado = false;
    }
    //inserta em la cola
    public void insertar(String x){
        if(!llena()){
            cola[fin]=x;
            tam++;
            if(fin==cola.length-1)
                fin=0;
            else
                fin++;
            extraido=false;
            insertado=true;
        }
        else{
            System.out.println("ERROR: COLA LLENA");
            System.out.println();
            System.out.println();
        }
 
    }
    //Eliminar de la cola
    public void extraer(){
        if(!vacia()){
            extraido=true;
            insertado=false;
            tam--;
            if(inicio==cola.length-1){
                inicio=0;
            }
            else{
                inicio++;
            }
        }
        
    }
    //Cola vacia
    public boolean vacia(){
        if(inicio==fin)
            return !insertado;
        else
            return false;
    }
    //Cola llena
    public boolean llena(){
        if(inicio==fin)
            return !extraido;
        else
            return false;
    }

    /**
     *
     * @param nombres
     */
    //Mostrar Cola
    public void mostrar(String[][] nombres){
        int i;
        int j = 0;
        if (inicio<fin)
            
            for(i=inicio ; i < fin ; i++)
            {
                nombres[j][0] = String.valueOf(j);
                nombres[j][1] = cola[i];
                j++;
            }
                
        if(inicio>fin || llena()){
            for(i = inicio; i < cola.length ; i++)
            {
                nombres[j][0] = String.valueOf(j);
                nombres[j][1] = cola[i];
                j++;
            }
            for(i = 0 ; i < fin ; i++)
            {
                nombres[j][0] = String.valueOf(j);
                nombres[j][1] = cola[i];
                j++;
            }
        }
        if (vacia())
            return;  
    }
    //Tamaño cola
    public int size()
    {
        return tam;
    }
    
}
