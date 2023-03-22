import java.util.Arrays;
public class Lista {
    Integer[] tabla;
    public Lista(){
        tabla = new Integer[0];

    }
    void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla,tabla.length + 1);
        System.arraycopy (tabla,0,tabla,1,tabla.length-1);
        tabla [0] = nuevo;


    }
    void insertarFinal (Lista otraLista) {
        tabla=Arrays.copyOf(tabla,tabla.length + 1);
        tabla [tabla.length-1] = nuevo;
        
    }
    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;
        tabla=Arrays.copyOf(tabla,tabla.length + otraLista.tabla.length);

    }
    
}
