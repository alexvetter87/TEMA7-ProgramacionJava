import java.util.Arrays;

public class Lista {
    Integer[] tabla;

    public Lista() {
        tabla = new Integer[0];

    }

    void insertarPrincipio(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;

    }

    void insertarFinal(Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;

    }

    void insertarFinal(Lista otraLista) {
        int tamIni = tabla.length;
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);

    }

    void insertar(int posicion, Integer nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion - 1);
        tabla[posicion] = nuevo;

    }

    Integer eliminar(int indice) {
        Integer eliminado = null;
        if (indice >= 0 && indice < tabla.length) {
            eliminado = tabla[indice];
            for (int i = indice + 1; i < tabla.length; i++) {
            }
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return eliminado;
    }

    int buscar(Integer claveBusqueda) {
        int indice = -1;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i].equals(claveBusqueda)) {
                indice = i;
            }
        }
        return indice;
    }

    public int numeroElementos() {
        return tabla.length;
    }

    public void mostrar() {
        System.out.println("lista: "+ Arrays.toString(tabla));
    

    }

}
