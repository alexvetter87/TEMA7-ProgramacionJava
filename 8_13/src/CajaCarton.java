public class CajaCarton extends Caja {

    int cantidad;

    public CajaCarton(int a,int b, int c,Unidad u, int d) {
        super(a,b,c,u);
        this.cantidad=d;


    }
    public double  superficieTotal(){
        double result;
        result=getAncho()*getAlto()*getFondo()*this.cantidad;
        return result;

    }

}
