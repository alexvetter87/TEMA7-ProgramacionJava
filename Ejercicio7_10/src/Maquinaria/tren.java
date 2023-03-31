package Maquinaria;
import Personal.Maquinista;


public class tren {
    Locomotora locomotora;
    Vagon vagones[];
    Maquinista responsable;
    private int numVagones;
    public tren(Locomotora locomotora,Maquinista responsable){
        this.locomotora = locomotora;
        this.responsable=responsable;
        vagones=new Vagon[5];
        numVagones=0;
    }
    public void enganchaVagon(int cargaMax, int cargaActual,String mercancia) {
        if (numVagones >=5){
            System.out.println("el tren no admite más vagones");
        }else{
            Vagon v=new Vagon (numVagones,cargaMax,cargaActual,mercancia);
            vagones [numVagones] = v;
            numVagones++;

        }
        }
    }
    
    

