
package Lab6.ArbolBinario;

import java.util.LinkedList;
import javax.swing.JPanel;


public class AlmacenArbolBinario {

    ArbolB miArbol = new ArbolB();

    public AlmacenArbolBinario() {
    }

    public boolean insertar(Character dato, JPanel Grafico) {
        return (this.miArbol.agregar(dato, Grafico));
    }
    //metodo para mostrar los recorridos del arbol
    public String preOrden() {
        LinkedList it = this.miArbol.preOrden();
        return (recorrido(it, ""));
    }

    public String inOrden() {
        LinkedList it = this.miArbol.inOrden();
        return (recorrido(it, ""));
    }

    public String postOrden() {
        LinkedList it = this.miArbol.postOrden();
        return (recorrido(it, ""));
    }
    
    //metodo para poder mostrar los tipos de recorrido
    private String recorrido(LinkedList it, String msg) {
        int i = 0;
        String r = msg + "\n";
        while (i < it.size()) {
            r += "\t" + it.get(i).toString() + "";
            i++;
        }
        return (r);
    }

    public JPanel getDibujo() {
        return this.miArbol.getdibujo();
    }
}
