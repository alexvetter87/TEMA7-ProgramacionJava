public class Caja {
    int ancho;
    int alto;
    int fondo;
    Unidad unidad;
    String etiqueta;

    public Caja(int ancho, int alto, int fondo, Unidad unidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;

    }

    public int getFondo() {
        return fondo;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;

    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }

public String toString(){
    String result;
    result=" ancho " + this.ancho+" alto " + this.alto+" fondo " + this.fondo+" unidad " + this.unidad+ " etiqueta "+ this.etiqueta;
    return result;
}
}



